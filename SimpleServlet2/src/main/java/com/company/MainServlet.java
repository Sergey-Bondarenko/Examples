package com.company;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Admin on 27.04.2015.
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("name", "TestJSP");

        req.getRequestDispatcher("mypage.jsp").forward(req, resp);
    }
}
