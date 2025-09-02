package workingWithArrays;

public class ArrayTraversing {
	public static void main(String[] args) {
		int k[] = new int[4];

		k[0] = 1;
		k[1] = 2;
		k[2] = 3;
		k[3] = 4;
		System.out.println("----- Traversing with for loop-------");

		for (int n = 0; n <= k.length - 1; n++) {
			System.out.println("e" + k[n]);

		}
		System.out.println("----- Traversing with foreach/enhanced loop-------");
		for (int e : k) {
			System.out.println("e" + e);
		}
		System.out.println("----- Traversing with foreach/enhanced loop and with index-------");
		int count = 0;
		for (int e : k) {
			System.out.println("index [" + count + "]" + "=" + e);
			count++;
		}

	}
}
