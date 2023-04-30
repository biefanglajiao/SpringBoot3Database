package com.example.springboot3database.integrationMybatis.自定义配置视图管理;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: 常兆海
 * @Description: 访问index.html即对应路径index
 * @缺点 只能访问静态资源  不能访问动态资源
 *
 * @DateTime: 2023/4/30 21:41
 **/
@Configuration
public class 自定义视图映射_直接访问html即对应路径 implements WebMvcConfigurer {

    //添加视图管理


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("index.html").setViewName("index");

    }
}
