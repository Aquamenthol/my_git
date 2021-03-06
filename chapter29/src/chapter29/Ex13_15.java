package chapter29;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_15 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("툴바 만들기");
			this.setLayout(new FlowLayout());
			
			JToolBar toolBar = new JToolBar();
			
			JButton newItem = new JButton("새 문서");
			JButton openItem = new JButton("열기");
			JButton closeItem = new JButton(new ImageIcon("./image/e_exit.png"));
			
			add(toolBar, BorderLayout.NORTH);
			toolBar.add(newItem);
			toolBar.add(openItem);
			toolBar.addSeparator(new Dimension(20, 10));
			toolBar.add(closeItem);
			
			JLabel lbl = new JLabel("\n이 글자가 바뀝니다.\n");
			this.add(lbl);
			
			newItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("[새문서]를  선택하셨습니다");
				}
			});
			
			openItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("[열기]를  선택하셨습니다");
				}
			});
			
			closeItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
			});
			
			
			
			
			// 세 버튼의 리스너 코딩 실습
			
			setSize(1024, 500);
			setVisible(true);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
