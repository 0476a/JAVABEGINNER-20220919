package ch10;

public class MainTest1 {

	public static void main(String[] args) {
	
		MyFrame frame = new MyFrame();
		// frame.start(); // 없음!!
		// 사용하는 방법
		Thread thread = new Thread(frame); // 다형성
		
		thread.start();
		// start메서드는 run 메서드를 실행 해라!!!
		
	} // end of main

} // end of class
