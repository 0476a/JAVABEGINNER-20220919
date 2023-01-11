package ch06;

public class MainTest3 {

	public static void main(String[] args) {
	
		Book book1 = new Book(1, "사피엔스", "유발하라리");
		Person person1 = new Person("홍길동", 10);
		Person person2 = new Person("티모", 50);
		Person person3 = new Person("홍길동", 10);
		
		// toSring 사용해보세요.
		person1.toString(); // 생략가능 (Object 상속으로)
		person2.toString(); // 생략가능 (Object 상속으로)
		person3.toString(); // 생략가능 (Object 상속으로)
		System.out.println(person1); // 출력값 : [홍길동]
		System.out.println(person2); // 출력값 : [티모]
		System.out.println(person3); // 출력값 : [홍길동]
		
		// equals 사용해서 결과를 확인해 주세요.
		
		System.out.println(person1.equals(person3)); // 출력값 : true
		System.out.println("--------------------");
		System.out.println(person1.equals(book1)); // 출력값 : false
		// 방어적 코드를 사용한 덕분에  오류가 뜨지 않고 false 값이 출력
		// (instanceof 사용)

	} // end of main

} // end of class
