package application;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o caminho do arquivo: ");
		String arquivo = sc.nextLine();
		
		System.out.println(arquivo);
		contaBancaria contas = new contaBancaria();
		contas.lerdadosOperacao(arquivo);
		System.out.println(contas.getFilaOperacao().displayFila());
		
		sc.close();

	}
	
}
