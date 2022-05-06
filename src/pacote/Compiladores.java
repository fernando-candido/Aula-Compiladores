package pacote;

public class Compiladores {

	public static void main(String[] args) {
		
		System.out.println("Iniciando o Compilador...");
		Arquivos arquivos = new Arquivos();
		AnalisadorLexico al = new AnalisadorLexico();
		AnalisadorSintatico as = new AnalisadorSintatico();
		
		al.analisar(arquivos.progama, arquivos.alfabeto);
		as.analisar(arquivos.progama, arquivos.expressoes);
		
	}

}
