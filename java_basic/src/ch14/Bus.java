package ch14;

public class Bus {
	
	int busNumber;
	int personCount;
	int money;
	
	// this 키워드 : 자기 자신
	// 가독성을 높일 수 있고 단, 멤버 변수인지 매계변수인지 구분을 짓기 위해서 this. 키워드를 사용해야 한다.
	public Bus(int busNumber, int personCount, int money) {
		this.busNumber = busNumber;
		this.personCount = personCount;
		this.money = money;
	}

}
