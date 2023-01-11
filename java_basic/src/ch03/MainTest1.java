package ch03;

public class MainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 대입 연산자 ( '  =  ' )
		// 연산에 방향은 오른쪽에서 왼쪽으로 연산이 됩니다.
		
		int number = 10;
		
		int number2 = number;
		System.out.println(number2); // 출력값 : 10
		System.out.println("===================");
		
		// 부호 연산자 ( + ,  - )
		System.out.println(-number); // 출력값 : -10
		System.out.println("===================");
		System.out.println(+number); // 출력값 : 10
		
		// 부호를 변경하는 연산자 입니다.
		// 단 변수에 들어 있는 실제 값을 변경하는 연산자는 아닙니다.
		// 그러면 실제 값을 변경하려면 대입연산자를 사용해야 한다.
		
		System.out.println("=====================");
		
		number = -number;
		System.out.println(number); // 출력값 : -10
		
		System.out.println("========================");
		int number3 = -100;
		
		
		// 문제 number3 이라는 변수에 값을 양수로 변경해주세요.
		// ' - '  +  ' + '    =    ' - '
		// -1 * -1 = 1
		number3 = -number3;
		System.out.println(number3); // 출력값 : 100
		

	} // end of main

} // end of class
