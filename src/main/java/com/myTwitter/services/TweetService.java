package com.myTwitter.services;

import com.myTwitter.dto.TweetDto;

import java.util.List;
import java.util.Optional;

/**
 * Created by Grzesiek on 2018-09-30
 */
public interface TweetService {

    Optional<TweetDto> findById(Integer id);
    List<TweetDto> findAll();

    void addNewTweetToMap(TweetDto tweetDto);
    void save(TweetDto tweetDto);

}
