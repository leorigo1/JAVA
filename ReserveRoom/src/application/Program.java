package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Room number:");
		int number = sc.nextInt();
		
		System.out.println("Check-in date: (dd/MM/yyyy)");
		Date checkin = sdf.parse(sc.next());
		
		System.out.println("Check-out date: (dd/MM/yyyy)");
		Date checkout = sdf.parse(sc.next());
		
		Reservation reservation =  new Reservation (number,checkin,checkout);
		System.out.println(reservation.toString());
		
		System.out.println("");
		System.out.println("Update Dates:");
		System.out.println("Check-in date: (dd/MM/yyyy)");
		checkin = sdf.parse(sc.next());
		
		System.out.println("Check-out date: (dd/MM/yyyy)");
		 checkout = sdf.parse(sc.next());
		
		reservation.updateDates(checkin, checkout);
		System.out.println(reservation.toString());
		
		sc.close();
		}
		
		catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
	}
}