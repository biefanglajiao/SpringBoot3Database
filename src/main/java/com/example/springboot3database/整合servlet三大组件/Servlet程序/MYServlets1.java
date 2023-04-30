package com.example.springboot3database.整合servlet三大组件.Servlet程序;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/1 1:23
 **/
@WebServlet(name = "MYServlets1", value = "/myServlets1")
public class MYServlets1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello111czh666");
    }
}
