package ch14;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		// 멤버 변수는 초기 값을 넣지 않으면 기본 값으로 셋팅 된다. (컴파일러가)
		// int --> 0;
		// double ---> 0;
		// boolean --> false;
		// String ---> null;
		// System.out.println(bank.balance); // 출력값 : 0
                                                      // private가 있기 때문에 balance 사용 X
		
		// 입금하기
		bank.deposit(10_000);
		bank.showInfo(); // 출력값 : 현재 잔액은 10000입니다.
		
		// 출금하기
		bank.withdraw(5_000);
		bank.showInfo(); // 출력값 : 현재 잔액은 5000입니다.
		
		// 신입이 실수로 멤버 변수에 접근해서 잔액을 수정함!!
		// 사용에 실수를 줄일 수 있다. - 접근 제어 지시자를 활용하면!!!
		// bank.balance = 100_000; // 신입의 실수
		bank.showInfo(); // 출력값 : 현재 잔액은 100000입니다. 
		// 원래 값에 플러스가 되는게 아니라 그 위에 값을 덮어쓰기 때문에 문제가 발생
		
		// 접근 제어 지시자!!!
		// 접근 제어 지시자는 4가지가 존재한다.
		
		// public - 누구나 접근을 허용한다.
		// default - 같은 패키지(폴더) 내에서 접근을 허용한다.
		                   // 아무것도 없을 때 default 이다.
		// protected - 상속관계에서만 접근을 허용한다.
		// private - 내 클래스 내부에서만 접근을 허용한다.
		
		
	} // end of main

} // end of class
