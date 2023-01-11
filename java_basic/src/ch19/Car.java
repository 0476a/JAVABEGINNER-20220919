package ch19;

public class Car {
	
	String name;
	int price;
	// 포함관계 !!!
	Engine engine; // 주소값 담김.
	
	// 의존 주입한다.
	public Car(String name, int price, Engine engine) {
		this.name = name;
		this.price = price;
//		this(name, price); // 생성자에서 다른 생성자를 호출
		this.engine = engine;
	}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		// Car 인스턴스화 할 때 Engine 객체를 초기화
		this.engine = new Engine("GDI", 500);
	}
	
	public void showInfo() {
		System.out.println("car name : " + name);
		System.out.println("car price : " + price);
	}

} // end of Car
