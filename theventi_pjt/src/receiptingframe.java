import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class receiptingframe extends JFrame {

	public receiptingframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 영수증 이미지
		ImageIcon receiptIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\receipt.png");
		Image receiptImage = receiptIcon.getImage();
		Image sreceiptImage = receiptImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
		ImageIcon sreceiptIcon = new ImageIcon(sreceiptImage);

		// MADE BY. 김성건 텍스트 넣는 JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. 김성건");
		ksgJLabel.setBounds(330, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// 영수증 이미지 넣는 JLabel
		JLabel receiptJLabel = new JLabel(sreceiptIcon);
		receiptJLabel.setBounds(110, 20, sreceiptIcon.getIconWidth(), sreceiptIcon.getIconHeight());
		c.add(receiptJLabel);

		// 영수증 출력중 텍스트 넣는 JLabel
		JLabel textJLabel = new JLabel("영수증 출력중...");
		textJLabel.setBounds(150,  180, 400, 20);
		textJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(textJLabel);
		
		Timer timer = new Timer(2000, e -> {
			receiptframe.insertdata();
			new ordernumberframe();
			dispose();
		});
		timer.setRepeats(false);
		timer.start();

		setSize(450, 280);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
