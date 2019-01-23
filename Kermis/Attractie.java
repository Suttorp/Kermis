package Kermis;

import java.util.ArrayList;

abstract public class Attractie {
	
	protected String naam;
	protected double prijs;
	protected double omzet;
	protected int verkochteKaartjes;
	
	abstract public String getNaam();
	abstract public void setNaam(String naam);
	
	abstract public double getPrijs();
	abstract public void setPrijs(double prijs);
	
	abstract public double getOmzet();
	abstract public void voegOmzetToe();
	
	abstract public int getVerkochteKaartjes();
	abstract public void setVerkochteKaartjes();
	
	public Attractie (String naam, double prijs, double omzet, int verkochteKaartjes) {
		this.naam = naam;
		this.prijs = prijs;
		this.omzet = omzet;
		this.verkochteKaartjes = verkochteKaartjes;
	}
	
}
//42356