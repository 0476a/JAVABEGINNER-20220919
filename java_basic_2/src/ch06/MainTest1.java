package ch06;

public class MainTest1 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러티UI실전", "김근호");
		Book book3 = new Book(3, "사피엔스", "유발하라리");
		Book book4 = new Book(4, "리딩으로리드하", "이지성");
		
		System.out.println(book1.toString()); // <--- toString 재정의
		// 출력값 : [흐르는 강물처럼]
		
		System.out.println(book1); // 출력값 : [흐르는 강물처럼]
		System.out.println(book2); // 출력값 : [플러티UI실전]
		System.out.println(book3); // 출력값 : [사피엔스]
		System.out.println(book4); // 출력값 : [리딩으로리드하]
		// to String 재정의 하는 방법
		
		// equals
		System.out.println(1 == 2); // 출력값 : false
		System.out.println(book1 == book2); // 출력값 : false
		// 1. 문자열 비교 할때는 equals 를 무조건 사용하자.
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		String name3 = "홍길동"; // 먼저 생성되어 있느면 새로 생성하지 않고 가져와서 사용한다.
		// String은 재정의 되어 있다!!!
		System.out.println(name1); // 출력값 : 홍길동
		System.out.println(name2); // 출력값 : 홍길동
		System.out.println(name1 == name2); // 출력값 : false // 서로의 집이 다르기 때문
		System.out.println("-------------");
		System.out.println(name1 == name3); // 출력값 : true
		// 문자열 비교할 때는 보통 값을 기준으로 한다.
		if(name1.equals(name2)) {
			System.out.println("같은 값 입니다."); // true가 나옴!
		} else {
			System.out.println("다른 값 입니다.");
		}
		// 출력값 : 같은 값 입니다. (true임)
		// 문자열 equals 는 주소값을 비교하는 것이 아니라 문자열 값을 비교 한다.
		Object object;
		
		
	} // end of main

} // end of class
