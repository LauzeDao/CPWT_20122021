package YTTUTs;

public class Schleifen {
	
	public static void main(String[] args) {
		
		int number = 1;
		
		while(number <= 5) {
			System.out.println(number);
			number += 1; // entspricht number = number + 1; 
			
		}
		
		int zahl = 4;
		
		do {
			System.out.println(zahl);
			zahl++;
		}
		while(zahl <= 7);
		
	
			//Initialisierung in der Schleife, vorher nicht nötig	
		for(int i = 0; i< 4; i++) {
			System.out.println(i);
		}
		
		
	}
}
