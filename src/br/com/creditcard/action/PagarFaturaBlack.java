package br.com.creditcard.action;

import br.com.creditcard.model.CartaoCreditoBlack;

public class PagarFaturaBlack extends PagarFatura {
	
	public void liberarSalaVip(CartaoCreditoBlack cartaoCredito) {
		System.out.println("**************************************");
		System.out.println(" Sala Vip do Cartão: " + cartaoCredito.getCardNumber());
		System.out.println("**************************************");
	}

}
