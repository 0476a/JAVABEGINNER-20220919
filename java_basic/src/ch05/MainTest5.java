package ch05;

public class MainTest5 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int number = 65;
		int number2 = 66;
		System.out.println(number); // 출력값 : 65
		System.out.println(number2); // 출력값 : 66
		System.out.println((char) number); // 출력값 : A
		System.out.println((char) number2); // 출력값 : B
		
		System.out.println("---------------");
		//인코딩이란 : 문자를 숫자로 변환하는 것
		char str1= 'A';
		// str1 을 인코딩해주세요 (문자 ------> 숫자로 변환)
		System.out.println((int) str1); // 출력값 : 65
		char str2 = 'H';
		//인코딩해주세요
		System.out.println((int) str2); // 출력값 : 72
		System.out.println("---------------");
		
		int str3 = 65;
		// str3 을 디코딩 해주세요 (숫자 -----> 문자로 변환)
		System.out.println((char) str3); // 출력값 : A
		int str4 = 72;
		// 디코딩해주세요.
		System.out.println((char) str4); // 출력값 : H
		System.out.println("---------------");
		
		
		// 문제
		// 화면에 HELLO 인코딩해주세요.
		// 한줄씩 화면에 출력
		System.out.println((int) 'H'); // 출력값 : 72
		System.out.println((int) 'E'); // 출력값 : 69
		System.out.println((int) 'L'); // 출력값 : 76
		System.out.println((int) 'L'); // 출력값 : 76
		System.out.println((int) 'O'); // 출력값 : 79
		System.out.println("------------------");
		
		//반대로 디코딩
		// 디코딩 : 숫자를 문자로 변환하는 것
		// H - 72
		// E - 69
		// L - 76
		// L - 76
		// O - 79
		// 디코딩 ~~~~~~~~~~~
		System.out.println((char) 72); // 출력값 : H
		System.out.println((char) 69); // 출력값 : E
		System.out.println((char) 76); // 출력값 : L
		System.out.println((char) 76); // 출력값 : L
		System.out.println((char) 79); // 출력값 : O
		
		

	}

}
