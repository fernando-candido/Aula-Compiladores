package pacote;

import java.util.List;

public class AnalisadorLexico {
	
	
	public List<String> dicionario;
	public List<String> progama;
	
	
	public void analisar(String[] alfabeto, List<String> progama) {
		int erros = 0;
		for(String linha: progama) {
			String[] letras = linha.split("");
			for (String letra: letras) {
				if(!verificarSeALetraEstaNoAlfabeto(letra, alfabeto)) {
					System.out.println("A letra " + letra + "=> não está no alfabeto..");
					erros++;
				}
			}
		}
		System.out.println("Fim da analise lexica => erros = " + erros);
	}
	
	public Boolean verificarSeALetraEstaNoAlfabeto(String letra, String[] alfabeto) {
		for(String exp: alfabeto) {
			if(letra.equals(exp)) {
				return true;
			}
		}
		return false;
	};
	

}
