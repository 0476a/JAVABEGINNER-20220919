package ch01;

public class DataTypeEx2 {
	
	// 코드의 시작점
	public static void main(String[] args) {
		
		// 기본 데이터 타입 : (data 담을 공간에 어떠한 종류인지 결정, 정해주어야 하는 것)
		
		// 문자 자료형 ( 단 한글자)
		char name; // 변수에 선언
		// 값을 넣다 --> 초기화 한다.
		char a;
		
		// 초기화 하기 위해서는 이름으로 먼저 찾아야 한다.
		name = 'A'; // 변수에 초기화
		// char 타입에 데이터 크기는 2바이트 (16bit)
		// name = 'AB'; // char 타입은 오직 한글자만 취급한다.
		
		// 화면에 name 상자 안에 들어 있는 값을 출력해죠 !!!
		System.out.println(name); // 출력값 :  A
		
		
		a = 'Y';
		System.out.println(a); // 출력값 : Y
		
		name = '한';
		System.out.println(name); // 출력값 : 한
		
		// 2바이트 공간안에 하나의 문자만 담을 수 있다.
		
		
		
		
		

	} // end of main

} // end of class
