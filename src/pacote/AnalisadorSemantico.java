package pacote;

import java.util.ArrayList;
import java.util.List;

public class AnalisadorSemantico {
	
	public List <String> tabelaSimbolos;
	public List <String> dicionario;
	
	public AnalisadorSemantico() {
		tabelaSimbolos = new ArrayList<>();
		
	}
	
	public void analisar(List <String> exemplo, List<String> dicionario) {
		// this. to pegando da tabela privada e movendo p tabela publica
		this.dicionario = dicionario;
		int erros = 0;
		int nl = 1; 
		for (String linha: exemplo) {
			erros += validarLinha( linha.trim(), nl);
			nl++;
		}
		System.out.println("Fim da Analise Semântica: erros = " + erros);
	}
	// token = uma palavra
	// tokens = todas as palavras
	public int validarLinha(String linha, int nl) {
		
		String[] tokens = linha.split(" ");
		int numeroLinha = 0;
// System.out.println("Tabela de simbolos" + tabelaSimbolos);
		for(String token: tokens) {
			
			if(!(tokens[0].equals("escreva") && tokens[1].startsWith("\""))) {

				if( numeroLinha > 0 &&  ehVariavel(token)  ) {
					System.out.println("É Variavel: " + token);
					
				
	
				}
				if(tokens[0].equals("int") || 
				   tokens[0].equals("char") ||
				   tokens[0].equals("bool") || 
				   tokens[0].equals("float"))
					{
					tabelaSimbolos.add(token);
				}
				
				else{
					if(tabelaSimbolos.contains(token)) {
						// System.out.println("Variavel OK: " + token);
						return 0;
					}else{
						System.out.println(" Linha: " + nl + " Variavel não declarada: " + token);
						return 1;
					}
				}		
				numeroLinha++;
			}



			}
		
		return 0;
	}

	public boolean ehVariavel(String token) {
		if(token.isEmpty()){
			return false;
		}

		if(dicionario.contains(token)) {
			return false;
		} else {
			if(token.matches("^[0-9]{1,10}$")) {
				return false;
			}
		}
		return true;
	}

}



