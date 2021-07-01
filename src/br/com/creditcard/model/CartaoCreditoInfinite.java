package br.com.creditcard.model;

import java.util.Arrays;

public class CartaoCreditoInfinite extends CartaoCredito {
	
	private String renovarSeguro;
	
	
	
	public String getRenovarSeguro() {
		return renovarSeguro;
	}

	public void setRenovarSeguro(String renovarSeguro) {
		this.renovarSeguro = renovarSeguro;
	}

	public CartaoCreditoInfinite() {
		super();
	}

	public CartaoCreditoInfinite(boolean saldoReduzido) {
		super();
		this.saldoReduzido = saldoReduzido;
	}
	
	

	@Override
	public String toString() {
		return "CartaoCreditoInfinite [saldoReduzido=" + saldoReduzido + ", toString()=" + super.toString()
				+ ", getCreditCardId()=" + getCreditCardId() + ", getCardNumber()=" + getCardNumber()
				+ ", getBandeira()=" + getBandeira() + ", getPortador()=" + getPortador() + ", getTitular()="
				+ getTitular() + ", getValidade()=" + getValidade() + ", getCvv()=" + getCvv() + ", getEmissor()="
				+ getEmissor() + ", getDiaVencimentoFatura()=" + getDiaVencimentoFatura() + ", getValorLimite()="
				+ getValorLimite() + ", getValorSaldo()=" + getValorSaldo() + ", getSegmento()=" + getSegmento()
				+ ", getValorAnuidade()=" + getValorAnuidade() + ", getTecnologia()=" + Arrays.toString(getTecnologia())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	private boolean saldoReduzido;

	public boolean isSaldoReduzido() {
		return saldoReduzido;
	}

	public void setSaldoReduzido(boolean saldoReduzido) {
		this.saldoReduzido = saldoReduzido;
	}
	
	

}
