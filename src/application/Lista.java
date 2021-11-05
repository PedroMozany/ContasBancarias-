package application;

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

 
  
    /**
     * vai retorna dados que esta na lista conforme formada��o 
     * @return lista preenchida ou vazia 
     */
    public String imprimir(){
        if(listaVazia())
            return "LISTA VAZIA!!!";

        StringBuilder sb = new StringBuilder("LISTA: \n");
        sb.append("CONTA" + " " + "OPERA��O" + " " + "SALDO" + "       "+ "DATA \n");
        ElementoCliente aux = primeiro.proximo;
        while(aux != null){
            sb.append(aux.dadosCliente.nunConta+ "      "+aux.dadosCliente.opera��o+ "    " + aux.dadosCliente.saldo + "      " + aux.dadosCliente.data +"\n");
            aux = aux.proximo;   
        }
        sb.append("Acabou!!");
        return sb.toString();
    }

}
