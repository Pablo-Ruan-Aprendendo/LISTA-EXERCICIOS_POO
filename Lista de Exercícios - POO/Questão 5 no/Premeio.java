import java.util.Scanner;

public class Premeio {

static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {

    int valor,numero;

    System.out.println("DIGITE O VALOR DA COMPRA");
    valor = scan.nextInt();

    if(valor > 100){
        System.out.println("DIGITE O NUMERO DA SORTE ENTRE (1 A 9)");
        numero = scan.nextInt();

        if(numero == 1){
            System.out.println("PARABENS VOCÊ GANHOU UM CARRO !!!!!");
        }
        if(numero == 2){
            System.out.println("PARABENS VOCÊ GANHOU UMA BOLA !!!!!");
        }
        if(numero == 3){
            System.out.println("PARABENS VOCÊ GANHOU UMA TV !!!!!");
        }
        if(numero == 4){
            System.out.println("PARABENS VOCÊ GANHOU UMA BICICLETA !!!!!");
        }
        if(numero == 5){
            System.out.println("PARABENS VOCÊ GANHOU UMA PANELA !!!!!");
        }
        if(numero == 6){
            System.out.println("PARABENS VOCÊ GANHOU UM COMPUTADOR !!!!!");
        }
        if(numero == 7){
            System.out.println("PARABENS VOCÊ GANHOU UMA MOTO !!!!!");
        }
        if(numero == 8){
            System.out.println("PARABENS VOCÊ GANHOU UM VIDEO GAME !!!!!");
        }
        if(numero == 9){
            System.out.println("PARABENS VOCÊ GANHOU UM CELULAR !!!!!");
        }

    }
    else{
        System.out.println("OTIMAS COMPRAS");
    }
}
    
}
