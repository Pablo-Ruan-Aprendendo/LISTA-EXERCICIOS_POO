package Emprestimo;

import java.util.Scanner;

public class biblioteca {

static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
    
    String cpf;

	String arquivo;														//VARIAVEIS DA BIBLIOTECA
	String menu;
	String opc="s";
    char opc2='s';													
	String nome,linha,autor,titulo,editora,np,ano;							//recadastro de livro

	
	String usuario;															//VARIAVEIAS DO LOGIN
    String senha;
    int tentativas = 0;
    String dia;

	

    while (tentativas < 3)
    {
        System.out.println("DIGITE SEU USUARIO: ");
        usuario = scan.nextLine();
        System.out.println("DIGITE SUA SENHA:");
        senha = scan.nextLine();

		if (usuario == "ruan" && senha == "13465")
		{
			
			System.out.println("LOGIN EFETUADO COM SUCESSO!!!");
			break;
		}
        
		
        else
        {
            System.out.println("TENTATIVA DE LOGIN INVALIDA. POR FAVOR, TENTE NOVAMENTE!!.\n" + '\n');
            tentativas++;
        }
    }
    if (tentativas == 3)
    {
            
			
			System.out.println("\n\nMUITAS TENTATIVAS DE LOGIN! O PROGRAMA TERMINARA AGORA!!.");
           
			
			return ;
    }
	
	for(String ch = "s"; ch != "n"; ){
	
		
		
		do{
			
		
		System.out.println("===============MENU================");
		System.out.println("***DIGITE 1 PARA CADASTRA LIVRO.***");
		System.out.println("***DIGITE 2 PARA FAZER EMPRESTIMO.***");
		System.out.println("***DIGITE 3 PARA VER O ESTOQUE.***");
		menu = scan.nextLine();
	
		}while((menu <= "0") || (menu >= "4"));
		
		
	
	
			Object ios;
            if(menu == "1")
			{
		
			//ofstream,=sai do programa e ENTRA no arquivo txt, ifstream,= sai do arquivo e ENTRA NO PROGRAMA, fstream,= faz as duas funções
		
			
	
			while((opc=="s")||(opc=="S"))
			{
				
				System.out.println("AUTOR................");
				autor = scan.nextLine();
				System.out.println("TITULO................");
				titulo = scan.nextLine();
				System.out.println("EDITORA................");
				editora = scan.nextLine();;
				System.out.println("NUMERO DE PAGNAS.....");
				np = scan.nextLine();;
				System.out.println("ANO DE LANCAMENTO....");
				ano = scan.nextLine();;
				System.out.println("CADASTRAR OUTRO LIVRO ??[s/n]");
				opc = scan.next();
				
				
				
			}
		
		}
		if(menu=="2")
		{
				System.out.println("NOME E SOBRENOME");
				nome = scan.nextLine();
				System.out.println("CPF");
				cpf = scan.nextLine();
				System.out.println("DATA DE DEVOLUCAO");
				dia = scan.nextLine();
				break;

                System.out.println("DATA DA DEVOLUÇÃO:" + dias);
                Emprestimo.multas();


		}
		
		if(menu=="3")
		{
			
			Livro.verLivros();
			
			
	
	System.out.println("PARA FECHA O PROGRAMA DIGITE n CASO CONTRARIO DIGITE QUALQUER TECLA PARA RETORNAR AO MENU.  ");
       
        ch = scan.nextLine();}


return;

}
}
    
}
