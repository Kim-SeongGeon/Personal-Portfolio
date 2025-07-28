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

		// �ｺ�� ��ũ �̹��� ImageIcon
		ImageIcon gymIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\GYM1.png");

		// ���ϱ� ������ �̹��� ImageIcon
		ImageIcon dailyframeIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\DAILY_FRAME.png");
		Image dailyframe = dailyframeIcon.getImage();
		Image changedailyframe = dailyframe.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changedailyframeIcon = new ImageIcon(changedailyframe);

		// ���ϱ� ������ �ٲ�� �̹��� ImageIcon
		ImageIcon dailyframe1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\DAILY_FRAME1.png");
		Image dailyframe1 = dailyframe1Icon.getImage();
		Image changedailyframe1 = dailyframe1.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changedailyframe1Icon = new ImageIcon(changedailyframe1);

		// ȸ���� ������ �̹��� ImageIcon
		ImageIcon membershipframeIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\MEMBERSHIP_FRAME.png");
		Image membershipframe = membershipframeIcon.getImage();
		Image changemembershipframe = membershipframe.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changemembershipframeIcon = new ImageIcon(changemembershipframe);

		// ȸ���� ������ �ٲ�� �̹��� ImageIcon
		ImageIcon membershipframe1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\MEMBERSHIP_FRAME1.png");
		Image membershipframe1 = membershipframe1Icon.getImage();
		Image changemembershipframe1 = membershipframe1.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changemembershipframe1Icon = new ImageIcon(changemembershipframe1);

		// PT ������ �̹��� ImageIcon
		ImageIcon PTframeIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\P.T_FRAME.png");
		Image PTframe = PTframeIcon.getImage();
		Image changePTframe = PTframe.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changePTframeIcon = new ImageIcon(changePTframe);

		// PT ������ �ٲ�� �̹��� ImageIcon
		ImageIcon PTframe1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\P.T_FRAME1.png");
		Image PTframe1 = PTframe1Icon.getImage();
		Image changePTframe1 = PTframe1.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
		ImageIcon changePTframe1Icon = new ImageIcon(changePTframe1);

		// ���� ȸ�� ��� ������ �̹��� ImageIcon
		ImageIcon ExistingIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\Exitsting.png");
		Image Existing = ExistingIcon.getImage();
		Image changeExisting = Existing.getScaledInstance(120, 40, Image.SCALE_SMOOTH);
		ImageIcon changeExistingIcon = new ImageIcon(changeExisting);

		// ���� ȸ�� ��� ������ �̹��� ImageIcon
		ImageIcon Existing1Icon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\Exitsting1.png");
		Image Existing1 = Existing1Icon.getImage();
		Image changeExisting1 = Existing1.getScaledInstance(120, 40, Image.SCALE_SMOOTH);
		ImageIcon changeExisting1Icon = new ImageIcon(changeExisting1);

		// ���� ��¥�� �ð��� �����ִ� JLabel
		DateTimejb = new JLabel();
		DateTimejb.setFont(new Font("Bauhaus", Font.BOLD, 15));
		DateTimejb.setForeground(Color.white);
		DateTimejb.setBounds(10, 10, 200, 20);
		c.add(DateTimejb);

		// ���� ��¥ �������� JLabel
		DateTimejb1 = new JLabel();
		c.add(DateTimejb1);

		// ���� ��¥�� �ð��� �����ֵ��� �����ִ� ��Ʈ
		Timer timer = new Timer(1000, e -> updateDateTimejb());
		timer.start();

		// �ｺ�� ��ũ �ִ� JLabel
		JLabel mkjb = new JLabel(gymIcon);
		mkjb.setBounds(127, 5, 200, 200);
		c.add(mkjb);

		// �ｺ�� ��ũ �̸� �ִ� JLabel
		JLabel mknjb = new JLabel("JAVA GYM ����");
		mknjb.setFont(new Font("Bauhaus", Font.BOLD, 40));
		mknjb.setForeground(Color.white);
		mknjb.setBounds(80, 190, 400, 60);
		c.add(mknjb);

		// �ｺ�� ���� �ִ� JLabel
		JLabel gyminfo1jb = new JLabel(
				"<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��ð� : 24�ð� �<br>�����ް� : �Ŵ� ������ �� �Ͽ���</html>");
		gyminfo1jb.setFont(new Font("Bauhaus", Font.BOLD, 16));
		gyminfo1jb.setForeground(Color.yellow);
		gyminfo1jb.setBounds(110, 235, 400, 70);
		c.add(gyminfo1jb);

		// ���ϱ� ������ ������ �ִ� JLabel
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

		// ȸ���� ������ ������ �ִ� JLabel
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

		// PT ������ ������ �ִ� JLabel
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

		// ���� ȸ�� ��� JLabel
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

		// �ｺ�� �Ұ� �ִ� JLabel
		JLabel gymintrojb = new JLabel(
				"<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�ȳ��ϼ���. �ڹ��� �����Դϴ�.<br>���� ���Ͻô� ȸ������ �������ּ���.<br>&nbsp;&nbsp;&nbsp;&nbsp;�ٸ� ���ǻ����� '010-1234-5678'<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;����� �����ּ���.<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;���õ� ����ϼ���!</html>");
		gymintrojb.setFont(new Font("Bauhaus", Font.BOLD, 16));
		gymintrojb.setForeground(Color.white);
		gymintrojb.setBounds(87, 580, 400, 120);
		c.add(gymintrojb);

		System.out.println("�ڹ��� ȸ������");
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
