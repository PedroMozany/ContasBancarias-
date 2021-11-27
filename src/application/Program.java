package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import estruturaDados.ArvoreBinaria;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		Cliente pessoa = new Cliente();
		ArvoreBinaria arvore = pessoa.lerDadosCliente("C:\\temp\\txt1.txt");

		String arquivoConta = ("C:\\temp\\txt2.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(arquivoConta))) {
			String linha = br.readLine();
			while (linha != null) {
			Conta novo = new Conta(linha);
			ContaBancaria cb = new ContaBancaria(novo);
			ContaBancaria buscar = arvore.buscar(new Cliente(cb.getCpf(), ""), arvore);
			if (buscar != null){
			buscar.lista.inserirPorUltimo(cb);
			} else {
			}
			linha = br.readLine();
			}
			} catch (IOException exe) {
			System.out.println("Erro: " + exe.getMessage());
			}

		String arquivoOperacao = ("C:\\temp\\txt3.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(arquivoOperacao))) {

			String linha = br.readLine();
			while (linha != null) {
			Operacao op = new Operacao(linha);
			ContaBancaria cb = new ContaBancaria(op);
			ContaBancaria buscar = arvore.buscar(new Cliente(cb.getCpf(), ""), arvore);
			buscar.lista.localizarDado(cb);
			buscar.lista.inserirPorUltimo(cb);
			
//			else {
//				System.out.println("Nao a conta com esse CPF!!");
//			}
			linha = br.readLine();
			}
			} catch (IOException exe) {
			System.out.println("Erro: " + exe.getMessage());
			}
			
		System.out.println(arvore.emOrdem(arvore));
		System.out.println();

		System.out.println("Digite a conta que deseja localizar: ");
		String localizar = sc.nextLine();

		ContaBancaria buscar = arvore.buscar(new Cliente(localizar, ""), arvore);

		System.out.println("Conta Localizada: \n" + "CPF: "+ buscar.cpf + "\n" + "NOME: "+ buscar.nome + "\n" + buscar.lista.imprimir());
		System.out.println();

		sc.close();
	}

}
