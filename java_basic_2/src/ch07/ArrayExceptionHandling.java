package ch07;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// 여기코드는 런타임 에러를 확인해 봄...
		// 예외처리에서 가장 중요한 본질은 프로그램의 비정상 종료를 막기 위함이다.
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			
			for(int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
			// ArrayIndexOutOfBoundsException 예외 발생!
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 무슨 예외 인지 알려준다.
			System.out.println("예외가 발생 되었습니다.");
		}
		
		// 런타임 오류가 발생 --> 프로그램이 자동 종료 된다.
		// 프로그램이 비정상 종료 되지 않았다 !!!
		System.out.println("<<<<<<<<<<<<<<여기 코드가 실행이 될까요>>>>>>>>>>");
		// but 예외처리를 하게 되면 실행 O

	} // end of main

} // end of class
