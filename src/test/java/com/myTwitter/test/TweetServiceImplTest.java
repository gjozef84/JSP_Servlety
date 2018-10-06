package com.myTwitter.test;

import com.myTwitter.dto.TweetDto;
import com.myTwitter.services.TweetService;
import com.myTwitter.services.TweetServiceImpl;
import org.junit.Assert;
import org.junit.Test;


import java.util.List;

/**
 * Created by Grzesiek on 2018-09-30
 */
public class TweetServiceImplTest {

    private TweetService tweetService = new TweetServiceImpl();

    @Test
    public void shouldFindTweetById() {
        tweetService.findById(1);
    }

    //@org.junit.jupiter.api.Test
    @Test
    public void shouldFindAllTweets() {
        //WHEN
        List<TweetDto> tweets = tweetService.findAll();
        //THEN
        Assert.assertEquals(3, tweets.size());
    }
}