package model.entities;

import model.enums.Color;

public class Retangulo extends AbstrataForma{
	private double largura;
	private double altura;
	
	public Retangulo() {
		
	}
	
	public Retangulo(Color cor, double largura, double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	@Override
	public double area() {
		return largura * altura;
	}
	
	
}
