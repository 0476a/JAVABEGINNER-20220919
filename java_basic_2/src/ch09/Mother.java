package ch09;

public class Mother extends Thread {

	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 어머니가 출금 동작
		account.withdarwMoney(5_000);
	}
}
