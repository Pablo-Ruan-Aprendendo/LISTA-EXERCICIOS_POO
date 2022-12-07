import java.util.Scanner;

public class numerointeiro {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[]args){

        int numero_1;
        int numero_2;

        System.out.println("DIGITE UM NÚMERO INTEIRO ");
        numero_1 = scan.nextInt();

        System.out.println("DIGITE O SEGUNDO NUMERO INTEIRO ");
        numero_2 = scan.nextInt();

        if(numero_1 == numero_2){
            System.out.println("OS NÚMEROS " + numero_1 + " E " + numero_2 + " SÃO IGUAIS !!!");
        }

        if(numero_1 < numero_2){
            System.out.println("O NÚMERO " + numero_2 + " É MAIOR QUE O NÚMERO " + numero_1 + "!!!");
        }

        if(numero_1 > numero_2){
            System.out.println("O NUMERO " + numero_1 + " É MAIOR QUE O NÚMERO " + numero_2 + "!!!");
        }
    }
    
}