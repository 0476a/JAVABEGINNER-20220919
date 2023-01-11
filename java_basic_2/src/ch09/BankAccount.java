package ch09;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력 값 입니다.");
		} else {
			this.money = money;
		}
	}

	// 입금
	// 동기화 처리 완료
	public synchronized void saveMoney(int money) {
		// 초기 금액 10만원

		// 1. 10만원
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금 // 5천원
	// 동기화 처리 완료
	public void withdarwMoney(int money) {
		// synchronized 블럭
		synchronized (this) {
			// 10만원
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 방어적 코드
			// 10 5천원
			if (currentMoney > money) {
				setMoney(currentMoney - money);
			} else {
				System.out.println("잔액부족");
			}
			// 9만 5천원 처리 끝 !!!
			System.out.println("출금후 계좌 잔액 : " + getMoney());

		}

	}

}
