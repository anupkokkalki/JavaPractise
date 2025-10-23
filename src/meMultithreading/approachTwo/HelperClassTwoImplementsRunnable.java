package meMultithreading.approachTwo;

public class HelperClassTwoImplementsRunnable implements Runnable {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("HelperClassOneExtendsThread - run method started");
			for (int j = 0; j < 10; j++) {
				System.out.println("looking into thread sheduling/sequenting not incontrol for dev OS & JVM dependent");
			}

		}

	}
}
