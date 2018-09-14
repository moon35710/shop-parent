package com.moon.account;

import com.moon.account.conf.AccountMvcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication(scanBasePackages = {"com.moon.account"})
@EnableCaching
@EnableJpaRepositories
@EnableTransactionManagement
public class ShopAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopAccountApplication.class, args);
    }

}
