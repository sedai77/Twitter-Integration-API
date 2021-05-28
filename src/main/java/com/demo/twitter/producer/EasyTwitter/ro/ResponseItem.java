package com.demo.twitter.producer.EasyTwitter.ro;

import java.util.List;

public class ResponseItem{
	private int inReplyToUserId;
	private List<UserMentionEntitiesItem> userMentionEntities;
	private String source;
	private boolean retweeted;
	private int currentUserRetweetId;
	private long createdAt;
	private List<Object> hashtagEntities;
	private List<Object> mediaEntities;
	private int inReplyToStatusId;
	private RetweetedStatus retweetedStatus;
	private Object quotedStatusPermalink;
	private long id;
	private String text;
	private Object place;
	private String lang;
	private boolean favorited;
	private int displayTextRangeEnd;
	private int accessLevel;
	private boolean retweet;
	private boolean truncated;
	private int displayTextRangeStart;
	private int quotedStatusId;
	private Object rateLimitStatus;
	private Object inReplyToScreenName;
	private boolean possiblySensitive;
	private Object geoLocation;
	private Object quotedStatus;
	private Object scopes;
	private List<Object> contributors;
	private boolean retweetedByMe;
	private List<Object> symbolEntities;
	private User user;
	private List<Object> urlentities;
	private int retweetCount;
	private Object withheldInCountries;
	private int favoriteCount;

	public int getInReplyToUserId(){
		return inReplyToUserId;
	}

	public List<UserMentionEntitiesItem> getUserMentionEntities(){
		return userMentionEntities;
	}

	public String getSource(){
		return source;
	}

	public boolean isRetweeted(){
		return retweeted;
	}

	public int getCurrentUserRetweetId(){
		return currentUserRetweetId;
	}

	public long getCreatedAt(){
		return createdAt;
	}

	public List<Object> getHashtagEntities(){
		return hashtagEntities;
	}

	public List<Object> getMediaEntities(){
		return mediaEntities;
	}

	public int getInReplyToStatusId(){
		return inReplyToStatusId;
	}

	public RetweetedStatus getRetweetedStatus(){
		return retweetedStatus;
	}

	public Object getQuotedStatusPermalink(){
		return quotedStatusPermalink;
	}

	public long getId(){
		return id;
	}

	public String getText(){
		return text;
	}

	public Object getPlace(){
		return place;
	}

	public String getLang(){
		return lang;
	}

	public boolean isFavorited(){
		return favorited;
	}

	public int getDisplayTextRangeEnd(){
		return displayTextRangeEnd;
	}

	public int getAccessLevel(){
		return accessLevel;
	}

	public boolean isRetweet(){
		return retweet;
	}

	public boolean isTruncated(){
		return truncated;
	}

	public int getDisplayTextRangeStart(){
		return displayTextRangeStart;
	}

	public int getQuotedStatusId(){
		return quotedStatusId;
	}

	public Object getRateLimitStatus(){
		return rateLimitStatus;
	}

	public Object getInReplyToScreenName(){
		return inReplyToScreenName;
	}

	public boolean isPossiblySensitive(){
		return possiblySensitive;
	}

	public Object getGeoLocation(){
		return geoLocation;
	}

	public Object getQuotedStatus(){
		return quotedStatus;
	}

	public Object getScopes(){
		return scopes;
	}

	public List<Object> getContributors(){
		return contributors;
	}

	public boolean isRetweetedByMe(){
		return retweetedByMe;
	}

	public List<Object> getSymbolEntities(){
		return symbolEntities;
	}

	public User getUser(){
		return user;
	}

	public List<Object> getUrlentities(){
		return urlentities;
	}

	public int getRetweetCount(){
		return retweetCount;
	}

	public Object getWithheldInCountries(){
		return withheldInCountries;
	}

	public int getFavoriteCount(){
		return favoriteCount;
	}
}