import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class paycoframe extends JFrame {

	private Container c;
	private JLabel paycoJLabel;
	private JLabel methodJLabel;
	private JLabel method1JLabel;

	public paycoframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 페이코 이미지
		ImageIcon paycoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\payco.png");
		Image paycoImage = paycoIcon.getImage();
		Image spaycoImage = paycoImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
		ImageIcon spaycoIcon = new ImageIcon(spaycoImage);

		// MADE BY. 김성건 텍스트 넣는 JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. 김성건");
		ksgJLabel.setBounds(370, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// 페이코 이미지 넣는 JLabel
		paycoJLabel = new JLabel(spaycoIcon);
		paycoJLabel.setBounds(140, 20, spaycoIcon.getIconWidth(), spaycoIcon.getIconHeight());
		c.add(paycoJLabel);

		// 결제 방법 설명 넣는 JLabel
		methodJLabel = new JLabel("바코드 인식을 위해 바코드를");
		methodJLabel.setBounds(115, 200, 300, 20);
		methodJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(methodJLabel);

		// 결제 방법 설명 넣는 JLabel
		method1JLabel = new JLabel("바코드 리더기에 가져다 주세요.");
		method1JLabel.setBounds(100, 230, 300, 20);
		method1JLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(method1JLabel);

		// Timer 설정 : 3초 후에 실행
		Timer timer = new Timer(2000, e -> updateUI());
		timer.setRepeats(false);
		timer.start();

		setSize(500, 380);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void updateUI() {
		// 기존의 JLabel 컴포넌트 제거
		c.remove(method1JLabel);

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
