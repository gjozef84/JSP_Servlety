package com.myTwitter.servlet;

import com.myTwitter.dto.TweetDto;
import com.myTwitter.services.TweetService;
import com.myTwitter.services.TweetServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Grzesiek on 2018-09-30
 */
@WebServlet(name = "TweetListServlet", value = "/tweets")
public class TweetListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TweetService tweetService = new TweetServiceImpl();
        List<TweetDto> tweets = tweetService.findAll();

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>Tweet list:</h1>");

        printWriter.print("<ul>");
        for (TweetDto tweet : tweets) {
            printWriter.print("<li>");
            printWriter.print("Twett id " + tweet.getId() + " Tweet title " + tweet.getTitle() + " Tweet msg " + tweet.getBody());
            printWriter.print("</li>");
        }
        printWriter.print("</ul>");

    }
}
