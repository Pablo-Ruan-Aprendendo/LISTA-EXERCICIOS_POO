import java.util.Scanner;

public class esfera {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        float volume;
        float raio;

        do{

        System.out.println("DIGITE O VALOR DO RAIO");
        raio = scan.nextFloat();

        }while(raio <= 0);

        volume = (float) (4.0 * (3.1415 * ((raio * raio * raio) / 3)));


        System.out.println("O VOLUME É " + volume);

    
    }
    
}
