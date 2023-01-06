package com.meetnow.meetnowbackend.domain.room;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_name", length = 30, nullable = false)
    private String roomName;

    @Column(name = "appointment_Hour", length = 3, nullable = false)
    private Short appointmentHour;

    // Todo 방의 약속시작 - 종료시간은 개인의 약속시작 - 종료시간과 다른가?
    @Column(name = "start_time", length = 30, nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", length = 30, nullable = false)
    private LocalDateTime endTime;
}
























