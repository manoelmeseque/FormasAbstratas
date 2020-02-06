package model.entities;

import model.enums.Color;

public abstract class AbstrataForma {
	private Color cor;
	
	public AbstrataForma() {
		
	}

	public AbstrataForma(Color cor) {
		this.cor = cor;
	}
	
	public Color getCor() {
		return cor;
	}
	
	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	public abstract double area();
}
