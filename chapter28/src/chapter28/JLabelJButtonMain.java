package chapter28;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JLabelJButton implements ActionListener {
	private JFrame f;
	private JLabel msn;
	private JButton imageb, textb, btnMemo;
	private ImageIcon image, smile;
	
	public JLabelJButton() {
		f = new JFrame("이미지가 추가된 레이블, 버튼");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		
		image = new ImageIcon("./image/s_msn.png");
		smile = new ImageIcon("./image/s_smile.png");
		
		msn = new JLabel("MSN", image, JLabel.CENTER);
		imageb = new JButton(smile);
		imageb.setToolTipText("클릭해주세요");
		
		
		textb = new JButton("기상청접속");
		textb.addActionListener(this);
		textb.setToolTipText("클릭해주세요");
		
		btnMemo = new JButton("메모장열기");
		btnMemo.addActionListener(this);
		btnMemo.setToolTipText("클릭해주세요");
		
		c.add(msn);
		c.add(imageb);
		c.add(textb);
		c.add(btnMemo);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 메모리종료 상수
		f.setSize(1024, 200);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		
		System.out.println("jb : " + jb);
		
		if (jb == textb) {
			try {
				Runtime rt = Runtime.getRuntime();
				rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe https://www.weather.go.kr/");
			}catch (Exception ex) {
				// TODO: handle exception
				System.out.println(ex.toString());
			}finally {
				if (jb == btnMemo) {
					try {
						Runtime rt = Runtime.getRuntime();
						rt.exec("C:\\Program Files (x86)\\Notepad++.exe");
					}catch (Exception ex) {
						// TODO: handle exception
						System.out.println(ex.toString());
					}finally {
						
					}
				}
			}
		}
	}
}
public class JLabelJButtonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelJButton();
	}

}
