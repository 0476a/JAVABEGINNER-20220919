package ch07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainTest2 {

	public static void main(String[] args) {
		
		Worrior worrior = new Worrior();
		worrior.attack();
		
		try {
			worrior.readFile(); // 던져진 예외처리를 받아서 예외처리한다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	} // end of main

} // end of class

class Worrior {
	
	String name;
	FileInputStream inputStream;
	
	public String readFile() throws FileNotFoundException { 
		// 활요하는 사람이 알아서 예외처리 하게끔 던진다.
		inputStream = new FileInputStream("c.txt");
		return "temp";
	}
	
	public void attack() {
		System.out.println("공격합니다.");
	}
}
