package ch07;

public class MainTest1 {

	// 코드의 시작점 (실행 버튼을 누르면 제일 먼저 찾는 코드)
	public static void main(String[] args) {
		// 변수는 크게 2가지 종류가 있다.
		// 1. 값을 담는 기본 데이터 타입 (int, byte, long)
		// 2. 주소값을 담는 변수
		int num1 = 10; // 변수에 선언과 초기화
		num1 = 100;
		Student s1; // 변수에 선언 (데이터에 타입은 학생(Student))
		// 초기화 (값을 넣다.)
		s1 = new Student(); // 초기화
		
		System.out.println(num1); // 출력값 : 100
		System.out.println(s1); 
		// 출력값 : ch07.Student@587d1d39 (주소값)

	} // end of main

} // end of class
