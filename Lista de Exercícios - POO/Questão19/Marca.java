package Questão19;

public class Marca extends Carros {
    public Marca(String proprietario) {
        super(proprietario);
        
    }

    private String nrDeModelos, ano_lancamento, codigo_identificador;

    public Marca(String proprietario, String nrDeModelos, String ano_lancamento, String codigo_identificador) {
        super(proprietario);
        this.nrDeModelos = nrDeModelos;
        this.ano_lancamento = ano_lancamento;
        this.codigo_identificador = codigo_identificador;
    }

    public String getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(String nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getCodigo_identificador() {
        return codigo_identificador;
    }

    public void setCodigo_identificador(String codigo_identificador) {
        this.codigo_identificador = codigo_identificador;
    }


}
