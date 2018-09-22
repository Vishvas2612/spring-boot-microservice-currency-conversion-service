package com.atishay.currencyconversation.model;

public class CurrencyConversionBean {

	private String id;
	private String currencyFrom;
	private String currencyTo;
	private Double conversationRate;
	private Double quantity;
	private Double totalCalculatedAmount;

	public CurrencyConversionBean() {

	}

	public CurrencyConversionBean(String id, String currencyFrom, String currencyTo, Double conversationRate,
			Double quantity, Double totalCalculatedAmount) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.conversationRate = conversationRate;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public Double getConversationRate() {
		return conversationRate;
	}

	public void setConversationRate(Double conversationRate) {
		this.conversationRate = conversationRate;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(Double totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

}
