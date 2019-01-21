package Kermis.Attracties;

import Kermis.*;

public class Hawaii extends Attractie {

	public Hawaii(String naam, double prijs, double omzet, int verkochteKaartjes) {
		super(naam, prijs, omzet, verkochteKaartjes);
	}

	@Override
	public double getPrijs() {
		// TODO Auto-generated method stub
		return prijs;
	}

	@Override
	public void setPrijs(double prijs) {
		// TODO Auto-generated method stub
		this.prijs = prijs;
		
	}

	@Override
	public String getNaam() {
		// TODO Auto-generated method stub
		return naam;
	}

	@Override
	public void setNaam(String naam) {
		// TODO Auto-generated method stub
		this.naam = naam;
	}
	
	@Override
	public double getOmzet() {
		// TODO Auto-generated method stub
		return omzet;
	}

	@Override
	public void voegOmzetToe() {
		// TODO Auto-generated method stub
		this.omzet += prijs;
	}
	
	@Override
	public int getVerkochteKaartjes() {
		// TODO Auto-generated method stub
		return verkochteKaartjes;
	}

	@Override
	public void setVerkochteKaartjes() {
		// TODO Auto-generated method stub
		this.verkochteKaartjes += 1;
		
	}


}
