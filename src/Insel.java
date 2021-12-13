import java.text.DecimalFormat;

public class Insel {

	public static void main(String[] args) {
		
		int betrag_verkauf = 24, zinssatz, jahr;
		double betrag_heute = betrag_verkauf;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		for(jahr = 1628; jahr < 2021; jahr++) {
			
			betrag_heute = betrag_heute + betrag_heute * 2 / 100;
			
		}
		System.out.println("Indianer hätte " + df.format(betrag_heute) + "$ bekommen.");
	}

}
