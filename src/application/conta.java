package application;

public class conta {
	//Atributos
	int nunConta, cpf, saldo;
	
	//Construtores
	public conta() {
		this.nunConta = 0;
		this.cpf = 0;
		this.saldo = 0;
	}
	public conta(String linha) {
		String[] dadosconta = linha.split(";");
		this.nunConta = Integer.parseInt(dadosconta[0]);
		this.cpf = Integer.parseInt(dadosconta[1]);
		this.saldo = Integer.parseInt(dadosconta[2]);
	}
	
	//Gets e Sets
	//Set
	public void setNumConta(int num) {
		this.nunConta = num;
	}
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	public void setsalado(int saldo) {
		this.saldo = saldo;
	}
	//GET
	public int getNunConta() {
		return this.nunConta;
	}
	public int getCPF() {
		return this.cpf;
	}
	public int getSalado() {
		return this.saldo;
	}
	
	
	//Metodos sobrescrevidos
	@Override
	public String toString() {
		return "Numero da conta:" + this.nunConta
				+ ";CPF da conta:" + this.cpf
				+ ";Saldo da conta:" + this.saldo
				+ ";";
	}
}
