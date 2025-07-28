import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class dcardpaymentsuccessframe extends JFrame {

	public dcardpaymentsuccessframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 카드 결제 이미지 ImageIcon
		ImageIcon dinsertcardIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\dinsertcard.png");
		Image dinsertcard = dinsertcardIcon.getImage();
		Image changedinsertcard = dinsertcard.getScaledInstance(450, 630, Image.SCALE_SMOOTH);
		ImageIcon changedinsertcardIcon = new ImageIcon(changedinsertcard);

		// 클릭 시 회원번호 창으로 이동하는 JLabel
		JLabel homejb = new JLabel("확인");
		homejb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		homejb.setForeground(Color.white);
		homejb.setBounds(365, 665, 100, 40);
		c.add(homejb);
		homejb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new membershipnumber(dcardpaymentframe.phonenumber, dcardpaymentframe.formattedDateTime, dcardpaymentframe.formattedDateTime1);
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
				dcardpaymentframe.phonenumber = "";
				new dcardpaymentframe();
				setVisible(false);
			}
		});

		// 일일권 시작 시간 들어가는 JLabel
		JLabel stjb = new JLabel(dcardpaymentframe.formattedDateTime);
		stjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		stjb.setBounds(130, 468, 250, 25);
		stjb.setOpaque(true);
		stjb.setForeground(Color.BLUE);
		stjb.setBackground(Color.white);
		c.add(stjb);

		// 일일권 종료 시간 들어가는 JLabel
		JLabel etjb = new JLabel(dcardpaymentframe.formattedDateTime1);
		etjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		etjb.setBounds(130, 494, 250, 25);
		etjb.setOpaque(true);
		etjb.setForeground(Color.BLUE);
		etjb.setBackground(Color.white);
		c.add(etjb);

		// 입력했던 휴대폰 번호 들어가는 JLabel
		JLabel pnjb = new JLabel("010  -  " + dcardpaymentframe.phonenumber);
		pnjb.setFont(new Font("Bauhaus", Font.BOLD, 23));
		pnjb.setBounds(150, 520, 250, 25);
		pnjb.setOpaque(true);
		pnjb.setForeground(Color.blue);
		pnjb.setBackground(Color.white);
		c.add(pnjb);

		// 카드 결제 이미지 넣는 JLabel
		JLabel cpjb = new JLabel(changedinsertcardIcon);
		cpjb.setBounds(5, 10, 450, 630);
		c.add(cpjb);

		mainframe.part = "d";
		System.out.println("티켓 구분 : " + mainframe.part);

		setSize(470, 750);
		setLocationRelativeTo(null);
	}
}
