package com.projectname.model.apiresponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FormFields {
	@JsonProperty("FREEFORM")
	private String freeform;
	
	@JsonProperty("CARD_ZIP")
	private String cardZip;
	
	@JsonProperty("AVS-CODE")
	private String avsCode;
	
	@JsonProperty("RECEIPTCC")
	private String receiptcc;	
	
	@JsonProperty("AUTH-CODE")
	private String authCode1;
	
	@JsonProperty("AUTH_CODE")
	private String authCode2;
	
	@JsonProperty("CARD_TYPE")
	private String cardType;
	
	@JsonProperty("UNAME")
	private String uname;
	
	@JsonProperty("CARD_STATE")
	private String cardState;
	
	@JsonProperty("CARD_ADDRESS1")
	private String cardAddress1;
	
	@JsonProperty("SHIPINFO")
	private String shipInfo;
	
	@JsonProperty("AUTH-MSG")
	private String authMsg;
	
	@JsonProperty("DUMMYFIELD")
	private String dummyField;
	
	@JsonProperty("ACCTTYPE")
	private String acctType;
	
	@JsonProperty("PAYMETHOD")
	private String payMethod;
	
	@JsonProperty("PATH_INVOICE_CGI")
	private String pathInvoiceCgi;
	
	@JsonProperty("MERCHANT")
	private String merchant;
	
	@JsonProperty("CURRENCY")
	private String currency;	
	
	@JsonProperty("privacy")
	private String privacy;
	
	@JsonProperty("CARD_NAME")
	private String cardName;
	
	@JsonProperty("ELAPSEDTIMEPURCHASE")
	private String elapsedTimePurchase;
	
	@JsonProperty("IMAGE_PLACEMENT")
	private String imagePlacement;
	
	@JsonProperty("CLIENT")
	private String client;	
	
	@JsonProperty("PRIVACY")
	private String privacyParsed;
	
	@JsonProperty("EASYCART")
	private String easyCart;
	
	@JsonProperty("AUTHTYPE")
	private String authType;
	
	@JsonProperty("CARD_COUNTRY")
	private String cardCountry;
	
	@JsonProperty("FINALSTATUS")
	private String finalStatus;
	
	@JsonProperty("PROBLEM-LINK")
	private String problemLink;
	
	@JsonProperty("CARD_EXP")
	private String cardExp;
	
	@JsonProperty("CVVRESP")
	private String cvvResp;
	
	@JsonProperty("CONVERTFLG")
	private String convertFlg;
	
	@JsonProperty("PG2_STATEMENT")
	private String pg2Statement;
	
	@JsonProperty("TRANSFLAGS")
	private String transFlags;
	
	@JsonProperty("USER_AGENT")
	private String userAgent;
	
	@JsonProperty("txntype_id")
	private String txnTypeId;
	
	@JsonProperty("card_name")
	private String cardName2;
	
	@JsonProperty("card_type_with_number")
	private String cardTypeWithNumber;
	
	@JsonProperty("transaction_token")
	private String transactionToken;
	
	@JsonProperty("CARD_CITY")
	private String cardCity;
	
	@JsonProperty("AMOUNTCHARGED")
	private String amountCharged;
	
	@JsonProperty("PATH_CGI")
	private String pathCgi;
	
	@JsonProperty("MNKY_SHOWNAV")
	private String mnkyShownavParsed;
	
	@JsonProperty("BADCARD-LINK")
	private String badcardLink;
	
	@JsonProperty("IPADDRESS")
	private String ipAddress;
	
	@JsonProperty("TAX")
	private String tax;
	
	@JsonProperty("REFERRER")
	private String referrer;
	
	@JsonProperty("EMAIL")
	private String email;
	
	@JsonProperty("CONVERT")
	private String convert;
	
	@JsonProperty("COUNTRY")
	private String country;
	
	@JsonProperty("CARD_ALLOWED")
	private String cardAllowed;
	
	@JsonProperty("RESP-CODE")
	private String respCode;
	
	@JsonProperty("PAIRSREF")
	private String pairsref;
	
	@JsonProperty("ID")
	private String id;
	
	@JsonProperty("TXNTYPE_ID")
	private String txntypeIdParsed;
	
	@JsonProperty("MERRMSG")	
	private String merrmsg;	
	
	@JsonProperty("mnky_shownav")
	private String mnkyShownav;	
	
	@JsonProperty("CARD_NUMBER")
	private String cardNumber;
	
	@JsonProperty("REFERENCE_NO")
	private String referenceNumber;
	
	@JsonProperty("X_RESPONSE_CODE")
	private String xResponseCode;
	
	@JsonProperty("TRANSACTIONCARDTYPE")
	private String transactionCardType;
	
	@JsonProperty("TRNORDERNUMBER")
	private String trnOrderNumber;
	
	@JsonProperty("X_TRANS_ID")
	private String xTransId;
	
	public String getXTransId() {
		return this.xTransId;
	}

	public void setXTransId(String xTransId) {
		this.xTransId = xTransId;
	}
	
	public String getTransactionCardType() {
		return this.transactionCardType;
	}

	public void setTransactionCardType(String transactionCardType) {
		this.transactionCardType = transactionCardType;
	}
	
	public String getXResponseCode() {
		return this.xResponseCode;
	}

	public void setXResponseCode(String xResponseCode) {
		this.xResponseCode = xResponseCode;
	}
	
	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	
	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getFreeform() {
		return this.freeform;
	}

	public void setFreeform(String freeform) {
		this.freeform = freeform;
	}

	public String getCardZip() {
		return this.cardZip;
	}

	public void setCardZip(String cardZip) {
		this.cardZip = cardZip;
	}
	
	public String getAvsCode() {
		return this.avsCode;
	}

	public void setAvsCode(String avsCode) {
		this.avsCode = avsCode;
	}
	
	public String getReceiptcc() {
		return this.receiptcc;
	}

	public void setReceiptcc(String receiptcc) {
		this.receiptcc = receiptcc;
	}
	public String getAuthCode1() {
		return this.authCode1;
	}

	public void setAuthCode1(String authCode1) {
		this.authCode1 = authCode1;
	}

	public String getAuthCode2() {
		return this.authCode2;
	}

	public void setAuthCode2(String authCode2) {
		this.authCode2 = authCode2;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getCardState() {
		return this.cardState;
	}

	public void setCardsata(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCardAddress1() {
		return this.cardAddress1;
	}

	public void setCardAddress1(String cardAddress1) {
		this.cardAddress1 = cardAddress1;
	}	
	
	public String getShipInfo() {
		return this.shipInfo;
	}

	public void setShipInfo(String shipInfo) {
		this.shipInfo = shipInfo;
	}
	
	public String getAuthMsg() {
		return this.authMsg;
	}

	public void setSAuthMsg(String authMsg) {
		this.authMsg = authMsg;
	}
	
	public String getDummyField() {
		return this.dummyField;
	}

	public void setDummyField(String dummyField) {
		this.dummyField = dummyField;
	}
	
	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
	public String getPayMethod() {
		return this.payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	
	public String getPathInvoiceCgi() {
		return this.pathInvoiceCgi;
	}

	public void setPathInvoiceCgi(String pathInvoiceCgi) {
		this.pathInvoiceCgi = pathInvoiceCgi;
	}

	public String getMerchant() {
		return this.merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getPrivacy() {
		return this.privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	
	public String getCardName() {
		return this.cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}	
	
	public String getElapsedTimePurchase() {
		return this.elapsedTimePurchase;
	}

	public void setElapsedTimePurchase(String elapsedTimePurchase) {
		this.elapsedTimePurchase = elapsedTimePurchase;
	}

	public String getImagePlacement() {
		return this.imagePlacement;
	}

	public void setImagePlacement(String imagePlacement) {
		this.imagePlacement = imagePlacement;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}
	
	public String getPrivacyToParse() {
		return this.privacyParsed;
	}

	public void setPrivacyParsed(String privacyParsed) {
		this.privacyParsed = privacyParsed;
	}
	
	public String getEasyCart() {
		return this.easyCart;
	}

	public void setEasyCart(String easyCart) {
		this.easyCart = easyCart;
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getCardCountry() {
		return this.cardCountry;
	}

	public void setCardCountry(String cardCountry) {
		this.cardCountry = cardCountry;
	}

	public String getFinalStatus() {
		return this.finalStatus;
	}

	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}

	public String getProblemLink() {
		return this.problemLink;
	}

	public void setProblemLink(String problemLink) {
		this.problemLink = problemLink;
	}

	public String getCardExp() {
		return this.cardExp;
	}

	public void setCardExp(String cardExp) {
		this.cardExp = cardExp;
	}	

	public String getCvvResp() {
		return this.cvvResp;
	}

	public void setCvvResp(String cvvResp) {
		this.cvvResp = cvvResp;
	}	

	public String getConvertFlg() {
		return this.convertFlg;
	}

	public void setConvertFlg(String convertFlg) {
		this.convertFlg = convertFlg;
	}
	
	public String getPg2Statement() {
		return this.pg2Statement;
	}

	public void setPg2Statement(String pg2Statement) {
		this.pg2Statement = pg2Statement;
	}
	
	public String getTransFlags() {
		return this.transFlags;
	}

	public void setTransFlags(String transFlags) {
		this.transFlags = transFlags;
	}
	
	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	
	
	public String getCardName2() {
		return this.cardName2;
	}

	public void setCardName2(String cardName2) {
		this.cardName2 = cardName2;
	}

	public String getCardTypeWithNumber() {
		return this.cardTypeWithNumber;
	}

	public void setCardTypeWithNumber(String cardTypeWithNumber) {
		this.cardTypeWithNumber = cardTypeWithNumber;
	}	

	public String getTransactionToken() {
		return this.transactionToken;
	}

	public void setTransactionToken(String transactionToken) {
		this.transactionToken = transactionToken;
	}	
	
	public String getCardCity() {
		return this.cardCity;
	}

	public void setCardCity(String cardCity) {
		this.cardCity = cardCity;
	}	
	
	public String getAmountCharged() {
		return this.amountCharged;
	}

	public void setAmountCharged(String amountCharged) {
		this.amountCharged = amountCharged;
	}
	
	public String getPathCgi() {
		return this.pathCgi;
	}

	public void setpathCgi(String pathCgi) {
		this.pathCgi = pathCgi;
	}
	
	public String getMnkyShownav() {
		return this.mnkyShownav;
	}

	public void setMnkyShownav(String mnkyShownav) {
		this.mnkyShownav = mnkyShownav;
	}

	public String getBadcardLink() {
		return this.badcardLink;
	}

	public void setBadcardLink(String badcardLink) {
		this.badcardLink = badcardLink;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getTax() {
		return this.tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getReferrer() {
		return this.referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmailParsed(String email) {
		this.email = email;
	}

	public String getConvert() {
		return this.convert;		
	}

	public void setConvert(String convert) {
		this.convert = convert;
	}
	
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
	
	public String getCardAllowed() {
		return this.cardAllowed;
	}

	public void setCardAllowed(String cardAllowed) {
		this.cardAllowed = cardAllowed;
	}	
	
	public String getRespCode() {
		return this.respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	
	public String getPairsref() {
		return this.pairsref;
	}

	public void setPairsref(String pairsref) {
		this.pairsref = pairsref;
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}	

	public String getTxntypeIdParsed() {
		return this.txntypeIdParsed;
	}

	public void setTxntypeIdParsed(String txntypeIdParsed) {
		this.txntypeIdParsed = txntypeIdParsed;
	}	

	public String getMerrmsg() {
		return this.merrmsg;
	}

	public void setMerrmsg(String merrmsg) {
		this.merrmsg = merrmsg;
	}

	public String getMnkyShownavParsed() {
		return this.mnkyShownavParsed;
	}

	public void setMnkyShownavParsed(String mnkyShownavParsed) {
		this.mnkyShownavParsed = mnkyShownavParsed;
	}

	public String getTrnOrderNumber() {
		return trnOrderNumber;
	}

	public void setTrnOrderNumber(String trnOrderNumber) {
		this.trnOrderNumber = trnOrderNumber;
	}
}