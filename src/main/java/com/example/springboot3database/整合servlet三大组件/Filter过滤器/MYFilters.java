package com.example.springboot3database.整合servlet三大组件.Filter过滤器;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/1 1:27
 **/
@WebFilter(filterName = "MYFilters", value = "/index")
public class MYFilters implements Filter {
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
