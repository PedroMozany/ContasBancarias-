package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import estruturaDados.ArvoreBinaria;
import estruturaDados.Lista;

public class Cliente {

	// Atributos
	public String nome;
	public String cpf;
	


	
	public Cliente() {
	}

	// Construtores
	/**
	 * @param cpf  CPF do cliente
	 * @param nome Nome do cliente
	 */
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		
	}
	
	public boolean igual(ContaBancaria raiz) {
		if (cpf.compareTo(raiz.cpf) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ehMenorQue(ContaBancaria outro) {
		if (cpf.compareTo(outro.cpf ) < 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param linha linha contendo os dados do cliente, separado por ;
	 */
	public Cliente(String linha) {
		String[] dadosCliente = linha.split(";");
		this.nome = dadosCliente[1];
		this.cpf = dadosCliente[0];
		
	}

	// Gets e Sets
	// Set
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	// Get
	public String getNome() {
		return this.nome;
	}

	public String getCPF() {
		return this.cpf;
	}

	
	public ArvoreBinaria lerDadosCliente(String arquivo) throws FileNotFoundException {

		ArvoreBinaria arvore = null;

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			String linha = br.readLine();

			while (linha != null) {
				Cliente pessoa = new Cliente(linha);
				
				ContaBancaria cb = new ContaBancaria(pessoa);
				arvore = inserirNaArvore(cb, arvore);
				linha = br.readLine();
			}

		} catch (IOException exe) {
			System.out.println("Erro: " + exe.getMessage());

		}

		return arvore;
	}

	public static ArvoreBinaria inserirNaArvore(ContaBancaria novo, ArvoreBinaria arvore) {
		if (arvore == null)
			arvore = new ArvoreBinaria(novo);
		else
			arvore = arvore.inserir(novo, arvore);

		return arvore;

	}
	
	
	@Override
	public String toString() {
		return "CPF:" + this.cpf + "|" + "Nome:" + this.nome + "\n";
	}

	

	
}
