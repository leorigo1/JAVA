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
	
	public String toString() {
		return  name + ": $ " + rent + "\n";
	}

	@Override
	  public double tax() {
        double imposto = 0;
        if (quant < 10) {
        imposto = getRent() * 0.16;
        }
        if (quant > 10) {
            imposto += getRent() * 0.14;
        }
        return imposto;
    }
}