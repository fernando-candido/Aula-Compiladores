package pacote;

import java.util.List;

public class AnalisadorLexico {
	
	
	public List<String> dicionario;
	public List<String> progama;
	
	
	public void analisar(List<String> alfabeto, List<String> progama) {
			
		int erros;
		for(String linha: progama) {
			String[] letras = linha.split("");
			for (String letra: letras) {
				if(!verificarSeALetraEstaNoAlfabeto(letra, alfabeto)) {
					System.out.println("A letra " + letra + "=> não está no alfabeto..");
				};
			}
		}
	}
	
	public boolean verificarSeALetraEstaNoAlfabeto(String letra, String[] alfabeto) {
		for(String caracter: alfabeto) {
			if(letra.equals(caracter)) {
				return true;
			}
		}
		return false;
	};
	
}
