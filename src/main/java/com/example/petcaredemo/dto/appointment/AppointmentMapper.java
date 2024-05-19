package com.example.petcaredemo.dto.appointment;

import com.example.petcaredemo.entity.Appointment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {
    AppointmentDTO appointmentToAppointmentDTO(Appointment appointment);
    Appointment appointmentDTOToAppointment(AppointmentDTO appointmentDTO);
    Appointment appointmentSaveDTOToAppointment(AppointmentToSaveDTO appointmentToSaveDTO);
}
