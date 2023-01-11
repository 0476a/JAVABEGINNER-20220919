package ch01;

public class DataTypeEx4 {

	// 코드의 시작점
	public static void main(String[] args) {
		// 기본 데이터 타입
		// 논리 자료형 (사실을 관찰하고 결과값이 참, 거짓을 판별할 때 사용한다.)
		
		// 변수에 선언과 동시에 값을 넣다 (초기화)
		boolean isMarried = false;
		System.out.println(isMarried);  // 출력값 : false
		
		isMarried = true;
		System.out.println(isMarried);  // 출력값 : true
		
		// 1바이트(8bit)
		
		boolean isOk;
		isOk = false;
		System.out.println(isOk);  // 출력값 : false
		System.out.println("==========");
		System.out.println(true);  // 출력값 : true
		System.out.println(false);  // 출력값 : false
		
		

	} // end of main

} // end of class
