package ch18;

class Cal {
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	// 자바 개발자들이 메서드 오버로딩 기술을 만들어 줬다.
//	public int sumThree(int n1, int n2, int n3) {   // 불편함. 메서드 이름을 계속 지어줘야함.
//		return n1 + n2 + n3;                                    // sumThree, Forth, Five, .....
//	} 
	// 메서드 오버로딩 (매계변수가 달라서 오류 X)
	public int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	// 다른 데이터 타입도 가능
	public int sum(double n1, double n2) {
		return (int) (n1 * n2); // 1.0 + 1.0 = 2.0 --> 2 (int로 변환)
	}
	public int multiply(int n1, int n2) {
		// 1000줄 ~
		return n1 * n2;
	}

	// 결론
	// 메서드 오버로딩이란 System.out.println() 이다.
	// 메서드에 매개변수 갯수, 데이터 타입을 다르게 선언하여 같은 이름으로
	// 사용할 수 있게 하는 기법이다.

	// 메서드 오버라이드란?
	// 상속관계에 있어서 자식 클래스가 필요하다면 부모에 메서드를 재정의해서
	// 새롭게 기능을 정의하는 것

} // end of Cal

class Cal2 extends Cal {
	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	// 상속관계에 있을 때 부모 메서드를 재정의 할 수 있다. -- 오버라이드
	@Override // 어노테이션 - 주석 + 힌트 (컴파일러한테 힌트를 주는 것)
	// 메서드 오버로딩 != 메서드 오버라이드
	public int multiply(int n1, int n2) {
		// true ---> false
		if (n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하지 마세요!!!");
			return 0; // if 에도 return 값을 넣어 줘야함.
		} else {
			// return n1 * n2;
			return super.multiply(n1, n2); // super의 사용
		}

		// return super.multiply(n1, n2);
		// super - 부모 클래스를 가리키는 키워드

	} // end of multiply

} // end of Cal2

public class MainTest2 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3)); // 출력값 : 8
		System.out.println(cal2.minus(10, 7)); // 출력값 : 3
		System.out.println(cal2.multiply(10, 3)); // 출력값 : 30
		
		System.out.println(cal2.multiply(10, 0)); // 출력값 : 0을 입력하지 마세요!!!
																		  //             0
		System.out.println("==============");
		cal2.sum(1, 1);
		cal2.sum(1, 1, 1);
		cal2.sum(2.0, 1.0);
		System.out.println("==============");
		// 메서드 오버로딩이란 System.out.println() 이다.
		System.out.println(true); // 출력값 : true
		System.out.println(10); // 출력값 : 10
		System.out.println(0.5); // 출력값 : 0.5
		System.out.println("A"); // 출력값 : A
		System.out.println("반가워"); // 출력값 : 반가워

	} // end of main

} // end of class
