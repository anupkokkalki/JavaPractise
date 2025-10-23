package meSynchronized;

public class MyThread1 extends Thread {
	
	HugeTask hugeTask;
	
	public MyThread1(HugeTask hugeTask) {
		this.hugeTask=hugeTask;
	}
	
	public void run() {
		hugeTask.doHugeTask();
	}
	

}
