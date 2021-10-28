package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class Cliente {

	static Random sorteio = new Random();

	String nome, data;

	int cpf;

	int quantosDados, quantasNotas;

	int operação, saldo, nunConta;

	public Cliente(int indeficação) {
		cpf = indeficação;
	}

	public Cliente() {
		cpf = sorteio.nextInt(999_999_999 - 99);
	}

	/**
	 * relizando a contrução da conta somente com dados do arquivo disponibilizado
	 * no canvas
	 * 
	 * @param linha vai ler dos lementos separando por ";"
	 */
	public Cliente(String linha) {

		String[] dadosCliente = linha.split(";");
		nunConta = Integer.parseInt(dadosCliente[0]);
		operação = Integer.parseInt(dadosCliente[1]);
		saldo = Integer.parseInt(dadosCliente[2]);
		data = dadosCliente[3];

	}

	/**
	 * @param arquivo METODO DE LEITURA PARA LER OS DADOS DE UM ARQUIVO QUE VAI
	 *                CONTER DADOS DO CLIENTE, NUMEROD DE OPERAÇÃO, NUMERO DE CONTA
	 *                É DATA,
	 */
	static Lista lerDadosParaLista(String arquivo) throws FileNotFoundException {

		Lista contas = new Lista();

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				Cliente quem = new Cliente(linha);
				contas.inserirPorUltimo(quem);
				linha = br.readLine();
			}

		} catch (IOException exe) {
			System.out.println("Erro: " + exe.getMessage());

		}
		return contas;
	}

}
