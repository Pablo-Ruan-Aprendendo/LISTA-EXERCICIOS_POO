import java.lang.ref.Cleaner;
import java.util.Scanner;

public class ordemcrecente {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[]args){
        
        int numero1, numero2, numero3, numero4, trocador;


        System.out.println("DIGITE UM NÚMERO INTERIRO (1/4)");
        numero1 = scan.nextInt();

        System.out.println("DIGITE UM OUTRO NÚMERO INTERIRO (2/4)");
        numero2 = scan.nextInt();

        System.out.println("DIGITE UM OUTRO NÚMERO INTERIRO (3/4)");
        numero3 = scan.nextInt();

        System.out.println("DIGITE UM OUTRO NÚMERO INTERIRO (4/4)");
        numero4 = scan.nextInt();

        do{
            if(numero1 > numero4){
                trocador = numero1;
                numero1 = numero4;
                numero4 = trocador;
            }

            if(numero1 > numero2){
                trocador = numero1;
                numero1 = numero2;
                numero2 = trocador;
            }

            if(numero2 > numero3){
                trocador = numero2;
                numero2 = numero3;
                numero3 = trocador;
            }

            if(numero3 > numero4){
                trocador = numero3;
                numero3 = numero4;
                numero4 = trocador;
            }
        }while(numero1 > numero4 || numero1 > numero2 || numero2 > numero3 || numero3 > numero4);

        System.out.println(numero1 + "," + numero2 + "," + numero3 + "," + numero4);


    }
}
