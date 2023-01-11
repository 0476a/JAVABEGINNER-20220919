package ch09;

public class FunctionMainTest1 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		
		//함수 사용해보기 (모양 맞추기)
		int myResult = add(10, 20);
		System.out.println(myResult); // 출력값 : 30
		

	} // end of main
	
	// 함수 만들어보기 -- 함수 설계
	public static int add(int num1, int num2) {
		//                  10    +    20
		int result = num1 + num2;
		return result; // 리턴 키워드를 만났을때 실행에 제어가 반납
	} // end of add
	

} // end of class
