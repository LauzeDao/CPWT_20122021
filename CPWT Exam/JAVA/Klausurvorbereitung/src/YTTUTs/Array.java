package YTTUTs;

public class Array { 
	
	public static void main(String[] args) {
		
		//bei Arrays [] hinter Datentyp, bei neuem integer wert bspw [3] übergeben. Die Zahl gibt an wie
		// viele Werte man speichern möchte.
		String[] fnames = new String[3];
		
		fnames[0] = "Laurence";
		fnames[1] = "Louis";
		fnames[2] = "Lucas";
		
		//System.out.println(fnames[2]);
		
		// .length gibt uns die aktuelle maximale Länge des Arrays an
		for(int i = 0; i < fnames.length; i++) {
			System.out.println(fnames[i]);
		}
		
		String[] lnames = new String[3];
		
		lnames[0] = "Meyer";
		lnames[1] = "Kürschner";
		lnames[2] = "Schuster";
		
		//for each: nur bei datenstrukturen einsetzbar, "Typ bezeichner: Array name" 
		//Array Schritt fuer Schritt durchlaufen und immer eine Kopie vom Wert an aktueller Stelle in name speichern
		for(String name: lnames) {
			System.out.println(name);
		}
			
		//mehrdimensionale arrays	
		// 2dimensional
											// Zeilen und Spalten
		String [][] firstAndLastName = new String[3][2];
		
		firstAndLastName[0][0] = "Christian";
		firstAndLastName[0][1] = "Heller";
		
		firstAndLastName[1][0] = "Janik";
		firstAndLastName[1][1] = "Krause";
		
		firstAndLastName[2][0] = "Martyna";
		firstAndLastName[2][1] = "Mol";
		
		//Äußere For-Schleife: Zeilenindex -> i
		// Innere For-Schleifge: Spaltenindex -> j
		for(int i = 0; i < firstAndLastName.length; i++) {
			for(int j = 0; j < firstAndLastName[i].length; j ++) {
					System.out.println(firstAndLastName[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
