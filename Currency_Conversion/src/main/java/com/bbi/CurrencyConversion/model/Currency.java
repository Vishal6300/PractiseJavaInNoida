package com.bbi.CurrencyConversion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="currency")
public class Currency {
	
	@Id
	@Column(name="currency_code", nullable = false)
	private String currCode;
	@Column(name="currency_name", nullable = false)
	private String currName;
	@Column(name="currency_symbol")
	private String currSymbol;
	@Column(name="Country", nullable = false)
	private String country;
	@Column(name="Comments")
	private String comments;
	@Column(name="currency_rate")
	private Double currRate;
	@Column(name="active_inactive")
	private Boolean activeInActive;
	
	
	public String getCurrCode() {
		return currCode;
	}
	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}
	public String getCurrName() {
		return currName;
	}
	public void setCurrName(String currName) {
		this.currName = currName;
	}
	public String getCurrSymbol() {
		return currSymbol;
	}
	public void setCurrSymbol(String currSymbol) {
		this.currSymbol = currSymbol;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Double getCurrRate() {
		return currRate;
	}
	public void setCurrRate(Double currRate) {
		this.currRate = currRate;
	}
	public Boolean getActiveInActive() {
		return activeInActive;
	}
	public void setActiveInActive(Boolean activeInActive) {
		this.activeInActive = activeInActive;
	}
	public Currency(String currCode, String currName, String currSymbol, String country, String comments,
			Double currRate, Boolean activeInActive) {
		super();
		this.currCode = currCode;
		this.currName = currName;
		this.currSymbol = currSymbol;
		this.country = country;
		this.comments = comments;
		this.currRate = currRate;
		this.activeInActive = activeInActive;
	}
	
	@Override
	public String toString() {
		return "Currency [currCode=" + currCode + ", currName=" + currName + ", currSymbol=" + currSymbol + ", country="
				+ country + ", comments=" + comments + ", currRate=" + currRate + ", activeInActive=" + activeInActive
				+ "]";
	}
	
	
	

}
