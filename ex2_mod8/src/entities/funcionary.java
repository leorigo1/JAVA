package entities;

public class funcionary {
	public String name;
	public double salaryliquid;
	public double tax;
	public double percentage;
	
	public double netsalary () {
		return this.salaryliquid - this.tax;
	}	
	
	public double resultado() {
		return this.salaryliquid * (percentage / 100) + netsalary();
	}
}