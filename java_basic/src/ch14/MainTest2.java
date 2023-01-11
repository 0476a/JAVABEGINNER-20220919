package ch14;

public class MainTest2 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.deposit(100_000);
		// getter 메서드는 read only 성질을 가진다. (읽기만 가능)
		System.out.println("bank 접근해서 현재 잔액 : " + bank.getBalance());
		// 출력값 : bank 접근해서 현재 잔액 : 100000
		
		bank.setBalance(-500_000);
		bank.showInfo(); // 출력값 : 잘못된 입력 값입니다.
											    // 현재 잔액은 -500000입니다.
		
		
	} // end of main

} // end of class
