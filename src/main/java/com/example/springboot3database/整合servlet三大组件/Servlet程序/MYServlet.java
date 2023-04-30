package com.example.springboot3database.整合servlet三大组件.Servlet程序;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author: 常兆海
 * @Description: 自定义Servlet程序
 * @DateTime: 2023/4/30 22:30
 **/
@Component
public class MYServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.getWriter().write("hello111czh");
    }
}
