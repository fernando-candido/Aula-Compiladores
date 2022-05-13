package pacote;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public String[] alfabeto;
	public List<String> dicionario;
	public List<String> expressoes;
	public List<String> programa;
	

	public Arquivos() throws IOException {
	List<String> alfabetoLinhas;
	alfabetoLinhas = lerArquivo("C:\\Linguagem\\cport\\alfabeto.txt");
	dicionario = lerArquivo("C:\\Linguagem\\cport\\dicionario.txt");
	expressoes = lerArquivo("C:\\Linguagem\\cport\\expressoes.txt");
	programa = lerArquivo("C:\\Linguagem\\cport\\exemplo.txt");
		
	String temp="";
			
	
	for(String linha: alfabetoLinhas) {
		temp += linha;
		
	}
	alfabeto = temp.split("");
	// se quiser olhar
	}	

	public List<String> lerArquivo(String arquivo) throws IOException {
		List<String> conteudo = new ArrayList<>();
		FileReader leitor = new FileReader(arquivo);
		BufferedReader buffer = new BufferedReader(leitor);		
		String linha = "";
		while((linha = buffer.readLine()) != null ) {
			conteudo.add(linha);
		}
		return conteudo;
	}

	public void imprimirArquivo(List<String> arquivo){
		for(String linha: arquivo){
			System.out.println(linha);
		}
	}
}
