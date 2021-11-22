package application;

import java.io.FileNotFoundException;
import java.util.Scanner;

import estruturaDados.ArvoreBinaria;
import estruturaDados.contaBancaria;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo: ");
		String arquivo = sc.nextLine();

		contaBancaria contas = new contaBancaria();
		ArvoreBinaria conta = contas.lerDadosConta(arquivo);

		System.out.println(conta.emOrdem(conta));
		System.out.println();

		System.out.println("Digite o numero da conta que deseja localizar: ");
		int localizar = sc.nextInt();
       
        
		Conta buscar = conta.buscar(new Conta(localizar,0,""), conta);
		System.out.println("Conta Localizada" + buscar.nunConta);
		System.out.println();

		sc.close();
	}

}
