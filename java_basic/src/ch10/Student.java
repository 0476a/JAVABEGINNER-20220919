package ch10;

public class Student {
	
	// 객체의 속성은 맴버 변수로, 객체의 기능은 메서드로 구현한다.
	int studentId;
	String studentName;
	String address;
	
	// 학생에 기능을 설계해보자
	public void study() {
		System.out.println( studentName + " 학생이 공부를 합니다.");
	}
	
	public void breakTime() {
		System.out.println( studentId + " 번 학생이 휴식을 합니다.");
	}
	
	public void testTime() {
		System.out.println( studentName + " 학생이 시험을 칩니다.");
	}
	
	public void cleanTime() {
		System.out.println( studentId + " 번 학생이 청소를 합니다.");
	}
	
	// 정리
	// 메서드란?
	// 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 함수
	// 멤버 함수 (member function) 이라고 함.
	// *** 메서드를 구현함으로써 객체의 기능이 구현된다. *** 중요!!!
	
	// 1. 시험을 친다. (멤버 변수를 활용)
	// 2. 청소를 한다. (멤버 변수 활용)


} // end of class
