package ch08;

// 다른 동기가 여러분이 만든 클래스를 사용하는 쪽 코딩
public class MainTest1 {

	public static void main(String[] args) {
		
		int age;
		Warrior warrior1; // 변수에 선언, 데이터 타입 Warrior
		// 클래스에서 ----> 객체로 만들어 주었다.
		warrior1 = new Warrior();
		
		warrior1.height = 200;
		warrior1.power = 100;
		warrior1.color = "초록색";
		warrior1.name = "흑우전사";
		
		System.out.println(warrior1.height); // 출력값 : 200
		System.out.println(warrior1.power); // 출력값 : 100
		System.out.println(warrior1.color); // 출력값 : 초록색
		System.out.println(warrior1.name); // 출력값 : 흑우전사
		
		Warrior warrior2 = new Warrior(); // 변수에 선언과 동시에 초기화
		warrior2.height = 100;
		warrior2.power = 50;
		warrior2.color = "빨간색";
		warrior2.name = "오크";
		System.out.println("------------------------");
		System.out.println(warrior2.height); // 출력값 : 100
		System.out.println(warrior2.power); // 출력값 : 50
		System.out.println(warrior2.color); // 출력값 : 빨간색
		System.out.println(warrior2.name); // 출력값 : 오크

	}

}
