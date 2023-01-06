package com.meetnow.meetnowbackend.domain.room;

import com.meetnow.meetnowbackend.domain.timetable.TimeTable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;



@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Room extends TimeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_name", length = 30, nullable = false)
    private String roomName;

    @Column(name = "appointment_Hour", length = 3, nullable = false)
    private Short appointmentHour;

    // StartDate와 endDate는 해당 방에서 잡을 수 있는 약속시간의 범위
    @Column(name = "start_time", length = 30, nullable = false)
    private LocalDate startDate;

    @Column(name = "end_time", length = 30, nullable = false)
    private LocalDate endDate;
}













