import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class kakaopayframe extends JFrame {

	private Container c;
	private JLabel naverpayJLabel;
	private JLabel methodJLabel;
	private JLabel method1JLabel;

	public kakaopayframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 카카오페이 이미지
		ImageIcon kakaopayIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\kakaopay.png");
		Image kakaopayImage = kakaopayIcon.getImage();
		Image skakaopayImage = kakaopayImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
		ImageIcon skakaopayIcon = new ImageIcon(skakaopayImage);

		// MADE BY. 김성건 텍스트 넣는 JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. 김성건");
		ksgJLabel.setBounds(370, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// 모바일상품권 이미지 넣는 JLabel
		naverpayJLabel = new JLabel(skakaopayIcon);
		naverpayJLabel.setBounds(140, 20, skakaopayIcon.getIconWidth(), skakaopayIcon.getIconHeight());
		c.add(naverpayJLabel);

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
