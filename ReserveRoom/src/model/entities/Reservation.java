package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation () {}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
		if (!checkout.after(checkin)) {
			throw new DomainException("Erro em datas!");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkin, Date checkout) throws DomainException {
		Date now =  new Date();
		if (!checkout.after(checkin)) {
			throw new DomainException("Erro em datas!");
		}
		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Erro em datas!");
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: " + getRoomNumber());
		sb.append(", check-in: " + sdf.format(getCheckin()));
		sb.append(", check-out: " + sdf.format(getCheckout()));
		sb.append(", " + duration() + " nights.");
		return sb.toString();
	}
	
}