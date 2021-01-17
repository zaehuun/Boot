package com.example.security.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Log4j2
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /*
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        //inMemoryAuthentication()은 걍 단순히 테스트 용도로 사용
        auth.inMemoryAuthentication().withUser("user1")
                .password("$2a$10$ZtmOTDeyejIYddgvgk3JIO33h7YN2aan16L65gmpj2uzRvgcR7D2u")
                .roles("USER");
    }
*/
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/sample/all").permitAll()
                .antMatchers("/sample/member").hasRole("USER");

        http.formLogin().defaultSuccessUrl("/sample/success");
        http.csrf().disable();
        http.logout();
    }
}
