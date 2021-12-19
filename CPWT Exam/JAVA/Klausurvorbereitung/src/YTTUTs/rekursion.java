package YTTUTs;

public class rekursion {
	
	public static void baumfaellen(int a) {
		
		System.out.println("hacken");
		if(a==1) {
			System.out.println("Baum faellt !");
		}
		
		else {
			//Rekursion -> Methode ruft sich selbst wieder auf
			
			baumfaellen(a-1);
		}
	}
	
	public static void main(String[] args) {
			baumfaellen(5);
	}

	//Iteration -> bestimmte Abschnite werden wiederholt, bspw mit Schleifen (do while etc.)
	
}
