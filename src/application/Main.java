package application;

import model.entities.AbstrataForma;
import model.entities.Circulo;
import model.entities.Retangulo;
import model.enums.Color;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstrataForma circulo = new Circulo(Color.BLACK, 4.0);
		AbstrataForma retangulo = new Retangulo(Color.WHITE, 10.0, 4.0);
		
		
		System.out.printf("Area Circulo: %.2f%n",circulo.area());
		System.out.println("Color Circulo: " + circulo.getCor());
		System.out.printf("Area retangulo: %.2f%n", retangulo.area());
		System.out.println("Color Retangulo: " + retangulo.getCor());
	}

}
