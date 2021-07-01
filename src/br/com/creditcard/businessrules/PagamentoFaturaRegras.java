package br.com.creditcard.businessrules;

import br.com.creditcard.model.CartaoCredito;

public class PagamentoFaturaRegras {
	
	public boolean validarPagamento(CartaoCredito cartaoCredito, double valorPagamento) {
		boolean menor10percent = true;
		boolean maiorquetotal = true;
		boolean a = true;
		
		// Verificar o valor do pagamento > que o saldo
		
		if ( valorPagamento > cartaoCredito.getValorSaldo() ) {
			maiorquetotal = false;
			a = maiorquetotal;
		}

		// Verificar o valor do pagamento mínimo (se < 10% do saldo)
		
		if ( valorPagamento < (cartaoCredito.getValorSaldo() * 0.1)) {
			menor10percent = false;
			a = menor10percent;
		}
		
		return a;
	}

}
