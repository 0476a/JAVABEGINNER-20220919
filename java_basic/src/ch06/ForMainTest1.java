package ch06;

public class ForMainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
//		for(초기화식; 조건식; 증감식) {
		
//			       수행문 (코드)
//		} // end of for
		
		
		// 1 부터 10까지 더한 결과 출력하세요.
		int sum = 0; // 변수 선언과 동시에 초기화(값을 넣다)
		// 1 + 2+ 3 ... + 10 = 55; 계산
		// int i; // 여기에 i를 정의하면 main안에 유효함!
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println("i의 현재값 : " + i);
			// 출력값 : i의 현재값 : 1 ~ 10
		} // end of for
		// i = 10; X // i의 범위는 end of for 안에 끝남. (블록의 유효범위는 절대적이다.
		
		System.out.println("현재 sum 의 값은 : " + sum);
		// 출력값 : 현재 sum 의 값은 : 55
		

	} // end of main

} // end of class
