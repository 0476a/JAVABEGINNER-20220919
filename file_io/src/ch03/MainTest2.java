package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 파일 출력 스트림 - 2
 * 
 * 배열에 A ~ Z 까지 ㄴ허고
 * 파일에다가 그 데이터를 출력하기 !!!
 *
 */
public class MainTest2 {

	public static void main(String[] args) {

		// 두개 코디 이용해서 반복문 활용해서 알파벳을 담아 보세요.
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("output_c.txt");
			byte[] bs = new byte[26];
			byte data = 65; // 256까지 처리 가능
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			// 한 바이트 씩 글자를 쓰는게 아니라 배열을 한번에 파일에다가 작성
			fos.write(bs);
			fos.flush(); // 출력 버퍼를 비울때 사용 한다.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
