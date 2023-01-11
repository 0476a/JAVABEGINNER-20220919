package ch19;

public class Warrior extends Hero {
	// 부모가 있어야 자식이 생성될 수 있다.
	public Warrior(String name, int hp) {
		// 부모 사용자 정의 생성자가 있을 경우 반드시 부모 생성자를 먼저 호출 해야 한다.
		super(name, hp); // 맨 먼저 호출 해야한다.
	}
	
	public void comboAttack() {
		System.out.println("2단 공격을 합니다.");
	}

}
