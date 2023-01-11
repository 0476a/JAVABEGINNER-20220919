package ch09;

import java.util.Random;

public class FunctionMainTest3 {

	// main 함수
	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			System.out.print(randomNumber() + "\t");
		}

	} // end of main

	public static int randomNumber() {
		// 난수 발생.. 클래스 (자바)
		Random random = new Random();
		// random. nextInt(); : 랜덤적인 정수값 하나를 반환한다.
		// 이녀석은 숫자 0 ~~ 정수 약 21억 까지
		int lottoNumber = random.nextInt(45) + 1; // 1부터 45까지 숫자 중에 한가지 숫자를 반환
		return lottoNumber;
	}

} // end of class
