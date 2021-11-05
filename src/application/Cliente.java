package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class Cliente {

	//Atributos
	static Random sorteio = new Random();
	String nome, data;
	int cpf, quantosDados, quantasNotas,operacao, saldo, nunConta;

	//Construtores
	/**
	 * @param indeficacao CPF do cliente
	 */
	public Cliente(int indeficacao) {
		this.cpf = indeficacao;
	}
	/**
	 * CPF do cliente gerado automaticamente
	 */
	public Cliente() {
		cpf = sorteio.nextInt(999_999_999 - 99);
	}

	/**
	 * realizando a contrucao da conta somente com dados do arquivo disponibilizado
	 * no canvas
	 * 
	 * @param linha vai ler dos lementos separando por ";".
	 */
	public Cliente(String linha) {

		String[] dadosCliente = linha.split(";");
		this.nunConta = Integer.parseInt(dadosCliente[0]);
		this.operacao = Integer.parseInt(dadosCliente[1]);
		this.saldo = Integer.parseInt(dadosCliente[2]);
		this.data = dadosCliente[3];

	}

	/**
	 * @param arquivo METODO DE LEITURA PARA LER OS DADOS DE UM ARQUIVO QUE VAI
	 *                CONTER DADOS DO CLIENTE, NUMEROD DE OPERACAO, NUMERO DE CONTA
	 *                � DATA,
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
