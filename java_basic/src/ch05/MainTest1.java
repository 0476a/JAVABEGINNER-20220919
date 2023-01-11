package ch05;

public class MainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {
		// 제어문 if
		// 주어진 조건에 따라서 실행이 이루어 지도록 구현한다.
		// 만약 .... 이라면 중요!

		// 1. if 문 단독 (true면 실행, false면 실행x)
		boolean flag = false;
		if (flag) {
			System.out.println("조건식이 true면 여기가 실행");

		} // end of if
			// 단독 if문은 실행 될 수도 있고 안될 수도 있다.

		// 2. if else 문
		boolean flag2 = true;
		if (flag2) {
			System.out.println("true이면 여기 실행 - 1");
			System.out.println("여기도 포함 됩니다 !~~~~");
		} else {
			System.out.println("false이면 여기 실행 - 2");
		}

		// 3. if else if else 문
		int point = 30;

		if (point >= 90) {
			System.out.println("A학점 입니다."); // point가 90이상 출력
		} else if (point >= 80) {
			System.out.println("B학점 입니다."); // point가 90미만 80이상 출력
		} else if (point >= 70) {
			System.out.println("C학점 입니다."); // point가 80 미만 70이상 출력
		} else if (point >= 60) {
			System.out.println("D학점 입니다."); // point가 70 미만 60이상 출력
		} else {
			System.out.println("F학점 입니다."); // point가 60미만 출력
		} // 출력값 : F학점 입니다.

	} // end of main

} // end of class
