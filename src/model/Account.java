package model;

import java.io.Serializable;

public class Account implements Serializable {
	private String userId;
	private String pass;
	private String name;

	public Account(String userId, String pass, String name) {
		super();
		this.userId = userId;
		this.pass = pass;
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}
	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}


}
