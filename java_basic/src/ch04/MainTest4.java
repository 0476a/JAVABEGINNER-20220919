package ch04;

public class MainTest4 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 증가 연산자, 감소 연산자
		//    ++         ,       --
		// 증가 연산자는 변수에 직접 접근해서 오직 +1 만 한다. 중요!
		// 감소 연산자는 변수에 직접 접근해서 오직 -1 만 한다. 중요!
		
		int num1 = 1;
		num1++;
		System.out.println(num1);  // 출력값 : 2
		
		int num2 = 1;
		num2--;
		System.out.println(num2); // 출력값 : 0
		 
		// 결론 : 증가 연산자는 변수(메모리공간)에 있는 값을 1 증가 시킨다.
		// 결론 : 감소 연산자는 변수(메모리공간)에 있는 값을 1 감소 시킨다.
		

	} // end of main

} // end of class
