package com.example.springboot3database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ServletComponentScan//扫描Servlet三大件的注解 不添加 扫描不到注解形式的三大件
@SpringBootApplication
public class SpringBoot3DatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3DatabaseApplication.class, args);
    }

}
