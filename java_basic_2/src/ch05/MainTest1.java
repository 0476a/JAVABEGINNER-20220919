package ch05;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		// while 문 사용해서 기능을 만들어 보세요.
		// Scanner 사용
		// 0번 눌렀을 때 종료 아니면 계속 반복

		UserInfoDao userInfoDao = new UserInfoDao();
		// 0번 아닐때 계속 반복하게 만들어야 한다!!!
		// while() <-- 반복문 : 횟수를 알수 없을때 반복, for
		Scanner scanner = new Scanner(System.in);
		int userInput = -1;
		// 0 != 0 ---> false
		while (userInput != 0) {
			System.out.println("1. 회원가입 2. 회원정보수정 3.회원조회 4.회원정보삭제 0. 종료");
			userInput = scanner.nextInt();
			// 실행에 흐름을 만들어 주세요. ~~~
			if (userInput == 1) {
				System.out.println("1111");
				//
				UserInfoDto dto = new UserInfoDto();
				dto.userId = "abc";
				dto.userName = "이순신";
				dto.userPw = "1234";
				userInfoDao.insertUserInfo(dto);
			} else if (userInput == 2) {
				System.out.println("2222");
				userInfoDao.updateUserInfo(null);
			} else if (userInput == 3) {
				System.out.println("3333");
				userInfoDao.selectUserInfo();
			} else if (userInput == 4) {
				System.out.println("4444");
				userInfoDao.deleteUserInfo("temp");
			} else {
				System.out.println("잘못된 값을 입력 하였습니다.");
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");

	} // end of main

} // end of class
