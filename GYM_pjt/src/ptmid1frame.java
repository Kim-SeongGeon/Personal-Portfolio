import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ptmid1frame extends JFrame{
	
	public ptmid1frame() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.DARK_GRAY);
		c.setLayout(null);

		// ���� ��ü �̹��� ImageIcon
		ImageIcon accountpaymentIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\accountpayment.png");
		Image accountpayment = accountpaymentIcon.getImage();
		Image changeaccountpayment = accountpayment.getScaledInstance(240, 180, Image.SCALE_SMOOTH);
		ImageIcon changeaccountpaymentIcon = new ImageIcon(changeaccountpayment);

		// ���� ��ü �̹��� ImageIcon
		ImageIcon accountpayment1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\accountpayment1.png");
		Image accountpayment1 = accountpayment1Icon.getImage();
		Image changeaccountpayment1 = accountpayment1.getScaledInstance(240, 180, Image.SCALE_SMOOTH);
		ImageIcon changeaccountpayment1Icon = new ImageIcon(changeaccountpayment1);

		// ���� �������� �˷��ִ� JLabel
		JLabel nowjb = new JLabel(
				"<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;P . T ȸ���� ���Ÿ� ����<br>���Ͻô� ���� ����� �����ϼ���.</html>");
		nowjb.setFont(new Font("Bauhaus", Font.BOLD, 20));
		nowjb.setForeground(Color.white);
		nowjb.setBounds(78, 125, 320, 50);
		c.add(nowjb);

		// ���� ��ü ������ �ִ� JLabel
		JLabel apjb = new JLabel(changeaccountpaymentIcon);
		apjb.setBounds(75, 280, 300, 180);
		c.add(apjb);
		apjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				apjb.setIcon(changeaccountpayment1Icon);
			}

			public void mouseExited(MouseEvent e) {
				apjb.setIcon(changeaccountpaymentIcon);
			}

			public void mousePressed(MouseEvent e) {
				new paccountpaymentframe();
				setVisible(false);
			}
		});

		// Ŭ�� �� ��ȭ������ �̵��ϴ� JLabel
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

		// Ŭ�� �� Ȩȭ������ �̵��ϴ� JLabel
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
