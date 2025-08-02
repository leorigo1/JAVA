package entities;

public class Juridice extends Pessoas{

	private int quant;
	
	public Juridice () {}

	public Juridice(String name, Double rent, int quant) {
		super(name, rent);
		this.quant = quant;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	};
	
}