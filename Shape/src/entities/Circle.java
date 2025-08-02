package entities;

import entities.enums.Colors;

public class Circle extends Shape{

	private Double Radius;
	
	public Circle () {}

	public Circle(Colors color, Double radius) {
		super(color);
		Radius = radius;
	}

	public Double getRadius() {
		return Radius;
	}

	public void setRadius(Double radius) {
		Radius = radius;
	}

	@Override
	public double area() {
		return Math.pow(Radius, 2) * 3.14159;
	}

	@Override
	public String toString() {
		return "Circle [Radius=" + Radius + "]";
	}
	
}