package estruturaDados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import application.Cliente;
import application.Conta;
import application.Operacao;

public class contaBancaria {

	// Atributos

	/*
	 * public Cliente pessoa; public Conta conta; public Operacao operacao;
	 */

	// Construtor
	/*
	 * public contaBancaria() { this.pessoa = new Cliente(); this.conta = new
	 * Conta(); this.operacao = new Operacao();
	 * 
	 * }
	 */

	// Leitura
	/**
	 * realizando a contrucao da conta somente com dados do arquivo disponibilizado
	 * no canvas
	 * 
	 * @param linha vai ler dos elementos separando por ";".
	 * @return 
	 */

	public ArvoreBinaria lerDadosConta(String arquivo) throws FileNotFoundException {

		ArvoreBinaria arvore = null;

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				Conta novo = new Conta(linha);
				arvore = inserirNaArvore(novo, arvore);
				linha = br.readLine();
			}

		} catch (IOException exe) {
			System.out.println("Erro: " + exe.getMessage());

		}

		return arvore;
	}

	
	
	public static ArvoreBinaria inserirNaArvore(Conta quem, ArvoreBinaria arvore) {
		if (arvore == null)
			arvore = new ArvoreBinaria(quem);
		else
			arvore = arvore.inserir(quem, arvore);

		return arvore;

	}

}
