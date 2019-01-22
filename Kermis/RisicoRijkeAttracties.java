package Kermis;

public class RisicoRijkeAttracties extends Attractie {
	protected int aantalRittenTotOnderhoud;
	protected int aantalBeurtenVoorOnderhoud;

	public RisicoRijkeAttracties(String naam, double prijs, double omzet, int verkochteKaartjes) {
		
		super(naam, prijs, omzet, verkochteKaartjes);
		this.aantalRittenTotOnderhoud = 0;
		// TODO Auto-generated constructor stub
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
		if (isOnderhoudsBeurtNodig() == true) {
			System.out.println("Helaas de monteur moet langskomen. als die 'R' intypt van reparatie wordt het weer gefixt.");
		} else {
			this.verkochteKaartjes += 1;
			this.aantalRittenTotOnderhoud += 1;
		}
		
		
	}

	public int getAantalRittenTotOnderhoud() {
		return aantalRittenTotOnderhoud;
	}
	
	public boolean isOnderhoudsBeurtNodig() {
		if ( aantalRittenTotOnderhoud == aantalBeurtenVoorOnderhoud) {
			return true;
		} return false;
	}
	
	 public void onderhoudsBeurtIsGeweest() {
		aantalRittenTotOnderhoud = 0;
		System.out.println("De monteur is langsgeweest. U kunt de attractie " + super.naam + " weer gebruiken");
	}

	
	


	
	
}
