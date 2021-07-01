package br.com.creditcard.action;

import javax.swing.JOptionPane;

import br.com.creditcard.model.CartaoCreditoBlack;
import br.com.creditcard.model.Portador;

public class PagamentoFaturaTest {

	public static void main(String[] args) {
		
		CartaoCreditoBlack cartaoCreditoBlack = new CartaoCreditoBlack();
		cartaoCreditoBlack.setCardNumber("5555 4444 3333 2222");
		cartaoCreditoBlack.setBandeira("Mastercard");
		cartaoCreditoBlack.setCvv(123);
		cartaoCreditoBlack.setValorSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da fatura:")));
		cartaoCreditoBlack.setSegmento("Black");
		cartaoCreditoBlack.setEmissor("Itau");
		
		Portador portador = new Portador();
		portador.setCpfPortador("12345678950");
		portador.setNomePortador("Paulo A"
				+ "zedo");
		portador.setValorLimite(5000.00);
		
		Portador titular = new Portador();
		titular.setCpfPortador("12345678990");
		titular.setNomePortador("Paulo Henrique Azedo");
		titular.setValorLimite(7000.00);
				
		cartaoCreditoBlack.setPortador(portador);
		cartaoCreditoBlack.setTitular(titular);
				
		PagarFatura pagarFatura = new PagarFatura();
		pagarFatura.efetuarPagamento(cartaoCreditoBlack, Double.parseDouble(JOptionPane.showInputDialog("Valor da fatura: " + cartaoCreditoBlack.getValorSaldo() + "\nValor a pagar: (minimo 10%)")));
		
	}

}
