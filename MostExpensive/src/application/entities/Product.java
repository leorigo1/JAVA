package application.entities;

public class Product <t>{

	private String name;
	private Double price;
	
	public Product() {}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void Double(Double price) {
		this.price = price;
	}
	
	
	
}
