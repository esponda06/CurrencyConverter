package currency.converter.service;

import org.springframework.stereotype.Service;

import currency.converter.model.ConversionRequest;
import currency.converter.model.ConversionResponse;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService {

	@Override
	public ConversionResponse getCurrency(ConversionRequest req) {
		// TODO Auto-generated method stub
		ConversionResponse resp = new ConversionResponse();
		
		Double conversionRate = 16.73;
		
		resp.setCurrency(req.getDestCurrency());
		resp.setAmount(req.getAmount() * conversionRate);
		
		return resp;
	}

}
