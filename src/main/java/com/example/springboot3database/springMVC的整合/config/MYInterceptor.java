package com.example.springboot3database.springMVC的整合.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: 常兆海
 * @Description:  在此处设置拦截器
 * @DateTime: 2023/4/30 22:15
 **/
@Component
public class MYInterceptor implements HandlerInterceptor {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        request.setAttribute("msg","czhhello1111");
    }
}
