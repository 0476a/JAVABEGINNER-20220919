package ch04;

public class OperatorEx1 {

	// 코드의 시작점
	public static void main(String[] args) {
				
				int i = 10;
				double d = 20.5;
				
				// 1
				// 두 수를 덧셈 연산 하여 result1 변수에 담고
				// 결과값 30.5를 출력 하세요.
				double result1 =  (i + d) ;
				System.out.println(result1); // 출력값 : 30.5


				// 2
				// result1 변수를 정수형으로 강제 형 변환 해서 출력하세요
				System.out.println((int) result1); // 출력값 : 30
				
			

				// 3
				// i 변수의 값을 -1을 뺀 후 출력하세요
				// 단, 단항 연산자 사용 (증가, 감소)
				i--;
				System.out.println(i);  // 출력값 : 9


				// 4
				// d 변수에 값을 -20.5로 출력 하세요
				// 단, d 변수에 값을 변경하지 마세요
				System.out.println(-d); // 출력값 : -20.5
				System.out.println(d); // 출력값 : 20.5



				// 5
				// 변수 i와 d, 관계 연산자를 사용해서 result2 변수를 
		        // 선언하고 변수에 true 값이 담기도록 식을 만들고
		        // 출력하세요 
				System.out.println("i : " +i); // 출력값 : i : 9
				// 로깅 기법 (화면에 찍어서 하나 하나 살펴본다.)
				                         // 9 < 20.5
				boolean result2 = (i <  d);
				System.out.println(result2); // 출력값 : true
				

				int num1 = 10;
				int num2 = 30;

				// 6
				// 변수 result3을 선언하고
				// num1과 num2 변수가 숫자 50보다 큰지 
				//논리 연산자를 사용해서 결과를 담고 출력하세요
				//       false                false                   false
				boolean result3 = (num1 > 50) && (num2 > 50);
				System.out.println(result3); // 출력값 : false


				// 7
				// num1과 num2 값 중 큰 수를 삼항 연산자를 사용해서
				// max 변수에 값을 담고 출력해주세요
				// 단, 선언과 초기화를 동시에 해주세요
				
				// 삼항연산자 -> if 문을 간소화 할 때 많이 사용한다.
				// 조건문 ? 결과1 : 결과2
				//                               true          참   :   거짓 
				boolean result5 = (50 < 100) ? true : false;
				System.out.println(result5); // 출력값 : true
				//                    true    참 : 거짓
				int result6 = (1 < 2) ? 1  :  -1;
				System.out.println(result6); // 출력값 : 1
		

	} // end of main

} // end of class
