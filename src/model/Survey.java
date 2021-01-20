package model;

import java.io.Serializable;

public class Survey implements Serializable{
	private String userId;
	private String name;
	private int like;
	private String text;

	public Survey(String userId, String name, int like, String text) {
		super();
		this.userId = userId;
		this.name = name;
		this.like = like;
		this.text = text;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public int getLike() {
		return like;
	}

	public String getText() {
		return text;
	}
}
