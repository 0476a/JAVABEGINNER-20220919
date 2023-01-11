package ch05;

public class UserInfoClient {

	public static void main(String[] args) {
		// 기본 코드
		// Scanner 사용해서 값을 입력 받을 수 있다.
		
		UserInfoDao userInfoDao = new UserInfoDao();
		// 1. 화원가입 기능 호출
		UserInfoDto dto = new UserInfoDto();
		dto.userId = "abc";
		dto.userName = "홍길동";
		dto.userPw = "asd123";
		userInfoDao.insertUserInfo(dto); 
		// 출력값 : SQL 문 작성 --> insertUserIfo() 메서드 호출
//		               abc
//		               홍길동
//		               asd123
		
		// 2. 회원정보 수정 기능
		userInfoDao.updateUserInfo(dto); 
		// 출력값 : SQL 문 작성 --> updateUserInfo() 메서드 호출
//		SQL 쿼리문을 배워서 작성해서 사용하면 된다.

		// 3. 회원정보 삭제 기능 호출
		userInfoDao.deleteUserInfo("abc");
		// 출력값 : SQL 문 작성 --> deleteUserInfo() 메서드 호출
		
		// 4. 회원정보 조회
		userInfoDao.selectUserInfo();
		// 출력값 : SQL 문 작성 --> selectUserInfo() 메서드 호출
		

	} // end of main

} // end of class
