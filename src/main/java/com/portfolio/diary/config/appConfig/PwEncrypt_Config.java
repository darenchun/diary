
package com.portfolio.diary.config.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableWebSecurity
public class PwEncrypt_Config {

    /* password encryption */
    @Bean
    public PasswordEncoder pwEncoder() {
        log.info("pwEncoder()");
        return new BCryptPasswordEncoder();
    }
}