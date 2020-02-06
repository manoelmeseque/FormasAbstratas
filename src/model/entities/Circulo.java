package model.entities;

import model.enums.Color;

public class Circulo extends AbstrataForma{
	private double raio;

	public Circulo(Color cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	
}
