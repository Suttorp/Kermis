package Kermis;


public interface GokAttractie {
		
	default double kansSpelBelastingBetalen(Attractie aa) {
		return aa.getOmzet() * 0.3;
		
	}
}
