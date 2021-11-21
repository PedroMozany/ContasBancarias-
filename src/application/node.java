package application;
/**
 * Esse node ser para interface de conexão entre dois elementos, deixando que as partes internas
 * dele seja obrigatorias, já que ele é uma interface.
 * O elemento T, é um elemento que pode assumir qualquer valor, sendo ele int, String, boolean, Aluno
 * Arvore ou qualquer outro objeto.
 */
abstract interface node<T> {
    /***
     * 
     * @return Ele clona o elemento atual.
     */
    abstract node cloneNode();
    /***
     * 
     * @param others Outro elemento de mesmo tipo ou tipos diferentes.
     * @return Retorna se esse elemento é igual ao elemento comparado.
     */
    abstract boolean equalsThan(T others);
    /***
     * 
     * @param others Outro elemento de mesmo tipo ou tipos diferentes.
     * @return Retorna se o elemento é menor ou maior do que o outro.
     */
    abstract boolean smallerThan(T others);
    /***
     * 
     * @return Retorna apenas esses elementos na forma de string.
     */
    abstract String dice();
}
