package com.meetnow.meetnowbackend.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeConfig {


    // KST 시간 안맞을 경우 아래 코드 활성화
//    @PostConstruct
//    void init() {
//        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
//    }

}
