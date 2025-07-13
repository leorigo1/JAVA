package util;

public class Calculadora {
	public double price;
	public double quant;
	
	public double calcular () {
		return (this.price * this.quant) + ((this.price * this.quant) * 0.06);
	}
}