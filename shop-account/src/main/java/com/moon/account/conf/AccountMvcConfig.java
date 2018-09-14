package com.moon.account.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
@MapperScan("com.moon.account")
public class AccountMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("home");
    }
//    @Bean
//    public ServletRegistrationBean dispatcherRegistration() {
//        //注解扫描上下文
//        AnnotationConfigWebApplicationContext applicationContext
//                = new AnnotationConfigWebApplicationContext();
//        //base package
//        applicationContext.scan("com.moon.account");
//        //通过构造函数指定dispatcherServlet的上下文
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
//        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
//        registration.addUrlMappings("/account/*");
//
//        return registration;
//    }
}
