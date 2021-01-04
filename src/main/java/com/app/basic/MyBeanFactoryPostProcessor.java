package com.app.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        List<BeanDefinition> collect = Arrays.stream(beanFactory.getBeanDefinitionNames())
                .map(beanFactory::getBeanDefinition)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
        System.out.println("FACTORY POST PROCESSING");
    }
}
