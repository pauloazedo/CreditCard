package br.com.creditcard.model;

public class Portador extends Pessoa {
	
	private long portadorId;
	private String cpfPortador;
	private String enderecoPortador;
	private String nomePortador;
	private double valorLimite;
		
	public Portador() {
		super();
	}

	public Portador(long portadorId, String cpfPortador, String enderecoPortador, String nomePortador,
			double valorLimite) {
		super();
		this.portadorId = portadorId;
		this.cpfPortador = cpfPortador;
		this.enderecoPortador = enderecoPortador;
		this.nomePortador = nomePortador;
		this.valorLimite = valorLimite;
	}

	@Override
	public String toString() {
		return "Portador [portadorId=" + portadorId + ", cpfPortador=" + cpfPortador + ", enderecoPortador="
				+ enderecoPortador + ", nomePortador=" + nomePortador + ", valorLimite=" + valorLimite + "]";
	}
	
	public long getPortadorId() {
		return portadorId;
	}
	public void setPortadorId(long portadorId) {
		this.portadorId = portadorId;
	}
	public String getCpfPortador() {
		return cpfPortador;
	}
	public void setCpfPortador(String cpfPortador) {
		this.cpfPortador = cpfPortador;
	}
	public String getEnderecoPortador() {
		return enderecoPortador;
	}
	public void setEnderecoPortador(String enderecoPortador) {
		this.enderecoPortador = enderecoPortador;
	}
	public String getNomePortador() {
		return nomePortador;
	}
	public void setNomePortador(String nomePortador) {
		this.nomePortador = nomePortador;
	}
	public double getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	

}
