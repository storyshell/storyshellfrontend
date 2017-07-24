package com.storyshell.model;

import java.io.Serializable;
import java.util.List;

public class SearchModel implements Serializable {
	private String Name;
	private String location;
	private String profession;
	private String interest;
	private List<UserModel> userModel;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public List<UserModel> getUserModel() {
		return userModel;
	}

	public void setUserModel(List<UserModel> userModel) {
		this.userModel = userModel;
	}
}
