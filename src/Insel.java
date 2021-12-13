import java.text.DecimalFormat;
import Prog1Tools.IOTools;

public class Insel {

	public static void main(String[] args) {
		
		int betrag_verkauf = 24, zinssatz, jahr_a, jahr_e;
		double betrag_heute = betrag_verkauf;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		jahr_a = IOTools.readInteger("Geben Sie das Jahr des Verkaufs ein: ");
		jahr_e = IOTools.readInteger("Geben Sie das aktuelle Jahr ein: ");
		betrag_verkauf = IOTools.readInteger("Geben Sie den Verkaufsbetrag ein: ");
		zinssatz = IOTools.readInteger("Geben Sie den Zinssatz ein: ");
		
		for(jahr_a = 1628; jahr_a <= jahr_e; jahr_a++) {
			
			betrag_heute = betrag_heute + betrag_heute * 2 / 100;
			
		}
		System.out.println("Indianer hätte " + df.format(betrag_heute) + "$ bekommen.");
		System.out.println("Kapital im Jahr " + jahr_a + " betrug " + betrag_verkauf + "$");
		System.out.println("Zinsatz pro Jahr beträgt " + zinssatz + " Prozent");
	}

}
