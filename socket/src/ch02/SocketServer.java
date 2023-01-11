package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DomainCombiner;

// 준비물
// ServerSocket
// Socket
public class SocketServer {

	// 클라이언트에 연결을 받는 소켓
	ServerSocket serverSocket;
	// 실제로 스트림을 달아서 데이터를 주고 받고 하는 통신을 담당
	Socket socket;
	// 스트림 달기
	BufferedReader bufferedReader;
	
	 public SocketServer() {
		 System.out.println("1.>>> 서버 소켓 시작 <<<");
		  try {
			  // 192.168.3.10 : 11000
			  // 192.168.3.10 --> localhost
			serverSocket = new ServerSocket(11000);
			// 동작 --> 클라이언트 연결을 기다려 !!!
			socket = serverSocket.accept(); // 프로그램은 여기서 멈추고 있다.
//			System.out.println("여기 코드 내려 오나요??");
			System.out.println("클라이언트 연결 완료 -> 서버측 소캣 생성 완료");
			
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String msg = bufferedReader.readLine();
				System.out.println("클라이언트로 부터 받은 메시지 : " + msg);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
	}
	 
	public static void main(String[] args) {
		new SocketServer();
		
	} 
	 
}
