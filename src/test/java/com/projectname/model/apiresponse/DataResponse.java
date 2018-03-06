package com.projectname.model.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projectname.model.apirequest.Batch;
import com.projectname.model.apirequest.Mids;
import com.projectname.model.apirequest.Settings;

import java.util.List;

public class DataResponse {
	@JsonProperty("settings")
	private Settings settings;
	@JsonProperty("batch")
	private Batch batch;
	@JsonProperty("mids")
	private List<Mids> mids;

	public Settings getSettings() {
		return this.settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public Batch getBatch() {
		return this.batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public List<Mids> getMids() {
		return this.mids;
	}

	public void setMids(List<Mids> mids) {
		this.mids = mids;
	}
}