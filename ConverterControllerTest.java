package currency.converter.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import currency.converter.model.ConversionRequest;
import currency.converter.model.ConversionResponse;
import currency.converter.service.CurrencyConverterService;

@SpringBootTest
public class ConverterControllerTest {
	
	
	@Autowired
	ConverterController controller;
	
	@Mock
	CurrencyConverterService servcie;
	
	
	@Test
	public void concurrencyConversionTest() {
		ConversionRequest req = new ConversionRequest();
		req.setAmount(100.0);
		req.setCurrency("USD");
		req.setDestCurrency("MXN");
		
		ConversionResponse resp = new ConversionResponse();
		
		when(servcie.getCurrency(any())).thenReturn(resp);
		
		controller.concurrencyConversion(req);
		
	}

}
