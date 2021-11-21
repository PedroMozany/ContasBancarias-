package application;
/**
 * Arvore generic, tendo elemento T, como elemento que pode ser de qualquer tipo. Tem uma observação
 * que o elemento generico dele, deve implementar o node, ou seja, ele deve ser ter como "implements"
 * o node, tendo assim a obrigação e dever, de ter os metodos de node.
 * Com isso, eu garanto que os metodos que eu queira, seja implementado e faça o que eu quero. 
 * deixando a obrigação para quem for implementar
 */
public class abb<T extends node> {
    //Atributos
    T raiz;
    abb left, right;

    /**
     * Construtor
     * @param whats Elemento generico, para inicializar a arvore.
     */
    public abb(T whats){
        raiz = whats;
        left = null;
        right = null;
    }

    //get e sets
    //set
    public void setLeft(abb left){
        this.left = left;
    }
    public void setRight(abb right){
        this.right = right;
    }
    public void setRaiz(T raiz){
        this.raiz = raiz;
    }
    //get
    public abb getLeft(){
        return this.left;
    }
    public abb getRight(){
        return this.right;
    }
    public T getRaiz(){
        return this.raiz;
    }

    /**
     * A inserção é O(Log base 2)
     * @param what Elemento que você queira inserir.
     * @param local Arvore ao qual o elemento onde sera inserido.
     * @return Ela retornara uma arvore que tenha o elemento inserido
     */
    public abb insert(T what, abb local){
        if(local == null){
            abb newnode = new abb(what);
            return newnode;
        } else {
            if(what.smallerThan(local.getRaiz()))
                local.setLeft(insert(what, local.getLeft()));
            else
                local.setRight(insert(what, local.getRight()));
        }
        return local;
    }

    /**
     * A procura é O(Log base 2)
     * @param what Elemento que você queira procurar
     * @param local Arvore que você queira procurar.
     * @return Retorna o elemento que você esteja procurando. caso esse elemento não esteja na arvore, ele retorna null.
     */
    public T search(T what, abb local){
        if(local!=null){
            if(what.equalsThan(local.getRaiz()))
                return (T)local.getRaiz();
            if(what.smallerThan(local.getRaiz()))
              return (T)search(what, local.getLeft());
            else
              return (T)search(what, local.getRight());
        }
        else 
            return null;
    }

    /**
     * 
     * @param local Arvore local par aser imprimida
     * @return Retornar uma string com os elementos da arvore. Ordem de O(N)
     */
    public String inOrder(abb local){
        if(local!=null){
            String aux = inOrder(local.getLeft());
            aux+=local.getRaiz().dice() + "\n";
            aux+=inOrder(local.getRight());
            return aux;
        } else { return ""; }
    }
}
