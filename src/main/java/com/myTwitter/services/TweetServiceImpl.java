package com.myTwitter.services;

import com.myTwitter.dto.TweetDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by Grzesiek on 2018-09-30
 */
public class TweetServiceImpl implements TweetService {

    private static Map<Integer, TweetDto> tweetDtoMap;

    static {
        tweetDtoMap = new HashMap<>();
        tweetDtoMap.put(1, new TweetDto(1, "Grzesiek", "Powitanie", "Witam", LocalDate.now()));
        tweetDtoMap.put(2, new TweetDto(2, "Grzesiek", "Drugi tweet", "To jest moj pierwszy tweet", LocalDate.now()));
        tweetDtoMap.put(3, new TweetDto(3, "Iwonka", "Powitanie", "Witam", LocalDate.now()));
    }

    public void addNewTweetToMap(TweetDto tweetDto) {
        tweetDtoMap.put(tweetDtoMap.size() + 1, tweetDto);
    }

    @Override
    public Optional<TweetDto> findById(Integer id) {
        TweetDto tweetDto = tweetDtoMap.get(id);

        if (tweetDto!=null) {
            return Optional.of(tweetDtoMap.get(id));
        }
        else {
            return Optional.empty();
        }
        //return tweetDtoMap.get(id);
    }

    @Override
    public List<TweetDto> findAll() {
        return new ArrayList<TweetDto>(tweetDtoMap.values());
    }
}
