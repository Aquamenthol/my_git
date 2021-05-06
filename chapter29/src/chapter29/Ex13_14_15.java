package chapter29;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_14_15 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�޴������");
			this.setLayout(new FlowLayout());
			
			JLabel lbl = new JLabel("�� ���ڰ� �ٲ�ϴ�.");
			this.add(lbl);
			
			JMenuBar menuBar = new JMenuBar();
			JMenu fileMenu = new JMenu("����");
			JMenu editMenu = new JMenu("����");
			
			JMenuItem newItem = new JMenuItem("�� ����");
			JMenuItem openItem = new JMenuItem("����");
			JMenuItem closeItem = new JMenuItem("�ݱ�");
			
			setJMenuBar(menuBar);
			
			menuBar.add(fileMenu);
			menuBar.add(editMenu);
			
			fileMenu.add(newItem);
			fileMenu.add(openItem);
			fileMenu.addSeparator();
			fileMenu.add(closeItem);
			
			newItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("[������]�� �����߽��ϴ�.");	
					
				}
			});
			
			openItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("[����]�� �����߽��ϴ�.");
					
				}
			});
			
			closeItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.exit(0);
					
				}
			});

			// ��������
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			
			JToolBar toolBar = new JToolBar();
			
			JButton newItem2 = new JButton("�� ����");
			JButton openItem2 = new JButton("����");
			JButton closeItem2 = new JButton(new ImageIcon("./image/e_exit.png"));
			
			add(toolBar, BorderLayout.NORTH);
			toolBar.add(newItem2);
			toolBar.add(openItem2);
			toolBar.addSeparator(new Dimension(20, 10));
			toolBar.add(closeItem2);
			
			//JLabel lbl = new JLabel("\n�� ���ڰ� �ٲ�ϴ�.\n");
			this.add(lbl);
			
			newItem2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("[������]��  �����ϼ̽��ϴ�");
				}
			});
			
			openItem2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("[����]��  �����ϼ̽��ϴ�");
				}
			});
			
			closeItem2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
			});
			
			setSize(1024, 200);
			setVisible(true);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
		
	}

}