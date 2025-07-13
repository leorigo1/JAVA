import java.util.Scanner;

import util.Calculadora;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		System.out.println("Whats is the dollar price?");
		Scanner sc = new Scanner (System.in);
		calculadora.price = sc.nextDouble();
		
		System.out.println("How  many dollars  will be bought?");
		calculadora.quant = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n",calculadora.calcular());
		
		
		sc.close();
	}

}
