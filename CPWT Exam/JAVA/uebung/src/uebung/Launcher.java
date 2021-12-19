package uebung;

import java.util.Arrays;

public class Launcher {
			
			public static void main (String[] args)		{
				
				String s = "Max riecht gut";
				System.out.println(s);
				
				s = s.replace("riecht gut","stinkt nach Fisch");
				System.out.println(s);
				
				String [] result = s.split("\\s");
				
				//System.out.println(Arrays.toString(result));
				
				for (int i = 0; i < result.length; i++) {
					
					System.out.println(result[i]);
				}
			
			}
		}


