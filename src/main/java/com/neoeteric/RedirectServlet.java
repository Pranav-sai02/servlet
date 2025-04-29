package com.neoeteric;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirects to Google
        response.sendRedirect("https://www.google.com");
    }
}
