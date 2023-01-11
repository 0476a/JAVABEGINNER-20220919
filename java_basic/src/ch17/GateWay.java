package ch17;

public class GateWay {
	
	public static int zealotCount = 0;
	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		this.name = "게이트웨이" + id;
	}
	
	// 질럿 생산하기
	public Zealot createZealot() {
		System.out.println("질럿을 생산합니다. ");
//		Zealot zealot = new Zealot("질럿...");
//		retrun zealot;
		zealotCount++;
		return new Zealot("질럿" + zealotCount); // 줄인거임.
	}
	
	public void showInfo() {
		System.out.println("=== 게이트웨이 정보 ===");
		System.out.println("이름 : " + this.name);
	}

} // end of GateWay
