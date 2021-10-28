package application;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o caminho do arquivo: ");
		String arquivo = sc.nextLine();
		
		Lista contas = Cliente.lerDadosParaLista(arquivo);
		 
		 System.out.println(contas.imprimir());
		
		sc.close();

	}
	
}
