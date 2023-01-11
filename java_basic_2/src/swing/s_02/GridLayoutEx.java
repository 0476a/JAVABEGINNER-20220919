package swing.s_02;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{

	JButton[] buttons = new JButton[9];
	String[] strArr = {"가", "나", "다", "라", "마", "바", "사", "아", "자"};
	
	public GridLayoutEx() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("그리드레이아웃연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		
		for(int i = 0; i < buttons.length; i++) { // length 는 변수 이다.
			buttons[i] = new JButton(strArr[i]); // JButton 값을 넣어 줘야함.
		}
	}
	// GridBagLayout gridBagLayout = new GridBagLayout(); // 굳이 여러번 안쓰려면 변수 선언 굳이 안해도됨.
	
	private void setInitLayout() {
		// borderlayout --> gridlayout 변경
		// rows, cols (행, 열) (가로, 세로)
		setLayout(new GridLayout(3, 3, 10, 10)); // 줄여서 사용!
		for(int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
		
		setVisible(true);
	}
} // end of class
