package application;

public class Contas {
	int cpf;
	int nunConta;
	double saldoInicial;
	
	public Contas(int cpf, int nunConta,double saldoInicial) {
		this.cpf = cpf;
		this.nunConta = nunConta;
		this.saldoInicial = saldoInicial;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public int getCpf() {
		return cpf;
	}

	public int getNunConta() {
		return nunConta;
	}
	

}
