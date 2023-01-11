package swing.s_03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{

	JLabel idImport;
	JLabel pwImport;
	JButton login;
	JTextField id;
	JPasswordField pw;
	
	public Login() {
		initData();
		setInitLayout();
	}
	public void initData() {
		setTitle("로그인 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		idImport = new JLabel("아이디 : ");
		pwImport = new JLabel("비밀번호 : ");
		login = new JButton("로그인");
		id = new JTextField("아이디를 입려하세요.", 20);
		pw = new JPasswordField(20);
	}
	public void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 400));
		add(idImport);
		add(id);
		add(pwImport);
		add(pw);
		add(login);
		setVisible(true);
	}
} // end of class
