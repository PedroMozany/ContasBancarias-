package application;

public class Conta {
	//Atributos
	int nunConta;
	double saldo;
	String cpf;
	
	//Construtores
	public Conta(int nunConta,double saldo, String cpf) {
		this.nunConta = nunConta;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	public Conta(String linha) {
		String[] dadosconta = linha.split(";");
		this.nunConta = Integer.parseInt(dadosconta[0]);
		this.cpf = dadosconta[1];
		this.saldo = Double.parseDouble(dadosconta[2]);
	}
	
	//Gets e Sets
	//Set
	public void setNumConta(int num) {
		this.nunConta = num;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public void setsalado(int saldo) {
		this.saldo = saldo;
	}
	//GET
	public double getNunConta() {
		return this.nunConta;
	}
	public String getCPF(String cpf) {
		return this.cpf;
	}
	public Double getSalado() {
		return this.saldo;
	}
	
	 public boolean igual(Conta outro){
	        if (nunConta == outro.nunConta) {
	        	 return true;
	        }
	        else { 
	             return false;
	        }
	    }

	    public boolean ehMenorQue(Conta outro){
	        if(nunConta < outro.nunConta) { 
	                   return true;
	        }
	        else {
	        	return false;
	        }
	    }
	
	
	
	//Metodos sobrescrevidos
	@Override
	public String toString() {
		return "Numero da conta: " + this.nunConta
				+ " | CPF da conta: " + this.cpf
				+ " |  Saldo da conta: " + this.saldo
				+ "\n";
	}
}
