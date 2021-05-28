package com.demo.twitter.producer.EasyTwitter.ro;

public class UserMentionEntitiesItem{
	private int start;
	private String name;
	private int end;
	private String screenName;
	private long id;
	private String text;

	public int getStart(){
		return start;
	}

	public String getName(){
		return name;
	}

	public int getEnd(){
		return end;
	}

	public String getScreenName(){
		return screenName;
	}

	public long getId(){
		return id;
	}

	public String getText(){
		return text;
	}
}
