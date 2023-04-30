package com.example.springboot3database.整合servlet三大组件.Filter过滤器;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Author: 常兆海
 * @Description:    注册Filter
 * @DateTime: 2023/4/30 22:42
 **/
@Configuration
public class MYConfig1 {
    @Bean
    public FilterRegistrationBean get(MYFilter myFilter){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter);
       filterRegistrationBean.setUrlPatterns(Arrays.asList("/index"));
        return filterRegistrationBean;
    }
}
