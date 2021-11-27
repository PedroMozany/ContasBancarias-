package estruturaDados;

import application.ContaBancaria;

public class Elemento {
	public ContaBancaria dadosCliente;
    public Elemento proximo;
    
    /**
     * elemento sentinela 
     * @param quem Cliente
     */
    public Elemento (ContaBancaria quem){
    	dadosCliente = quem;
        proximo = null;
    }

}
