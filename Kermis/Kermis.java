package Kermis; 

import java.util.*;

import Kermis.Attracties.*;
import java.math.*;

public class Kermis {

	ArrayList<Attractie> att = new ArrayList<>();
	int keuzeAttractie;
	
	public static void main(String[] args) {
		Kermis ker = new Kermis();
		ker.vulArrayList();
		ker.printMenu();
		
		for (int x = 0; x <555; x++) {
		ker.draaien();
		}
		
		
	}
	
	private void printMenu() {
		
		System.out.println("Welkom bij de Kermis!");
		System.out.println("=====================");
		int y = 1;
		for(Attractie attractie : att) {
			System.out.println("Kies " + y++ + " voor " + attractie.getNaam() + 
											" en de prijs is " + attractie.getPrijs());
		}
		
		
	}
	//hasNextInt() even uitzoeken
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
			System.out.println("De totaalomzet van " + att.get(keuzeAttractie).getNaam() 
					+ " is " + att.get(keuzeAttractie).getOmzet() + "\nHet aantal verkochte kaartjes is " + att.get(keuzeAttractie).getVerkochteKaartjes());
			
		}
		catch (Exception e) {
			System.out.println("Deze keuze is invalid.");
			System.out.println(keuzeAttractie);
		} 
		} else {
			String keuzeMenu = scan.nextLine();
			if (keuzeMenu.equals("O")) {
				double totaalOmzet = kas.totaalOmzet(att);
				System.out.println("De totaalomzet is: " + Math.round(totaalOmzet* 100.0) / 100.0);
				
			} else if (keuzeMenu.equals("K")) {
				int verkochteKaartjes = kas.totaalAantalVerkochteKaartjes(att);
				System.out.println("Het totaal aantal verkochte kaartjes: " + verkochteKaartjes);
			} else {
				System.out.println("Invalid input");
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

