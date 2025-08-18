package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime init;
	private LocalDateTime end;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	
	public CarRental () {}

	public CarRental(LocalDateTime init, LocalDateTime end, Vehicle vehicle) {
		this.init = init;
		this.end = end;
		this.vehicle = vehicle;
	}


	public LocalDateTime getInit() {
		return init;
	}

	public void setInit(LocalDateTime init) {
		this.init = init;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}