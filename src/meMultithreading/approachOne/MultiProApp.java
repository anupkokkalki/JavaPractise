package meMultithreading.approachOne;

public class MultiProApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelperClassOneExtendsThread helperOne = new HelperClassOneExtendsThread();

		helperOne.start();
		
		
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Anonymous Thread run method");
			}
		};
		t1.start();

		// main thread work
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread Started");		

			Thread t = Thread.currentThread();
			System.out.println("Current Thread Name: " + t.getName());
//			t.setName("mainThreadRenamed"+i);
			System.out.println("After rename: " + t.getName());
		}		// main thread work

	}

}
