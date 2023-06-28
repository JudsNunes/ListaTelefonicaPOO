package com.Estudo.LucasNunes24;

public class Test {

	private static void main(String [] args) {
		
		//Relacionamento entre classes
		
		Contato contato = new Contato();
		
		contato.setNome("Lucas");
		contato.setSoliciticao("Pedido");
		
		//Erro
		//contato.getEndereco();
		
		Endereco end = new Endereco();
		
		end.setBairro("bomba");
		end.setCep(52080525);
		end.setNumeroRua(538);
		end.setRua("Aurea");
		
		//estamos relacionando a classe Endereco com a classe end
		contato.setEndereco(end);
		
		System.out.println(contato.getEndereco().getBairro());
		
		
		
	}
		
	
}
