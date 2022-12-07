import java.util.Scanner;

public class pareimpar {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[]args){

        int numero1;

        System.out.println("DIGITE UM NÚMERO INTEIRO.");
        numero1 = scan.nextInt();

        if((numero1 % 2) == 0){

            System.out.println("O NÚMERO " + numero1 + " É PAR !!");

        }

        else{
            System.out.println("O NÚMERO " + numero1 + " É IMPAR !!");
        }

    }

    
}
