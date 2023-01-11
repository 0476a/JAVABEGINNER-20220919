package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		
		try {
			// 예외가 발생할 수 있는 코드들을 넣어 둡니다.
			// 실제 예외가 발생하면 catch 블록으로 이동합니다.
			int result = 100 / 0;
		} catch(Exception e) {
			e.printStackTrace(); // 어디가 오류인지 찾아주는 메서드
			System.out.println("정수값을 0으로 나눌 수 없습니다.");
		}
		

	} // end of main

} // end of class
