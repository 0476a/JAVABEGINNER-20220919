package ch17;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}

	// 상태창 보기
	public void showInfo() {
		System.out.println("==== 정보창 ====");
		System.out.println("유닛이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("==== ==== ====");
	}

	// 질럿이 마린을 공격합니다.
	public void attackMarine(Marine marine) {
		System.out.println(this.name + " 이 " + marine.getName() + "을 공격합니다.");
		marine.beAttacked(this.power);
	}

	// 질럿이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + " 이 " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}

	// 공격을 받습니다.
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "은 이미 사망하였습니다.");
		} else {
			this.hp -= power;
		}
	}

	// getter

	// name
	public String getName() {
		return name;
	}

	// power
	public int getPower() {
		return power;
	}

	// hp
	public int getHp() {
		return hp;
	}

} // end of Zealot
