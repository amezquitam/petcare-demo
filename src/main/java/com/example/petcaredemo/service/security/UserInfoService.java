package com.example.petcaredemo.service.security;

import com.example.petcaredemo.dto.user.UserInfoDto;
import com.example.petcaredemo.entity.ERole;
import com.example.petcaredemo.entity.Role;
import com.example.petcaredemo.entity.User;
import com.example.petcaredemo.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserInfoService implements UserDetailsService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserInfoService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isEmpty()) {
            throw new UsernameNotFoundException("");
        }

        return new UserInfo(user.get());
    }

    public UserInfoDto addUser(UserInfoDto userInfo) {
        User user = new User(userInfo.name(), userInfo.email(), passwordEncoder.encode(userInfo.password()));
        Set<Role> roles = new HashSet<>();

        Arrays.stream(userInfo.roles().split(",")).forEach(role -> roles.add(new Role(null, ERole.valueOf(role))));

        user.setRoles(roles);

        user = userRepository.save(user);

        return new UserInfoDto(user.getName(), user.getEmail(), userInfo.password(), user.getRoles().stream().map(role -> role.getName().name()).collect(Collectors.joining(",")));
    }
}
