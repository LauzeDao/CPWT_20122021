package cs21_1_5_exception;

//import cs21_1_5_exception.AusnahmeException.PlatzMangelException;

public class OsterNest {
	
	int kapazitaet;
	int eier;
	
	public OsterNest ( int k, int e) {
		
	
		super();
		this.kapazitaet = k;
		this.eier = e;
	}
	
	void hinzufuegen(OsterNest o) throws PlatzMangelException {
		
		if ((this.eier + o.eier)< this.kapazitaet) {
			
		this.eier = this.eier + o.eier;
	
		}
		else {
			
			throw new PlatzMangelException("Osternest zu klein");
		}
	}
	
	void fuellen () {
		
		if (this.eier < this.kapazitaet) {
			
		
		(this.eier)++;
		fuellen();
		} else {
			
			System.out.println("Osternest voll!");
		}
	}
	
	
		
}
