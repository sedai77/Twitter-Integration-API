package com.demo.twitter.producer.EasyTwitter.ro;

import java.util.List;

public class MediaEntitiesItem{
	private String mediaURLHttps;
	private String mediaURL;
	private int start;
	private String expandedURL;
	private String type;
	private String url;
	private String displayURL;
	private int videoAspectRatioWidth;
	private Sizes sizes;
	private int videoDurationMillis;
	private List<Object> videoVariants;
	private Object extAltText;
	private int videoAspectRatioHeight;
	private int end;
	private long id;
	private String text;

	public String getMediaURLHttps(){
		return mediaURLHttps;
	}

	public String getMediaURL(){
		return mediaURL;
	}

	public int getStart(){
		return start;
	}

	public String getExpandedURL(){
		return expandedURL;
	}

	public String getType(){
		return type;
	}

	public String getUrl(){
		return url;
	}

	public String getDisplayURL(){
		return displayURL;
	}

	public int getVideoAspectRatioWidth(){
		return videoAspectRatioWidth;
	}

	public Sizes getSizes(){
		return sizes;
	}

	public int getVideoDurationMillis(){
		return videoDurationMillis;
	}

	public List<Object> getVideoVariants(){
		return videoVariants;
	}

	public Object getExtAltText(){
		return extAltText;
	}

	public int getVideoAspectRatioHeight(){
		return videoAspectRatioHeight;
	}

	public int getEnd(){
		return end;
	}

	public long getId(){
		return id;
	}

	public String getText(){
		return text;
	}
}