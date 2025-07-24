import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quant;
		
		System.out.println("Quantos numeros você vai digitar?");
		quant = sc.nextInt();
		
		int[] numeros = new int[quant];
		int[] resultado = new int[quant];
		
		for (int i = 0; i < quant; i++) {
			System.out.println("Digite um número:");
			numeros[i] = sc.nextInt();

		}
		sc.close();
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (int i = 0; i < resultado.length; i++) {
			if (numeros[i] < 0) {
				resultado[i] = numeros[i];
			System.out.println(resultado[i]);
			}
		}
	}
}