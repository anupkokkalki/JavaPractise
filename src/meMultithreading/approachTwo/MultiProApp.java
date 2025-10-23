package meMultithreading.approachTwo;

public class MultiProApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelperClassTwoImplementsRunnable helperObjTwo = new HelperClassTwoImplementsRunnable();

		Thread helperThread = new Thread(helperObjTwo);

		helperThread.setName("helperThreadRenamed");
		helperThread.getName();

		Runnable r = new HelperClassTwoImplementsRunnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Anonymous Runnable run method");				}
				
			}
		};
		Thread t1 = new Thread(r);
		t1.setName("anonymousRunnableThread");

		String anonymousRunnableThreadthreadName = t1.getName();
		System.out.println("Thread Name: " + anonymousRunnableThreadthreadName);
		
		helperThread.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		helperThread.start();
		t1.start();



		// main thread work
		for (int i = 0; i < 10; i++) {
			try {
				helperThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // main thread will wait until helpThread is completed
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread Started");
			Thread t = Thread.currentThread();
			System.out.println("Current Thread Name: " + t.getName());
//					t.setName("mainThreadRenamed"+i);
			System.out.println("After rename: " + t.getName());
		}

	}

}
