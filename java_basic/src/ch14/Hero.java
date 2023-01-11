package ch14;

public class Hero {
	
	// 상태값 3가지 설계
	// get 메서드, set 메서드
	
	private String name;
	private int level;
	
	// getter 메서드
	public String getName() {
		return this.name;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	// setter 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	

} // end of class
