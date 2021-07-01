package br.com.creditcard.test;

import br.com.creditcard.model.CartaoCreditoBlack;

public class CartaoCreditoHerancaTest {

	public static void main(String[] args) {

		//CartaoCredito cartaoCredito = new CartaoCredito();
		
		//CartaoCreditoBlack cartaoCreditoBlack = new CartaoCreditoBlack();
		
		CartaoCreditoBlack CartaoCreditoBlack = new CartaoCreditoBlack("123", null, "Sala Vip Cumbica");
		
		System.out.println(CartaoCreditoBlack);

	}

}
