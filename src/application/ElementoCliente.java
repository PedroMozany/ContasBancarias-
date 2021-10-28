package application;

public class ElementoCliente {
	public Cliente dadosCliente;
    public ElementoCliente proximo;
    
    
    /**
     * elemento sentinela 
     * @param quem
     */
    public ElementoCliente(Cliente quem){
        dadosCliente = quem;
        proximo = null;
    }

}
