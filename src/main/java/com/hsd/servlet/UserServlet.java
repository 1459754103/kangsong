package com.hsd.servlet;

import com.hsd.entity.User;
import com.hsd.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("test/html;charset=utf-8");
        UserService service = new UserService();
        List<User> findall = service.findall();
        req.setAttribute("clist",findall);
        for (User user :findall) {
            System.out.println(user.getName());
            System.out.println("shda");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
