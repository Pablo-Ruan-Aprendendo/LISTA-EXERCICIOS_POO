public class computador {
    
    private String modelo,memoria, armazenamento, processador, placa_video;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memória;
    }

    public void setMemoria(String memória) {
        this.memória = memória;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlaca_video() {
        return placa_video;
    }

    public void setPlaca_vídeo(String placa_video) {
        this.placa_video = placa_video;
    }
    
    
    
    

    
    public static String cadastrarComputador(String modelo, String memoria, String armazenamento, String processador,String placa_video){
        System.out.println("DADOS INSERIDOS: " + modelo + "," + memoria + "," + armazenamento + "," + processador + "," + placa_video);
        computador.setModelo(modelo);
        computador.setMemoria(memoria);
        computador.setArmazenamento(armazenamento);
        computador.setProcessador(processador);
        computador.setPlaca_video(placa_video);
    }

    public void removerComputador(String modelo){
        computador.setModelo(modelo == 0);
    }

    public static String upgrade(String memoria, String armazenamento, String processador,String placa_video){
        System.out.println("DADOS ATUALIZADOS: " + memoria + "," + armazenamento + "," + processador + "," + placa_video);
        computador.setMemoria(memoria);
        computador.setArmazenamento(armazenamento);
        computador.setProcessador(processador);
        computador.setPlaca_video(placa_video);
    }
}
