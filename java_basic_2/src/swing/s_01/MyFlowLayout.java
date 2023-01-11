package swing.s_01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayout extends JFrame{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	// 문제
	// 버튼 3개 생성해서 화면에 올려보세요~~~
	
	private FlowLayout flowLayout;
	
	public MyFlowLayout() {
		initData();
		setInitLayout();
		
		// 순서도 중요하다. (순서를 바꾸면 NullPointerException 발생)
	}
	
	// 데이터에 초기화(값을 넣는 기능으로 만들 꺼임)
	private void initData() {
		setTitle("배치관리자 - FlowLayout");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		flowLayout = new FlowLayout();
		// hgap 수평으로 띄운다. vgap은 수직으로 띄운다.
		flowLayout = new FlowLayout(flowLayout.CENTER, 50, 300);
		
		button1 = new JButton("버튼 1");
		button2 = new JButton("버튼 2");
		button3 = new JButton("버튼 3");
		button4 = new JButton("버튼 4");
		button5 = new JButton("버튼 5");
		button6 = new JButton("버튼 6");
	}
	
	// 화면에 컴포넌트를 추가한다거나 사리지게 하는 기능을 담당
	private void setInitLayout() {
		setVisible(true);
		// 배치관리자를 등록해보자.
		setLayout(flowLayout);
		// 기본적으로 덮어쓰기됨.
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
	}

}
