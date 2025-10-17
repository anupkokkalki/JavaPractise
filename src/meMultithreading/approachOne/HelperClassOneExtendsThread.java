package meMultithreading.approachOne;

import java.lang.Thread;

public class HelperClassOneExtendsThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("HelperClassOneExtendsThread - run method started");
			for (int j = 0; j < 10; j++) {
				System.out.println("Dont looking into thread sheduling/sequenting its not incontrol for dev-as its OS & JVM dependent");}
			
		}
	}

}
