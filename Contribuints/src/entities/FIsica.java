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
	
	public String toString() {
		return  name + ": $ " + rent + "\n";
	}

	@Override
	public double tax() {
	    double baseTax;
	    if (getRent() < 20000.00) {
	        baseTax = getRent() * 0.15;
	    } else {
	        baseTax = getRent() * 0.25;
	    }
	    baseTax -= getHealty() * 0.50;
	    return baseTax;
	}
}