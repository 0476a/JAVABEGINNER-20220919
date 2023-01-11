package ch03;

public class MainTest2 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 산술 연산자 +-*/ ( % : 나머지 연산자)
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		
		// 값이 소수점이지만 정수형으로 바뀌면서 소수점이 없어짐.
		int number4 = 5 / 3;
		
		int number5 = 5 % 3;
		
		System.out.println(number1); //출력값 : 8
		System.out.println(number2); // 출력값 : 2
		System.out.println(number3); // 출력값 : 15
		System.out.println(number4); // 출력값 : 1
		System.out.println(number5); // 출력값 : 2
		
		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요.
		System.out.println( ( 12 + 3 ) / 3 ); // 출력값 : 5
		// 변수로 선언해도 되지만 식을 바로 출력해도 됨.
		
		// 2. (25 % 2) 값을 화면에 출력해 보세요.
		System.out.println( 25 % 2 ); // 출력값 : 1
		

	} // end of main

} // end of class
