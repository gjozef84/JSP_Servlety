package com.myTwitter.controllers;

import com.myTwitter.services.LoginService;
import com.myTwitter.services.LoginServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Grzesiek on 2018-10-07
 */
@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {

    private final String LOGIN_ERROR_MSG = "You've typed wrong login or password";
    private LoginService loginService = new LoginServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String login = request.getParameter("login");
        final String password = request.getParameter("password");

        boolean logged = loginService.login(login, password);

        if (!logged) {
            response.sendRedirect("/login?msg=" + LOGIN_ERROR_MSG);
        } else {
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("login", login);
            response.sendRedirect("/tweets");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("h2Text", "Login:");
        String msg = request.getParameter("msg");
        request.setAttribute("errorMsg", msg);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tweets_jsp/login.jsp");
        requestDispatcher.forward(request, response);
    }
}
