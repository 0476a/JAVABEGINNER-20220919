package ch05;

import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		// if else if else + 관계연산자 + Scanner (사용자의 값을 받아주는 역할)
		// 논리 + 관계연산
		
		System.out.println("성적을 입력하세요:");
		int number; // 변수에 선언
		Scanner scanner; // (참조) 변수에 선언
		scanner = new Scanner(System.in); // 값을 초기화 (주소값을 넣다.)
		
		int point = scanner.nextInt(); // 정수값을 받아 주는 녀석
		//System.out.println("point" + point); // 출력값 : point입력값
		
		// 문제 if 문을 활용해서
		// 100 ~ 90 A학점 (90점이면 A학점)
		// 90 ~ 80 B학점 (80점이면 B학점)
		// 80 ~ 70 C학점 (70점이면 C학점)
		// 60 ~ 0 F학점
		// 논리곱을 사용해서 식을 완성해주세요 !!!
		
		// 분할앤 정복 방식
		// 만약 point 점수가 100에서 90점 까지면 A 학점
		// T && T
		
		
		if ((point <= 100) && (point >= 90)) {
			System.out.println("A학점");
		} else if ((point < 90) && (point >= 80)) {
			System.out.println("B학점");
		} else if ((point < 80) && (point >= 70)) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
		

	}

}
