
package NestedClasses;

public class Outer {
	private int a = 10;
	private int b = 20;

//	void display() {
//		System.out.println("Outer class method called."+innerField);
//	}

	class inner {
		int a = 100;
		int b = 200;

		public void display() {
			int a = 1000;
			int b = 2000;
			System.out.println(a + b);
			System.out.println(this.a + this.b);

			System.out.println(Outer.this.a + Outer.this.b);
		}
	}

	public static void main(String[] args) {
		// Outer o = new Outer();
		// o.display();
		Outer.inner i = new Outer().new inner();
		i.display();
	}
}
