package ch05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 문자 단위 출력 스트림
 * Writer
 * 파일에 문자 쓰기 - 1
 *
 */

public class MainTest1 {

	public static void main(String[] args) {
		File file1 = new File("myFile.txt");
		try {
			FileWriter fw = new FileWriter(file1);
			fw.write('A'); // 문자 하나 출력  // write 오버 로딩
			char buf[] = {'B', 'C', 'D'};
			fw.write(buf);
			fw.write("안녕하세요 문자열 단위로 잘 써지네요 ~~");
			
			fw.flush(); // 출력 시에 넣어 줘라 !!
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}

}
