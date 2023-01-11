package ch06;

import java.util.Scanner;

public class ContinueTest {

	// 코드의 시작점
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 콘솔창에서 정수값을 받는 명령어 .. 
		
		// 예약어 continue
		// 무시하고 진행하는 continue
		
//		int i;
//		// 3에 배수이면 화면에 글자를 출력하지 마시오.
//		for (i = 1; i <= 10; i++) {
//			if (i % 3 == 0 ) {
//				continue;  // 조건이 참일 때 밑으로 내려가지 않고 바로 처음으로 돌아감.
//				// 조건에 의해 3의 배수만 빼고 결과 값이 나오게 됨.
//			} // end of if
//			System.out.println("i의 결과값은 : " + i);
//			// 출력값 : 1 , 2, 4, 5, 7, 8, 10
//		} // end of for
		
		// 문제 ! 
		System.out.println("MAX 값을 입력하세요.");
		final int MAX = sc.nextInt(); // 정수값을 받아줌. // MAX (상수)
		System.out.println("배수값을 입력하시오.");
		final int MULTIPLE = sc.nextInt(); // 정수값을 받아줌. // MULTIPLE (상수)
		
		int num;
		int count = 0;
		for (num =1; num <= MAX; num++) {
			// MAX 값 안에서 MULTIPLE의 배수의 개수를 출력하시오.
			if(num % MULTIPLE == 0) {
				count++;
				continue; // 조건이 참일때 무시하고 반복문 진행!
			} // end of if
		} // end of for
		System.out.println("count의 갯수는 ?" + count);
		// MAX의 값 : 100 -> MULTIPLE 값 : 3 = count의 갯수는? 33 
		// MAX의 값 : 10 -> MULTIPLE 값 : 3 = count의 갯수는? 3 
		

	} // end of main

} // end of class
