package ch06;

public class Person {
	
	String name;
	int age;
	
	// Alt + Shift + s 생성자 자동 완성
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 문제 1. toString 재정의 해주세요.
	@Override
	public String toString() {
		return "["+this.name+"]";
	}
	
	// 문제 2. 이름과 나이가 같으면 true를 리턴하게 equals 메서드를 재정의 해주세요.
	@Override
	public boolean equals(Object obj) {
		// 방어적 코드 <-- 데이터 타입이 Person일때만 if 문 적용시켜준다 !!!
		if(obj instanceof Person) { 
			Person tempPerson = (Person)obj; // 다운캐스팅
			if(this.name.equals(tempPerson.name) && this.age == tempPerson.age ) { // int 값은 '==' 사용
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	
	

}
