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
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Grzesiek on 2018-09-30
 */
@WebServlet(name = "AddTweetServlet", value = "/tweet/addTweet")
public class AddTweetServlet extends HttpServlet {

    private TweetService tweetService = new TweetServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = tweetService.findAll().size()+1;
        String tweetAuthor = "Grzesiek";
        String tweetTitle = request.getParameter("title");
        String tweetMsg = request.getParameter("message");

        TweetDto tweet = new TweetDto(id, tweetAuthor, tweetTitle, tweetMsg, LocalDate.now());
        tweetService.addNewTweetToMap(tweet);
        PrintWriter writer = response.getWriter();
        writer.print("<p>DODANO NOWY(id="+id+") TWEET o tytule \""+tweetTitle+"\"</p>");
        writer.print("<a href=\"/tweets\">Pokaz wszystkie tweety</a>");
    }
}
