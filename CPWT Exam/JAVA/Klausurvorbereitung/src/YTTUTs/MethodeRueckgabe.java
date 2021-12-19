package YTTUTs;

public class MethodeRueckgabe {
	
	public static void main(String[] args) {
		
		System.out.println("Do something Cat");
		String resultFromMethodDoSomethingCat = doSomethingCat (" *fart* ");
		System.out.println(resultFromMethodDoSomethingCat);
		System.out.println("It`s stinky in here");
	}
	
	public static String doSomethingCat(String f) {
		f = " *fart* ";
		return f;
		
		
	}
}
