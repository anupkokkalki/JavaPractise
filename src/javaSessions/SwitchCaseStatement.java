package javaSessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		// switch - case: int, short, byte, string, char
		System.out.println("*******Please go though this execise in recordings*******");

		String browser = "edgefail";
		double version = 111.11;

		switch (browser) {
		case "chrome":
			System.out.println("launching chrome");
			if (version == 111.11) {
				System.out.println("launching chrome 111.11");
				break;
			}
			break;
		case "firefox":
			System.out.println("launching firefox");
			break;
		case "safari":
			System.out.println("launching safari");
			break;
		case "edge":
			System.out.println("launching edge");
			break;

		default:
			System.out.println("plz pass the right browser name..." + browser);
		}

		//
		int marks = 95;
		switch (marks) {
		case 10:
			System.out.println("grade D");
			break;
		case 90:
			System.out.println("grade A");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		//
//		double bmi = 12.33;
//		switch (bmi) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

		//
		char c = 'e';
		switch (c) {
		case 'a':
			break;
		
		}

		// NA
//		boolean flag = true;
//		switch (flag) {
//		case true:
//			
//			break;
//
//		default:
//			break;
//		}

		short s = 12;
		switch (s) {
		case 10:

			break;

		default:
			break;
		}

		// NA
//		long l = 10000;
//		switch (l) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

	}

}