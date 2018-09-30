package com.myTwitter.servlet;

import com.myTwitter.dto.TweetDto;
import com.myTwitter.services.TweetService;
import com.myTwitter.services.TweetServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Grzesiek on 2018-09-30
 */
@WebServlet(name = "TweetServlet", value = "/tweet")
public class TweetServlet extends HttpServlet {

    private TweetService tweetService = new TweetServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id"); //pobieramy parametr z url, tj. z GET
        TweetDto tweetDto = null;

        try {
            tweetDto = tweetService.findById(Integer.parseInt(id));

        } catch (NumberFormatException ex) {
            System.out.println("Tweet od should be number");
        }

        ServletOutputStream outputStream = response.getOutputStream();

        if (tweetDto != null) {
            outputStream.println("<html>");
            outputStream.print("<form action=\"/addTweet\"method=\"GET\">\n" +
                    "Tweet title: <input type=\"text\" name=\"title\" value=\"" + tweetDto.getTitle() + "\"><br>\n" +
                    "Message: <input type=\"text\" name=\"message\" value=\"" + tweetDto.getBody() + "\"><br>\n" +
                    "<input type=\"hidden\" name=\"id\" value=\"" + tweetDto.getId() + "\"><br>\n" +
                    "<input type=\"submit\" value=\"Save tweet\">\n" +
                    "</form>");
            outputStream.println("</html>");
        } else {
            outputStream.println("There is no tweet with id=" + id);
        }

    }
}
