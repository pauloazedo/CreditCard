package br.com.creditcard.test;

import br.com.creditcard.action.PagarFaturaInfinite;
import br.com.creditcard.model.CartaoCreditoInfinite;
import br.com.creditcard.model.Portador;

public class PagamentoFaturaInfiniteTest {

	public static void main(String[] args) {

		CartaoCreditoInfinite cartaoCreditoInfinite = new CartaoCreditoInfinite();
		
		cartaoCreditoInfinite.setCardNumber("0000 1111 2222 3333");
//		cartaoCreditoInfinite.setCvv("281");
		cartaoCreditoInfinite.setValorSaldo(2000.00);
		
		Portador portador = new Portador();
		portador.setCpfPortador("123");
		portador.setNomePortador("Joao");
		portador.setValorLimite(10000.00);
		
		cartaoCreditoInfinite.setPortador(portador);
		
		PagarFaturaInfinite pagarFaturaInfinite = new PagarFaturaInfinite();
		pagarFaturaInfinite.efetuarPagamento(cartaoCreditoInfinite, 200);
		pagarFaturaInfinite.renovarSeguro(cartaoCreditoInfinite);
		
	}

}
