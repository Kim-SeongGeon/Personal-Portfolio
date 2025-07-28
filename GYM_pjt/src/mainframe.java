import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class mainframe extends JFrame {

	private JLabel DateTimejb;
	private JLabel DateTimejb1;
	public static String formattedDateTime = "";
	public static String formattedDateTime1 = "";
	public static String part = "";

	public mainframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.black);
		c.setLayout(null);

		// 헬스장 마크 이미지 ImageIcon
		ImageIcon gymIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\GYM1.png");

		// 일일권 프레임 이미지 ImageIcon
		ImageIcon dailyframeIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\DAILY_FRAME.png");
		Image dailyframe = dailyframeIcon.getImage();
		Image changedailyframe = dailyframe.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changedailyframeIcon = new ImageIcon(changedailyframe);

		// 일일권 프레임 바뀌는 이미지 ImageIcon
		ImageIcon dailyframe1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\DAILY_FRAME1.png");
		Image dailyframe1 = dailyframe1Icon.getImage();
		Image changedailyframe1 = dailyframe1.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changedailyframe1Icon = new ImageIcon(changedailyframe1);

		// 회원권 프레임 이미지 ImageIcon
		ImageIcon membershipframeIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\MEMBERSHIP_FRAME.png");
		Image membershipframe = membershipframeIcon.getImage();
		Image changemembershipframe = membershipframe.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changemembershipframeIcon = new ImageIcon(changemembershipframe);

		// 회원권 프레임 바뀌는 이미지 ImageIcon
		ImageIcon membershipframe1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\MEMBERSHIP_FRAME1.png");
		Image membershipframe1 = membershipframe1Icon.getImage();
		Image changemembershipframe1 = membershipframe1.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changemembershipframe1Icon = new ImageIcon(changemembershipframe1);

		// PT 프레임 이미지 ImageIcon
		ImageIcon PTframeIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\P.T_FRAME.png");
		Image PTframe = PTframeIcon.getImage();
		Image changePTframe = PTframe.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changePTframeIcon = new ImageIcon(changePTframe);

		// PT 프레임 바뀌는 이미지 ImageIcon
		ImageIcon PTframe1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\P.T_FRAME1.png");
		Image PTframe1 = PTframe1Icon.getImage();
		Image changePTframe1 = PTframe1.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changePTframe1Icon = new ImageIcon(changePTframe1);

		// 기존 회원 등록 프레임 이미지 ImageIcon
		ImageIcon ExistingIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\Exitsting.png");
		Image Existing = ExistingIcon.getImage();
		Image changeExisting = Existing.getScaledInstance(120, 40, Image.SCALE_SMOOTH);
		ImageIcon changeExistingIcon = new ImageIcon(changeExisting);

		// 기존 회원 등록 프레임 이미지 ImageIcon
		ImageIcon Existing1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\Exitsting1.png");
		Image Existing1 = Existing1Icon.getImage();
		Image changeExisting1 = Existing1.getScaledInstance(120, 40, Image.SCALE_SMOOTH);
		ImageIcon changeExisting1Icon = new ImageIcon(changeExisting1);

		// 현재 날짜와 시간을 보여주는 JLabel
		DateTimejb = new JLabel();
		DateTimejb.setFont(new Font("Bauhaus", Font.BOLD, 15));
		DateTimejb.setForeground(Color.white);
		DateTimejb.setBounds(10, 10, 200, 20);
		c.add(DateTimejb);

		// 현재 날짜 가져오는 JLabel
		DateTimejb1 = new JLabel();
		c.add(DateTimejb1);

		// 현재 날짜와 시간을 보여주도록 도와주는 파트
		Timer timer = new Timer(1000, e -> updateDateTimejb());
		timer.start();

		// 헬스장 마크 넣는 JLabel
		JLabel mkjb = new JLabel(gymIcon);
		mkjb.setBounds(127, 5, 200, 200);
		c.add(mkjb);

		// 헬스장 마크 이름 넣는 JLabel
		JLabel mknjb = new JLabel("JAVA GYM 본점");
		mknjb.setFont(new Font("Bauhaus", Font.BOLD, 40));
		mknjb.setForeground(Color.white);
		mknjb.setBounds(80, 190, 400, 60);
		c.add(mknjb);

		// 헬스장 정보 넣는 JLabel
		JLabel gyminfo1jb = new JLabel(
				"<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;운영시간 : 24시간 운영<br>정기휴관 : 매달 마지막 주 일요일</html>");
		gyminfo1jb.setFont(new Font("Bauhaus", Font.BOLD, 16));
		gyminfo1jb.setForeground(Color.yellow);
		gyminfo1jb.setBounds(110, 235, 400, 70);
		c.add(gyminfo1jb);

		// 일일권 프레임 아이콘 넣는 JLabel
		JLabel dafjb = new JLabel(changedailyframeIcon);
		dafjb.setBounds(0, 300, 150, 220);
		c.add(dafjb);
		dafjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				dafjb.setIcon(changedailyframe1Icon);
			}

			public void mouseExited(MouseEvent e) {
				dafjb.setIcon(changedailyframeIcon);
			}

			public void mousePressed(MouseEvent e) {
				new dailyframe();
				setVisible(false);
			}
		});

		// 회원권 프레임 아이콘 넣는 JLabel
		JLabel mmfjb = new JLabel(changemembershipframeIcon);
		mmfjb.setBounds(150, 293, 150, 230);
		c.add(mmfjb);
		mmfjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				mmfjb.setIcon(changemembershipframe1Icon);
			}

			public void mouseExited(MouseEvent e) {
				mmfjb.setIcon(changemembershipframeIcon);
			}

			public void mousePressed(MouseEvent e) {
				new membershipframe();
				setVisible(false);
			}
		});

		// PT 프레임 아이콘 넣는 JLabel
		JLabel ptfjb = new JLabel(changePTframeIcon);
		ptfjb.setBounds(300, 293, 150, 230);
		c.add(ptfjb);
		ptfjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				ptfjb.setIcon(changePTframe1Icon);
			}

			public void mouseExited(MouseEvent e) {
				ptfjb.setIcon(changePTframeIcon);
			}

			public void mousePressed(MouseEvent e) {
				new ptframe();
				setVisible(false);
			}
		});

		// 기존 회원 등록 JLabel
		JLabel exjb = new JLabel(changeExistingIcon);
		exjb.setBounds(125, 485, 200, 130);
		c.add(exjb);
		exjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				exjb.setIcon(changeExisting1Icon);
			}

			public void mouseExited(MouseEvent e) {
				exjb.setIcon(changeExistingIcon);
			}

			public void mousePressed(MouseEvent e) {
				new existingframe();
				setVisible(false);
			}
		});

		// 헬스장 소개 넣는 JLabel
		JLabel gymintrojb = new JLabel(
				"<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;안녕하세요. 자바짐 본점입니다.<br>구매 원하시는 회원권을 선택해주세요.<br>&nbsp;&nbsp;&nbsp;&nbsp;다른 문의사항은 '010-1234-5678'<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;여기로 연락주세요.<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;오늘도 득근하세요!</html>");
		gymintrojb.setFont(new Font("Bauhaus", Font.BOLD, 16));
		gymintrojb.setForeground(Color.white);
		gymintrojb.setBounds(87, 580, 400, 120);
		c.add(gymintrojb);

		System.out.println("자바짐 회원정보");
		try {
			readtxtfile.readMembershipNumberFromFile();
		} catch (Exception e) {
			e.printStackTrace(); // Handle the exception appropriately
		}

		setSize(470, 750);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void updateDateTimejb() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		formattedDateTime = dateFormat.format(new Date());
		DateTimejb.setText(formattedDateTime);
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		formattedDateTime1 = dateFormat1.format(new Date());
		DateTimejb1.setText(formattedDateTime1);
	}

}
