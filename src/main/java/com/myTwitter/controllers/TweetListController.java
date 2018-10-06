package com.myTwitter.controllers;

import com.myTwitter.dto.TweetDto;
import com.myTwitter.services.TweetService;
import com.myTwitter.services.TweetServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Grzesiek on 2018-09-30
 */
@WebServlet(name = "TweetListController", value = "/tweets")
public class TweetListController extends HttpServlet {

    private TweetService tweetService = new TweetServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<TweetDto> tweets = tweetService.findAll();
        request.setAttribute("tweetsModel", tweets);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tweets_jsp/tweets_jstl.jsp");
        requestDispatcher.forward(request, response);
    }
}
