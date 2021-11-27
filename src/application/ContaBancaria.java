package application;

import estruturaDados.Lista;

public class ContaBancaria {

	Cliente cliente = new Cliente();
	Conta conta = new Conta();
	Operacao op = new Operacao();

	// Atributos

	public String nome;
	public String cpf;
	public String data;
	public Double saldo;
	public int nunConta;
	public int operacao;
    Lista lista = new Lista();

	// Construtor

	public ContaBancaria() {

	}

	public ContaBancaria(Cliente cliente) {
		this.lista = new Lista();
		this.nome = cliente.getNome();
		this.cpf = cliente.getCPF();

	}

	public ContaBancaria(Conta conta) {
		this.cpf = conta.getCpf();
		this.nunConta = conta.getNunConta();
		this.saldo = conta.getSaldo();
	}

	public ContaBancaria(Operacao op) {
		this.cpf = op.getCpf();
		this.nunConta = op.getNunConta();
		this.saldo = op.getValor();
		this.operacao = op.getOperacao();
		this.data = op.getData();
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = cliente.getNome();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getNunConta() {
		return nunConta;
	}

	public void setNunConta(int nunConta) {
		this.nunConta = nunConta;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	
	
	public boolean igual(ContaBancaria outro) {
		if (cpf.compareTo(outro.cpf) == 0) {
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
	
	public boolean ehIgual(ContaBancaria qual) {
		if (nunConta == qual.nunConta) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public String toString() {
		return "CPF:" + this.cpf + "|" + "Nome:" + this.nome + "\n";
	}

	

}
