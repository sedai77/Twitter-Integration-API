package com.demo.twitter.producer.EasyTwitter.bo;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import twitter4j.*;
import twitter4j.api.DirectMessagesResources;

@Slf4j
public class TwitterBO {
    Twitter twitter = TwitterFactory.getSingleton();

    public QueryResult getFeedForKey(String searchKey) throws TwitterException, JsonProcessingException {
        log.info("In TwitterBO: "+ searchKey);

        Query query = new Query(searchKey);
        QueryResult result = twitter.search(query);

        if(null == result.getTweets()) {
            log.info("There are no tweets for provided keyword.");
            return null;
        } else {
            log.info("Got {} tweets back from Twitter ", result.getTweets().size());
            return result;
        }
    }

    public DirectMessagesResources getDirectMessage() {
        DirectMessagesResources directMessagesResources = twitter.directMessages();
        return directMessagesResources;
    }
}
