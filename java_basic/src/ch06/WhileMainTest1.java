package ch06;

public class WhileMainTest1 {

	// 코드의 시작점
	public static void main(String[] args) throws InterruptedException {
		                                                         // 출력 시간을 제어해 줄 때 추가 할때 생성함.
		// 반복문 while
//		while (조건식) {
//			수행코드
//		}
		// for , while
		// for -- 반복에 횟수가 정해진 코드이면 for문을 상용한다.
		// while -- 반복에 횟수가 정해지지 않았다면 사용한다.
		
		int num = 1;
		
//		while ((num < 10)) {    // 조건이 true이면 무한으로 반복함.
//			System.out.println("***"); 
//			System.out.println("num : " + num);
//			num++; // 증감식을 넣음으로써 반복 제어!
//		}
		// 출력값 : ***
		//             num : 1 ~ 9
		
		boolean flag = true;
		int count = 0;
		
		while(flag) {
			System.out.print("-"); // 조건문이 true 일때 무한 출력 (if 문 때문에 99개 까지 출력)
			count++;                          // 조건문이 true 일때 무한 증가 (if 문 때문에 100까지 증가)
			if (count == 100) { // 만약 count 증가하다가 100이 되면 
				System.out.println("count 가 100입니다."); // "count 가 100입니다" 출력 후
				flag = false;                                                  // flag값이 false로 바뀌면서 반복문 종료 
			}
			
			Thread.sleep(10); // 0.01초 // 출력 속도를 제어 해주는 명령어
		}
		
		// ※ print : 줄 바꿈 x 출력
		// ※ println : 줄 바뀜 출력

	} // end of main

} // end of class
