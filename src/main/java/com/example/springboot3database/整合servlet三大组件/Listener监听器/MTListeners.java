package com.example.springboot3database.整合servlet三大组件.Listener监听器;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/1 1:30
 **/
@WebListener
public class MTListeners implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器销毁");
    }
}
