public class fordecrecente {
    
    private static void zeroa100decrescente(int n) {

		System.out.print(n+" ");
		if(n>0) {
			zeroa100decrescente(n-1);
		}
        
		else {
			System.out.println();
		}
    }
    public static void main(String[] args) {

        zeroa100decrescente(100);
         
    }
}
