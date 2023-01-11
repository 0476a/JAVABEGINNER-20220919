package ch04;

public class Tellevsion extends HomeAppliances implements RemoteController, SoundEffect{

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");
	}

	@Override
	public void notification() {
		System.out.println("텔레~~~비~~~♬");
	}

}
