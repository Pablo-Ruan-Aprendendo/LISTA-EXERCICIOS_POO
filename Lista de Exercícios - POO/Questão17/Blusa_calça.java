package Questão17;

public class Blusa_calça extends Roupa{
    
    public Blusa_calça(int numero, String tamanho, String cor) {
        super(numero, tamanho, cor);
        
    }

    private String estilo;
    private String materio;
    
    
    
    
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public String getMaterio() {
        return materio;
    }
    public void setMaterio(String materio) {
        this.materio = materio;
    }

    public void add_peças(String estilo, String materio){
        this.estilo = estilo;
        this.materio = materio;
    }


    
}
