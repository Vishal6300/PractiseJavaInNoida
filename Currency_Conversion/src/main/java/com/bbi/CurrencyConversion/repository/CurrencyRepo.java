package com.bbi.CurrencyConversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbi.CurrencyConversion.model.Currency;

public interface CurrencyRepo extends JpaRepository<Currency, String>{
	
}
