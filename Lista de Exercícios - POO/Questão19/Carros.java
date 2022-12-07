package Questão19;

public class Carros {
    
    private String modelo, cor, marca,cambio_automatico,teto_solar, proprietario;
    private int ano,velocidade_maxima,velocidade_atual=0,numero_portas,numero_marchas=0,ré=-1,volume_combustivel,chassi;
    
    

    
    public Carros(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCambio_automatico() {
        return cambio_automatico;
    }
    public void setCambio_automatico(String cambio_automatico) {
        this.cambio_automatico = cambio_automatico;
    }
    public String getTeto_solar() {
        return teto_solar;
    }
    public void setTeto_solar(String teto_solar) {
        this.teto_solar = teto_solar;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getVelocidade_maxima() {
        return velocidade_maxima;
    }
    public void setVelocidade_maxima(int velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }
    public int getVelocidade_atual() {
        return velocidade_atual;
    }
    public void setVelocidade_atual(int velocidade_atual) {
        this.velocidade_atual = velocidade_atual;
    }
    public int getNumero_portas() {
        return numero_portas;
    }
    public void setNumero_portas(int numero_portas) {
        this.numero_portas = numero_portas;
    }
    public int getNumero_marchas() {
        return numero_marchas;
    }
    public void setNumero_marchas(int numero_marchas) {
        this.numero_marchas = numero_marchas;
    }
    public int getVolume_combustivel() {
        return volume_combustivel;
    }
    public void setVolume_combustivel(int volume_combustivel) {
        this.volume_combustivel = volume_combustivel;
    }
    public int getChassi() {
        return chassi;
    }
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public void aumentar_velocidade(){
        velocidade_atual ++;
    }

    public void freia(){
        velocidade_atual = 0;
    }

    public void trocar_marchaaumentar(){
        numero_marchas ++;

    }

    public void trocar_marchadiminuir(){
        numero_marchas --;

    }

    public void marchar_re(){
        if(velocidade_atual == 0){
            numero_marchas = ré;
        }
    }



    
    

}
