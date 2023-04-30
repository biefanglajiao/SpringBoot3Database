package com.example.springboot3database.整合servlet三大组件.Servlet程序;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 常兆海
 * @Description: 注册Servlet
 * @DateTime: 2023/4/30 22:31
 **/
@Configuration
public class MYConfig {
    @Bean
    public ServletRegistrationBean getServletReg(MYServlet myServlet){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(myServlet, "/myServlet");
        return servletRegistrationBean;

    }
}
