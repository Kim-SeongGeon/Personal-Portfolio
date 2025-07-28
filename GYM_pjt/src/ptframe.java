import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ptframe extends JFrame {

	boolean page = false;
	public static String trainer = "";

	public ptframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.darkGray);
		c.setLayout(null);

		// 왼쪽 화살표 이미지 ImageIcon
		ImageIcon rarrowIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\rarrow.png");
		Image rarrow = rarrowIcon.getImage();
		Image changerarrow = rarrow.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon changerarrowIcon = new ImageIcon(changerarrow);

		// 왼쪽 화살표 바뀌는 이미지 ImageIcon
		ImageIcon crarrowIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\crarrow.png");
		Image crarrow = crarrowIcon.getImage();
		Image changecrarrow = crarrow.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon changecrarrowIcon = new ImageIcon(changecrarrow);

		// 오른쪽 화살표 이미지 ImageIcon
		ImageIcon arrowIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\arrow.png");
		Image arrow = arrowIcon.getImage();
		Image changearrow = arrow.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon changearrowIcon = new ImageIcon(changearrow);

		// 오른쪽 화살표 바뀌는 이미지 ImageIcon
		ImageIcon carrowIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\carrow.png");
		Image carrow = carrowIcon.getImage();
		Image changecarrow = carrow.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon changecarrowIcon = new ImageIcon(changecarrow);

		// 크리스 범스테드 트레이너 이미지 ImageIcon
		ImageIcon ctrainerIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\ctrainer.png");
		Image ctrainer = ctrainerIcon.getImage();
		Image changectrainer = ctrainer.getScaledInstance(410, 260, Image.SCALE_SMOOTH);
		ImageIcon changectrainerIcon = new ImageIcon(changectrainer);

		// 크리스 범스테드 트레이너 바뀌는 이미지 ImageIcon
		ImageIcon cctrainerIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cctrainer.png");
		Image cctrainer = cctrainerIcon.getImage();
		Image changecctrainer = cctrainer.getScaledInstance(410, 260, Image.SCALE_SMOOTH);
		ImageIcon changecctrainerIcon = new ImageIcon(changecctrainer);

		// 박재훈 트레이너 이미지 ImageIcon
		ImageIcon ptrainerIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\ptrainer.png");
		Image ptrainer = ptrainerIcon.getImage();
		Image changeptrainer = ptrainer.getScaledInstance(410, 260, Image.SCALE_SMOOTH);
		ImageIcon changeptrainerIcon = new ImageIcon(changeptrainer);

		// 박재훈 트레이너 바뀌는 이미지 ImageIcon
		ImageIcon cptrainerIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cptrainer.png");
		Image cptrainer = cptrainerIcon.getImage();
		Image changecptrainer = cptrainer.getScaledInstance(410, 260, Image.SCALE_SMOOTH);
		ImageIcon changecptrainerIcon = new ImageIcon(changecptrainer);

		// 정대진 트레이너 이미지 ImageIcon
		ImageIcon jtrainerIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\jtrainer.png");
		Image jtrainer = jtrainerIcon.getImage();
		Image changejtrainer = jtrainer.getScaledInstance(410, 260, Image.SCALE_SMOOTH);
		ImageIcon changejtrainerIcon = new ImageIcon(changejtrainer);

		// 정대진 트레이너 바뀌는 이미지 ImageIcon
		ImageIcon cjtrainerIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cjtrainer.png");
		Image cjtrainer = cjtrainerIcon.getImage();
		Image changecjtrainer = cjtrainer.getScaledInstance(410, 260, Image.SCALE_SMOOTH);
		ImageIcon changecjtrainerIcon = new ImageIcon(changecjtrainer);

		// 심으뜸 트레이너 이미지 ImageIcon
		ImageIcon strainerIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\strainer.png");
		Image strainer = strainerIcon.getImage();
		Image changestrainer = strainer.getScaledInstance(410, 260, Image.SCALE_SMOOTH);
		ImageIcon changestrainerIcon = new ImageIcon(changestrainer);

		// 심으뜸 트레이너 바뀌는 이미지 ImageIcon
		ImageIcon cstrainerIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cstrainer.png");
		Image cstrainer = cstrainerIcon.getImage();
		Image changecstrainer = cstrainer.getScaledInstance(410, 260, Image.SCALE_SMOOTH);
		ImageIcon changecstrainerIcon = new ImageIcon(changecstrainer);

		// 안내문 넣는 JLabel
		JLabel ifjb = new JLabel("원하는 트레이너를 선택해 주세요.");
		ifjb.setFont(new Font("Bauhaus", Font.BOLD, 26));
		ifjb.setForeground(Color.white);
		ifjb.setBounds(30, 40, 400, 60);
		c.add(ifjb);

		// 크리스 범스테드 or 정대진 트레이너 사진 넣는 JLabel
		JLabel ctjb = new JLabel(changectrainerIcon);
		ctjb.setBounds(25, 115, 410, 260);
		c.add(ctjb);
		ctjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (page == false) {
					ctjb.setIcon(changecctrainerIcon);
				} else {
					ctjb.setIcon(changecjtrainerIcon);
				}
			}

			public void mouseExited(MouseEvent e) {
				if (page == false) {
					ctjb.setIcon(changectrainerIcon);
				} else {
					ctjb.setIcon(changejtrainerIcon);
				}
			}
		});

		// 박재훈 or 심으뜸 트레이너 사진 넣는 JLabel
		JLabel ptjb = new JLabel(changeptrainerIcon);
		ptjb.setBounds(25, 395, 410, 260);
		c.add(ptjb);
		ptjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (page == false) {
					ptjb.setIcon(changecptrainerIcon);
				} else {
					ptjb.setIcon(changecstrainerIcon);
				}
			}

			public void mouseExited(MouseEvent e) {
				if (page == false) {
					ptjb.setIcon(changeptrainerIcon);
				} else {
					ptjb.setIcon(changestrainerIcon);
				}
			}
		});

		// 왼쪽 화살표 사진 넣는 JLabel
		JLabel rarjb = new JLabel(changerarrowIcon);
		rarjb.setBounds(5, 368, 30, 30);
		c.add(rarjb);
		rarjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (page == true) {
					rarjb.setIcon(changecrarrowIcon);
				}
			}

			public void mouseExited(MouseEvent e) {
				rarjb.setIcon(changerarrowIcon);
			}

			public void mousePressed(MouseEvent e) {
				if (page == true) {
					ctjb.setIcon(changectrainerIcon);
					ptjb.setIcon(changeptrainerIcon);
					page = false;
				}
			}
		});

		// 오른쪽 화살표 사진 넣는 JLabel
		JLabel arjb = new JLabel(changearrowIcon);
		arjb.setBounds(423, 368, 30, 30);
		c.add(arjb);
		arjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				if (page == false) {
					arjb.setIcon(changecarrowIcon);
				}
			}

			public void mouseExited(MouseEvent e) {
				arjb.setIcon(changearrowIcon);
			}

			public void mousePressed(MouseEvent e) {
				if (page == false) {
					ctjb.setIcon(changejtrainerIcon);
					ptjb.setIcon(changestrainerIcon);
					page = true;
				}
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
		
		ctjb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (page == false) {
					trainer = "씨범";
				} else {
					trainer = "정대진";
				}
				new ptchooseframe();
				setVisible(false);
			}
		});
		
		ptjb.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (page == false) {
					trainer = "박재훈";
				} else {
					trainer = "심으뜸";
				}
				new ptchooseframe();
				setVisible(false);
			}
		});

		setSize(470, 750);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
