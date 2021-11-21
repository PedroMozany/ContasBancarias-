package application;
/**
 * Essa classe, é uma classe basica e tranguila, nada de diferente, porem ela está implementando
 * o node, ou seja, ela tem a base e obrigação de implementar os metodos ou atributos que adicionei
 * ao node. Como node é um elemento generico, devemos falar qual é o tipo dele, para assim implementar.
 */
public class Aluno implements node<Aluno>{
    public static final int QTAVALIACOES = 4;
    public int mat;
    public String nome;
    public double[] avaliacoes;
    public int totalAulas;
    public int totalPresenca;

    /*
    * Método construtor
    */
    public Aluno(String nome, int mat){
        this.mat = mat;
        this.nome = nome;
        this.avaliacoes = new double[QTAVALIACOES];
        this.totalAulas = 80;
        this.totalPresenca = 0;
    }
    public Aluno(){
        this.mat = 0;
        this.nome = "";
        this.avaliacoes = new double[QTAVALIACOES];
        this.totalAulas = 80;
        this.totalPresenca = 0;
    }

    //Set
    public void setMat(int mat){
        this.mat = mat;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void lancarNota(int pos, double valor){
        if(pos<QTAVALIACOES && valor >=0){
            avaliacoes[pos] = valor;
        }
    }
    /**
     * Classe que clona o aluno, sem retirar ele de algo.
     * @return retornar o aluno clonado.
     */
    @Override
    public Aluno cloneNode(){
        Aluno novo = new Aluno(this.nome, this.mat);
        novo.avaliacoes = this.avaliacoes;
        novo.totalAulas = this.totalAulas;
        novo.totalPresenca = this.totalPresenca;
        return novo;
    }
    /**
     * metodo que server para comparar dois elementos, para caso sejam iguais.
     * @param outro Elemento a ser comparado.
     * @return Caso um elemento for igual ao outro, ele retornar true se não retornar false.
     */
    @Override
    public boolean equalsThan(Aluno outro){
        if (mat == outro.mat) return true;
        else return false;
    }
    /**
     * Metodo Herdado de node.
     * @param outro Aluno a ser comparado se é maior ou menor que o outro. A base dele é a matricula.
     * @return retornar se é verdadeiro se é maior ou menor. Retorna boolean.
     */
    @Override
    public boolean smallerThan(Aluno outro){
        if(equalsThan(outro))
            return false;
        if(mat < outro.mat) return true;
        else return false;
    }

    public double notaFinal(){
        double soma = 0;
        for (double nota : avaliacoes) {
            soma+=nota;
        }
        return soma;
    }
    /**
     * Metodo herdado de node.
     * @return Retornar uma string dos dados de aluno.
     */
    @Override
    public String dice(){
        String auxDados="";
        auxDados+= mat+" - ";
        auxDados+= " Nome: "+nome+" ";
        auxDados+= " Nota final: ";
        auxDados+= this.notaFinal() +" ";
        return auxDados;
    }
  

}




