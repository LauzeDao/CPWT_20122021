package cs20_2_1_grundrechenarten;

import java.util.*;

//dies ist die Startklasse

public class Launcher {
	
	//dies ist die Einstiegsmethode
	public static void main (String[] artgs) {
		
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int r = 0;
		String quit = " n ";
		
		while (quit.equals("n")) {
		
		System.out.println("Operand a: ");
		a = s.nextInt ();
		System.out.println("Operand b: ");
		b = s.nextInt ();
		System.out.println("Operator: ");
		String o = s.next ();
		
		r = 0;
		
		switch (o) {
		
		case"+":
			r = a + b;
			break;
			
		case"-":
			r = a - b;
			break;
			
		case"*":
			r = a * b;
			break;
			
		case"/":
			r = a / b;
			break;

		default:
			; 	//nur Semikolon entspricht "nichts"
		}
	  
		}
		
		System.out.println("Ergebni	s: " + r);
		
		System.out.println("Programm beenden? (j/n)");
		quit = s.next();
		
		s.close();
	}
	

}
