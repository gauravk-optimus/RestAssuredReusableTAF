package com.projectname.model.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Batch {
	@JsonProperty("batch_id")
	private String batchId;
	@JsonProperty("error_email")
	private String errorEmail;
	@JsonProperty("completion_email")
	private String completionEmail;
	@JsonProperty("send_email")
	private String sendEmail;

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getErrorEmail() {
		return this.errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public String getCompletionEmail() {
		return this.completionEmail;
	}

	public void setCompletionEmail(String completionEmail) {
		this.completionEmail = completionEmail;
	}

	public String getSendEmail() {
		return this.sendEmail;
	}

	public void setSendEmail(String sendEmail) {
		this.sendEmail = sendEmail;
	}
}