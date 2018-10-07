package com.myTwitter.factory;

import com.myTwitter.dto.TweetDto;

/**
 * Created by Grzesiek on 2018-10-06
 */
public interface TwitterDtoFactory {

    public TweetDto getTweetDto(String id, String title, String message);

}
