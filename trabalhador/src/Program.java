import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department name:");
		String name = sc.nextLine();
		
		System.out.println("Enter worker data:");
		
		sc.close();	
	}
}