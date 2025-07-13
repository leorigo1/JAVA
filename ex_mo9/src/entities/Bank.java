package entities;

public class Bank {
	private int number;
	private String name;
	private double money;
	
	
	public Bank(int number, String name, double money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}
	
	public void setMoney(double value) {
		this.money = value;
	}
	
	public void deposit(double deposit) {
		this.money += deposit;
	}
	
	public void whitdraw (double whitdraw) {
		this.money -= whitdraw;
		this.money -= 5.00;
	}
}