package ch04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 문자 단위 입력 스트림( 기반 스트림 + 보조 스트림 (기능 확장) )
 * BufferedReader
 */
public class MainTest2 {

	public static void main(String[] args) {
		
		try {
			// 입력 스트림 (보조 스트림) : 보조 스트림은 읽는 기능은 없다. 읽는 기능 기반 스트림에 있다.
			// 문자 단위 스트림을 사용하려면 기반 스트림 + 보조 스트림 붙인다.
			// 데코레이션 패턴
			BufferedReader reader = new BufferedReader(new FileReader("reader_1.txt"));
			String line;
			while ( ( line = reader.readLine())  != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
