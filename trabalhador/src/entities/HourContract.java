package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuehour;
	private Integer hours;
	
	public HourContract() {
	}
	
	public HourContract(Date date, Double valuehour, Integer hours) {
		this.date = date;
		this.valuehour = valuehour;
		this.hours = hours;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuehour() {
		return valuehour;
	}

	public void setValuehour(Double valuehour) {
		this.valuehour = valuehour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return this.valuehour * this.hours;
	}
}