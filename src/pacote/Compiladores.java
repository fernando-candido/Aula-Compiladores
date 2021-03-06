package pacote;

import java.io.IOException;

public class Compiladores {

	public static void main(String[] args) throws IOException {
		

		Arquivos arquivos = new Arquivos();
		AnalisadorLexico al = new AnalisadorLexico();
		AnalisadorSintatico as = new AnalisadorSintatico();
		AnalisadorSemantico ase = new AnalisadorSemantico();
		
		System.out.println("\n");
		System.out.println("*******************************************************************************");
		System.out.println("*                                                                             *");
		System.out.println("*                          Iniciando o Compilador...                          *");
		System.out.println("*                                                                             *");
		System.out.println("*******************************************************************************");
		System.out.println("\n");

		al.analisar(arquivos.alfabeto, arquivos.programa);
		as.analisar(arquivos.programa, arquivos.expressoes);
		ase.analisar(arquivos.programa, arquivos.dicionario);
		
	}

}
