package estruturaDados;

import application.Cliente;

public class ElementoCliente {
	public Cliente dadosCliente;
    public ElementoCliente proximo;
    
    /**
     * elemento sentinela 
     * @param quem Cliente
     */
    public ElementoCliente(Cliente quem){
        dadosCliente = quem;
        proximo = null;
    }

}
