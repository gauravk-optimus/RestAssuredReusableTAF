package com.projectname.model.apiresponse;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MidSettings{
	
	@JsonProperty("mid_username")
	private String midUsername;
	
	@JsonProperty("mid_key")
	private String midKey;

	public String getMidUsername() {
		return this.midUsername;
	}

	public void setMidUsername(String midUsername) {
		this.midUsername = midUsername;
	}

	public String getMidKey() {
		return this.midKey;
	}

	public void setMidKey(String midKey) {
		this.midKey = midKey;
	}
	

}