package ch02;

public class TypeConversion2 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 형 변환 -> (데이터 타입을 변경하기)
		// int 자료형 double 로 변경하거나
		// double 자료형을 int 로 변경하는 것을 말한다.
		
		// 형 변환에는 자료형변환과 강제형변환 두가지가 있다.
		
		int iName = 100;
		System.out.println(iName); // 출력값 : 100
		
		// 자동형변환
		double dNum1 = iName;
		System.out.println(dNum1); // 출력값 : 100.0
		
		// 강제형변환
		double dNum2 = 1.123456; 
		
		// 컴파일러가 작은 상자에 큰 상자를 넣으려면 오류를 일으킨다.
//		int iNum2 =  dNum2;
		
		// 개발자가 컴파일러야 괜찮으니깐 그냥 강제로 넣어
		int iNum2 = (int)dNum2;
		System.out.println(iNum2); // 출력값 : 1
		// 소수점을 그냥 버리고 값을 저장
		System.out.println("=================");
		
		
		double dValue;
		int iValue;
		
		dValue = 0.5;
		iValue = (int)dValue;
		
		int iValue2 = (int)10.1;
		System.out.println(iValue2); // 출력값 : 10
		// 소수점 버리고 값을 저장하고 출력함 !!!!
		
		float a = 10.1F;
		int b = (int)a; // 바이트 크기는 같지만 자료형이 다른 경우에도 강제형 변화에 해당
		System.out.println(b); // 출력값 : 10
		// 소수점 버리고 값을 저장하고 출력함 !!
		
		
		

	} // end of main

} // end of class
