package pacote;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public List<String> alfabeto;
	public List<String> dicionario;
	public List<String> expressoes;
	public List<String> progama;
	
	alfabeto = lerArquivo(C:\\Linguagem\\cport\\alfabeto.txt);
	dicionario = lerArquivo();
	expressoes = lerArquivo();
	progama = lerArquivo();
	
	String temp="";
			
	
	for(String linhas: alfabetoLinha) {
		temp += linha;
		
	}
	alfabeto = temp.split("");
	
	// se quiser olhar
	

	
	public Arquivos() {
		
		alfabeto = new ArrayList<>();
		dicionario = new ArrayList<>();
		expressoes = new ArrayList<>();
		progama = new ArrayList<>();
	}
	
	public List<String> lerArquivo(String arquivo) throws IOException {
		
		FileReader leitor = new FileReader(arquivo);
		BufferedReader buffer = new BufferedReader(leitor);		
		String linha = "";
		while(linha = buffer.readLine()) != null ) {
				
	
			}
			
		return conteudo;
	}
}
