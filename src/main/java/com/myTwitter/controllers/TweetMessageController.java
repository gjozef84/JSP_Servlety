package com.myTwitter.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Grzesiek on 2018-10-06
 */
@WebServlet(name = "TweetMessageController", value = "/tweet/message")
public class TweetMessageController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = request.getParameter("msg");

        request.setAttribute("msg", msg);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tweets_jsp/message.jsp");
        requestDispatcher.forward(request, response);
    }
}
