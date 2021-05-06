package chapter29;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_15 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("���� �����");
			this.setLayout(new FlowLayout());
			
			JToolBar toolBar = new JToolBar();
			
			JButton newItem = new JButton("�� ����");
			JButton openItem = new JButton("����");
			JButton closeItem = new JButton(new ImageIcon("./image/e_exit.png"));
			
			add(toolBar, BorderLayout.NORTH);
			toolBar.add(newItem);
			toolBar.add(openItem);
			toolBar.addSeparator(new Dimension(20, 10));
			toolBar.add(closeItem);
			
			JLabel lbl = new JLabel("\n�� ���ڰ� �ٲ�ϴ�.\n");
			this.add(lbl);
			
			newItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("[������]��  �����ϼ̽��ϴ�");
				}
			});
			
			openItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("[����]��  �����ϼ̽��ϴ�");
				}
			});
			
			closeItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
			});
			
			
			
			
			// �� ��ư�� ������ �ڵ� �ǽ�
			
			setSize(1024, 500);
			setVisible(true);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}