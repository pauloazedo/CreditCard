package br.com.creditcard.model;

import java.util.Arrays;

public class CartaoCreditoBlack extends CartaoCredito {
	
	public CartaoCreditoBlack() {
		//super();
	}

	public CartaoCreditoBlack(String cardNumber, Portador portador, String salaVip) {
		super(cardNumber, portador);
		this.salaVip = salaVip;
		
	}
	
	
	
	@Override
	public String toString() {
		return "CartaoCreditoBlack [salaVip=" + salaVip + ", toString()=" + super.toString() + ", getCreditCardId()="
				+ getCreditCardId() + ", getCardNumber()=" + getCardNumber() + ", getBandeira()=" + getBandeira()
				+ ", getPortador()=" + getPortador() + ", getTitular()=" + getTitular() + ", getValidade()="
				+ getValidade() + ", getCvv()=" + getCvv() + ", getEmissor()=" + getEmissor()
				+ ", getDiaVencimentoFatura()=" + getDiaVencimentoFatura() + ", getValorLimite()=" + getValorLimite()
				+ ", getValorSaldo()=" + getValorSaldo() + ", getSegmento()=" + getSegmento() + ", getValorAnuidade()="
				+ getValorAnuidade() + ", getTecnologia()=" + Arrays.toString(getTecnologia()) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}



	private String salaVip;

	public String getSalaVip() {
		return salaVip;
	}

	public void setSalaVip(String salaVip) {
		this.salaVip = salaVip;
	}
	
	
	

}
