package com.app.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyConfiguration) {
            System.out.println("BEAN PREPROCESS CONFIG");
        }

        if (bean instanceof MyPureComponent) {
            System.out.println("BEAN PREPROCESS PURE");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyConfiguration) {
            System.out.println("BEAN POSTPROCESS CONFIG");
        }
        if (bean instanceof MyPureComponent) {
            System.out.println("BEAN POSTPROCESS PURE");
        }
        return bean;
    }
}
