package Lista01;

public class Questao8 {
	
	 public static void main(String[] args) {
		int[]numeros = new int [100];
		int total = 0;
		
		for(int i =0; i<= numeros.length - 1; i++ ) {
			numeros[i] = (int) (Math.random() * 101);
			System.out.println(numeros[i]);
		}
		int media = total / numeros.length;
		
		System.out.println(total);
		System.out.println(media);
	 }
}
