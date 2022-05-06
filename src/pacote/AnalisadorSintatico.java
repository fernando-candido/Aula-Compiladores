package pacote;

import java.util.List;

public class AnalisadorSintatico {

	
	public void analisar(List<String> progama, List<Expressoes> expressoes) {
	
		int erros = 0;
		for(String linha: progama) {
			if(!linhaAprovada(linha.trim(), expressoes)) {
				System.out.println("Erro na linha:" + linha);
			}
		}
	}
	
	public void linhaAprovada() {
		for(String exp: expressoes) {
			if(linha.matches(exp)){
				return true;
			}
		}
		return false;
	}
	
}
