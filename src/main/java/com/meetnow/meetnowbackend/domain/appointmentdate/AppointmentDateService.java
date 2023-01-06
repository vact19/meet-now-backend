package com.meetnow.meetnowbackend.domain.appointmentdate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AppointmentDateService {

    private final AppointmentDateRepository appointmentDateRepository;
}
