package application;

import java.util.Random;

public class Cliente {

	//Atributos
	static Random sorteio = new Random();
	String nome;
	int cpf;

	//Construtores
	/**
	 * @param cpf CPF do cliente
	 * @param nome Nome do cliente
	 */
	public Cliente(int cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	/**
	 * @param linha linha contendo os dados do cliente, separado por ;
	 */
	public Cliente(String linha) {
		String[] dadosCliente = linha.split(";");
		this.nome = dadosCliente[0];
		this.cpf = Integer.parseInt(dadosCliente[1]);
	}
	/**
	 * CPF do cliente gerado automaticamente
	 */
	public Cliente() {
		cpf = sorteio.nextInt(999_999_999 - 99);
	}
	
	//Gets e Sets
	//Set
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	//Get
	public String getNome() {
		return this.nome;
	}
	public int getCPF() {
		return this.cpf;
	}
	
	@Override
	public String toString() {
		return "Nome do cliente:" + this.nome
				+ ";CPF do cliente:" + this.cpf
				+ ";";
	}
}
