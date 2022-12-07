import java.util.Scanner;

public class tabuada {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int numero,soma,multiplicacao;

        System.out.println("============================TABUADA============================");
        System.out.println("DIGETE 1 PARA VER A TABUADA DE SOMA !");
        System.out.println("DIGITE 2 PARA VER A TABUADA DA MULTIPLICAÇÃO");
        numero = scan.nextInt();

        if(numero == 1){
            System.out.println("DIGITE O VALOR DE TABUADA");
            soma = scan.nextInt();

            for(int i = 0; i <= 10; i++){
                System.out.println(soma + "+" + i + "=" + (soma+i));
            }
        }

        if(numero ==2){
            System.out.println("DIGITE O VALOR DA TABUADA");
            multiplicacao = scan.nextInt();

            for(int i = 0; i <= 10; i++){
                System.out.println(multiplicacao + "x" + i + "=" + (multiplicacao*i));
            }
        }

        
    }
}
