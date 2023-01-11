package ch16;

public class MainTest1 {

	public static void main(String[] args) {
		
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		
		numberPrinter1.printWaitNumber(); // 출력값 : 1기기의 대기 순번 : 1
		numberPrinter1.printWaitNumber(); // 출력값 : 1기기의 대기 순번 : 2
		numberPrinter1.printWaitNumber(); // 출력값 : 1기기의 대기 순번 : 3
		numberPrinter1.printWaitNumber(); // 출력값 : 1기기의 대기 순번 : 4
		numberPrinter1.printWaitNumber(); // 출력값 : 1기기의 대기 순번 : 5
		
		System.out.println("================");
		
		numberPrinter2.printWaitNumber(); // 출력값 : 2기기의 대기 순번 : 6
		numberPrinter2.printWaitNumber(); // 출력값 : 2기기의 대기 순번 : 7
		numberPrinter2.printWaitNumber(); // 출력값 : 2기기의 대기 순번 : 8
		
		// waitNumber가 static으로 되어있기 때문에
		// 프린트 1과 프린트 2가 함께 waitNumber를 공유하고 있음.
		
	} // end of main

} // end of class
