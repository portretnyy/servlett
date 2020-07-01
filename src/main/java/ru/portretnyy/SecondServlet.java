package ru.portretnyy;

import javax.servlet.Servlet;
import javax.servlet.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println();
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        final ServletInputStream is = servletRequest.getInputStream();
        final InputStreamReader reader = new InputStreamReader(is);
        char[] chars = new char[100];
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            reader.read(chars);
            sb.append(chars);
        }
        System.out.println();
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
