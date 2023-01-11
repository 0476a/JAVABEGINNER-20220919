package ch01;

public class DataTypeEx1 {
	
	// 코드의 시작점(메인함수)
	public static void main(String[] args) {
		
		//크게 데이터 타입 종류 2가지가 있다.
		// 1. 기본 데이터 타입 (정수, 실수, 문자, boolean)
		// 2. 참조 타입 - 주소값
		
		// 데이터 타입에 종류
		// 정수형 데이터 타입 (1, 10, 100 정수형 data들을 담을 수 있다.)
		byte b; // 1바이트 // 127
		b = 127;
		// b=128;
		
		short s; // 2바이트 약 3만 2천
		s = 32000;
//		s = 33000;
		
		int i; // 4바이트 +- 약 21억
		i = 2100000000;
//		i = 2200000000;
		
		long l; // 8바이트 : 접미사
		l = 2200000000L; // 대문자 사용 권장
		l = 2200000000l;
		
		
		
	} // end of main

} // end of class
