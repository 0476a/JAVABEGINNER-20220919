package ch16;

public class NumberPrinter {
	// static 에 대해 알아보자 !!!
	// 번호표 만들기
	private int id;
	private static int waitNumber;
	
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}
	
	// 번호표를 출력합니다.
	public void printWaitNumber() {
		System.out.println(id + "기기의 대기 순번 : " + waitNumber);
		waitNumber++;
	}

} // end of class
