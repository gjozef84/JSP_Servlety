package com.myTwitter.services;

import com.myTwitter.dto.TweetDto;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-10-07
 */
public class TweetServiceImplTest {

    private TweetService tweetService = new TweetServiceImpl();

    @Test
    public void save() {
    }

    @Test
    public void shouldFindTweetById() {
        Optional<TweetDto> tweetDtoOptional = tweetService.findById(1);
        TweetDto tweetDto = tweetDtoOptional.get();
        Assert.assertEquals(Integer.valueOf(1), tweetDto.getId());
        Assert.assertEquals("Powitanie", tweetDto.getTitle());
    }

    @Test
    public void shouldFindEmptyTweet(){
        Optional<TweetDto> tweetDtoOptional = tweetService.findById(10);
        Assert.assertEquals(Optional.empty(), tweetDtoOptional);
    }

    @Test
    public void shouldFindAllTweets() {
        //WHEN
        List<TweetDto> tweets = tweetService.findAll();
        //THEN
        Assert.assertEquals(3, tweets.size());
    }
}