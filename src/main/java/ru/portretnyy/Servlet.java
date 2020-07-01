package ru.portretnyy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello_world")
public final class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String cnt = req.getParameter("cnt");
        final long value = Long.parseLong(cnt);
        resp.setContentType("text/html");
        try(PrintWriter writer = resp.getWriter()) {
            writer.print(String.format("<p>%d</p>", value*value));
        }
    }
}
