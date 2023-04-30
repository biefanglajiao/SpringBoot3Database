package com.example.springboot3database.springMVC的整合.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: 常兆海
 * @Description: 访问index.html即对应路径index http://localhost:8080/index.html=》http://localhost:8080/index
 * @缺点 只能访问静态资源  不能访问动态资源
 * @解决： 添加拦截器  并初始化拦截器
 * @DateTime: 2023/4/30 21:41
 **/
@Configuration
public class 自定义视图映射_直接访问html即对应路径 implements WebMvcConfigurer {

    //添加视图管理


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("index.html").setViewName("index");

    }

    @Autowired
    private MYInterceptor myInterceptor;

    /***
     *
     * @描述 将自定义的拦截器通过实现方法 初始化 使得可以获得数据
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor);
    }
}
