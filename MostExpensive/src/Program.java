import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.entities.Product;


public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		List<Product> list = new ArrayList<Product>();
		
		String line = ("Computer,890.50");
		String line2 = ("Telephone,600.00");
		String line3 = ("Tablet,330.99");
		
		String[] fields = line.split(",");
		String[] fields2 = line2.split(",");
		String[] fields3 = line3.split(",");
		
		list.add(new Product (fields[0],Double.parseDouble(fields[1])));
		list.add(new Product (fields2[0],Double.parseDouble(fields2[1])));
		list.add(new Product (fields3[0],Double.parseDouble(fields3[1])));
		
		Collections.max(list);
		
		
		
		
		sc.close();
	}
}
