package Kermis;

import java.util.ArrayList;

public class Kassa {
	
	int belastingDienstIsLangsGeweest = 0;
	double totaalomzet;
	double belastingbetaald;
	
	int totaalAantalVerkochteKaartjes (ArrayList<Attractie> att2) {
		int totaalAantalVerkochteKaartjes = 0;
		for (Attractie att : att2) {
			totaalAantalVerkochteKaartjes += att.getVerkochteKaartjes();
		}
		return totaalAantalVerkochteKaartjes;
	} 
	
	double totaalOmzet (ArrayList<Attractie> att) {
		double totaalOmzet = 0;
		for (Attractie att1 : att) {
			totaalOmzet += att1.getOmzet();
		}
		return totaalOmzet;
		
	}
	
	
}
