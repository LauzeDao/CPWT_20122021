package ggT;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		int m, n, r;
		Scanner s = new Scanner(System.in);
		System.out.println("Zahl 1: ");
		int zahl1 = s.nextInt();
		System.out.println("Zahl 2: ");
		int zahl2 = s.nextInt();
		
		if(zahl1 >= zahl2) {
			m = zahl1;
			n = zahl2;
		} else {
			m = zahl2;
			n = zahl1;
		}
	r = m % n;
		
		while(r != 0) {
			m = n;
			n = r;
			r = m % n;
		}
		System.out.println("Der ggT von  " + zahl1 + " und " + zahl2 + " ist " + n);
	}

}