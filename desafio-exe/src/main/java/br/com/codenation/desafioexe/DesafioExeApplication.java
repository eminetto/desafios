package br.com.codenation.desafioexe;

import br.com.codenation.base.Desafio;
import br.com.codenation.base.Testador;

public class DesafioExeApplication {

	public static void main(String[] args) {
		Testador.testa(DesafioExeApplication.class);
	}

	@Desafio("Primeiro")
	public static int seuMetodo(Integer a) {
		return a + 3;
	}

}
