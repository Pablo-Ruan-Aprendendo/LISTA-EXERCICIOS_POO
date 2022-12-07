package Questão17;
public class Roupa{

    private int numero;
    private String tamanho,cor;

     public Roupa(int numero,String tamanho,String cor){
        this.numero = numero;
        this.tamanho = tamanho;
     }


     public int getNumero(){
        return numero;
     }

     public void setNumero(int numero){
        this.numero = numero;
     }

     public String getTamanho(){
        return tamanho;
     }

     public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getCor(){
        return cor;
     }

     public void setCor(String cor){
        this.cor = cor;
    }
}