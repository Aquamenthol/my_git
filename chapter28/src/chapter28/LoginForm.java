package chapter28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
	JPanel panel1, panel2;
	JTextField id;
	JPasswordField password;
	JButton confirm, cancel;

	public LoginForm() {
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2));
		id = new JTextField(10);
		password = new JPasswordField(10);

		panel1.add(new JLabel("아이디", JLabel.LEFT));
		panel1.add(id);
		id.setToolTipText("ID를 입력하세요");
		panel1.add(new JLabel("비밀번호", JLabel.LEFT));
		panel1.add(password);
		password.setToolTipText("비밀번호를 입력하세요");

		panel2 = new JPanel();
		confirm = new JButton("확인");
		cancel = new JButton("취소");

		confirm.addActionListener(this);
		cancel.addActionListener(this);
		panel2.add(confirm);
		panel2.add(cancel);

		getContentPane().add(panel1, "Center");
		getContentPane().add(panel2, "South");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024, 300);
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {
		Object o = ae.getSource();

		String db_id = "abc543";
		String db_pwd = "08023719569";

		if (o == confirm) {		//String.valueOf(password.getPassword()); 비밀번호 String로 받아오기
			if (db_id.equals(id.getText().trim()) && db_pwd.equals(String.valueOf(password.getPassword()))) {
				id.setText("Success");
				password.setText("Success");
			} else {
				id.setText("Fail");
				password.setText("Fail");
				id.requestFocus();
			}
		} else if (o == cancel) {
			id.setText("");
			password.setText("");
			id.requestFocus();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginForm();

	}

}
