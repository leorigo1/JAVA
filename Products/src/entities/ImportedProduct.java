package entities;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	public ImportedProduct () {}

	public ImportedProduct(String name, double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public double PriceTag (double price, double customsFee) {
		return price += customsFee;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " (used) $ ");
		sb.append(String.format("%.2f",getPrice()));
		sb.append("Customs fee: (" + getCustomsFee() + ")");
		return sb.toString();
	}
}