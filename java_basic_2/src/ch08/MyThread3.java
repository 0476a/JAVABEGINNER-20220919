package ch08;

public class MyThread3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		// 1 ~ 10 main
		// 최소값 1
		// 최소값 10
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		// 서브 작업자 3개 생성
		SubThread2 t1 = new SubThread2();
		t1.setPriority(1);
		SubThread2 t2 = new SubThread2();
		SubThread2 t3 = new SubThread2();
		t3.setPriority(10);
		// 작업에 시작은 start() 호출하면 된다.
		t1.start();
		t2.start();
		t3.start();
 		

	} // end of main

} // end of class

// 스레드 생성 방법 - 1

class SubThread2 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println(i + " : " + Thread.currentThread());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
