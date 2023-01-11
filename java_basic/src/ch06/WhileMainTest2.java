package ch06;

public class WhileMainTest2 {

	// 코드의 시작점 (메인 쓰래드)
	public static void main(String[] args) {
		
		// while 문을 사용해서 1 부터 10까지 더해서 그 결과를 화면에 출력해 주세요.
		int startNumber = 1;
		int sum = 0;
		
		while(startNumber <= 10) {
			// 수행코드
			sum = sum + startNumber;
			// 증감식
			startNumber++; // 증감으로써 반복문 제어!
		}
		System.out.println("sum : " + sum);
		// 출력값 :                        sum : 55

	} // end of main
} // end of class
