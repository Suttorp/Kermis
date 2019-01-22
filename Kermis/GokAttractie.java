package Kermis;

import java.util.ArrayList;

public interface GokAttractie {
		
	default double kansSpelBelastingBetalen(ArrayList<Attractie> aa) {
		for (Attractie attractie : aa) {
			if (attractie instanceof GokAttractie) {
				return attractie.getOmzet() * 0.3;
			}
		} return 0;	
		
	}
}
