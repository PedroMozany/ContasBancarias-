package application;

public class Operacao {
	//Atributos
	String data, cpf;
	int nunConta, operacao;
	double valor;
	
	//Construtor
	
	public Operacao() {
	
	}
	
	
	public Operacao(int nunConta, int operacao, double valor, String data, String cpf) {
		this.cpf = cpf;
		this.nunConta = nunConta;
		this.operacao = operacao;
		this.valor = valor;
		this.data = data;
	}
	
	
	public Operacao(String linha) {
		String[] dadosCliente = linha.split(";");
		this.cpf = dadosCliente[0];
		this.nunConta = Integer.parseInt(dadosCliente[1]);
		this.operacao = Integer.parseInt(dadosCliente[2]);
		this.valor = Integer.parseInt(dadosCliente[3]);
		this.data = dadosCliente[4];
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	@Override
	public String toString() {
		return   "CPF:" + this.cpf + "\n"
				+"Numero da conta:" + this.nunConta + "\n"
				+ ";Operação:" + this.operacao + "\n"
				+ ";Valor:" + this.valor+ "\n"
				+ ";Data da operação:" + this.data 
				+ ";\n";
	}
	
	
}
