package currency.converter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import currency.converter.model.ConversionRequest;
import currency.converter.model.ConversionResponse;
import currency.converter.service.CurrencyConverterService;

@RestController
@RequestMapping("currency")
public class ConverterController {
	
	@Autowired
	CurrencyConverterService service;
	
	@PostMapping("conversion")
	public ConversionResponse concurrencyConversion(@RequestBody ConversionRequest entity) {
		//TODO: process POST request
		
		return service.getCurrency(entity);
	}
	
	

}
