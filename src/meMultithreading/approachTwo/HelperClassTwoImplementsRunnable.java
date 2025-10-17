package meMultithreading.approachTwo;

public class HelperClassTwoImplementsRunnable implements Runnable{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("HelperClassTwoImplementsRunnable - run method started");
			for (int j = 0; j < 10; j++) {
				System.out.println("HelperClassTwoImplementsRunnable Dont looking into thread sheduling/sequenting its not incontrol for dev-as its OS & JVM dependent");}
			
		}

}
}
