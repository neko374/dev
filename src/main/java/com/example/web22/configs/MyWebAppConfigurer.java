package com.example.web22.configs;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//这个类很重要，这是将物理地址映射为逻辑地址的类
@Configuration
    public class MyWebAppConfigurer implements WebMvcConfigurer {
//        @Value("${file.staticAccessPath}")
//        private String staticAccessPath;
//        @Value("${file.uploadFolder}")
//        private String uploadFolder;

        public void addResourceHandlers(ResourceHandlerRegistry registry) {
          //  addResourceHandler:是相当于配置了一个映射
         //   addResourceLocations:对应本地文件夹
            registry.addResourceHandler("/uploads/**").addResourceLocations("file:D:/fileloads/");
            WebMvcConfigurer.super.addResourceHandlers(registry);
        }
    }
