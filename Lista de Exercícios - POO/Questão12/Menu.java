import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        int numero1, numero2, resultado, resto, opcao;

        do
        {
          System.out.println("DIGITE 1 PARA APRENDER: ");
          System.out.println("DIGITE 2 PARA ESCREVER: ");
          System.out.println("DIGITE 3 PARA LER");
          numero1 = scan.nextInt();
          
          if(numero1 == 1){
            System.out.println("APREDER :\n Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
          }

          if(numero1 == 2){
            System.out.println("DIGITAR : \n Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
          }
          if(numero1 == 3){
            System.out.println("LER :\n Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
          }

          System.out.println("Deseja encerrar o programa?\n[1] para sim e [2] para nao.");
          System.out.println("\nOpcao: ");
          opcao = scan.nextInt();
        }
         while (opcao != 1);
         
         return ;

    }

    
      
    
}
