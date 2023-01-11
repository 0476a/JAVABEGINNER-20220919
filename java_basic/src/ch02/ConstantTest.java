package ch02;

public class ConstantTest {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 예약어
		// 자바에서 개발자들이 미리 선점해둔 단어들
		// 상수(constant)
		
		
		int age = 10; // 변수
		
		age = 11;  // 변수
		
		final int MONTH = 12; // 상수
//		MONTH = 10;
		// 권장사항 : 상수에 이름을 사용할 때는 대문자로 사용한다. (가독성을 위해)
		System.out.println(MONTH); // 출력값 : 12
		
		final int MAX_NUM = 10; // 상수에 선언과 동시에 초기화
		final int MIN_NUM; // 상수에 선언
		MIN_NUM = 0;
//		MIN_NUM = 1;
		// 상수는 한번 값이 초기화 되면 그 이후에 변경할 수 없다.
		
		System.out.println(MAX_NUM); // 출력값 : 10
		System.out.println(MIN_NUM); // 츌력값 : 0
		
		final int MY_COUNT = 100;
		// 1. 위에서 상수는 어디를 말하는 걸까요?
		// 답. MY_COUNT
		
		// 2. 예약어는 어디를 말하는 걸까요?
		// 답. final, int
		
		// 3. 리터럴은 어디를 말하는 걸까요??
		// 답. 100
		
		

	} // end of main

} // end of class
