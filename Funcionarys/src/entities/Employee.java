package entities;

public class Employee {

	protected String name;
	protected Integer hours;
	protected Double valueperHour;
	
	public Employee() {}

	public Employee(String name, Integer hours, Double valueperHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valueperHour = valueperHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueperHour() {
		return valueperHour;
	}

	public void setValueperHour(Double valueperHour) {
		this.valueperHour = valueperHour;
	}
	
	public String result () {
		return String.format("%.2f",hours * valueperHour);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " - $ " + result());
		return sb.toString();
	}
}