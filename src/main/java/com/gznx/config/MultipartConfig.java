package com.gznx.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

@Configuration
public class MultipartConfig {
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.parse("500MB"));
        factory.setMaxRequestSize(DataSize.parse("5000MB"));
        factory.setLocation("./upload_temp");
        return factory.createMultipartConfig();
    }
}
