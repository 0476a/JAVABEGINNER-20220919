package ch05;

import java.util.Scanner;

public class UserInfoClient2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("기능을 선태해주세요.");

		UserInfoDao userInfoDao = new UserInfoDao();

		System.out.println("1.회원가입 2.회원정보수정 3.회원조회 4.회원정보삭제 0.종료"); // 과제! while 문 사용
		// 과제2 오류 없애기
		int userInput = scanner.nextInt();
		if (userInput == 1) {
			System.out.println("1111");
			//
			UserInfoDto dto = new UserInfoDto();
			dto.userId = "abc";
			dto.userName = "이순신";
			dto.userPw = "1234";
			userInfoDao.insertUserInfo(dto);
			// 1입력시 출력 : 1111
			// SQL 문 작성 --> insertUserIfo() 메서드 호출
			// abc
			// 이순신
			// 1234
		} else if (userInput == 2) {
			System.out.println("2222");
			userInfoDao.updateUserInfo(null);
			// 2입력시 출력 : 2222
//			                        SQL 문 작성 --> updateUserInfo() 메서드 호출
//			                        SQL 쿼리문을 배워서 작성해서 사용하면 된다.
		} else if (userInput == 3) {
			System.out.println("3333");
			userInfoDao.selectUserInfo();
			// 3입력시 출력 : 3333
//			                         SQL 문 작성 --> selectUserInfo() 메서드 호출
		} else if (userInput == 4) {
			System.out.println("4444");
			userInfoDao.deleteUserInfo("temp");
			// 4입력시 출력 : 4444
//			                         SQL 문 작성 --> deleteUserInfo() 메서드 호출
		} else {
			System.out.println("잘못된 값을 입력 하였습니다.");
			// 그 외에 입력시 출력 : 잘못된 값을 입력 하였습니다.
		}

	} // end of main

} // end of class
