package com.example.petcaredemo.auth;

import lombok.RequiredArgsConstructor;
import com.example.petcaredemo.entity.User;
import com.example.petcaredemo.jwt.JwtService;
import com.example.petcaredemo.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
                .name(request.name())
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .phoneNumber(request.phoneNumber())
                .build();

        userRepository.save(user);

        return new AuthResponse(jwtService.getToken(user));
    }

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.email(), request.password()));
        UserDetails userDetails = userRepository.findByEmail(request.email()).orElseThrow();
        String token = jwtService.getToken(userDetails);
        return new AuthResponse(token);
    }
}
