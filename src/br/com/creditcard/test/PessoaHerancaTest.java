package br.com.creditcard.test;

import br.com.creditcard.model.Cliente;
import br.com.creditcard.model.GerenteRelacionamento;
import br.com.creditcard.model.Pessoa;
import br.com.creditcard.model.Portador;

public class PessoaHerancaTest {

	public static void main(String[] args) {

		GerenteRelacionamento gerenteRelacionamento = new GerenteRelacionamento();
		gerenteRelacionamento.setDocumentoIdentificacao("123");

		Portador portador = new Portador();
		
		Cliente cliente = new Cliente();
		
		//Pessoa pessoa = new Pessoa();
		

	}

}
