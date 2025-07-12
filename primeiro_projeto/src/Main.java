import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Triangle x,y;
			x = new Triangle();
			y = new Triangle();	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of the triangle X");	
		 x.a = sc.nextDouble();		
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		
		sc.close();
		
		double resultado = x.area();
		
		System.out.printf("Result is: " + "%.4f" , resultado);
		
	}
		
}