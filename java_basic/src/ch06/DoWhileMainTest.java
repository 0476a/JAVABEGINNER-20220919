package ch06;

import java.util.Scanner;

public class DoWhileMainTest {

	// 코드의 시작점
	public static void main(String[] args) {

//		do {
//			수행문 (여기는 무조건 한번은 실행됨!)
//		} while(조건문)
//			수행문2

//		int num = 0;
//		do {
//			System.out.println("여기는 무조건 한번은 실행됩니다." + num);
//			num++;
//		} while (num < 10);
		
		Scanner sc = new Scanner(System.in);
		int menuNumber;
		Object menu;
		do {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("커피, 빵, 치즈, 종료");
			menu = sc.nextLine(); // 문자열을 받는 녀석
			System.out.println("당신이 선택한 메뉴는 " + menu);
		} while (!menu.equals("종료"));
		// while (조건식) 안에 false 값이 들어와야 종료됨. ---> false
		// 따라서 do 안에 있는 "메뉴를 선택해주세요"
		// "커피, 빵, 치즈, 종료" 한번은 출력!
		// 선택 1 . 종료를 입력 시 조건식이 false 임으로 종료됨.
		// 선택 2. 커피, 빵, 치즈 입력시 값이 반복되어 나옴.
		
		//  문제1. 0 번을 누르면 종료 시키는 코드를 완성해주세요.
//		do {
//			System.out.println("메뉴를 선택해주세요"); // 한번은 출력
//			System.out.println("1.커피, 2.빵, 3.치즈, 0.종료"); // 한번은 출력
//			menuNumber = sc.nextInt(); // 문자열을 받는 녀석
//			// 1 != 0 ---> true 반복 실행!
//			// 0 != 0 ---> false 반복문 종료
//		} while ( menuNumber != 0);
//		// () 조건식 안에 false 라는 값이 들어와야 종료가 된다. --> false

	} // end of main

} // end of class
