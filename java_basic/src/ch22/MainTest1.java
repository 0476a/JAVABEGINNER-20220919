package ch22;

public class MainTest1 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		
		// 배열이란
		// 배열이란(array) 연관된 데이터를 통으로 모아서 관리하기 위한 데이터 타입니다.
		// 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나에 변수에
		// 저장하기 위한 것
		
		int num; // 4byte 크기에 정수값 하나를 정하는 상자 (메모리 공간) // 변수에 선언
		int num1;
		int num2;
		int num3;
		int num4;
		// ...
		int num10;
		
		int[] arr1; // 배열에 선언
		arr1 = new int[10]; // 배열에 초기화 인덱스 크기 : 9
		arr1[0] = 10;
		arr1[1] = 10;
		arr1[2] = 10;
		arr1[3] = 10;
		arr1[4] = 10;
		arr1[5] = 10;
		arr1[6] = 10;
		arr1[7] = 10;
		arr1[8] = 10;
		arr1[9] = 10;
		
		// 인덱스에 크기는 n - 1
		int[] arr2 = new int[874]; // 배열에 길이는 874 
		// 0 부터 (모든 프로그램에 인덱스에 시작은 0부터 시작한다.) 인덱스의 크기는 873
		int[] arr3 = new int [17]; // 배열에 길이는 17 (길이는 1부터 시작), 인덱스에 크기는 16 
	
	} // end of main

} // end of class
