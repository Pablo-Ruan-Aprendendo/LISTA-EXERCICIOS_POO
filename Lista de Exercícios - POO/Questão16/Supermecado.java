import java.util.Scanner;
import java.util.ArrayList;

public class Supermecado {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;


        Estoque estoque1 =new Estoque();
        Estoque estoque2 =new Estoque();
        

        produto1.nome = "leite";
        produto1.ID = 0001;
        produto1.qttotal = 81;
        produto1.valor = 5;

        produto2.nome = "AGUA";
        produto2.ID = 0002;
        produto2.qttotal = 200;
        produto2.valor = 2;


        System.out.println("===============MENU================");
		System.out.println("***DIGITE 1 PARA FAZER UMA COMPRAR.***");
        System.out.println("***DIGITE 2 PARA VER O ESTOQUE.");
		opcao = scan.nextInt();

        if(opcao == 2){
            Estoque.protudosnoestoque();
        }

        
    }
    
}
