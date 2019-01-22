package Kermis.Attracties;

import Kermis.*;

public class Hawaii extends RisicoRijkeAttracties {

	public Hawaii(String naam, double prijs, double omzet, int verkochteKaartjes) {
		super(naam, prijs, omzet, verkochteKaartjes);
		super.aantalBeurtenVoorOnderhoud = 10;
	}


}
