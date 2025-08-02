package entities;

public class Pessoas {

	protected String name;
	protected Double rent;
	
	public Pessoas () {}

	public Pessoas(String name, Double rent) {
		super();
		this.name = name;
		this.rent = rent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	};
}