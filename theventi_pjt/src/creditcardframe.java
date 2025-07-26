import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class creditcardframe extends JFrame {
	private Container c;
	private JLabel creditcardJLabel;
	private JLabel methodJLabel;

	public creditcardframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 신용카드 이미지
		ImageIcon creditcardIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\creditcard.png");
		Image creditcardImage = creditcardIcon.getImage();
		Image screditcardImage = creditcardImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
		ImageIcon screditcardIcon = new ImageIcon(screditcardImage);

		// MADE BY. 김성건 텍스트 넣는 JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. 김성건");
		ksgJLabel.setBounds(370, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// 신용카드 이미지 넣는 JLabel
		creditcardJLabel = new JLabel(screditcardIcon);
		creditcardJLabel.setBounds(140, 20, screditcardIcon.getIconWidth(), screditcardIcon.getIconHeight());
		c.add(creditcardJLabel);

		// 결제 방법 설명 넣는 JLabel
		methodJLabel = new JLabel("카드를 카드 리더기에 꽂아 주세요.");
		methodJLabel.setBounds(100, 200, 400, 20);
		methodJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(methodJLabel);

		Timer timer = new Timer(2000, e -> updateUI());
		timer.setRepeats(false);
		timer.start();

		setSize(500, 380);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void updateUI() {
		methodJLabel.setText("결제 진행중...");
		methodJLabel.setBounds(170, 210, 300, 30);
		methodJLabel.setFont(new Font("Bauhaus", Font.BOLD, 25));
		c.add(methodJLabel);

		c.revalidate();
		c.repaint();

		Timer timer = new Timer(2500, e -> new receiptframe());
		timer.setRepeats(false);
		timer.start();
	}
}
