import java.util.Arrays;

public class sequenciainver {

    public static void main(String[] args) {
 
        int[] arrey = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
 
        int[] voltar = new int[arrey.length];
        int contador = 0;

        for (int i = 1; i <= arrey.length; i++) {
            voltar[contador++] = arrey[arrey.length - i];
        }
        
        System.out.println(Arrays.toString(voltar));
    }
    
}
 

 

