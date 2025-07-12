package entities;

import java.util.Scanner;

public class estoque {
	public String product;
	public double price;
	public int quant;
	
	public double totalvalueinstock() {
		return price * quant;
	}
	
	public void addproducts(int quantity) {
		this.quant += quantity;
	}
	
	public void removeproducts(int quantity) {
		this.quant -= quantity;
	}
	
}
