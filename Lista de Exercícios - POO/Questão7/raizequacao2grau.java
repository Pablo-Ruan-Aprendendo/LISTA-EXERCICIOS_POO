import java.util.Scanner;

public class raizequacao2grau {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        float a, b, c, delta, bhaskara1, bhaskara2;

        System.out.println("DIGITE UM VALOR PARA A");
        a = scan.nextFloat();

        System.out.println("DIGITE UM VALOR PARA B");
        b = scan.nextFloat();

        System.out.println("DIGITE UM FALOR PARA C");
        c = scan.nextFloat();

        delta = b * b - 4 * a * c;
        bhaskara1 = (-b + (delta)) / (2 * a);
        bhaskara2 = (-b -delta) / 2 * a;

        if(delta < 0){
            System.out.println("O VALOR DE DELTA É: " + delta + " E POR SER NAGATIVO! NÃO EXISTINDO VALORES REAIS!");
        }

        if(delta == 0){
            System.out.println("O VALOR DE DELTA É IGUAL A 0! POSUINDO SOMENTE A RAIZ " + bhaskara1 + " " + bhaskara2);
        }

        if(delta > 0){
            System.out.println("O VALOR DE DELTA É " + delta + " SENDO MAIOR QUE 0! POSUINDO AS RAIZES " + bhaskara1 + " , " + bhaskara2);
        }
        
    }
}
