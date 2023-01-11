package ch06;

public class BreakMainTest {

	// 코드의 시작점
	public static void main(String[] args) {

		// break --> 예약어
		// 중간에 멈추는 break

		// 10번
		// 1 ~ 10 --> true
		// 11 ----> false
		// 1~10까지 반복할때 7까지 화면에 출력해주세요.
//		for (int i = 1; i < 11; i++) {
//			System.out.println(" i : " + i); // 출력값 : i : 1~7
//			if (i % 7 == 0) {
//				break; // true 일때 반복문을 나감!
//				// 자신에 가장 가까운 반복문 (for)을 하나 멈춘다. 중요!
//			} // end of if
//		} // end of for
		
		// 1~10까지 반복할때 3에 배수만 화면에 출력해주세요
//		for (int i = 1; i < 11; i++) {
//			
//			if (i % 3 == 0) {
//				System.out.println(" i : " + i); // 출력값 : i : 3,6,9
//				// break; // 여기서 break 를 만나 i : 3 만 출력됨. (삭제)
//			} // end of if
//		} // end of for
		
		// 문제
		// 만약 i 값이 8이면 반복문을 멈추세요!
		
		for (int i = 1; i < 11; i++) {
			System.out.println(" i : " + i); //출력값 : i : 1~8 
			if (i % 8 ==0) {
				break; // break로 8이 되면 반복문을 나감.
			} // end of if
		} // end of for

	} // end of main

} // end of class
