package br.com.creditcard.action;

import br.com.creditcard.model.CartaoCreditoInfinite;

public class PagarFaturaInfinite extends PagarFatura {
	
	public void renovarSeguro (CartaoCreditoInfinite cartaoCreditoInfinite) {
		
//		System.out.println("**************************************");
		System.out.println("Seguro renovado para o cart�o " + cartaoCreditoInfinite.getCardNumber());
		System.out.println("***********************************"
				+ "");
		
	}

}
