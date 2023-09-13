package com.ust.spring.AugustspringSecurity1st;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class securityConfiguration extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
        auth.inMemoryAuthentication()
        .withUser("athira")
        .password("athira")
        .roles("user")
        .and()
        .withUser("radhamani")
        .password("radha")
        .roles("admin");
    }
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
        .antMatchers("/admin").hasRole("admin")
        .antMatchers("/user").hasRole("user")
        .antMatchers("/").permitAll()
        .and().formLogin();
    }
}
