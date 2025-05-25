package com.barber.barber.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Дозволяємо запити з будь-якого джерела (можна обмежити конкретним доменом)
        config.addAllowedOrigin("http://localhost:63342");
        // Дозволяємо всі HTTP методи (GET, POST тощо)
        config.addAllowedMethod("*");
        // Дозволяємо всі заголовки
        config.addAllowedHeader("*");

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}