import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class membershipframe extends JFrame {

	boolean change = false;
	public static int month;
	public static String price = "";

	public membershipframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.darkGray);
		c.setLayout(null);

		// ī�� ���� �̹��� ImageIcon
		ImageIcon cardIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\card.png");
		Image card = cardIcon.getImage();
		Image changecard = card.getScaledInstance(150, 40, Image.SCALE_SMOOTH);
		ImageIcon changecardIcon = new ImageIcon(changecard);

		// ī�� ���� �ٲ�� �̹��� ImageIcon
		ImageIcon ccardIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\ccard.png");
		Image ccard = ccardIcon.getImage();
		Image changeccard = ccard.getScaledInstance(155, 55, Image.SCALE_SMOOTH);
		ImageIcon changeccardIcon = new ImageIcon(changeccard);

		// ���� ���� �̹��� ImageIcon
		ImageIcon cashIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cash.png");
		Image cash = cashIcon.getImage();
		Image changecash = cash.getScaledInstance(150, 40, Image.SCALE_SMOOTH);
		ImageIcon changecashIcon = new ImageIcon(changecash);

		// ���� �ٲ�� �̹��� ImageIcon
		ImageIcon ccashIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\ccash.png");
		Image ccash = ccashIcon.getImage();
		Image changeccash = ccash.getScaledInstance(155, 55, Image.SCALE_SMOOTH);
		ImageIcon changeccashIcon = new ImageIcon(changeccash);

		// 1���� �̹��� ImageIcon
		ImageIcon month1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\month1.png");
		Image month1 = month1Icon.getImage();
		Image changemonth1 = month1.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth1Icon = new ImageIcon(changemonth1);

		// 1���� �ٲ�� �̹��� ImageIcon
		ImageIcon cmonth1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cmonth1.png");
		Image cmonth1 = cmonth1Icon.getImage();
		Image changecmonth1 = cmonth1.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth1Icon = new ImageIcon(changecmonth1);

		// ���� 1���� �̹��� ImageIcon
		ImageIcon emonth1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\emonth1.png");
		Image emonth1 = emonth1Icon.getImage();
		Image changeemonth1 = emonth1.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth1Icon = new ImageIcon(changeemonth1);

		// ���� 1���� �ٲ�� �̹��� ImageIcon
		ImageIcon cemonth1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cemonth1.png");
		Image cemonth1 = cemonth1Icon.getImage();
		Image changecemonth1 = cemonth1.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth1Icon = new ImageIcon(changecemonth1);

		// 2���� �̹��� ImageIcon
		ImageIcon month2Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\month2.png");
		Image month2 = month2Icon.getImage();
		Image changemonth2 = month2.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth2Icon = new ImageIcon(changemonth2);

		// 2���� �ٲ�� �̹��� ImageIcon
		ImageIcon cmonth2Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cmonth2.png");
		Image cmonth2 = cmonth2Icon.getImage();
		Image changecmonth2 = cmonth2.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth2Icon = new ImageIcon(changecmonth2);

		// ���� 2���� �̹��� ImageIcon
		ImageIcon emonth2Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\emonth2.png");
		Image emonth2 = emonth2Icon.getImage();
		Image changeemonth2 = emonth2.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth2Icon = new ImageIcon(changeemonth2);

		// ���� 2���� �ٲ�� �̹��� ImageIcon
		ImageIcon cemonth2Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cemonth2.png");
		Image cemonth2 = cemonth2Icon.getImage();
		Image changecemonth2 = cemonth2.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth2Icon = new ImageIcon(changecemonth2);

		// 3���� �̹��� ImageIcon
		ImageIcon month3Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\month3.png");
		Image month3 = month3Icon.getImage();
		Image changemonth3 = month3.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth3Icon = new ImageIcon(changemonth3);

		// 3���� �ٲ�� �̹��� ImageIcon
		ImageIcon cmonth3Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cmonth3.png");
		Image cmonth3 = cmonth3Icon.getImage();
		Image changecmonth3 = cmonth3.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth3Icon = new ImageIcon(changecmonth3);

		// ���� 3���� �̹��� ImageIcon
		ImageIcon emonth3Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\emonth3.png");
		Image emonth3 = emonth3Icon.getImage();
		Image changeemonth3 = emonth3.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth3Icon = new ImageIcon(changeemonth3);

		// ���� 3���� �ٲ�� �̹��� ImageIcon
		ImageIcon cemonth3Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cemonth3.png");
		Image cemonth3 = cemonth3Icon.getImage();
		Image changecemonth3 = cemonth3.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth3Icon = new ImageIcon(changecemonth3);

		// 6���� �̹��� ImageIcon
		ImageIcon month6Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\month6.png");
		Image month6 = month6Icon.getImage();
		Image changemonth6 = month6.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth6Icon = new ImageIcon(changemonth6);

		// 6���� �ٲ�� �̹��� ImageIcon
		ImageIcon cmonth6Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cmonth6.png");
		Image cmonth6 = cmonth6Icon.getImage();
		Image changecmonth6 = cmonth6.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth6Icon = new ImageIcon(changecmonth6);

		// ���� 6���� �̹��� ImageIcon
		ImageIcon emonth6Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\emonth6.png");
		Image emonth6 = emonth6Icon.getImage();
		Image changeemonth6 = emonth6.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth6Icon = new ImageIcon(changeemonth6);

		// ���� 6���� �ٲ�� �̹��� ImageIcon
		ImageIcon cemonth6Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cemonth6.png");
		Image cemonth6 = cemonth6Icon.getImage();
		Image changecemonth6 = cemonth6.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth6Icon = new ImageIcon(changecemonth6);

		// 9���� �̹��� ImageIcon
		ImageIcon month9Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\month9.png");
		Image month9 = month9Icon.getImage();
		Image changemonth9 = month9.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth9Icon = new ImageIcon(changemonth9);

		// 9���� �ٲ�� �̹��� ImageIcon
		ImageIcon cmonth9Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cmonth9.png");
		Image cmonth9 = cmonth9Icon.getImage();
		Image changecmonth9 = cmonth9.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth9Icon = new ImageIcon(changecmonth9);

		// ���� 9���� �̹��� ImageIcon
		ImageIcon emonth9Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\emonth9.png");
		Image emonth9 = emonth9Icon.getImage();
		Image changeemonth9 = emonth9.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth9Icon = new ImageIcon(changeemonth9);

		// ���� 9���� �ٲ�� �̹��� ImageIcon
		ImageIcon cemonth9Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cemonth9.png");
		Image cemonth9 = cemonth9Icon.getImage();
		Image changecemonth9 = cemonth9.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth9Icon = new ImageIcon(changecemonth9);

		// 12���� �̹��� ImageIcon
		ImageIcon month12Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\month12.png");
		Image month12 = month12Icon.getImage();
		Image changemonth12 = month12.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth12Icon = new ImageIcon(changemonth12);

		// 12���� �ٲ�� �̹��� ImageIcon
		ImageIcon cmonth12Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cmonth12.png");
		Image cmonth12 = cmonth12Icon.getImage();
		Image changecmonth12 = cmonth12.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth12Icon = new ImageIcon(changecmonth12);

		// ���� 12���� �̹��� ImageIcon
		ImageIcon emonth12Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\emonth12.png");
		Image emonth12 = emonth12Icon.getImage();
		Image changeemonth12 = emonth12.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth12Icon = new ImageIcon(changeemonth12);

		// ���� 12���� �ٲ�� �̹��� ImageIcon
		ImageIcon cemonth12Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cemonth12.png");
		Image cemonth12 = cemonth12Icon.getImage();
		Image changecemonth12 = cemonth12.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth12Icon = new ImageIcon(changecemonth12);

		// �ȳ��� �ִ� JLabel
		JLabel ifjb = new JLabel("���ϴ� �Ⱓ�� ������ �ּ���.");
		ifjb.setFont(new Font("Bauhaus", Font.BOLD, 26));
		ifjb.setForeground(Color.white);
		ifjb.setBounds(60, 30, 400, 60);
		c.add(ifjb);

		// �߰� �ȳ��� �ִ� JLabel
		JLabel aifjb = new JLabel("���� ���� ��� ������!");
		aifjb.setFont(new Font("Bauhaus", Font.BOLD, 20));
		aifjb.setForeground(Color.yellow);
		aifjb.setBounds(120, 70, 400, 60);
		c.add(aifjb);

		// ī�� ���� �̹��� �ִ� JLabel
		JLabel cjb = new JLabel(changeccardIcon);
		cjb.setBounds(82, 135, 150, 40);
		c.add(cjb);

		// ���� ���� �̹��� JLabel
		JLabel cajb = new JLabel(changecashIcon);
		cajb.setBounds(229, 135, 150, 40);
		c.add(cajb);

		// 1���� �̹��� �ִ� JLabel
		JLabel month1jb = new JLabel(changemonth1Icon);
		month1jb.setBounds(50, 210, 160, 80);
		c.add(month1jb);

		// 2���� �̹��� �ִ� JLabel
		JLabel month2jb = new JLabel(changemonth2Icon);
		month2jb.setBounds(250, 210, 160, 80);
		c.add(month2jb);

		// 3���� �̹��� �ִ� JLabel
		JLabel month3jb = new JLabel(changemonth3Icon);
		month3jb.setBounds(50, 360, 160, 80);
		c.add(month3jb);

		// 6���� �̹��� �ִ� JLabel
		JLabel month6jb = new JLabel(changemonth6Icon);
		month6jb.setBounds(250, 360, 160, 80);
		c.add(month6jb);

		// 9���� �̹��� �ִ� JLabel
		JLabel month9jb = new JLabel(changemonth9Icon);
		month9jb.setBounds(50, 510, 160, 80);
		c.add(month9jb);

		// 12���� �̹��� �ִ� JLabel
		JLabel month12jb = new JLabel(changemonth12Icon);
		month12jb.setBounds(250, 510, 160, 80);
		c.add(month12jb);

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

		// ī�� �Ǵ� ���� ���� �� �����ϴ� LIstener
		cjb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				change = false;
				cjb.setIcon(changeccardIcon);
				cajb.setIcon(changecashIcon);
				month1jb.setIcon(changemonth1Icon);
				month2jb.setIcon(changemonth2Icon);
				month3jb.setIcon(changemonth3Icon);
				month6jb.setIcon(changemonth6Icon);
				month9jb.setIcon(changemonth9Icon);
				month12jb.setIcon(changemonth12Icon);
			}
		});
		cajb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				change = true;
				cjb.setIcon(changecardIcon);
				cajb.setIcon(changeccashIcon);
				month1jb.setIcon(changeemonth1Icon);
				month2jb.setIcon(changeemonth2Icon);
				month3jb.setIcon(changeemonth3Icon);
				month6jb.setIcon(changeemonth6Icon);
				month9jb.setIcon(changeemonth9Icon);
				month12jb.setIcon(changeemonth12Icon);
			}
		});

		month1jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (change == false) {
					month1jb.setIcon(changecmonth1Icon);
				} else {
					month1jb.setIcon(changecemonth1Icon);
				}
			}

			public void mouseExited(MouseEvent e) {
				if (change == false) {
					month1jb.setIcon(changemonth1Icon);
				} else {
					month1jb.setIcon(changeemonth1Icon);
				}
			}

			public void mousePressed(MouseEvent e) {
				if (change == false) {
					month = 1;
					price = "60,000";
					new membershipmidframe();
					setVisible(false);
				} else {
					month = 1;
					price = "60,000";
					new membershipmid1frame();
					setVisible(false);
				}
			}
		});

		month2jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (change == false) {
					month2jb.setIcon(changecmonth2Icon);
				} else {
					month2jb.setIcon(changecemonth2Icon);
				}
			}

			public void mouseExited(MouseEvent e) {
				if (change == false) {
					month2jb.setIcon(changemonth2Icon);
				} else {
					month2jb.setIcon(changeemonth2Icon);
				}
			}

			public void mousePressed(MouseEvent e) {
				if (change == false) {
					month = 2;
					price = "110,000";
					new membershipmidframe();
					setVisible(false);
				} else {
					month = 2;
					price = "90,000";
					new membershipmid1frame();
					setVisible(false);
				}
			}
		});

		month3jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (change == false) {
					month3jb.setIcon(changecmonth3Icon);
				} else {
					month3jb.setIcon(changecemonth3Icon);
				}
			}

			public void mouseExited(MouseEvent e) {
				if (change == false) {
					month3jb.setIcon(changemonth3Icon);
				} else {
					month3jb.setIcon(changeemonth3Icon);
				}
			}

			public void mousePressed(MouseEvent e) {
				if (change == false) {
					month = 3;
					price = "160,000";
					new membershipmidframe();
					setVisible(false);
				} else {
					month = 3;
					price = "140,000";
					new membershipmid1frame();
					setVisible(false);
				}
			}
		});

		month6jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (change == false) {
					month6jb.setIcon(changecmonth6Icon);
				} else {
					month6jb.setIcon(changecemonth6Icon);
				}
			}

			public void mouseExited(MouseEvent e) {
				if (change == false) {
					month6jb.setIcon(changemonth6Icon);
				} else {
					month6jb.setIcon(changeemonth6Icon);
				}
			}

			public void mousePressed(MouseEvent e) {
				if (change == false) {
					month = 6;
					price = "300,000";
					new membershipmidframe();
					setVisible(false);
				} else {
					month = 6;
					price = "270,000";
					new membershipmid1frame();
					setVisible(false);
				}
			}
		});

		month9jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (change == false) {
					month9jb.setIcon(changecmonth9Icon);
				} else {
					month9jb.setIcon(changecemonth9Icon);
				}
			}

			public void mouseExited(MouseEvent e) {
				if (change == false) {
					month9jb.setIcon(changemonth9Icon);
				} else {
					month9jb.setIcon(changeemonth9Icon);
				}
			}

			public void mousePressed(MouseEvent e) {
				if (change == false) {
					month = 9;
					price = "500,000";
					new membershipmidframe();
					setVisible(false);
				} else {
					month = 9;
					price = "460,000";
					new membershipmid1frame();
					setVisible(false);
				}
			}
		});

		month12jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (change == false) {
					month12jb.setIcon(changecmonth12Icon);
				} else {
					month12jb.setIcon(changecemonth12Icon);
				}
			}

			public void mouseExited(MouseEvent e) {
				if (change == false) {
					month12jb.setIcon(changemonth12Icon);
				} else {
					month12jb.setIcon(changeemonth12Icon);
				}
			}

			public void mousePressed(MouseEvent e) {
				if (change == false) {
					month = 12;
					price = "700,000";
					new membershipmidframe();
					setVisible(false);
				} else {
					month = 12;
					price = "650,000";
					new membershipmid1frame();
					setVisible(false);
				}
			}
		});

		setSize(470, 750);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
