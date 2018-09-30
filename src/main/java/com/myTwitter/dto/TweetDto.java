package com.myTwitter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by Grzesiek on 2018-09-30
 */
//@Setter
//@Getter
@AllArgsConstructor
public class TweetDto {

    private int id;

    private String author;

    private String title;

    private String body;

    private LocalDateTime createdDate;

}
