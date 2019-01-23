//	Stap 4:
//	Maak een Klasse BelastingInspecteur. *
//	Maak OF een input voor een bezoek van de BelastingInspecteur, bv 'b'.
//	OF maak een random die 1 keer per 15 verkopen ervoor zorgt dat de BelastingInspecteur langskomt.
//	
//	De belastingInspecteur haalt meteen zijn belasting uit de omzet.
//	De kassa moet natuurlijk bijhouden dat er een bezoek van de BelastingInspecteur is geweest.
//	Een belasting inspecteur checkt van alle attracties of die van het Type GokAttractie zijn.
//	Alleen voor Gokattracties wordt belasting geheven, de andere niet.
//	
//	Tenslotte maken we de Spin ook een GokAttractie om te kijken of ons Ontwerp goed werkt.


package Kermis;

import java.util.*;

import Kermis.Attracties.*;
import java.math.*;

public class Kermis {

	ArrayList<Attractie> att = new ArrayList<>();
	int keuzeAttractie;
	Kassa kassa = new Kassa();
	Belastinginspecteur BI = new Belastinginspecteur();

	public static void main(String[] args) {
		Kermis ker = new Kermis();
		ker.vulArrayList();
		ker.printMenu();

		for (int x = 0; x < 555; x++) {
			ker.draaien();
		}

	}

	private void printMenu() {

		System.out.println("Welkom bij de Kermis!");
		System.out.println("=====================");
		int y = 1;
		for (Attractie attractie : att) {
			System.out.println(
					"Kies " + y++ + " voor " + attractie.getNaam() + " en de prijs is " + attractie.getPrijs());
		}

	}

	// hasNextInt() even uitzoeken
	private void draaien() {
		Scanner scan = new Scanner(System.in);
		Kassa kas = new Kassa();
		boolean b = scan.hasNextInt();
		if (b == true) {
			int keuzeAttractie = scan.nextInt();

			try {

				keuzeAttractie--;
				System.out.println("U heeft gekozen voor " + att.get(keuzeAttractie).getNaam());
				att.get(keuzeAttractie).voegOmzetToe();
				att.get(keuzeAttractie).setVerkochteKaartjes();
			} catch (Exception e) {
				System.out.println("Deze keuze is invalid.");
				System.out.println(keuzeAttractie);
			}
		} else {
			String keuzeMenu = scan.nextLine();
			if (keuzeMenu.equals("O")) {
				double totaalOmzet = kas.totaalOmzet(att);
				System.out.println("De totaalomzet is: " + Math.round(totaalOmzet * 100.0) / 100.0);

			} else if (keuzeMenu.equals("K")) {
				int verkochteKaartjes = kas.totaalAantalVerkochteKaartjes(att);
				System.out.println("Het totaal aantal verkochte kaartjes: " + verkochteKaartjes);

			} else if (keuzeMenu.equals("R")) {
				this.keuzeMenuR();
			} else if (keuzeMenu.equals("B")) {
				BI.belastingBetalen(att, kassa);
				}
			 else {
				System.out.println("Invalid input");
			}
		}

	}

	private void keuzeMenuR() {
		System.out.println("U zit nu in het reparatiemenu. De volgende reparaties moeten worden uitgevoerd: ");
		for (int x = 0; x < att.size(); x++) {
			if (att.get(x) instanceof RisicoRijkeAttracties) {
				RisicoRijkeAttracties y = ((RisicoRijkeAttracties) att.get(x));
				if (y.isOnderhoudsBeurtNodig() == true) {
					System.out.println("Zo te zien is er een onderhoudsbeurt nodig voor: " + y.getNaam());
					y.onderhoudsBeurtIsGeweest();
				}

			}
		}

	}

	private void vulArrayList() {

		att.add(0, new Botsautos("Botsautos", 2.50, 0, 0));
		att.add(1, new Spin("Spin", 2.25, 0, 0));
		att.add(2, new Spiegelpaleis("Spiegelpaleis", 2.75, 0, 0));
		att.add(3, new Spookhuis("Spookhuis", 3.2, 0, 0));
		att.add(4, new Hawaii("Hawaii", 2.9, 0, 0));
		att.add(5, new Ladderklimmen("Ladderklimmen", 5, 0, 0));

	}

}
