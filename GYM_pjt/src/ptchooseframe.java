import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ptchooseframe extends JFrame {

	boolean change = false;
	public static int month;
	public static String price = "";

	public ptchooseframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.darkGray);
		c.setLayout(null);

		// 카드 선택 이미지 ImageIcon
		ImageIcon cardIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\card.png");
		Image card = cardIcon.getImage();
		Image changecard = card.getScaledInstance(150, 40, Image.SCALE_SMOOTH);
		ImageIcon changecardIcon = new ImageIcon(changecard);

		// 카드 선택 바뀌는 이미지 ImageIcon
		ImageIcon ccardIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\ccard.png");
		Image ccard = ccardIcon.getImage();
		Image changeccard = ccard.getScaledInstance(155, 55, Image.SCALE_SMOOTH);
		ImageIcon changeccardIcon = new ImageIcon(changeccard);

		// 현금 선택 이미지 ImageIcon
		ImageIcon cashIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cash.png");
		Image cash = cashIcon.getImage();
		Image changecash = cash.getScaledInstance(150, 40, Image.SCALE_SMOOTH);
		ImageIcon changecashIcon = new ImageIcon(changecash);

		// 현금 바뀌는 이미지 ImageIcon
		ImageIcon ccashIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\ccash.png");
		Image ccash = ccashIcon.getImage();
		Image changeccash = ccash.getScaledInstance(155, 55, Image.SCALE_SMOOTH);
		ImageIcon changeccashIcon = new ImageIcon(changeccash);

		// 1개월 이미지 ImageIcon
		ImageIcon month1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\pmonth1.png");
		Image month1 = month1Icon.getImage();
		Image changemonth1 = month1.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth1Icon = new ImageIcon(changemonth1);

		// 1개월 바뀌는 이미지 ImageIcon
		ImageIcon cmonth1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cpmonth1.png");
		Image cmonth1 = cmonth1Icon.getImage();
		Image changecmonth1 = cmonth1.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth1Icon = new ImageIcon(changecmonth1);

		// 현금 1개월 이미지 ImageIcon
		ImageIcon emonth1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\epmonth1.png");
		Image emonth1 = emonth1Icon.getImage();
		Image changeemonth1 = emonth1.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth1Icon = new ImageIcon(changeemonth1);

		// 현금 1개월 바뀌는 이미지 ImageIcon
		ImageIcon cemonth1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cepmonth1.png");
		Image cemonth1 = cemonth1Icon.getImage();
		Image changecemonth1 = cemonth1.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth1Icon = new ImageIcon(changecemonth1);

		// 2개월 이미지 ImageIcon
		ImageIcon month2Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\pmonth2.png");
		Image month2 = month2Icon.getImage();
		Image changemonth2 = month2.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth2Icon = new ImageIcon(changemonth2);

		// 2개월 바뀌는 이미지 ImageIcon
		ImageIcon cmonth2Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cpmonth2.png");
		Image cmonth2 = cmonth2Icon.getImage();
		Image changecmonth2 = cmonth2.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth2Icon = new ImageIcon(changecmonth2);

		// 현금 2개월 이미지 ImageIcon
		ImageIcon emonth2Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\epmonth2.png");
		Image emonth2 = emonth2Icon.getImage();
		Image changeemonth2 = emonth2.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth2Icon = new ImageIcon(changeemonth2);

		// 현금 2개월 바뀌는 이미지 ImageIcon
		ImageIcon cemonth2Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cepmonth2.png");
		Image cemonth2 = cemonth2Icon.getImage();
		Image changecemonth2 = cemonth2.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth2Icon = new ImageIcon(changecemonth2);

		// 3개월 이미지 ImageIcon
		ImageIcon month3Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\pmonth3.png");
		Image month3 = month3Icon.getImage();
		Image changemonth3 = month3.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth3Icon = new ImageIcon(changemonth3);

		// 3개월 바뀌는 이미지 ImageIcon
		ImageIcon cmonth3Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cpmonth3.png");
		Image cmonth3 = cmonth3Icon.getImage();
		Image changecmonth3 = cmonth3.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth3Icon = new ImageIcon(changecmonth3);

		// 현금 3개월 이미지 ImageIcon
		ImageIcon emonth3Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\epmonth3.png");
		Image emonth3 = emonth3Icon.getImage();
		Image changeemonth3 = emonth3.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth3Icon = new ImageIcon(changeemonth3);

		// 현금 3개월 바뀌는 이미지 ImageIcon
		ImageIcon cemonth3Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cepmonth3.png");
		Image cemonth3 = cemonth3Icon.getImage();
		Image changecemonth3 = cemonth3.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth3Icon = new ImageIcon(changecemonth3);

		// 6개월 이미지 ImageIcon
		ImageIcon month6Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\pmonth6.png");
		Image month6 = month6Icon.getImage();
		Image changemonth6 = month6.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth6Icon = new ImageIcon(changemonth6);

		// 6개월 바뀌는 이미지 ImageIcon
		ImageIcon cmonth6Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cpmonth6.png");
		Image cmonth6 = cmonth6Icon.getImage();
		Image changecmonth6 = cmonth6.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth6Icon = new ImageIcon(changecmonth6);

		// 현금 6개월 이미지 ImageIcon
		ImageIcon emonth6Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\epmonth6.png");
		Image emonth6 = emonth6Icon.getImage();
		Image changeemonth6 = emonth6.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth6Icon = new ImageIcon(changeemonth6);

		// 현금 6개월 바뀌는 이미지 ImageIcon
		ImageIcon cemonth6Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cepmonth6.png");
		Image cemonth6 = cemonth6Icon.getImage();
		Image changecemonth6 = cemonth6.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth6Icon = new ImageIcon(changecemonth6);

		// 9개월 이미지 ImageIcon
		ImageIcon month9Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\pmonth9.png");
		Image month9 = month9Icon.getImage();
		Image changemonth9 = month9.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth9Icon = new ImageIcon(changemonth9);

		// 9개월 바뀌는 이미지 ImageIcon
		ImageIcon cmonth9Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cpmonth9.png");
		Image cmonth9 = cmonth9Icon.getImage();
		Image changecmonth9 = cmonth9.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth9Icon = new ImageIcon(changecmonth9);

		// 현금 9개월 이미지 ImageIcon
		ImageIcon emonth9Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\epmonth9.png");
		Image emonth9 = emonth9Icon.getImage();
		Image changeemonth9 = emonth9.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth9Icon = new ImageIcon(changeemonth9);

		// 현금 9개월 바뀌는 이미지 ImageIcon
		ImageIcon cemonth9Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cepmonth9.png");
		Image cemonth9 = cemonth9Icon.getImage();
		Image changecemonth9 = cemonth9.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth9Icon = new ImageIcon(changecemonth9);

		// 12개월 이미지 ImageIcon
		ImageIcon month12Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\pmonth12.png");
		Image month12 = month12Icon.getImage();
		Image changemonth12 = month12.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changemonth12Icon = new ImageIcon(changemonth12);

		// 12개월 바뀌는 이미지 ImageIcon
		ImageIcon cmonth12Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cpmonth12.png");
		Image cmonth12 = cmonth12Icon.getImage();
		Image changecmonth12 = cmonth12.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecmonth12Icon = new ImageIcon(changecmonth12);

		// 현금 12개월 이미지 ImageIcon
		ImageIcon emonth12Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\epmonth12.png");
		Image emonth12 = emonth12Icon.getImage();
		Image changeemonth12 = emonth12.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changeemonth12Icon = new ImageIcon(changeemonth12);

		// 현금 12개월 바뀌는 이미지 ImageIcon
		ImageIcon cemonth12Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cepmonth12.png");
		Image cemonth12 = cemonth12Icon.getImage();
		Image changecemonth12 = cemonth12.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
		ImageIcon changecemonth12Icon = new ImageIcon(changecemonth12);

		// 안내문 넣는 JLabel
		JLabel ifjb = new JLabel("원하는 기간을 선택해 주세요.");
		ifjb.setFont(new Font("Bauhaus", Font.BOLD, 26));
		ifjb.setForeground(Color.white);
		ifjb.setBounds(60, 30, 400, 60);
		c.add(ifjb);

		// 추가 안내문 넣는 JLabel
		JLabel aifjb = new JLabel("현금 할인 행사 진행중!");
		aifjb.setFont(new Font("Bauhaus", Font.BOLD, 20));
		aifjb.setForeground(Color.yellow);
		aifjb.setBounds(120, 70, 400, 60);
		c.add(aifjb);

		// 카드 선택 이미지 넣는 JLabel
		JLabel cjb = new JLabel(changeccardIcon);
		cjb.setBounds(82, 135, 150, 40);
		c.add(cjb);

		// 현금 선택 이미지 JLabel
		JLabel cajb = new JLabel(changecashIcon);
		cajb.setBounds(229, 135, 150, 40);
		c.add(cajb);

		// 1개월 이미지 넣는 JLabel
		JLabel month1jb = new JLabel(changemonth1Icon);
		month1jb.setBounds(50, 210, 160, 80);
		c.add(month1jb);

		// 2개월 이미지 넣는 JLabel
		JLabel month2jb = new JLabel(changemonth2Icon);
		month2jb.setBounds(250, 210, 160, 80);
		c.add(month2jb);

		// 3개월 이미지 넣는 JLabel
		JLabel month3jb = new JLabel(changemonth3Icon);
		month3jb.setBounds(50, 360, 160, 80);
		c.add(month3jb);

		// 6개월 이미지 넣는 JLabel
		JLabel month6jb = new JLabel(changemonth6Icon);
		month6jb.setBounds(250, 360, 160, 80);
		c.add(month6jb);

		// 9개월 이미지 넣는 JLabel
		JLabel month9jb = new JLabel(changemonth9Icon);
		month9jb.setBounds(50, 510, 160, 80);
		c.add(month9jb);

		// 12개월 이미지 넣는 JLabel
		JLabel month12jb = new JLabel(changemonth12Icon);
		month12jb.setBounds(250, 510, 160, 80);
		c.add(month12jb);

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

		// 클릭 시 전화면으로 이동하는 JLabel
		JLabel backjb = new JLabel("BACK");
		backjb.setFont(new Font("Bauhaus", Font.BOLD, 25));
		backjb.setForeground(Color.white);
		backjb.setBounds(20, 665, 100, 40);
		c.add(backjb);
		backjb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new ptframe();
				setVisible(false);
			}
		});

		// 카드 또는 현금 선택 시 변경하는 LIstener
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
					price = "100,000";
					new ptmidframe();
					setVisible(false);
				} else {
					month = 1;
					price = "100,000";
					new ptmid1frame();
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
					price = "200,000";
					new ptmidframe();
					setVisible(false);
				} else {
					month = 2;
					price = "180,000";
					new ptmid1frame();
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
					price = "280,000";
					new ptmidframe();
					setVisible(false);
				} else {
					month = 3;
					price = "260,000";
					new ptmid1frame();
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
					price = "550,000";
					new ptmidframe();
					setVisible(false);
				} else {
					month = 6;
					price = "520,000";
					new ptmid1frame();
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
					price = "800,000";
					new ptmidframe();
					setVisible(false);
				} else {
					month = 9;
					price = "760,000";
					new ptmid1frame();
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
					price = "1,000,000";
					new ptmidframe();
					setVisible(false);
				} else {
					month = 12;
					price = "950,000";
					new ptmid1frame();
					setVisible(false);
				}
			}
		});

		setSize(470, 750);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
