package Lista01;

public class Questao4 {
 public static void main(String[] args) {
	 int[]numeros = new int[100];
	 
	 for(int i = 0; i<= numeros.length - 1; i++) {
		 boolean ehPrimo = true;
		 numeros[i] = (int) (Math.random() * 101);
		 
		 for(int j = 2; j < numeros[i]; j++) {
			 if(numeros[i] % j ==0) {
				 ehPrimo = false;
				 break;
			 }
		 }
		 
		 if(ehPrimo) {
			System.out.println(numeros[i]);
		 }

	 }
	
 	}
}