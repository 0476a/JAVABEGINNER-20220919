package ch18;

class A {
	// 자식 객체에서 접근 가능한 레밸링
	protected int number1;
	protected int number2;
	protected int number3;
}
class B {
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
}
// extends 상속
class C extends A {
	// number1,2,3 물려 받은 상태 (extends A 를 했기 때문)
	int number4;
	int number5;
}

public class MainTest1 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		
		// A.number1 is not visible // <- 변수에 private를 넣은 상태
		// 보여지지 않는 상태 (물려는 받았다)
		C c1 = new C();
		c1.number1 = 1;
		c1.number2 = 2;
		c1.number5 = 5;
		
		System.out.println(c1.number1); // 출력값 : 1
		System.out.println(c1.number2); // 출력값 : 2
		

	} // end of main

} // end of class

// 자바 문법 - MainTest1.java
// 하나의 자바파일안에 여러개의 클래스를 작성할 수 있다.
// 단, public 접근 제어지시자를 가진 클래스는 단 하나만 사용가능하다 !!!
// (컴파일러가 기계어로 번역하기 위해 막아 둔것.)


