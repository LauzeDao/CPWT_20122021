package cs21_1_5_exception;

import cs21_1_5_exception.*;

public class Launcher {
	
	public static void main(String[]args) {
		
		OsterNest o1 = new OsterNest(10, 2);
		System.out.println("Nest 1: " + o1.eier );
		OsterNest o2 = new OsterNest(20, 20);
		System.out.println("Nest 2: " + o2.eier );
		
		try {
			
			o1.hinzufuegen(o2);
			
		} catch (PlatzMangelException e) {
			
			System.err.println("Fehler: " + e.getMessage());
		}
		System.out.println("Nest 1 nach Hinzufügen: " + o1.eier );
		
		o1.fuellen();
		System.out.println("Nest 1 nach Füllen: ");
	}

}
