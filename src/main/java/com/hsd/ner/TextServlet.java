package com.hsd.ner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setCharacterEncoding("utf-8");
       resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
         pw.print("<head>");
         pw.print("<meta charset=\"UTF-8\">");
         pw.print("<title>Title</title>");
         pw.print("</head>");
         pw.print("<body>");
         pw.print("<div>");
         pw.print("熊文轩");
         pw.print("</div>");
         pw.print("</body>");
         pw.print("</html>");
         pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
