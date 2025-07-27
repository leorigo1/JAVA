import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <employee> list = new ArrayList<>();
		Integer id;
		
		System.out.println("How many employees will be registered?");
		int quant = sc.nextInt();
		

		for (int i = 0; i < quant; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.println("Id: ");
			id = sc.nextInt();
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Salary:");
			Double salary = sc.nextDouble();
			
			employee emp = new employee(name,salary,id);
			list.add(emp);
		}		
		
		System.out.println("Enter the employee id that will have salary  increase:");
		int checkid = sc.nextInt();
			employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			Integer pos = hasId(list,id);
			if (pos == null) {
				System.out.println("This id does not exist!");
			}
			else {
				System.out.println("Enter the percentage:");
				double percentage = sc.nextInt();
			}
		

		sc.close();
	}
	
	public static int hasId(List<employee> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
}