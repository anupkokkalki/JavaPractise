package javaSessions;

public class FinalKeyword {

	public static void main(String[] args) {

		
		//final -- constant values
		
		int a = 10;
		a = 20;
		a = 30;
		a = 40;
		System.out.println(a);
		
		final int days = 7;
		//days = 10;
		int totalAmout = 100 * days;
		System.out.println(totalAmout);
		
		final String title = "Login Page";
		
		final double basePrice = 12.22;
		
		final char gender = 'm';
		
		System.out.println("Note 1: Explain final keyword");
		System.out.println("Note 2: Provide use cases for final keyword e.g day-of-week, NoOfMonth, Gender, disignnation, page title");
		System.out.println("Note 3: Provide datatypes on which final keywords can be applied-int,char,string,double");

		
	}

}