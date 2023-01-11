package ch14;

// 통장 계좌
public class Bank {
	
	// 정보 은닉 (private) 외부에 보이지 않게 함.
	// 아무것도 사용하지 않으면 default 이다.
	private int balance; // 같은 클래스내에서만 사용 가능
	
	// getter 메서드
	public int getBalance() {
		return this.balance;
	}
	
	// setter 메서드
	public void setBalance(int balance) {
		// 방어적 코드
		if(balance <=0) {
			System.out.println("잘못된 입력 값입니다.");
		} else {
			this.balance = balance;
		}
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int money) {
		this.balance +=money;
	}
	
	// 출금
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	// 잔액 확인
	public void showInfo() {
		System.out.println("현재 잔액은 " + this.balance + "입니다.");
	}
	
	

} // end of class
