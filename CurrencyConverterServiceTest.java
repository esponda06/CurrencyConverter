package currency.converter.service;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import currency.converter.model.ConversionRequest;
import currency.converter.model.ConversionResponse;

@SpringBootTest
public class CurrencyConverterServiceTest {
	
	@Autowired
	CurrencyConverterServiceImpl service;
	
	@Test
	public void getCurrencyTest() {
		ConversionRequest req = new ConversionRequest();
		req.setAmount(100.0);
		req.setCurrency("USD");
		req.setDestCurrency("MXN");
		
		ConversionResponse resp =  service.getCurrency(req);
		
		Double result = 1673.0;
		assertEquals("MXN",resp.getCurrency());
		assertEquals(result,resp.getAmount());
	}

}
