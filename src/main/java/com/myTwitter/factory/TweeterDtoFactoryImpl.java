package com.myTwitter.factory;

import com.myTwitter.dto.TweetDto;

import java.time.LocalDate;

/**
 * Created by Grzesiek on 2018-10-06
 */
public class TweeterDtoFactoryImpl implements TwitterDtoFactory {

    @Override
    public TweetDto getTweetDto(String id, String title, String message) {

        Integer tweetId;

        try {
            tweetId = Integer.parseInt(id);
        } catch (NumberFormatException ex) {
            tweetId = null;
            System.out.println("Id should be int");
        }

        return new TweetDto(tweetId, "Grzesiek", title, message, LocalDate.now());

    }
}
