package com.demo.twitter.producer.EasyTwitter.bo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import twitter4j.TwitterException;

@SpringBootTest
public class TwitterBOTest {

    @Test
    public void getTwitterFeed() throws TwitterException, JsonProcessingException {
        TwitterBO twitterBO = new TwitterBO();
        twitterBO.getFeedForKey("nepal");


    }
}