package com;

import com.app.basic.MyConfiguration;
import com.app.basic.MyPureComponent;
import com.app.entities.TestEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class MainConfiguration {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        MyConfiguration myComponent = applicationContext.getBean(MyConfiguration.class);
        MyPureComponent pureComponent = applicationContext.getBean(MyPureComponent.class);
        String string = applicationContext.getBean(String.class);
        System.out.println(myComponent);
        System.out.println(pureComponent);
        System.out.println(string);
        saveTestEntity(applicationContext);
        applicationContext.close();
    }

    private static void saveTestEntity(ApplicationContext applicationContext) {
        SessionFactory sessionFactory = applicationContext.getBean(SessionFactory.class);
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(new TestEntity(1, "test"));
        session.getTransaction().commit();
        session.flush();
    }
}
