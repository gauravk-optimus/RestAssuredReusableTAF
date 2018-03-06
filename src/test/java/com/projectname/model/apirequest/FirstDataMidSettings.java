package com.projectname.model.apirequest;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class contains settings fields of FirstData API
 * 
 * @author Optimus
 *
 */
public class FirstDataMidSettings extends MidSettings{

	@JsonProperty("gge4_exactid")
	private String gge4ExactId;
	
	@JsonProperty("gge4_xfpsequence")
	private String gge4XfpSequence;
	
	@JsonProperty("gge4_xlogin")
	private String gge4XLogin;
	
	@JsonProperty("gge4_password")
	private String gge4Password;
	
	public String getGge4Password() {
		return gge4Password;
	}

	public void setGge4Password(String gge4Password) {
		this.gge4Password = gge4Password;
	}

	public String getGge4XLogin() {
		return this.gge4XLogin;
	}

	public void setGge4XLogin(String gge4XLogin) {
		this.gge4XLogin = gge4XLogin;
	}
		
	public String getGge4XfpSequence() {
		return this.gge4XfpSequence;
	}

	public void setGge4XfpSequence(String gge4XfpSequence) {
		this.gge4XfpSequence = gge4XfpSequence;
	}
		
	public String getGge4ExactId() {
		return this.gge4ExactId;
	}

	public void setGge4ExactId(String gge4ExactId) {
		this.gge4ExactId = gge4ExactId;
	}
}
