package ch04;

public class MainTest6 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 논리 연산자
		// && : 엠퍼센트, ---> 논리곱 (And)
		// || : 버티컬 바 ----> 논리합 (Or)
		// 연산에 결과값이 true, false
		
		// 논리곱 &&
		int num1 = 10; // 변수에 선언과 동시에 초기화 (값을 넣다.)
		int num2 = 20;
		//    true                 true     &&       true
		boolean flag1 = ( num1 > 0) && ( num2 > 0);
		System.out.println(flag1); // 출력값 : true
		System.out.println("----------------");
		//      false              true     &&     false
		boolean flag2 = (num1 > 0) && (num2 < 0);
		// 둘다 true(참) 일 때 true 반환
		// 하나라도 false(거짓) 가 나오면 결과는 false 이다.
		System.out.println(flag2); // 출력값 : false
		System.out.println("----------------");
		
		// 논리 합 ||
		//       true               true   ||     true
		boolean flag3 = (num1 > 0) || (num2 > 0);
		System.out.println(flag3);  //출력값 : true
		System.out.println("----------------");
		//      true                false   ||    true 
		boolean flag4 = (num1 < 0) || (num2 > 0);
		// 논리합은 둘중에 하나라도 true 이면 그 결과는 반드시 true 이다.
		System.out.println(flag4);  // 출력값 : true
		System.out.println("----------------");
		
		// 부정 !
		// 결과 값을 참->거짓, 거짓->참 으로 바꿈.
		//         true      !     false
		boolean flag5 = !(num1 < 0 );
		System.out.println(flag5); // 출력값 : true
		System.out.println("----------------");
		
		// 문제
		int num3 = 35;
		int num4 = 37;
		
		// 문제 1
		// 논리곱 식을 만들어서 결과를 화면에 출력해보세요.
		//      false               true                            true                   false
		boolean flag6 = (num3 < num4) && (num3 >= 35) && (num4 <37);
		System.out.println(flag6); // 출력값 : false
		
		// 문제2
		// 논리합 식을 만들어서 결과를 화면에 출력해보세요.
		//      true                  false                        false                     true 
		boolean flag7 = (num3 == num4) || (num3 > num4) || (num4 <= 37);
		System.out.println(flag7); // 출력값 : true

	} // 중괄호에 범위는 절대적이다. end of main

} // end of class
