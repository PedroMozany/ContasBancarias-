package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cliente {
	public static String[] nome;
	private static int[] cpf;
	private static char[] dados;

	public Cliente() {

	}

	public static String[] getNome() {
		return nome;
	}

	public static void setNome(String[] nome) {
		Cliente.nome = nome;
	}

	public static int[] getCpf() {
		return cpf;
	}

	public static void setCpf(int[] cpf) {
		Cliente.cpf = cpf;
	}

	public static char[] getDados() {
		return dados;
	}

	public static void setDados(char[] dados) {
		Cliente.dados = dados;
	}

	/**
	 * @param arquivo
	 * METODO DE LEITURA PARA LER OS DADOS DE UM ARQUIVO QUE VAI
	 * CONTER DADOS DO CLIENTE, NUMEROD DE OPERAÇÃO, NUMERO DE CONTA É  DATA,
	 */
	public static void lerDados(String arquivo) {

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linhas = br.readLine();
			dados = linhas.toCharArray();
			while (linhas != null) {
				dados = linhas.toCharArray();
				for (int i = 0; i < linhas.length(); i++) {
					System.out.print(dados[i]);
				}
				System.out.println();
				linhas = br.readLine();

			}

		} catch (IOException exc) {
			System.out.println("Erro  na leitura do arquivo" + exc.getMessage());
		}

	}

}
