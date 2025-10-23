package meSynchronized;

public class MyThread2 extends Thread {
	
	HugeTask hugeTask;
	
	public MyThread2(HugeTask hugeTask) {
		this.hugeTask=hugeTask;
	}
	
	public void run() {
		hugeTask.doHugeTask();
	}

}
