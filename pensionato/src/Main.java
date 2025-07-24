import java.util.Locale;
import java.util.Scanner;

import entities.Users;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Users[] vect = new Users[10];
		
		System.out.println("Quantas pessoas irão alugar quartos?");
		int quant = sc.nextInt();
		
		for (int i = 0; i < quant; i++) {
			System.out.println("Rent# " + (i+1) + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			vect[room] = new Users(name,email);
		}
		
		sc.close();
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}
	}
}