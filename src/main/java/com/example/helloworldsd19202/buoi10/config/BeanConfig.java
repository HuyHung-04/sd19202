package com.example.helloworldsd19202.buoi10.config;

import com.example.helloworldsd19202.buoi10.model.CongTyKhac;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public CongTyKhac getCongTyKhac(){
        return new CongTyKhac();
    }
}
