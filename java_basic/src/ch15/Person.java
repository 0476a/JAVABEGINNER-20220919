package ch15;

public class Person {

	// this 란
	// 1, 인스턴스(객체) 자신의 메모리 주소를 가리킨다.
	// 2. 생성자에서 또 다른 생성자를 호출 할 때 사용할 수 있다.
	// 3. 자신의 주소(참조값, 주소값)를 반환시킬 수 있다.

	String name;
	int age;

	public Person() {
		// 1. this. 멤버변수에 접근하는 방법
		// 초기 값을 넣을 수 있다. --> 생성자에서 !!!
//		this.name = "이름없음"; // 단 다른 생성자를 호출 할 떄 선행코드는 지양해야 한다.
//		this.age = 1; // 단 다른 생성자를 호출 할 때 선행코드는 지양해야 한다.

		// 2.
		// 생성자에서 다른 생성자를 호출할 수 있다.
		// 단 다른 생성자를 호출할 때 선행코드는 지양해야 한다.
		this("이름없음", 1);
		System.out.println("<< 마지막 라인 실행");
	}

	// 메서드 만들기
	// 3, 자기 자신을 반환 시킬 수 있다. (빌더 패턴)
	public Person getPerson() {
		return this; // this = Person
	}

	

	// Alt + Shift + s (생성자 만드는 단축키)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	
	

} // end of class
