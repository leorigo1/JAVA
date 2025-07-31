package entities;

public class OutsorcedEmployee extends Employee{

	private Double AdditionalCharge;
	
	public OutsorcedEmployee () {}

	public OutsorcedEmployee(String name, Integer hours, Double valueperHour, Double additionalCharge) {
		super(name, hours, valueperHour);
		AdditionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return AdditionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		AdditionalCharge = additionalCharge;
	}
	
	public String result () {
		return String.format("%.2f",(hours * valueperHour) + AdditionalCharge + (AdditionalCharge * 0.10));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " - $ " + result());
		return sb.toString();
	}
}