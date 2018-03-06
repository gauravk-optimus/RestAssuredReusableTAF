package com.projectname.model.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projectname.model.apirequest.MidSettings;
import com.projectname.model.apirequest.Orders;

import java.util.List;

public class Mids {
	@JsonProperty("settings")
	private MidSettings settings;
	@JsonProperty("orders")
	private List<Orders> orders;

	public MidSettings getSettings() {
		return this.settings;
	}

	public void setSettings(MidSettings settings) {
		this.settings = settings;
	}

	public List<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
}