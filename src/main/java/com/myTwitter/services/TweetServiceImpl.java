package com.myTwitter.services;

import com.myTwitter.dto.TweetDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Grzesiek on 2018-09-30
 */
public class TweetServiceImpl implements TweetService{

    private static Map<Integer, TweetDto> tweetDtoMap;

    static{
        tweetDtoMap = new HashMap<>();
        tweetDtoMap.put(1, new TweetDto(1, "Grzesiek", "Powitanie", "Wita sie Grzesiek", LocalDateTime.now()));
        tweetDtoMap.put(2, new TweetDto(2, "Grzesiek", "Drugi tweet", "To jest moj pierwszy tweet", LocalDateTime.now()));
        tweetDtoMap.put(3, new TweetDto(3, "Iwonka", "Powitanie", "Wita sie Iwonka", LocalDateTime.now()));
    }

    @Override
    public TweetDto findById(Integer id) {
        return tweetDtoMap.get(id);
    }

    @Override
    public List<TweetDto> findAll() {
        return new ArrayList<TweetDto>(tweetDtoMap.values());
    }
}
