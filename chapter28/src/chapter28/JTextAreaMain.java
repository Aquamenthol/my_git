package chapter28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTextAreaTest implements ActionListener {
	private JFrame f;
	private JButton btnOk;
	private JTextArea jta;
	private JScrollPane jcp;
	JViewport vp;

	public JTextAreaTest() {
		jcp = new JScrollPane();
		vp = jcp.getViewport();
		f = new JFrame("TestArea");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());

		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		c.add(btnOk);

		jta = new JTextArea(6, 30);
		jta.setFont(new Font("궁서체", Font.BOLD, 12));
		jta.setText("JTextArea 예제입니다.");
		jta.setLineWrap(true);
		vp.add(new JScrollPane(jta));
		c.add(vp);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1024, 200);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();
		if (jb == btnOk) {
			try {
				StringBuffer s = new StringBuffer();
				s.append("1월 java 주말 수업\n");
				s.append("1월 한겨울 입니다.\n");
				s.append("1월 java 주말 수업\n");
				s.append("1월 한겨울 입니다.\n");
				s.append("1월 java 주말 수업\n");
				s.append("1월 한겨울 입니다.\n");
				s.append("1월 java 주말 수업\n");
				s.append("1월 한겨울 입니다.\n");
				s.append("1월 java 주말s 수업\n");
				s.append("1월 한겨울 입니다.\n");
				s.append("1월 java 주말 수업\n");
				s.append("1월 한겨울 입니다.\n");
				s.append("1월 java 주말 수업\n");

				jta.setText(s.toString());
				jta.append("~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				jta.append("~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println(ex.toString());
			} finally {
			}
		}
	}

}

public class JTextAreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaTest();

	}

}
