package meSynchronized;

public class HugeTask {

	
		public synchronized void doHugeTask() {
			
			synchronized(this) {
				for(int i=1;i<=5;i++) {
					System.out.println("Huge Task - "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			System.out.println("Huge Task Completed");
		}
		
		
}
