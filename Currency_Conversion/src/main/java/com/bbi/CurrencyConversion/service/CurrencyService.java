package com.bbi.CurrencyConversion.service;

import org.springframework.stereotype.Service;

@Service
public interface CurrencyService {
	public double currencyChanger(String currCode, Integer amount,String reqCurr);

}
