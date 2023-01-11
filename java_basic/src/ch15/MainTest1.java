package ch15;

public class MainTest1 {
	// 코드의 시작점
	public static void main(String[] args) {
		
		Person person1 = new Person(); // 출력값 : << 마지막 라인 실행
		Person person2 = new Person(); // 출력값 : << 마지막 라인 실행
		System.out.println(person1.age); // 출력값 : 1
		System.out.println(person1.name); // 출력값 : 이름없음
		System.out.println(person1); // 출력값 : ch15.Person@587d1d39
		
		Person copyPerson = person1; 
		System.out.println(copyPerson); // 출력값 : ch15.Person@587d1d39
 		System.out.println(person2); // 출력값 : ch15.Person@58c1670b
 
	} // end of main

} // end of class
