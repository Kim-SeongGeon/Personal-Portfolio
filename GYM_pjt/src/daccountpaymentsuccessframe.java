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

public class daccountpaymentsuccessframe extends JFrame {
	
	public static String membershipNumber = "";

	public daccountpaymentsuccessframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// ���� ��ü �̹��� ImageIcon
		ImageIcon accountIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\daccount.png");
		Image account = accountIcon.getImage();
		Image changeaccount = account.getScaledInstance(450, 630, Image.SCALE_SMOOTH);
		ImageIcon changeaccountIcon = new ImageIcon(changeaccount);

		// Ŭ�� �� ȸ����ȣ â���� �̵��ϴ� JLabel
		JLabel homejb = new JLabel("Ȯ��");
		homejb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		homejb.setForeground(Color.white);
		homejb.setBounds(365, 665, 100, 40);
		c.add(homejb);
		homejb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new membershipnumber(daccountpaymentframe.phonenumber, daccountpaymentframe.formattedDateTime, daccountpaymentframe.formattedDateTime1);
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
				daccountpaymentframe.phonenumber = "";
				new dcardpaymentframe();
				setVisible(false);
			}
		});

		// ���ϱ� ���� �ð� ���� JLabel
		JLabel stjb = new JLabel(daccountpaymentframe.formattedDateTime);
		stjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		stjb.setBounds(130, 468, 250, 25);
		stjb.setOpaque(true);
		stjb.setForeground(Color.BLUE);
		stjb.setBackground(Color.white);
		c.add(stjb);

		// ���ϱ� ���� �ð� ���� JLabel
		JLabel etjb = new JLabel(daccountpaymentframe.formattedDateTime1);
		etjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		etjb.setBounds(130, 494, 250, 25);
		etjb.setOpaque(true);
		etjb.setForeground(Color.BLUE);
		etjb.setBackground(Color.white);
		c.add(etjb);

		// �Է��ߴ� �޴��� ��ȣ ���� JLabel
		JLabel pnjb = new JLabel("010  -  " + daccountpaymentframe.phonenumber);
		pnjb.setFont(new Font("Bauhaus", Font.BOLD, 23));
		pnjb.setBounds(150, 520, 250, 25);
		pnjb.setOpaque(true);
		pnjb.setForeground(Color.blue);
		pnjb.setBackground(Color.white);
		c.add(pnjb);

		// ���� ��ü �̹��� �ִ� JLabel
		JLabel apjb = new JLabel(changeaccountIcon);
		apjb.setBounds(5, 10, 450, 630);
		c.add(apjb);

		mainframe.part = "d";
		System.out.println("Ƽ�� ���� : " + mainframe.part);

		setSize(470, 750);
		setLocationRelativeTo(null);
	}
}
