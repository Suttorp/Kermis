package Kermis;

import java.util.ArrayList;

public class Belastinginspecteur {
	
		void belastingBetalen(ArrayList<Attractie> a, Kassa kas) {
			double aantalbelastingbetalen = 0;
			for (Attractie att: a) {
				if (att instanceof GokAttractie) {
					aantalbelastingbetalen += att.getOmzet();
				}
			}
			if (aantalbelastingbetalen > kas.belastingbetaald) {
				System.out.println("De belastingdienst is langsgeweest en heeft zijn zakken gevuld.");
				System.out.println("U heeft " + kas.belastingbetaald + " euro aan belasting betaald");
				System.out.println("Over uw omzet moet u " + aantalbelastingbetalen + " euro betalen");
				System.out.println("U moet dus op dit moment " + (aantalbelastingbetalen - kas.belastingbetaald) + " euro gaan betalen");
				kas.belastingbetaald += aantalbelastingbetalen - kas.belastingbetaald;
				kas.belastingDienstIsLangsGeweest++;
			} else {
				System.out.println("Er hoeft geen belasting worden betaald. Jammer voor hem");
			}

			System.out.println("De belastinginspecteur heeft tot nu toe " + kas.belastingDienstIsLangsGeweest + " keer kunnen innen");
			
			
		}
}
