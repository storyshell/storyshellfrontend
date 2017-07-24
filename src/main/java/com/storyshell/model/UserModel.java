package com.storyshell.model;

import java.io.Serializable;

public class UserModel implements Serializable {
	private int profileImageId;
	private String username;
	private String profileUrl;

	public int getProfileImageId() {
		return profileImageId;
	}

	public void setProfileImageId(int profileImageId) {
		this.profileImageId = profileImageId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
}
