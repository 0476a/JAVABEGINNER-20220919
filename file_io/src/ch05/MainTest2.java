package ch05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// ip 주소 + 포트 번호로 통신 한다.
// socket 기반으로 확장 된 개념!! http 통신
// socket 통신
// socket 통신이란 각각에 컴퓨터 마다 인터넷이 연결 되어 있다면 ip 주소
public class MainTest2 {

	public static void main(String[] args) {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("myFile2.txt"));
			bw.write("File Writer Test" + "\n"); // \n을 왠만하면 추가해주는 것이 좋다.
			// 주의!!! BufferedWriter 사용시 문자에 마지막을 \n 추가를 권장한다.
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
