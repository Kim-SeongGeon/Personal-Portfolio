import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mpaypaymentsuccessframe extends JFrame {

	public mpaypaymentsuccessframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// ���� ���� �̹��� ImageIcon
		ImageIcon minsertpayIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\minsertpay.png");
		Image minsertpay = minsertpayIcon.getImage();
		Image changeminsertpay = minsertpay.getScaledInstance(450, 630, Image.SCALE_SMOOTH);
		ImageIcon changeminsertpayIcon = new ImageIcon(changeminsertpay);

		// Ŭ�� �� ȸ����ȣ â���� �̵��ϴ� JLabel
		JLabel homejb = new JLabel("Ȯ��");
		homejb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		homejb.setForeground(Color.white);
		homejb.setBounds(365, 665, 100, 40);
		c.add(homejb);
		homejb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new membershipnumber(mpaypaymentframe.phonenumber, mpaypaymentframe.formattedDateTime,
						mpaypaymentframe.formattedDateTime1);
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
				mcardpaymentframe.phonenumber = "";
				new mcardpaymentframe();
				setVisible(false);
			}
		});

		// �Ⱓ ���� JLabel
		JLabel mojb = new JLabel("ȸ���� (" + membershipframe.month + "����)");
		mojb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		mojb.setBounds(130, 443, 200, 22);
		mojb.setOpaque(true);
		mojb.setForeground(Color.BLUE);
		mojb.setBackground(Color.white);
		c.add(mojb);

		// ���ϱ� ���� �ð� ���� JLabel
		JLabel stjb = new JLabel(mpaypaymentframe.formattedDateTime);
		stjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		stjb.setBounds(130, 467, 250, 22);
		stjb.setOpaque(true);
		stjb.setForeground(Color.BLUE);
		stjb.setBackground(Color.white);
		c.add(stjb);

		// ���ϱ� ���� �ð� ���� JLabel
		JLabel etjb = new JLabel(mpaypaymentframe.formattedDateTime1);
		etjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		etjb.setBounds(130, 494, 250, 25);
		etjb.setOpaque(true);
		etjb.setForeground(Color.BLUE);
		etjb.setBackground(Color.white);
		c.add(etjb);

		// �Է��ߴ� �޴��� ��ȣ ���� JLabel
		JLabel pnjb = new JLabel("010  -  " + mpaypaymentframe.phonenumber);
		pnjb.setFont(new Font("Bauhaus", Font.BOLD, 23));
		pnjb.setBounds(150, 520, 250, 25);
		pnjb.setOpaque(true);
		pnjb.setForeground(Color.BLUE);
		pnjb.setBackground(Color.white);
		c.add(pnjb);

		// ���� ���� JLabel
		JLabel prjb = new JLabel(membershipframe.price + "��");
		prjb.setFont(new Font("Bauhaus", Font.BOLD, 22));
		prjb.setBounds(325, 574, 200, 20);
		prjb.setOpaque(true);
		prjb.setForeground(Color.BLUE);
		prjb.setBackground(Color.white);
		c.add(prjb);

		// ���� ���� �̹��� �ִ� JLabel
		JLabel cpjb = new JLabel(changeminsertpayIcon);
		cpjb.setBounds(5, 10, 450, 630);
		c.add(cpjb);

		mainframe.part = "m";
		System.out.println("Ƽ�� ���� : " + mainframe.part);

		setSize(470, 750);
		setLocationRelativeTo(null);
	}
}
