package ch04;

public class MainTest5 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 관계 연산자(비교 연산자)
		// 관찰에 결과가 참, 거짓으로 판별할 때 사용한다.
		// 결과값은 오직 true, false 나온다.
		
		int num1 = 5;
		int num2 = 3;
		                           // 5     <      3
		boolean value1 = num1  <  num2;
		System.out.println(value1); // 출력값 : false
		                             //  5    >=     3
		boolean value2 = ( num1 >= num2 ); // 출력값 : true
		System.out.println(value2);
		                            // 5     =     3
		boolean value3 = num1 == num2;  // 출력값 : false
		System.out.println(value3);
		                             // 5   !=   3
		boolean value4 = num1 != num2;  // 출력값 : true
		System.out.println(value4);
		
		System.out.println("---------------");
		System.out.println(100 > 3); // 출력값 : true
		System.out.println("---------------");
		System.out.println(100 < 3); // 출력값 : false
		System.out.println("---------------");
		System.out.println(200 != 201); //출력값 : true
		System.out.println("---------------");
		System.out.println(300 != 300); // 출력값 : false

	} // end of main

} // end of class
