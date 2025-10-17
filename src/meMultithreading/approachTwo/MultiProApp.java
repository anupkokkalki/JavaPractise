package meMultithreading.approachTwo;

public class MultiProApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelperClassTwoImplementsRunnable helperObjTwo = new HelperClassTwoImplementsRunnable();

		Thread helperThread = new Thread(helperObjTwo);
		helperThread.start();
		
		
		
		// main thread work
				for (int i = 0; i < 10; i++) {
					System.out.println("Main Thread Started");		

					Thread t = Thread.currentThread();
					System.out.println("Current Thread Name: " + t.getName());
//					t.setName("mainThreadRenamed"+i);
					System.out.println("After rename: " + t.getName());
				}	

	}

}
