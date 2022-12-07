import java.util.Scanner;

public class veiculo {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[]aStrings){

        int kml = 12;
        float q_tempo;
        float v_media;
        float distancia;
        float q_litros;

        System.out.println("DIGITE O TEMPO GASTO NA VIAGEM EM HORAS");
        q_tempo = scan.nextFloat();

        System.out.println("DIGITE A VELOCIDADE MEDIA ALCANSADA ");
        v_media = scan.nextFloat();

        distancia = q_tempo * v_media;

        q_litros = distancia / kml;

        System.out.println("A DISTANCIA PERCORIDA É DE :" + distancia);

        System.out.println("A QUANTIDADE DE LITROS GASTOS É DE :" + q_litros);

    }
}