package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o banco de dados: ");
		String arquivo = sc.nextLine();
		Cliente.lerDados(arquivo);
		sc.close();

	}
}
