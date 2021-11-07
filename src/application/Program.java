package application;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println(
				"Digite a opcao desejada: \n 1 - Ver todos operações \n 2 - Ver todas contas \n 3 - Mostrar todos clientes");
		int opcao = sc1.nextInt();
		System.out.println("Digite o caminho do arquivo: ");
		String arquivo = sc.nextLine();
		// System.out.println(arquivo);
		contaBancaria contas = new contaBancaria();

		switch (opcao) {

		case 1:
			contas.lerdadosOperacao(arquivo);
			System.out.println(contas.getFilaOperacao().displayFila());

			break;
		case 2:
			contas.lerdadosConta(arquivo);
			System.out.println(contas.getFilaconta().displayFila());
			break;
		case 3:
			contas.lerdadosCliente(arquivo);
			System.out.println(contas.getFilaconta().displayFila());
			break;

		default:
			System.out.println("digite um numero valido: ");

		}

		sc1.close();
		sc.close();

	}

}
