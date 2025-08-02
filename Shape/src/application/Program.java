package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Colors;

public class Program {

	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes:");
		int quant = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quant; i++) {
			
			System.out.println("Shape #" + (i+1) + " data:");
			System.out.println("Rectangle or circle (r/c)?");
			char op = sc.nextLine().charAt(0);
			
			if (op == 'r') {
				System.out.println("Color (BLACK/BLUE/RED)");
				String colorStr = sc.nextLine();
				Colors color = Colors.valueOf(colorStr.toUpperCase());
				
				System.out.println("Width:");
				double width = sc.nextDouble();
						
				System.out.println("Height:");
				double height = sc.nextDouble();
				
				Shape rectangle = new Rectangle(color,width,height);
				list.add(rectangle);
			}
			
			else if (op == 'c') {
				System.out.println("Color (BLACK/BLUE/RED)");
				String colorStr = sc.nextLine();
				Colors color = Colors.valueOf(colorStr.toUpperCase());
				
				System.out.println("Radius:");
				double radius = sc.nextDouble();
						
				
				Shape circle = new Circle(color,radius);
				list.add(circle);
			}
			sc.nextLine();
		}
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}
		sc.close();
	}
}