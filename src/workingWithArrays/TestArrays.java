package workingWithArrays;

public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		a[0] = 10;
			a[1] = 20;
				a[2] = 30;
						a[3] = 40;
						a[4] = 50;
						
						System.out.println(a[0]);
						System.out.println(a[1]);
						System.out.println(a[2]);
						System.out.println(a[3]);
						System.out.println(a[4]);
						
						//System.out.println(a[5]); // ArrayIndexOutOfBoundsException
						
						System.out.println("Length of array: " + a.length);
						
						//print all the values of array: use for loop
						
						for(int i=0; i<a.length; i++) {
							System.out.println(a[i]);
						}
						
						//print all the values of array: use for each loop
						
						for(int e : a) {
							System.out.println(e);
						}
						
						//double array:
						
						double d[] = new double[3];
						d[0] = 12.33;
						d[1] = 23.44;
						d[2] = 34.55;
						
						for(int i=0; i<d.length; i++) {
							System.out.println(d[i]);
						}
						
						//char array:
						
						char c[] = new char[3];
						c[0] = 'a';
						c[1] = 'b';
						c[2] = 'c';
						
						for(int i=0; i<c.length; i++) {
							System.out.println(c[i]);
						}
						
						//String array:
						
						String s[] = new String[3];
						s[0] = "Hello";
						s[1] = "World";
						s[2] = "Java";
						
						for(int i=0; i<s.length; i++) {
							System.out.println(s[i]);
						}
						
						//boolean array:
						
						boolean b[] = new boolean[2];
						b[0] = true;
						b[1] = false;
						
						for(int i=0; i<b.length; i++) {
							System.out.println(b[i]);
						}

	}

}
