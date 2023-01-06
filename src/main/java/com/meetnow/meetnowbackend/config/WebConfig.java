package com.meetnow.meetnowbackend.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 이 경로로 접근하는
                .allowedOrigins("*") // 해당 Origin에 대해 CORS 활성화
                .allowedMethods(// 허용할 HTTP Method 설정
                        "*"
                );
    }

}














