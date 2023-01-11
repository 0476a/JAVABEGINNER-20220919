package ch22;

public class MainTest2 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		
		// 배열에 사용방법
		int[] numbers = new int[3]; // 정수값 3개를 담을 수 있는 상자
		// 값을 초기화 하는 방법
		numbers[0] = 100; // 인덱스 연산
		numbers[1] = 200;
		numbers[2] = 300;
		// numbers[3] = 400; X
		
		System.out.println(numbers[0]); // 출력값 : 100
		System.out.println(numbers[1]); // 출력값 : 200
		System.out.println(numbers[2]); // 출력값 : 300
		
		int result1 = numbers[0];
		System.out.println(result1); // 출력값 : 100
		
		// 1. 배열 선언과 동시에 초기화하는 방법
		// 배열은 반드시 크기를 정해 주어야 한다.
		int[] numbers2 = new int[] { 10 , 20 , 30 }; // 배열 선언과 동시에 초기화
		int[] numbers3 = {20,30,40}; // 위 코드와 같다 - 간소화
		// int[] numbers4 = {1, "abc" , 2}; // 설정한 자료형이랑 다르면 초기화 X
		
		// 배열은 보통 반복문과 함께 많이 사용된다.
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			// i -- 0
			// i -- 1... 10번
			nums[i] = i;
		}
		System.out.println("--------------");
		System.out.println(nums[0]); // 출력값 : 0
		System.out.println(nums[1]); // 출력값 : 1
		// nums.length 현재 배열에 길이 값을 반환 한다. (실수 줄이기 위해 권장)
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]); // 출력값 ; 0~9
		}
		
		System.out.println("--------------");
		// double 배열 공간
		double[] dArr = new double[5]; // 0, 1, 2, 3, 4
		dArr[3] = 10.0;
		dArr[1] = 2.0;
		dArr[3] = 0.5;
		System.out.println(dArr[3]); // 출력값 : 0.5
		
		System.out.println("--------------");
		String[] strArr = new String[3];
		strArr[0] = "안녕하세요";
		strArr[1] = "자바";
		strArr[2] = "저녁강의";
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		} // 출력값 : 안녕하세요
		   //             자바
		   //             저녁강의
		
	
		
		

	} // end of main

} // end of class
