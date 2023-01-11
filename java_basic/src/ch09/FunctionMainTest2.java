package ch09;

public class FunctionMainTest2 {

	// 메인 함수
	public static void main(String[] args) {
		// 함수 안에서 선언하는 변수는 지역변수
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;

		// 함수에 호출은 (사용은 모양 맞추기다.)
		int total = addNumber(num1, num2, num3);
		System.out.println(total); // 출력값 : 600
		
		sayHello("반갑습니다~~"); 
		// 출력값 : 매계변수로 넘겨 받은 값 : 반갑습니다~~
		
//		int myResult2 = calSum(); 
//		System.out.println(myResult2); // 출력값 : 5050
		System.out.println(calSum()); // 출력값 : 5050
		
		System.out.println("-------------------");
		
		// 문제 1번
		int total2 = intAdd(10, 20);
		System.out.println(total2); // 출력값 : 30
		
		// 문제 2번
		double total3 = doubleAdd(10, 20);
		System.out.println(total3); // 출력값 : 30.0
		
		// 문제 3번
		printArticle("안녕"); // 출력값 : -----------
		                                 //             안녕
		                                 //             -----------
		
		
		

	} // end of main

	// 1. 리턴값이 있는 함수
	public static int addNumber(int n1, int n2, int n3) { // (매계 변수)
		// 함수 안에도 변수를 선언할 수 있다.
		// 함수 안에 선언되는 변수는 지역변수라고 한다.
		int result; // 지역변수
		result = n1 + n2 + n3;
		return result;
	}

	// 2. 리턴 값이 없는 함수 void : 리턴값이 없다. (텅빈)
	// (괄호안에) ---> 매계변수
	public static void sayHello(String greeting) {
		System.out.println("매계변수로 넘겨 받은 값 : " + greeting);
	} // 실행의 제어가 반환된다.

	// 3. 리턴값이 있지만 매계변수가 없는 함수
	public static int calSum() {
		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			// sum = sum + i;
			sum += i;
		}
		return sum;

	}
	
	// 문제 1.
	// 1. 리턴값 int, 매계변수 n1, n2 이름은 intAdd 함수 만들어 주세요.
	public static int intAdd(int n1, int n2) {
		// 괄호 안에 매계변수에 범위는 함수 몸체 까지 이다.
		// int result = n1 + n2;
		return n1 + n2;
	}
	
	// 2. 리턴값 double 매계변수 d1, d2 이름은 doubleAdd 함수 만들어 주세요.
	public static double doubleAdd(double d1, double d2) {
		return d1 + d2;
	}
	
	// 3. 리턴값 void 매계변수 String article 이름은 printArticle 함수 만드어 주세요.
	public static void printArticle(String article) {
		System.out.println("--------------");
		System.out.println(article);
		System.out.println("--------------");
	}

} // end of class
