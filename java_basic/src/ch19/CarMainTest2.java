package ch19;

public class CarMainTest2 {

	public static void main(String[] args) {
		
		
		
		Engine engine = new Engine("V6", 900);
		// 외부에서 주입
		Car m3 = new Car("m3", 15000, engine);
		
		System.out.println(m3.engine.name); // 출력깂 : V6
		System.out.println(m3.engine.price); // 출력값 : 900

	}

}
