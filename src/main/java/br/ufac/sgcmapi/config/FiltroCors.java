package br.ufac.sgcmapi.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class FiltroCors {

    @Bean
    public CorsFilter corsFilter(){

        CorsConfiguration configCors = new CorsConfiguration();
        configCors.setAllowedOrigins(Arrays.asList("http://127.0.0.1:5500"));
        configCors.setAllowedMethods(Arrays.asList("*"));
        configCors.setAllowedHeaders(Arrays.asList("*"));

        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();

        configSource.registerCorsConfiguration("/**", configCors);

        return new CorsFilter(configSource);

    }
    
}
