package ch06;

public class MainTest2 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러티UI실전", "김근호");
		Book book3 = new Book(3, "사피엔스", "유발하라리");
		Book book4 = new Book(4, "플러티UI실전", "김근호");
		
		// book2 와 book4는 물리적으로 다른 객체입니다.
		// 하지만 논리적으로 책 이름과 작가의 이름이 같다면 같은 객체라고 생각하고 싶다!!!

		// Book 클래스에 equals 메서드를 필요에 의해서 재정의 했다.
		boolean isSame = book2.equals(book4); // 출력값 : 여기는 Book 클래스 입니다.
		System.out.println("isSame : " + isSame); // 출력값 : isSame : true

	} // end of main

} // end of class
