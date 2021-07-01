package br.com.creditcard.model;

import java.util.Arrays;
import java.util.Date;

public abstract class CartaoCredito {
	
	private long creditCardId;
	private String cardNumber;
	private String bandeira;
	
	private Portador portador;
	private Portador titular;
	
	private Date validade;
	private int cvv;
	private String emissor;
	private int diaVencimentoFatura;
	private double valorLimite;
	private double valorSaldo;
	private String segmento;
	private double valorAnuidade;
	private String tecnologia[];
		
	public CartaoCredito() {
		System.out.println("Inicializando a classe Pai Cartão de Crédito");
	}

	

	public CartaoCredito(String cardNumber, Portador portador) {
		super();
		this.cardNumber = cardNumber;
		this.portador = portador;
	}



	@Override
	public String toString() {
		return "CartaoCredito [creditCardId=" + creditCardId + ", cardNumber=" + cardNumber + ", bandeira=" + bandeira
				+ ", portador=" + portador + ", titular=" + titular + ", validade=" + validade + ", cvv=" + cvv
				+ ", emissor=" + emissor + ", diaVencimentoFatura=" + diaVencimentoFatura + ", valorLimite="
				+ valorLimite + ", valorSaldo=" + valorSaldo + ", segmento=" + segmento + ", valorAnuidade="
				+ valorAnuidade + ", tecnologia=" + Arrays.toString(tecnologia) + "]";
	}
	
	public long getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(long creditCardId) {
		this.creditCardId = creditCardId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public Portador getPortador() {
		return portador;
	}
	public void setPortador(Portador portador) {
		this.portador = portador;
	}
	public Portador getTitular() {
		return titular;
	}
	public void setTitular(Portador titular) {
		this.titular = titular;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
	public int getDiaVencimentoFatura() {
		return diaVencimentoFatura;
	}
	public void setDiaVencimentoFatura(int diaVencimentoFatura) {
		this.diaVencimentoFatura = diaVencimentoFatura;
	}
	public double getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	public double getValorSaldo() {
		return valorSaldo;
	}
	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public double getValorAnuidade() {
		return valorAnuidade;
	}
	public void setValorAnuidade(double valorAnuidade) {
		this.valorAnuidade = valorAnuidade;
	}
	public String[] getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String[] tecnologia) {
		this.tecnologia = tecnologia;
	}
		
}
