package ch19;

public class MainTest1 {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("전사", 100);
		warrior1.attack(); // 출력값 : 기본 공격을 합니다.
		warrior1.comboAttack(); // 출력값 : 2단 공격을 합니다.

	}

}
