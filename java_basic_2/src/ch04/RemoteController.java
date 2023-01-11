package ch04;

public interface RemoteController {
	// 1. 기능 중심 설계
	// 인터페이스 문법 --> 추상 메서드만 존재 가능하다.
	public abstract void turnOn();
	public abstract void turnOff();
	
	// 인터페이스란?
	// 구현된 것이 아무것도 없는 밑 그림만 있는 기본 설계도 이다.
	// 멤버 변수, 일반 메서드를 가질 수 없고, 오직 추상 메서드와 상수만을 가질 수 있다.
	// 중요! 표준, 약속(명세). (강제성있는)규칙 이다.
	
	// 사용방법
	// class 대신에 interface 라는 키워드를 사용한다.
	
	// 제약 사항
	// 모든 멤버 변수는 public static final 이어야한다. --> 상수 입니다.
	public static final int SERIAL_NUM = 100; // 상수
	// 모든 메서드는 추상 메서드 이어야 한다.
	// public abstract void left(); // 원형 --> 간소화 처리 하면 아래와 같다.
	// void left2(); // 추상메서드
}
