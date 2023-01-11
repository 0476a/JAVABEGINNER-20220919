package ch02;

public class TypeConversion {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 상수에 이름지을때 대문자 단어와 단어에 연결 사이는 '_' 사용한다.
		
		// 변수에 이름을 만들때 규칙
		
		int age;
		// 1. 대소문자가 엄격하게 구분되며 길이에 제한이 없다.
		int name = 100; 
		int nAme = 100;    // name과 nAme은 다름
//		int name = 1000;  // 이미 name 변수는 선언되어있음.
		name = 1; // 변수이기 때문에 값이 변한다.
		// 2. 자바에서 사용하는 예약어는 사용할 수 없다.
		// int, final, for, if, while
		// 3. 변수는 숫자로 시작할 수 없다.
//		int 7name;
//		char 55name;
		
		// 4. 특수 문자는 ' _ '  , ' $ ' 만 사용 가능하다.
		int _age; // 처음도 가능
		int $name; 
//		int *name; <-- 오류
		int a_age; // 중간도 가능
		int age_$; // 두개 다 사용 가능
		
		//  5. 권장사항 ex) ('isOk' 처럼 변수는 처음은 소문자로 시작하고
									// 단어가 바뀌는 부분은 첫 문자는 대문자로 한다. 
		

	} // end of main

} // end of class
