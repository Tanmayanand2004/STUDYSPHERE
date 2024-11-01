package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String contactMethod = request.getParameter("contactMethod");

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Thank you, " + name + "!</h2>");
        response.getWriter().println("<p>We will contact you via: " + contactMethod + "</p>");
        response.getWriter().println("<p>Your email: " + email + "</p>");
        response.getWriter().println("<a href='index.html'>Go back</a>");
        response.getWriter().println("</body></html>");
    }
}
