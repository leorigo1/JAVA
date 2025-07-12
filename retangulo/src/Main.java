import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		retangulo retangulo = new retangulo();
		
	System.out.println("Enter rectangle width and height:");
	Scanner sc = new Scanner(System.in);
	double v1 = sc.nextDouble();
	retangulo.altura = v1;
	
	double v2 = sc.nextDouble();
	retangulo.largura = v2;
	sc.close();
	
	System.out.printf("AREA = %.2f%n",retangulo.area());
	System.out.printf("PERIMETRO = %.2f%n",retangulo.perimetro());
	System.out.printf("DIAGONAL = %.2f%n",retangulo.diagonal());
	}
}