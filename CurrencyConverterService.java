package currency.converter.service;

import currency.converter.model.ConversionRequest;
import currency.converter.model.ConversionResponse;

public interface CurrencyConverterService {
	
	ConversionResponse getCurrency(ConversionRequest req);

}
