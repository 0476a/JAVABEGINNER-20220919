package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 
 * 
 * 바이트 단위 입력 스트림 !!!
 * 
 */
public class MainTest3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			int i;
			byte[] bs = new byte[10];
			
			while(   (i = fis.read(bs)) != -1  ) {
				for(int j = 0; j < i; j++) {
					System.out.print((char) bs[j] );
				}
				System.out.println(" i : " + i + "바이트 읽음");
//				System.out.println( (char) i);
			}
			System.out.println("\n끝");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
				

	}

}
