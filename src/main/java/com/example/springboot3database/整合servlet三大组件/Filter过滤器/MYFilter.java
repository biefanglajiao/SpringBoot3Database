package com.example.springboot3database.整合servlet三大组件.Filter过滤器;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * @Author: 常兆海
 * @Description: 自定义filter类
 * @DateTime: 2023/4/30 22:39
 **/
@Component
public class MYFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("------------------filter------------------");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
