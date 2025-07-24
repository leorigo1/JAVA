import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int quant = sc.nextInt(); 
		
		String [] nome = new String[quant];
		int [] idadevalidas = new int [quant];
		int [] idade = new int[quant];
		double[] altura = new double[quant];
		
		double alturamedia = 0;
		int menor = 0;
		
		for (int i = 0; i < quant; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.println("Nome:");
			nome[i] = sc.nextLine();
			sc.nextLine();
			System.out.println("Idade:");
			idade[i] = sc.nextInt();
			System.out.println("Altura:");
			altura[i] = sc.nextDouble();
			alturamedia += altura[i];
			if (idade[i] < 16) {
				menor++;
			}
		}
		sc.close();
		alturamedia = alturamedia / quant;
		
		for (int i = 0; i < menor; i++) {
			if (idade[i] < 16) {
				idadevalidas[i] = idade[i];
			}
		}
		
		System.out.printf("Altura media: %.2f%n " , alturamedia);
		System.out.println("Pessoas com menos de 16 anos:" + menor);
		
		for (int i = 0; i < menor; i++) {
			if (idade[i] < 16) {
				System.out.println(idade[i]);
			}
		}
		
	}
}