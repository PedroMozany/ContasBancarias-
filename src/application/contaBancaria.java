package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class contaBancaria {
	
	//Atributos

	public Cliente pessoa;
	public conta conta;
	public operacao operacao;
	public fila_dinamic<operacao> filaOperacao;
	public fila_dinamic<Cliente> filaCliente;
	public fila_dinamic<conta> filaConta;

	//Construtor
	public contaBancaria() {
		this.pessoa = new Cliente();
		this.conta = new conta();
		this.operacao = new operacao();
		this.filaOperacao = new fila_dinamic<operacao>();
		this.filaCliente = new fila_dinamic<Cliente>();
		this.filaConta = new fila_dinamic<conta>();
		
	}
	
	
	//Leitura
	/**
	 * realizando a contrucao da conta somente com dados do arquivo disponibilizado
	 * no canvas
	 * 
	 * @param linha vai ler dos elementos separando por ";".
	 */
	public void lerdadosOperacao(String arquivo) throws FileNotFoundException {
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha = br.readLine();
			linha = linha.replaceAll("[^\\p{ASCII}]", "");
			while (linha != null) {
				operacao operacao = new operacao(linha);
				filaOperacao.addElement(operacao);
				linha = br.readLine();
			}

		} catch (IOException exe) {
			System.out.println("Erro: " + exe.getMessage());

		}
	}
	public void lerdadosCliente(String arquivo) throws FileNotFoundException {
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha = br.readLine();
			linha = linha.replaceAll("[^\\p{ASCII}]", "");
			while (linha != null) {
				Cliente cliente = new Cliente(linha);
				this.filaCliente.addElement(cliente);
				linha = br.readLine();
			}

		} catch (IOException exe) {
			System.out.println("Erro: " + exe.getMessage());

		}
	}
	public void lerdadosConta(String arquivo) throws FileNotFoundException {
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha = br.readLine();
			linha = linha.replaceAll("[^\\p{ASCII}]", "");
			while (linha != null) {
				conta conta = new conta(linha);
				this.filaConta.addElement(conta);
				linha = br.readLine();
			}

		} catch (IOException exe) {
			System.out.println("Erro: " + exe.getMessage());

		}
	}
	
	//Gets e Sets
	//Set
	public void setFilaOperacao(fila_dinamic<operacao> fila) {
		this.filaOperacao = fila;
	}
	public void setPessoa(Cliente cliente) {
		this.pessoa = cliente;
	}
	public void setConta(conta conta) {
		this.conta = conta;
	}
	public void setOperacao(operacao operacao) {
		this.operacao = operacao;
	}
	//Get
	public fila_dinamic<operacao> getFilaOperacao() {
		return this.filaOperacao;
	}
	public fila_dinamic<conta> getFilaconta(){
		return this.filaConta;
	}
	public fila_dinamic<Cliente> getFilaCliente(){
		return this.filaCliente;
	}
	public Cliente getCliente() {
		return this.pessoa;
	}
	public conta getConta() {
		return this.conta;
	}
	public operacao getOperacao() {
		return this.operacao;
	}

	
	
}
