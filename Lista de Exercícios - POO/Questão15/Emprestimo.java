public class Empretimos {
    private String diadehoje;
    private String codigodolivor;
    private String notificação;

    public Empretimos(String diadehoje, String codigodolivro, String notificação){
        this.diadehoje = diadehoje;
        this.codigodolivor = codigodolivro;
        this.notificação = notificação;
    }

    public String getDiadehoje(){
        return diadehoje;
    }
    public String getCodigodolivro(){
        return codigodolivor;
    }
    public String getNotificação(){
        return notificação;
    }
    public void setDiadehoje(String diadehoje){
        this.diadehoje = diadehoje;
    }
    public void setCodigodolivro(String codigodolivro){
        this.codigodolivor = codigodolivro;
    }
    public void setNotificação(String notificação){
        this.notificação = notificação;
    }

    public void devolver_dia(String diadehoje, String codigodolivor, String notificação){
        if(diadehoje + 7 && notificação <= 2 ){
            System.out.println("empretimo aceito !!");
        }
        else{
            System.out.println("falha no empretimo !!\n\n pessoa tem mais de 3 notificações!!");
        }
    }
}