package test;

public class Launcher {
	
	static void fill (char[][] a, char c) {
		
		for (int i = 0; i  < 3; i++ ) {
			
			for (int j = 0; j < 4; j++) {
				
							a[i][j] = c;
							c++;
			}
		}
	}
	
	static void print(char[][] a) {
		
			for (char[] i : a) {
				
				for (char c : i) {
					
					System.out.println(c);
				}
				System.out.println();
			}
	}

	public static void main(String[] args) {
		
		char [][] a = new char[3][4];
		char c = 97;
		
		Launcher.fill(a, c);
		Launcher.print(a);
	}
}
