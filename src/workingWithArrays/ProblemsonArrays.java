package workingWithArrays;

public class ProblemsonArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = new String[3];
		s[0] = "Hello";
		s[1] = "World";
		s[2] = "Java";

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		// print all the values of array: use for each loop

		for (String e : s) {
			System.out.println(e);
		}

		// Object array:

		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';

		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}

		// print all the values of array: use for each loop

		for (Object e : ob) {
			System.out.println(e);
		}
		
	}

}
