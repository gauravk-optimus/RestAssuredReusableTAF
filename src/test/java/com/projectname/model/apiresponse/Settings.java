package com.projectname.model.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Settings {
	@JsonProperty("pnp_master_password")
	private String pnpMasterPassword;
	@JsonProperty("pnp_master_username")
	private String pnpMasterUsername;
	private String pnpApiUrl = null;

	public String getPnpApiUrl() {
		return this.pnpApiUrl;
	}

	public void setPnpApiUrl(String pnpApiUrl) {
		this.pnpApiUrl = pnpApiUrl;
	}

	public String getPnpMasterPassword() {
		return this.pnpMasterPassword;
	}

	public void setPnpMasterPassword(String pnpMasterPassword) {
		this.pnpMasterPassword = pnpMasterPassword;
	}

	public String getPnpMasterUsername() {
		return this.pnpMasterUsername;
	}

	public void setPnpMasterUsername(String pnpMasterUsername) {
		this.pnpMasterUsername = pnpMasterUsername;
	}
}