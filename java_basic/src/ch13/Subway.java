package ch13;

public class Subway {
	
	int lineNumber;
	int personCount;
	int money;
	
	// this. 키워드를 사용해서 사용자 정의 생성자를 만들어 주세요.
	public Subway(int lineNumber, int personCount, int money) {
		this.lineNumber = lineNumber;
		this.personCount = personCount;
		this.money = money;
	}

}
