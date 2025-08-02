package entities;

public class FIsica extends Pessoas{

	private Double healty;
	
	public FIsica () {}

	public FIsica(String name, Double rent, Double healty) {
		super(name, rent);
		this.healty = healty;
	}

	public Double getHealty() {
		return healty;
	}

	public void setHealty(Double healty) {
		this.healty = healty;
	}	
}