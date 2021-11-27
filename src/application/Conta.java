package application;

import estruturaDados.Lista;

public class Conta {
	Lista lista = new Lista();
	// Atributos
	int nunConta;
	double saldo;
	String cpf;

	// Construtores

	public Conta() {

	}

	public Conta(int nunConta, double saldo, String cpf) {
		this.nunConta = nunConta;
		this.cpf = cpf;
		this.saldo = saldo;

	}

	public Conta(String linha) {
		String[] dadosCliente = linha.split(";");
		this.nunConta = Integer.parseInt(dadosCliente[0]);
		this.cpf = dadosCliente[1];
		this.saldo = Double.parseDouble(dadosCliente[2]);
	}

	public int getNunConta() {
		return nunConta;
	}

	public void setNunConta(int nunConta) {
		this.nunConta = nunConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	// Metodos sobrescrevidos
	@Override
	public String toString() {
		return "Numero da conta: " + this.nunConta + " | CPF da conta: " + this.cpf + " |  Saldo da conta: "
				+ this.saldo + "\n";
	}

}
