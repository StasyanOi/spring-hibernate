package com.app.basic;

import lombok.*;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Configuration
@PropertySource("classpath:application.properties")
public class MyConfiguration implements ApplicationContextAware {

    @Value("${test}")
    private Integer number;

    private String data;
    private ApplicationContext applicationContext;

    @Bean
    public String stringBean() {
        System.out.println("create stringBean");
        return "stringBean";
    }

    @PostConstruct
    public void init() {
        data = "init";
        System.out.println("INIT");
        System.out.println(number);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DESTROY");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
