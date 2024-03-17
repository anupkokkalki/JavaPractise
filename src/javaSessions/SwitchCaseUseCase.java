package javaSessions;

public class SwitchCaseUseCase {

	public static void main(String[] args) {
		char alpha = 'a';

		switch (alpha) {
		case 'a':
			System.out.println("This is vowel (AEIOU)");
			break;

		case 'e':
			System.out.println("This is vowel (AEIOU)");
			break;
		case 'i':
			System.out.println("This is vowel (AEIOU)");
			break;
		case 'o':
			System.out.println("This is vowel (AEIOU)");
			break;
		case 'u':
			System.out.println("This is vowel (AEIOU)");
			break;
		default:
			System.out.println("This is a consonant (~AEIOU)");
			break;
		}

		String envName = "stage";
		switch (envName.trim().toLowerCase()) {
		case "Prd":
			System.out.println("Switch realtime usecase in switching tests in environment to desired env:" + envName);
			break;

		case "Stage":
			System.out.println("Switch realtime usecase in switching tests in environment to desired env:" + envName);
			break;
		case "Dev":
			System.out.println("Switch realtime usecase in switching tests in environment to desired env:" + envName);
			break;

		default:
			System.out.println("Not found environment " + envName);
			break;
		}
		System.out.println(" Note: 1}  understand unreachable code in switch ");
		System.out.println(" Note: 2}  understand break code in switch with below");
		String uber = "Mini";
		switch (uber) {
		case "Mini": {

			System.out.println("		Travel in " + uber);

		}
		case "Micro": {

			System.out.println(" 		y proceed to next case? under micro while " + uber + " Break is the culprit here");
			break;
		}
		default:
			System.out.println("No ride");
		}
		System.out.println(" Note: 3}  understand how to handle charecter case in switch toLowerCase()");
		System.out.println(
				" Note: 4}  understand Y not to handle charecter case in switch using ignorecase()-returns boolean");
		System.out.println(" Note: 5}  understand how to handle junk space  in switch using trim()");

		System.out.println(" Note: 6}  explain realtime usecases for switch");
		System.out.println(
				" Note: 7}  explain when to go switch - i.e while cases are finite like weekday/environments/uberBooking vehichle mini, auto etc");
		System.out.println(" 		user based permission- admin, customer, sale, vendor");

		System.out.println(" 		run test cases- sanity, smoke, regression, prod");
}

}
