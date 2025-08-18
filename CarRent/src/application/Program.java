package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main (String args[]) throws ParseException {
		
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	System.out.println("Entre com os dados do aluguel:");
	System.out.println("Modelo do carro: ");
	String modelo = sc.nextLine();
	
	System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
	LocalDateTime hourinit = LocalDateTime.parse(sc.nextLine(),sdf);
	
	System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
	LocalDateTime hourend = LocalDateTime.parse(sc.nextLine(),sdf);
	
	CarRental cr = new CarRental(hourinit, hourend, new Vehicle(modelo));
	
	
	System.out.println("Entre com o preço por hora:");
	double pricehour = sc.nextDouble();
	System.out.println("Entre com o preço por dia:");
	double priceday = sc.nextDouble();
	
	RentalService rentalService = new RentalService(pricehour, priceday, new BrazilTaxService());
	rentalService.processInvoice(cr);
	
	System.out.println("FATURA: ");
	System.out.println("Pagamengo basico: " + cr.getInvoice().getBasicPayment());
	System.out.println("Imposto: " + cr.getInvoice().getTax());
	System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
	
	sc.close();
	}
}
