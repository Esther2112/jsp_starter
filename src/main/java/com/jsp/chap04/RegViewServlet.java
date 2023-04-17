package com.jsp.chap04;

import com.jsp.chap01.servlet.HelloServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dancer/join")
public class RegViewServlet extends HelloServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dp
                = req.getRequestDispatcher("/WEB-INF/chap04/dancer/register.jsp");
        dp.forward(req, resp);
    }
}
