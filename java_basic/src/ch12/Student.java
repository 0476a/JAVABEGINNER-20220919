package ch12;

public class Student {
	
	// 생성자
	// 클래스에는 반드시 적어도 하나 이상의 생성자가 존재 해야 한다.
	
	// 기본 생성자 (기본 생성자는 컴파일러가 자동으로 넣어준다)
	// 사용자 정의 생성자
	String name;
	int money;
	
	// 기본 생성자 - 모양
	public Student() {
		
	}
	
	public Student(int m) {
		money = m;
	}
	
	// 사용자 정의 생성자
	public Student(String n, int m) {
		name = n;
		money = m;
	}
	
	// 객체와 객체간에 상호 작용하게 코드를 설계 한다!!
	// 학생이 버스를 탄다
	// int n = Bus bus
	public void takeBus(Bus bus) {
		money -= 1300;
		bus.take(1300);
		
	}
	
	// 객체와 객체간에 상호 작용하게 코드를 설계 한다!!
	// 학생이 지하철을 탄다
	public void takeSubway(Subway subway) {
		money -= 1500;
		subway.take(1500);
	}
	
	// 객체와 객체간에 상호 작용하게 코드를 설계 한다!!
	// 학생이 비행기를 탄다
	public void takeAirplane(Airplane airplane) {
		money -= 50000;
		airplane.take(50000);
	}
	
	// 사용자 정의 생성자를 만들어 주게되면 컴파일러는 기본 생성자를 만들어 주지 않는다. !!!
	// 생성자를 여러개 만들게 되다면 --> 생성자 오버로딩
	
	// 메서드 (멤버함수)
	public void showInfo() {
		System.out.println("학생에 이름" + name);
		System.out.println("현재 학생에 용돈" + money);
		
	}
	
	
} // end of class
