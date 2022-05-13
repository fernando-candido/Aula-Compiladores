package pacote;

import java.util.List;

public class AnalisadorSintatico {

	
	public void analisar(List<String> progama, List<String> expressoes) {
		int erros = 0;
		for(String linha: progama) {
			if(!linhaAprovada(linha.trim(), expressoes)) {
				System.out.println("Erro na linha:" + linha);
				erros++;
			} 
		}
		System.out.println("Fim da Analise Sint�tica: erros = " + erros);
	}
	
	public Boolean linhaAprovada(String linha, List<String> expressoes) {
		for(String exp: expressoes) {
			if(linha.matches(exp)){
				return true;
			}
		}
		return false;
	}
	
}
