package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import paypal.entities.Contract;
import paypal.services.ContractService;

public class Program {

	public static void main (String args[]) throws ParseException {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	System.out.println("Entre os dados do contrato:");
	System.out.println("Número:");	
	int num = sc.nextInt();
	
	System.out.println("Data (dd/MM/yyyy):");
	String dataStr = sc.nextLine();
	LocalDate data = LocalDate.parse(sc.next(),dtf);
	
	System.out.println("Valor do contrato:");
	Double valor = sc.nextDouble();
	
	System.out.println("Entre com o numero de parcelas: ");
	Integer parcelasquant = sc.nextInt();
	sc.close();
	
	Contract contract = new Contract(parcelasquant, data, valor);
	
	System.out.println("Parcelas:");
	
	ContractService contractService = new ContractService(null);
	
	contractService.processContract(contract, num);
		
	}
}
