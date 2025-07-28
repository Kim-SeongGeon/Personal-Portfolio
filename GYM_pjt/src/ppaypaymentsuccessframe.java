import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ppaypaymentsuccessframe extends JFrame {

	public ppaypaymentsuccessframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 페이 결제 이미지 ImageIcon
		ImageIcon minsertpayIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\pinsertpay.png");
		Image minsertpay = minsertpayIcon.getImage();
		Image changeminsertpay = minsertpay.getScaledInstance(450, 630, Image.SCALE_SMOOTH);
		ImageIcon changeminsertpayIcon = new ImageIcon(changeminsertpay);

		// 클릭 시 회원번호 창으로 이동하는 JLabel
		JLabel homejb = new JLabel("확인");
		homejb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		homejb.setForeground(Color.white);
		homejb.setBounds(365, 665, 100, 40);
		c.add(homejb);
		homejb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new membershipnumber(ppaypaymentframe.phonenumber, ppaypaymentframe.formattedDateTime,
						ppaypaymentframe.formattedDateTime1);
				setVisible(false);
			}
		});

		// 클릭 시 전화면으로 이동하는 JLabel
		JLabel backjb = new JLabel("BACK");
		backjb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		backjb.setForeground(Color.black);
		backjb.setBounds(20, 665, 100, 40);
		c.add(backjb);
		backjb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mcardpaymentframe.phonenumber = "";
				new ppaypaymentframe();
				setVisible(false);
			}
		});

		// 기간 들어가는 JLabel
		JLabel mojb = new JLabel("P.T 회원권 (" + ptchooseframe.month + "개월+" + ptframe.trainer + "T)");
		mojb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		mojb.setBounds(130, 443, 300, 22);
		mojb.setOpaque(true);
		mojb.setForeground(Color.BLUE);
		mojb.setBackground(Color.white);
		c.add(mojb);

		// 일일권 시작 시간 들어가는 JLabel
		JLabel stjb = new JLabel(ppaypaymentframe.formattedDateTime);
		stjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		stjb.setBounds(130, 467, 250, 22);
		stjb.setOpaque(true);
		stjb.setForeground(Color.BLUE);
		stjb.setBackground(Color.white);
		c.add(stjb);

		// 일일권 종료 시간 들어가는 JLabel
		JLabel etjb = new JLabel(ppaypaymentframe.formattedDateTime1);
		etjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		etjb.setBounds(130, 494, 250, 25);
		etjb.setOpaque(true);
		etjb.setForeground(Color.BLUE);
		etjb.setBackground(Color.white);
		c.add(etjb);

		// 입력했던 휴대폰 번호 들어가는 JLabel
		JLabel pnjb = new JLabel("010  -  " + ppaypaymentframe.phonenumber);
		pnjb.setFont(new Font("Bauhaus", Font.BOLD, 23));
		pnjb.setBounds(150, 520, 250, 25);
		pnjb.setOpaque(true);
		pnjb.setForeground(Color.BLUE);
		pnjb.setBackground(Color.white);
		c.add(pnjb);

		// 가격 들어가는 JLabel
		JLabel prjb = new JLabel(ptchooseframe.price + "원");
		prjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		prjb.setBounds(310, 574, 200, 25);
		prjb.setOpaque(true);
		prjb.setForeground(Color.BLUE);
		prjb.setBackground(Color.white);
		c.add(prjb);

		// 페이 결제 이미지 넣는 JLabel
		JLabel cpjb = new JLabel(changeminsertpayIcon);
		cpjb.setBounds(5, 10, 450, 630);
		c.add(cpjb);

		mainframe.part = "p";
		System.out.println("티켓 구분 : " + mainframe.part);

		setSize(470, 750);
		setLocationRelativeTo(null);
	}
}
