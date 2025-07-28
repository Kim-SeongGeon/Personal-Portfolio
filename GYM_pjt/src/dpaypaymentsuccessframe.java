import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class dpaypaymentsuccessframe extends JFrame {

	public dpaypaymentsuccessframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// ���� ���� �̹��� ImageIcon
		ImageIcon insertpayIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\dinsertpay.png");
		Image insertpay = insertpayIcon.getImage();
		Image changeinsertpay = insertpay.getScaledInstance(450, 630, Image.SCALE_SMOOTH);
		ImageIcon changeinsertpayIcon = new ImageIcon(changeinsertpay);

		// Ŭ�� �� ȸ����ȣ â���� �̵��ϴ� JLabel
		JLabel homejb = new JLabel("Ȯ��");
		homejb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		homejb.setForeground(Color.white);
		homejb.setBounds(365, 665, 100, 40);
		c.add(homejb);
		homejb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new membershipnumber(dpaypaymentframe.phonenumber, dpaypaymentframe.formattedDateTime,
						dpaypaymentframe.formattedDateTime1);
				setVisible(false);
			}
		});

		// Ŭ�� �� ��ȭ������ �̵��ϴ� JLabel
		JLabel backjb = new JLabel("BACK");
		backjb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		backjb.setForeground(Color.black);
		backjb.setBounds(20, 665, 100, 40);
		c.add(backjb);
		backjb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				dpaypaymentframe.phonenumber = "";
				new dcardpaymentframe();
				setVisible(false);
			}
		});

		// ���ϱ� ���� �ð� ���� JLabel
		JLabel stjb = new JLabel(dpaypaymentframe.formattedDateTime);
		stjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		stjb.setBounds(130, 468, 250, 25);
		stjb.setOpaque(true);
		stjb.setForeground(Color.BLUE);
		stjb.setBackground(Color.white);
		c.add(stjb);

		// ���ϱ� ���� �ð� ���� JLabel
		JLabel etjb = new JLabel(dpaypaymentframe.formattedDateTime1);
		etjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		etjb.setBounds(130, 494, 250, 25);
		etjb.setOpaque(true);
		etjb.setForeground(Color.BLUE);
		etjb.setBackground(Color.white);
		c.add(etjb);

		// �Է��ߴ� �޴��� ��ȣ ���� JLabel
		JLabel pnjb = new JLabel("010  -  " + dpaypaymentframe.phonenumber);
		pnjb.setFont(new Font("Bauhaus", Font.BOLD, 23));
		pnjb.setBounds(150, 520, 250, 25);
		pnjb.setOpaque(true);
		pnjb.setForeground(Color.blue);
		pnjb.setBackground(Color.white);
		c.add(pnjb);

		// ���� ���� �̹��� �ִ� JLabel
		JLabel cpjb = new JLabel(changeinsertpayIcon);
		cpjb.setBounds(5, 10, 450, 630);
		c.add(cpjb);

		mainframe.part = "d";
		System.out.println("Ƽ�� ���� : " + mainframe.part);

		setSize(470, 750);
		setLocationRelativeTo(null);
	}
}
