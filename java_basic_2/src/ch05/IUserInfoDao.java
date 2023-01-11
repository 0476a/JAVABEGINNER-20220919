package ch05;
// I 는 인터페이스를 뜻함!
public interface IUserInfoDao {
	
	// 클라이언트 쪽 개발자는 인터페이스만 보고 기능을 구현 할 수 있습니다.
	// DB쪽 연결 기능을 구현하는(백엔드) 개발자도 인터페이스만 보고 기능을 구현할 수 있습니다.
	// 어떤 기능을 만들지 먼저 정의해 보자!!!
	// public abstract 생략
	
	// C R U D
	// C - Create
	// R - Read
	// U - Update
	// D - Delete
	// void insertUserIfo(String userId, String userPw, String userName);
	void insertUserInfo(UserInfoDto userInfoDto); // 클래스를 만들어 줄여서 사용가능!
	void updateUserInfo(UserInfoDto userInfoDto);
	void deleteUserInfo(String userId);
	// SQL -- DB --> DELETE FORM  tableName WHERE userId = '값';
	void selectUserInfo();

}
