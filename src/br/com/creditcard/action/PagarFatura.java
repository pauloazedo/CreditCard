package br.com.creditcard.action;

import javax.swing.JOptionPane;

import br.com.creditcard.businessrules.PagamentoFaturaRegras;
import br.com.creditcard.model.CartaoCredito;

public class PagarFatura {
	
	public void efetuarPagamento( 
			CartaoCredito cartaoCredito,
			double valorPagamento ) {
		
		PagamentoFaturaRegras regras = new PagamentoFaturaRegras();
		boolean possivelPagar = regras.validarPagamento(cartaoCredito, valorPagamento);
		
		if (possivelPagar) {
		
		// debitar conta portador
		System.out.println("Debitando conta do Portador: ");
		
		// creditar a conta do banco
		System.out.println("Creditando conta do banco ...");
		
		// liberar o limite do cartao
		System.out.println("Liberando o limite ...");
		
		// iniciar novo ciclo de compra
		System.out.println("Liberando novo ciclo de compra");
		
		
		System.out.println("**********************************");
		System.out.println("Cliente: " + cartaoCredito.getPortador().getNomePortador() );
		System.out.println("N. Cartão: " + cartaoCredito.getCardNumber() );
		System.out.println("Valor Total: R$" + cartaoCredito.getValorSaldo());
		System.out.println("Valor Pago: R$ " + valorPagamento);
		System.out.println("");
		System.out.println("Autenticação: " + cartaoCredito);
		System.out.println("***********************************");
		
		} else {
			
			/*System.out.println("*********************");
			System.out.println("**** Nao Possivel ***");
			System.out.println("*********************"); */
			
			if (valorPagamento > cartaoCredito.getValorSaldo()) {
				JOptionPane.showMessageDialog(null, "Não é possível pagar. Valor maior que o total da fatura", "Erro no pagamento", JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Não é possível pagar. Valor menor que 10% do valor da fatura", "Erro no pagamento", JOptionPane.ERROR_MESSAGE);
				
			}
						
		}
	}

}
