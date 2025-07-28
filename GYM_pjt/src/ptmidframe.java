import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ptmidframe extends JFrame {

	public ptmidframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.DARK_GRAY);
		c.setLayout(null);

		// 카드 결제 이미지 ImageIcon
		ImageIcon cardpaymentIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cardpayment.png");
		Image cardpayment = cardpaymentIcon.getImage();
		Image changecardpayment = cardpayment.getScaledInstance(240, 180, Image.SCALE_SMOOTH);
		ImageIcon changecardpaymentIcon = new ImageIcon(changecardpayment);

		// 카드 결제 바뀌는 이미지 ImageIcon
		ImageIcon cardpayment1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cardpayment1.png");
		Image cardpayment1 = cardpayment1Icon.getImage();
		Image changecardpayment1 = cardpayment1.getScaledInstance(240, 180, Image.SCALE_SMOOTH);
		ImageIcon changecardpayment1Icon = new ImageIcon(changecardpayment1);

		// 페이 결제 이미지 ImageIcon
		ImageIcon paypaymentIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\paypayment.png");
		Image paypayment = paypaymentIcon.getImage();
		Image changepaypayment = paypayment.getScaledInstance(240, 180, Image.SCALE_SMOOTH);
		ImageIcon changepaypaymentIcon = new ImageIcon(changepaypayment);

		// 페이 결제 바뀌는 이미지 ImageIcon
		ImageIcon paypayment1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\paypayment1.png");
		Image paypayment1 = paypayment1Icon.getImage();
		Image changepaypayment1 = paypayment1.getScaledInstance(240, 180, Image.SCALE_SMOOTH);
		ImageIcon changepaypayment1Icon = new ImageIcon(changepaypayment1);

		// 현재 프레임을 알려주는 JLabel
		JLabel nowjb = new JLabel(
				"<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;P . T 회원권 구매를 위해<br>원하시는 결제 방식을 선택하세요.</html>");
		nowjb.setFont(new Font("Bauhaus", Font.BOLD, 20));
		nowjb.setForeground(Color.white);
		nowjb.setBounds(78, 95, 320, 50);
		c.add(nowjb);

		// 카드 결제 아이콘 넣는 JLabel
		JLabel cpjb = new JLabel(changecardpaymentIcon);
		cpjb.setBounds(75, 180, 300, 180);
		c.add(cpjb);
		cpjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cpjb.setIcon(changecardpayment1Icon);
			}

			public void mouseExited(MouseEvent e) {
				cpjb.setIcon(changecardpaymentIcon);
			}

			public void mousePressed(MouseEvent e) {
				new pcardpaymentframe();
				setVisible(false);
			}
		});

		// 페이 결제 아이콘 넣는 JLabel
		JLabel ppjb = new JLabel(changepaypaymentIcon);
		ppjb.setBounds(75, 380, 300, 180);
		c.add(ppjb);
		ppjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				ppjb.setIcon(changepaypayment1Icon);
			}

			public void mouseExited(MouseEvent e) {
				ppjb.setIcon(changepaypaymentIcon);
			}

			public void mousePressed(MouseEvent e) {
				new ppaypaymentframe();
				setVisible(false);
			}
		});

		// 클릭 시 전화면으로 이동하는 JLabel
		JLabel backjb = new JLabel("BACK");
		backjb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		backjb.setForeground(Color.white);
		backjb.setBounds(20, 665, 100, 40);
		c.add(backjb);
		backjb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new ptchooseframe();
				setVisible(false);
			}
		});

		// 클릭 시 홈화면으로 이동하는 JLabel
		JLabel homejb = new JLabel("HOME");
		homejb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		homejb.setForeground(Color.white);
		homejb.setBounds(365, 665, 100, 40);
		c.add(homejb);
		homejb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new mainframe();
				setVisible(false);
			}
		});

		setSize(470, 750);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
