package entities;

import java.util.List;

public class employee {
	
	private Integer id;
	private String name;
	private Double salary;

	
	public employee(String name, Double salary, Integer id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void Upsalary (Double amount) {
		 salary = salary + (salary * (amount / 100));
	}
	
}
