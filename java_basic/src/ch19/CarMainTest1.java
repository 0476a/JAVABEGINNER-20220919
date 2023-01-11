package ch19;

public class CarMainTest1 {

	public static void main(String[] args) {

		// Engine engine = new Engine("GDI2.5" , 800);
		
		Car car1 = new Car("BMW", 5700);
		car1.showInfo(); // 출력값 : car name : BMW
		                                      //  car price : 5700
		//car1.engine
		System.out.println(car1.engine.name); // 출력값 : GDI
		System.out.println(car1.engine.price); // 출력값 : 500
		// java.lang.NullPointException
		// 가리키는 객체주소가 없다.!!
		// 1. 객체를 생성했나?
		// 2. 참조변수에 주소값을 잘 담았는가??

	} // end of main

} // end of class
