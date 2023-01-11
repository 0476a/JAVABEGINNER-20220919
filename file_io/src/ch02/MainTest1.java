package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 입력 스트림
// 파일에서 한 바이트씩 자료 읽기 - 1

// 입출력을 사용하기 위해서 파일을 사용 했다.
// 파일에 데이터를 읽기 위해서 FileInputStream 클래스를 사용
// FileInputStream --> 한 바이트씩 데이터를 읽는 기능을 가지고 있다.
// 스트림을 사용하면 닫아 주는게 정석이다. 메모리가 계쏙 발생 된다.

public class MainTest1 {

	public static void main(String[] args) {
		
		// 파일에 있는 글자를 우리 프로그램으로 가져오기 !!
		FileInputStream fis = null;
		
		try {
			// 글자가 깨져서 나온다...
			// 기반 스트림 -> 한 바이트 데이터를 읽는다.
			// 영어권 --> 1 바이트 안에 모든 문자 표현 됩니다. 256
			// 한글은 --> 1 바이트 안에 표현이 불가능 --> 2 바이트 이상 필요
			fis = new FileInputStream("a.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 예외 발생 가능
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
