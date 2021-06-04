package com.demo.twitter.producer.EasyTwitter.controller;

import com.demo.twitter.producer.EasyTwitter.bo.TwitterBO;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.QueryResult;
import twitter4j.TwitterException;
import twitter4j.api.DirectMessagesResources;

@Slf4j
@RestController
public class GetTwitterFeed {

    @GetMapping(value = "/feed", produces = MediaType.APPLICATION_JSON_VALUE)
    public QueryResult getTwitter(@RequestParam(value = "key") String searchKey) throws TwitterException, JsonProcessingException {
        if(searchKey.isEmpty()) {
            log.info("No search key is passed. Pass the key as request parameter ");
            throw new TwitterException("Must pass in a search key");
        }
        log.info("Going to grab Twitter feed for the search key: " + searchKey);
        TwitterBO twitterBO = new TwitterBO();
        return twitterBO.getFeedForKey(searchKey);
    }

    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public DirectMessagesResources getMessage() throws TwitterException, JsonProcessingException {
        TwitterBO twitterBO = new TwitterBO();
        return twitterBO.getDirectMessage();
    }


}
