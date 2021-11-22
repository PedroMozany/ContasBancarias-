package application;

public class Operacao {
	//Atributos
	String data;
	int nunConta, operacao, valor;
	
	//Construtor
	public Operacao() {
		this.nunConta = 0;
		this.operacao = 0;
		this.valor = 0;
		this.data = "";
	}
	
	/**
	 * @param linha  contendo os dados da operacao, separado por ;
	 */
	public Operacao(String linha) {
		String[] dadosCliente = linha.split(";");
		this.nunConta = Integer.parseInt(dadosCliente[0]);
		this.operacao = Integer.parseInt(dadosCliente[1]);
		this.valor = Integer.parseInt(dadosCliente[2]);
		this.data = dadosCliente[3];
	}
	
	//Get e Sets
	//Set
	public void setNunConta(int nunConta) {
		this.nunConta = nunConta;
	}
	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	public void setSaldo(int saldo) {
		this.valor = saldo;
	}
	public void setdata(String data) {
		this.data = data;
	}
	//Get
	public int setNunConta() {
		return this.nunConta;
	}
	public int setOperacao() {
		return this.operacao;
	}
	public int setSaldo() {
		return this.valor;
	}
	public String setdata() {
		return this.data;
	}
	
	
	 public boolean igual(Operacao outro){
	        if (nunConta == outro.nunConta) {
	        	 return true;
	        }
	        else { 
	             return false;
	        }
	    }

	    public boolean ehMenorQue(Operacao outro){
	        if(nunConta < outro.nunConta) { 
	                   return true;
	        }
	        else {
	        	return false;
	        }
	    }
	
	@Override
	public String toString() {
		return "Numero da conta:" + this.nunConta 
				+ ";Operação:" + this.operacao
				+ ";Valor:" + this.valor
				+ ";Data da operação:" + this.data
				+ ";\n";
	}
	
	
}
