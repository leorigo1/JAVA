import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc =  new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetor = new double [N];
		double contador = 0;
		
		
		for (int i = 0; i < N; i++) {
			vetor[i] = sc.nextDouble();
			contador = contador + vetor[i];
		}
		
		double resultado = contador / N;
		
		
		System.out.printf("A média final é: %.2f" ,resultado);
		
		sc.close();
		
	}

}
