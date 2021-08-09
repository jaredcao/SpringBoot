package com.gyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication来标注一个主程序类，说明这是一个Spring应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    //Spring应用启动起来
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
