package dev.hems.auth.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Configuration//will tell the IOC how to create the configurations for the class type
public class webSecurity {
    @Autowired//class level annotation
    private UserDetailsService userDetailsService;

    @Bean//method level annot where it will inject what all details it should contain
    AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return provider;
    }
    @Bean
    HttpBasicConfigurer<HttpSecurity> securityFilterChain(HttpSecurity http) throws Exception{
                return http.authorizeHttpRequests()
                        .requestMatchers("/saveData").permitAll()
                        .requestMatchers("/home").hasAuthority("USER")
                        .requestMatchers("/admin").hasAuthority("EMPLOYEE")
                        .anyRequest()
                        .authenticated()
                        .and()
                        .httpBasic();
    }
}
