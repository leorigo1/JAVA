package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Level;

public class Worker {
	private String name;
	private Level level;
	private Double basesalary;
	
	private Department department;
	private List<HourContract> hourcontract = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String name, Level level, Double basesalary, Department department) {
		this.name = name;
		this.level = level;
		this.basesalary = basesalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Double getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(Double basesalary) {
		this.basesalary = basesalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getHourcontract() {
		return hourcontract;
	}
	
	
	
	public void addContract (HourContract contract) {
		hourcontract.add(contract);
	}
	
	public void removeontract (HourContract contract) {
		hourcontract.remove(contract);
	}
	
	public Double income (int year, int month) {
		double sum = basesalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : hourcontract) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}