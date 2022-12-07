import java.util.Scanner;

public class conversorterperatura {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        float farenheit;
        float celcius;
        float calculo;

        System.out.println("QUAL OPRAÇÃO VOÊ DESEJA FAZER ??");
        System.out.println("DIGITE 1 PARA CONVERTER DE FARENHEIT PARA CELCIUS.");
        System.out.println("DIGITE 2 PARA CONVERTER DE CELCIUS PARA FARENHEIT");
        calculo = scan.nextFloat();

        if(calculo == 1){

            System.out.println("DIGITE OS GRAUS EM FARENHEIT");
            farenheit = scan.nextFloat();

            System.out.println("A CONVERÇÃO DE FARENHEIT PARA CELCIUS É :" + ((farenheit - 32) *5/9));
            
        }

        if(calculo == 2){

            System.out.println("DIGETE OS GRAUS EM CELCIUS");
            celcius =scan.nextFloat();

            System.out.println("A CONVERÇÃO DE CELCIUS PARA FARENHEIT É : " + ((9*celcius+160)/5));
        }

    }
}



