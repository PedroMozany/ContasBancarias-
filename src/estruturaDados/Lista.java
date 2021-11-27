package estruturaDados;

import application.ContaBancaria;
import application.Operacao;

public class Lista {
	
	
    public Elemento primeiro, ultimo;
	//Construtor
    /**
     * Cria uma lista simplesmente encadeada vazia, com sentinela
     * 
     */
    public Lista(){
        primeiro = new Elemento (null);
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
    public void inserirPorUltimo(ContaBancaria quem){
        Elemento novo = new Elemento(quem);
        ultimo.proximo = novo;   
        ultimo = novo;         
    }
    
    public boolean localizarDado(ContaBancaria qual){
        Elemento aux = primeiro;
        while(aux.proximo!=null && !aux.proximo.dadosCliente.ehIgual(qual)){
            aux = aux.proximo;
        }

        return true; 
    }
    
    
    
    public String imprimir(){
        if(listaVazia()) {
            return "LISTA VAZIA!!!";
        }
        
        StringBuilder sb = new StringBuilder();
        Elemento aux = primeiro.proximo;
        while(aux != null){
            sb.append("Numero da conta: "+ aux.dadosCliente.getNunConta()+ "\n"
            		+ "Salto Inicial: R$" + aux.dadosCliente.getSaldo() + "\n");
            aux = aux.proximo;   
        }
        sb.append("\n");
        return sb.toString();
    }

 
}
