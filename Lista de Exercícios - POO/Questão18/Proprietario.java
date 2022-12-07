package Questão18;

public class Proprietario {

    private String nome, cidade, estado;
    private float CPF, RG, data_nascimento;
    private int rua;

    public Proprietario(String nome, float CPF, float RG) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getCPF() {
        return CPF;
    }

    public void setCPF(float cPF) {
        CPF = cPF;
    }

    public float getRG() {
        return RG;
    }

    public void setRG(float rG) {
        RG = rG;
    }

    public float getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(float data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getRua() {
        return rua;
    }

    public void setRua(int rua) {
        this.rua = rua;
    }

    




    
}
