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
@WebServlet(name = "TweetAddController", value = "/tweet/create")
public class TweetAddController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("h2Text", "Tweet add form:");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tweets_jsp/tweet.jsp");
        requestDispatcher.forward(request, response);
    }
}
