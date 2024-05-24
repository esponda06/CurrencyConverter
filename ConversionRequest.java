package currency.converter.model;

public class ConversionRequest {

	private String currency;
	private String destCurrency;
	private Double amount;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDestCurrency() {
		return destCurrency;
	}
	public void setDestCurrency(String destCurrency) {
		this.destCurrency = destCurrency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
}
