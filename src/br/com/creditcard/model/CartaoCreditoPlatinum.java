package br.com.creditcard.model;

public class CartaoCreditoPlatinum extends CartaoCredito {
	
	
	
	public CartaoCreditoPlatinum() {
		super();
	}

	public CartaoCreditoPlatinum(String seguroPerda) {
		super();
		this.seguroPerda = seguroPerda;
	}

	private String seguroPerda;

	public String getSeguroPerda() {
		return seguroPerda;
	}

	public void setSeguroPerda(String seguroPerda) {
		this.seguroPerda = seguroPerda;
	}
	
	

}
