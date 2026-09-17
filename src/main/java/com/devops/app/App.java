package com.devops.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class App extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>AWS CI/CD Java Web App</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>AWS CI/CD Java Web Application</h1>");
        out.println("<p>Application is running successfully.</p>");
        out.println("<p>Build Tool: Maven</p>");
        out.println("<p>CI/CD Tool: Jenkins</p>");
        out.println("<p>Cloud Platform: AWS</p>");
        out.println("</body>");

        out.println("</html>");
    }
}
