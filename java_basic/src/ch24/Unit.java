package ch24;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	// 다형성 사용
	public void attack(Unit unit) {
		System.out.println(this.name + "이 "+unit.name+"을 공격합니다.");
		unit.beAttacked(this.power);
	}
	
	// 공격을 받습니다.
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "은 이미 사망!!");
		} else {
			this.hp -= power;
		}
	}
	
	// 상태창 보기
	public void showInfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("유닛 이름 : " + name);
		System.out.println("유닛 공격력 : " + power);
		System.out.println("유닛 hp : " + hp);
		System.out.println("=================");
	}

} // end of Unit
