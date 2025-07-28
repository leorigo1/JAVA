import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.Level;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		System.out.println("Enter department name:");
		String departamento = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.println("Name:");
		String name = sc.nextLine();
		
		System.out.println("Level:");
		String level = sc.nextLine();
		
		System.out.println("Base salary:");
		Double baseSalary = sc.nextDouble();

		Department department = new Department(departamento);
		Worker worker = new Worker(name,Level.valueOf(level),baseSalary,new Department(departamento));
		
		
		System.out.println("How many contracts to this worker?");
		int quant = sc.nextInt();
		
		for(int i = 0; i < quant; i++) {
			System.out.println("Enter contract " + (i+1) + "# data");
			System.out.println("Date (DD/MM/YYYY)");
			Date data = sdf.parse(sc.next());
			
			System.out.println("Value per hour: ");
			Double valueperHour = sc.nextDouble();
			
			System.out.println("Duration (hours):");
			Integer duration = sc.nextInt();
			
			HourContract contract = new HourContract(data, valueperHour, duration);
			worker.addContract(contract);
		}
		

		System.out.println("Enter month  and year to calculate income (MM/YYYY)");
		String searchdata = sc.nextLine();
		int mes = Integer.parseInt(searchdata.substring(0,2));
		int ano = Integer.parseInt(searchdata.substring(3));
		
		
		System.out.println("Name:" + worker.getName());
		System.out.println("Department:" + worker.getDepartment().getName());
		System.out.println("Income for " + searchdata + ":" + String.format("%.2f", worker.income(ano, mes)));
		sc.close();	
	}
}