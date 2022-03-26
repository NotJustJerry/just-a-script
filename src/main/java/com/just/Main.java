package com.just;

import com.just.service.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.just")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = null;
        try {
            applicationContext = new AnnotationConfigApplicationContext(Main.class);
            Test service = applicationContext.getBean(Test.class);

            System.out.println(service.test());
        } finally {
            if (applicationContext != null) {
                applicationContext.close();
                System.out.println("IOC容器关闭。。。");
            }
        }
    }

}
