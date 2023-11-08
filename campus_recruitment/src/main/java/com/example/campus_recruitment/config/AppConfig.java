package com.example.campus_recruitment.config;

import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;
import java.security.cert.Extension;

//@Configuration
//public class AppConfig {
//    @Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource){
//        return new JdbcUserDetailsManager(dataSource);
//    }
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http ) throws Exception {
////        http.authorizeHttpRequests(configurer ->
////                configurer
////                        .requestMatchers(HttpMethod.POST, "/api/user/login").hasRole("Admin"));
////
////                http.httpBasic(Customizer.withDefaults());
////                http.csrf(csrf->csrf.disable());
////
////return http.build();
////
////    }
//public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//    http
//            .authorizeRequests(configurer ->
//                    configurer
//                            .requestMatchers(HttpMethod.POST, "api/user/login").permitAll());
//
//    http.httpBasic(Customizer.withDefaults());
//    http.csrf(csrf->csrf.disable());
//
//    return http.build();
//}

    @Configuration
public class AppConfig {
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http ) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
//
                        .requestMatchers(HttpMethod.POST, "/api/user/login").permitAll()
                       .requestMatchers(HttpMethod.POST, "/api/user/registration").permitAll()
//                        .requestMatchers(HttpMethod.GET,"/api/roles").permitAll()
                        .requestMatchers(HttpMethod.GET,"/api/roles").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/category/create").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/college/create").permitAll()
                        .requestMatchers(HttpMethod.GET,"/api/category/getAll").permitAll()
                        .requestMatchers(HttpMethod.GET,"/api/college/getAll").permitAll()
//                        .requestMatchers(HttpMethod.GET,"/api/category/getAllCollegesBy/{categoryId}").permitAll()


//                        .requestMatchers(HttpMethod.GET,"/api/roles").hasRole("admin")
                        .anyRequest().authenticated());


                http.httpBasic(Customizer.withDefaults());
                http.csrf(csrf->csrf.disable());
      http.cors(Customizer.withDefaults());




        return http.build();

    }
}

