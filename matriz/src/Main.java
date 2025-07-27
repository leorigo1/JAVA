import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int quant = 0;
		int [][] matriz = new int[N][N];
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(matriz[i][j] < 0) {
					quant++;
				}
			}
		}
		
		System.out.println("quant of numbers negative:" + quant);
		
		sc.close();	
	}
}
