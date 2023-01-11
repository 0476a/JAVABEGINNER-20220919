package ch06;

import java.util.Scanner;

public class WhileMainTest3 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int userInput = 1;
		System.out.println((userInput != 0)); // 출력값 : true
		Scanner sc = new Scanner(System.in);
		int input = 1;
		// true
		// intput = 0;
		// 0을 입력 하면 연산 결과는 input != 0 ----> false
		while(input !=0) { 
			System.out.println("0. 종료 1. 진행 ");
			input = sc.nextInt(); // 0을 입력시 조건 false 종료
			                                 // 1을 입력시 조건이 ture 반복
			if(input !=0) {
				System.out.println("게임을 진행 하셨네요!"); // 1을 입력시 출력
			} else {
				System.out.println("게임을 종료 합니다."); // 0을 입력시 출력
			}
		} // end of while
		

	} // end of main

} // end of class
