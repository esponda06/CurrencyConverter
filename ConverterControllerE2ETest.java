package currency.converter.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import currency.converter.CurrencyConverterApplication;
import currency.converter.model.ConversionRequest;
import currency.converter.model.ConversionResponse;

@SpringBootTest(classes = CurrencyConverterApplication.class)
public class ConverterControllerE2ETest {

	@Autowired
	WebApplicationContext context;
		
	private MockMvc mockMvc;
	
	@Test
	public void concurrencyConversionTest() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		
		ConversionRequest req = new ConversionRequest();
		req.setAmount(100.0);
		req.setCurrency("USD");
		req.setDestCurrency("MXN");
		
		
		ConversionResponse resp = new ConversionResponse();
		resp.setCurrency("MXN");
		resp.setAmount(1673.0);	
		
		try {
			mockMvc.perform(post("/currency/conversion")
					.contentType(MediaType.APPLICATION_JSON)
					.content(new ObjectMapper().writeValueAsString(req)))
					.andExpect(status().isOk())
					.andExpect(jsonPath("$.currency").value("MXN"))
					.andExpect(jsonPath("$.amount").value(1673.0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
