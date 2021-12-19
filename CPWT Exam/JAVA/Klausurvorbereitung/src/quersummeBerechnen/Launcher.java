package quersummeBerechnen;

import java.util.Scanner;

public class Launcher {
	
	public static void main(String[] args) {
		System.out.println("Bitte Zahl eingeben !");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		int quersumme = 0;
		int ziffer = 0;
		while (i>0) {
			// % bedeutet modulo
			// summe wird durch 10 dividiert. Rest der Division von 10 subtrahiert
				ziffer = i % 10;
				quersumme += ziffer;
				i = i/10;
					}
		System.out.println("Die Quersumme beträgt " + quersumme);
		s.close();
	}
	
	

}
