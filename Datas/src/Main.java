import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate date1 = LocalDate.parse("2025-07-26");
		Date date2 = new Date();
		LocalDate date3 = LocalDate.parse("2025-07-26Thh:MM:ss");
		
		System.out.println(date1);
		System.out.println(date2);
		
		sc.close();
 		
	}

}
