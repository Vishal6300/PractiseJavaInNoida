package com.bbi.CurrencyConversion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbi.CurrencyConversion.model.Currency;
import com.bbi.CurrencyConversion.repository.CurrencyRepo;

@Service
public class CurrencyServiceImpl implements CurrencyService{

	@Autowired
	CurrencyRepo repo;
	
	@Override
	public double currencyChanger(String inputCode, Integer amount, String outputCode) {
		// TODO Auto-generated method stub
		Optional<Currency> inputCurrency = repo.findById(inputCode);
		if(!inputCurrency.isPresent()) {
//			throw new 
		}
		
		Optional<Currency> outputCurrency = repo.findById(outputCode);
		if(!outputCurrency.isPresent()) {
//			throw new 
		}
		
		double result = amount * inputCurrency.get().getCurrRate();
		result = result / outputCurrency.get().getCurrRate();
		
		
		return result;
	}

}
