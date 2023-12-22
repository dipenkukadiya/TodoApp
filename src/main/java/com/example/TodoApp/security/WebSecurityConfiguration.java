package com.example.TodoApp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.TodoApp.service.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
   @Autowired
    UserService userService;
   
   
    @Bean
    AuthenticationProvider authenticationProv() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService());
        provider.setPasswordEncoder((new BCryptPasswordEncoder()));
        return provider;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
       
        http.authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .antMatchers("/home")
                .hasAuthority("User") 
                .antMatchers("/admin")
                .hasAuthority("Admin")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
                 

    }
    
}