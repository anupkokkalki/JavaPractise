package meSynchronized;

public class MyThreadSynchronizedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HugeTask hugeTask = new HugeTask();
		MyThread1 t1 = new MyThread1(hugeTask);
		MyThread2 t2 = new MyThread2(hugeTask);
		System.out.println("" + t1.getName());
		
		t1.start();
		System.out.println("" + t2.getName());

		t2.start();

	}

}
