package com.example.sweater.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Value("${upload.path}")
    private String uploadPath;



    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/contacts").setViewName("contacts");
        registry.addViewController("/committee1").setViewName("committee1");
        registry.addViewController("/news").setViewName("news");
        registry.addViewController("/quest").setViewName("quest");
        registry.addViewController("/faq").setViewName("faq");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**")
                .addResourceLocations("file://" + uploadPath + "/");
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}
