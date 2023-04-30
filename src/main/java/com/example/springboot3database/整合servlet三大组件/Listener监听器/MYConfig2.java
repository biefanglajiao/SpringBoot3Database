package com.example.springboot3database.整合servlet三大组件.Listener监听器;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/30 22:50
 **/
@Configuration
public class MYConfig2 {
    @Bean
    public ServletListenerRegistrationBean getlst(MYListener myListener){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean(myListener);
        return servletListenerRegistrationBean;
    }
}
