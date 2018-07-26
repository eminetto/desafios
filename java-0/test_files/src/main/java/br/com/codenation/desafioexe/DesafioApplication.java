package br.com.codenation.desafioexe;

import java.util.List;

import br.com.codenation.base.Desafio;
import br.com.codenation.base.TestadorDeDesafios;

public class DesafioApplication {

	public static void main(String[] args) {
		TestadorDeDesafios.testa(DesafioApplication.class);
	}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {
		return null;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {
		return null;
	}

}
