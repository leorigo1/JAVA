package entities;

public class Product {

	protected String name;
	protected Double price;
	
	public Product () {}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double PriceTag (double price, double customsFee) {
		return price += customsFee;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + "  $ ");
		sb.append(String.format("%.2f",getPrice()));
		return sb.toString();
	}
}