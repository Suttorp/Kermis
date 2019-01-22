package Kermis.Attracties;

import Kermis.*;

public class Spin extends RisicoRijkeAttracties {
	

	public Spin(String naam, double prijs, double omzet, int verkochteKaartjes) {
		super(naam, prijs, omzet, verkochteKaartjes);
		super.aantalBeurtenVoorOnderhoud = 5;
	}
	
	
}
