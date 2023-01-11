package ch05;

// import : 수입하다, 가지고 오다.
import java.util.Scanner; // Ctrl + shift + O 사용 후

public class MainTest2 {

	// 코드의 시작점
	public static void main(String[] args) {
		// 변수에 종류는 크게 딱 2가지다.
		// 1. 기본 데이터 타입 : int. double, ....
		// 2. 참조 타입 : 주소값
		
		// 입출력 IO
		int number; //  변수에 선언
		Scanner sc = new Scanner(System.in); // 참조 선언과 주소값 넣기를 동시에
		// -> Ctrl + shift + O 사용
		
		// Ctrl + shift + F : 정렬!
		// int point = 30;
		System.out.println("정수값을 입력해주세요.");
		int point = sc.nextInt(); // 정수값을 받아주는 역할
		
		if (point >= 90) {
			System.out.println("A학점 입니다.");
		} else if (point >= 80) {
			System.out.println("B학점 입니다.");
		} else if (point >= 70) {
			System.out.println("C학점 입니다.");
		} else if (point >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}

	} // end of main

} // end of class
