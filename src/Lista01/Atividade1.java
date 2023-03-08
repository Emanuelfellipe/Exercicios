package Lista01;
import java.util.Scanner;

public class Atividade1 {
	
public static void main(String[] args) {
	int n1 = 0;
	long nl = 0;
	float nf = 0;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("digite o numero inteiro");
	n1 = ler.nextInt();
	
	System.out.println("digite o numero long");
	nl = ler.nextInt();
	
	System.out.println("digite o numero float");
	nf = ler.nextInt();
	
	System.out.println("o numero inteiro foi" + n1);
	System.out.println("o numero long foi" + nl);
	System.out.println("o numero float foi" + nf);
	}

}



