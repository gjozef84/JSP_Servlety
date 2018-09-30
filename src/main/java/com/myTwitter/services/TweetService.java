package com.myTwitter.services;

import com.myTwitter.dto.TweetDto;

import java.util.List;

/**
 * Created by Grzesiek on 2018-09-30
 */
public interface TweetService {

    TweetDto findById(Integer id);
    List<TweetDto> findAll();

}
