package entities;

public class funcionary {
	public String name;
	public double salaryliquid;
	public double tax;
	public double percentage;
	
	public double netsalary () {
		return this.salaryliquid - this.tax;
	}	
	
	public void increasesalary(double total) {
		percentage = percentage / 100;
		total = (this.salaryliquid * tax);
	}
}
