import java.util.Scanner;

public class trabalho {
    
    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
        
        float horas_trabalhadas;
        float valor_hora_trabalhada;
        float percentual_desconto;
        float salario_bruto;
        float desconto;
        float salario_liquido;

        System.out.println("DIGITE O TOTAL DE HORAS TRABALHADAS");
        horas_trabalhadas = scan.nextFloat();

        System.out.println("DIGITE O VALOR DA HORA TRABALHADA");
        valor_hora_trabalhada = scan.nextFloat();

        System.out.println("DIGITE O PERCENTUAL (%) DE DESCONTO");
        percentual_desconto = scan.nextFloat();

        salario_bruto = horas_trabalhadas * valor_hora_trabalhada;

        desconto = ( salario_bruto * percentual_desconto)/100;

        salario_liquido = salario_bruto - desconto;

        System.out.println("O SEU SALARIO BRUTO É $" + salario_bruto);

        System.out.println("O VALOR TOTAL DO DESCONTO É $" + desconto);

        System.out.println("O SALARIO LIQUIDO É $" + salario_liquido);

    }
}
