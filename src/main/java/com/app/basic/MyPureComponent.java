package com.app.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class MyPureComponent {

    public MyPureComponent() {
        System.out.println("created my pureComponent");
    }

    private String data;

    @PostConstruct
    public void init() {
        data = "pureComponent";
    }
}
