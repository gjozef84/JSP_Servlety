package com.myTwitter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Grzesiek on 2018-09-30
 */
//@Setter
//@Getter
@AllArgsConstructor
public class TweetDto {

    private Integer id;

    private String author;

    private String title;

    private String body;

    private LocalDate createdDate;

    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
