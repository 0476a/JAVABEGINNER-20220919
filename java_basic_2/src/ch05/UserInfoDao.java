package ch05;

// IUserInfoDao 추상메서드가 존재 하기 때문에
// 강제성 class UserInfoDao는 IUserInfoDao 있는 추상 메서드를 반드시 오버라이드 해야한다.
public class UserInfoDao implements IUserInfoDao{

	@Override
	public void insertUserInfo(UserInfoDto userInfoDto) {
		System.out.println("SQL 문 작성 --> insertUserIfo() 메서드 호출");
		System.out.println(userInfoDto.userId);
		System.out.println(userInfoDto.userName);
		System.out.println(userInfoDto.userPw);
	}

	@Override
	public void updateUserInfo(UserInfoDto userInfoDto) {
		System.out.println("SQL 문 작성 --> updateUserInfo() 메서드 호출");
		System.out.println("SQL 쿼리문을 배워서 작성해서 사용하면 된다.");
	}

	@Override
	public void deleteUserInfo(String userId) {
		System.out.println("SQL 문 작성 --> deleteUserInfo() 메서드 호출");
		
	}

	@Override
	public void selectUserInfo() {
		System.out.println("SQL 문 작성 --> selectUserInfo() 메서드 호출");
		
	}

}
