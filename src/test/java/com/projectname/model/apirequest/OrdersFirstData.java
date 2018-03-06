package com.projectname.model.apirequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdersFirstData{

	
	@JsonProperty("card_type")
	private String cardType;
	
	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}
