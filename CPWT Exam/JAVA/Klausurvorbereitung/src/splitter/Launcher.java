package splitter;

import java.util.Arrays;
import java.util.Scanner;

public class Launcher {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String q = s.next();
		String neu[] = q.split("");
		System.out.println(Arrays.toString(neu));
		s.close();
		int quersumme = 0;
		
		for(int i = 0; i < neu.length; i++) {
			quersumme += Integer.parseInt(neu[i]);
		}
		System.out.println(quersumme);
	}

}
