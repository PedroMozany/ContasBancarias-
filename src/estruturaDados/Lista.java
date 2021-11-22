package estruturaDados;

import application.Cliente;

public class Lista {
	
	
    public ElementoCliente primeiro, ultimo;
	//Construtor
    /**
     * Cria uma lista simplesmente encadeada vazia, com sentinela
     * 
     */
    public Lista(){
        primeiro = new ElementoCliente(null);
        ultimo = primeiro;
    }

    /** vai verificar se a lista esta vazia 
     * @return se condi��o ter verdadeira vai retornar lista vazia 
     */
    public boolean listaVazia(){
        return (primeiro == ultimo);
    }

    /**
     * vai preencher na ultimo posi��o 
     * @param quem vai  amazenar a conta  
     */
    public void inserirPorUltimo(Cliente quem){
        ElementoCliente novo = new ElementoCliente(quem);
        ultimo.proximo = novo;   
        ultimo = novo;         
    }
 
}
