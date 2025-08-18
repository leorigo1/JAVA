package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService braziltaxservice;
	
	public RentalService(Double pricePerHour, Double pricePerDay,BrazilTaxService braziltaxservice) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.braziltaxservice = braziltaxservice;
	}

	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getInit(), carRental.getEnd()).toMinutes();
		double hours = minutes / 60.0;
		
		carRental.setInvoice(new Invoice(50.0,10.0));
	}
}