package ch01;

public class DataTypeEx3 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 기본 자료형
		// 실수형 (1.0, 0.123)
		
		// float      - 4바이트
		// double   - 8바이트 (실수형에 기본 연산에 단위는 double 이다.)
		
		// float 데이터 타입을 사용할려면 접미사를 붙여 주어야 한다.
		float name = 0.5F;
		double name2 = 0.5;
		
		double name3 = 0.1234;
		double name4 = 1.12345678;
		
		
		System.out.println(name); // 출력값 : 0.5
		System.out.println(name2); // 출력값 : 0.5
		
		System.out.println(0.5); // -> double로 인식    출력값 : 0.5 
		System.out.println(0.5F); // ->float로 인식      출력값 : 0.5
		

	} // end of main

} // end of class
