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
import java.util.Optional;

/**
 * Created by Grzesiek on 2018-10-06
 */
@WebServlet(name = "TweetController", value = "/tweet")
public class TweetController extends HttpServlet {

    private TweetService tweetService = new TweetServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       final String id = request.getParameter("id");
        Integer tweetId = null;
        try {
            tweetId = Integer.parseInt(id);
        } catch (NumberFormatException ex) {
            System.out.println("Tweet id should be Integer value");
        }

        Optional<TweetDto> tweetDto = tweetService.findById(tweetId);

        if (tweetDto.isPresent()) {
            request.setAttribute("tweetModel", tweetDto.get());
        }

        request.setAttribute("h2Text", "Tweet preview:");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tweets_jsp/tweet.jsp");

        requestDispatcher.forward(request, response);
    }
}
