package com.myTwitter.controllers;

import com.myTwitter.dto.TweetDto;
import com.myTwitter.factory.TweeterDtoFactoryImpl;
import com.myTwitter.factory.TwitterDtoFactory;
import com.myTwitter.services.TweetService;
import com.myTwitter.services.TweetServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by Grzesiek on 2018-10-06
 */
@WebServlet(name = "TweetSaveController", value = "/tweet/save")
public class TweetSaveController extends HttpServlet {

    private TweetService tweetService = new TweetServiceImpl();
    private TwitterDtoFactory tweeterDtoFactory = new TweeterDtoFactoryImpl();
    private final String TWEET_ADD_MESSAGE_SUCCESSFULL = "Tweet was added";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String message = request.getParameter("message");
        String id = request.getParameter("id");


        TweetDto tweetDto = tweeterDtoFactory.getTweetDto(id, title, message);
        tweetService.save(tweetDto);

        response.sendRedirect("/tweet/message?msg="+TWEET_ADD_MESSAGE_SUCCESSFULL);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
