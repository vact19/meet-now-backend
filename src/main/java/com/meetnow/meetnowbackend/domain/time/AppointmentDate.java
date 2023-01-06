package com.meetnow.meetnowbackend.domain.time;

import com.meetnow.meetnowbackend.domain.timetable.TimeTable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class AppointmentDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 날짜(월/일), 시작시간, 끝나는 시간이 필요함
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "appo_start", nullable = false)
    private LocalTime appoStart;

    @Column(name = "appo_end", nullable = false)
    private LocalTime appoEnd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "timetable_id", nullable = false)
    private TimeTable timeTable;





}
