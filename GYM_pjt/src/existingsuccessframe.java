import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class existingsuccessframe extends JFrame {

	boolean remaindate = false;

	public existingsuccessframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.black);
		c.setLayout(null);

		// Ƽ�� �̹��� ImageIcon
		ImageIcon ticketIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\ticket.png");
		Image ticket = ticketIcon.getImage();
		Image changeticket = ticket.getScaledInstance(470, 370, Image.SCALE_SMOOTH);
		ImageIcon changeticketIcon = new ImageIcon(changeticket);

		// Ƽ�� Ȯ�� �̹��� ImageIcon
		ImageIcon checkIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\ticketcheck.png");
		Image check = checkIcon.getImage();
		Image changecheck = check.getScaledInstance(80, 30, Image.SCALE_SMOOTH);
		ImageIcon changecheckIcon = new ImageIcon(changecheck);

		// Ƽ�� Ȯ�� �ٲ�� �̹��� ImageIcon
		ImageIcon chcheckIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\chticketcheck.png");
		Image chcheck = chcheckIcon.getImage();
		Image changechcheck = chcheck.getScaledInstance(80, 30, Image.SCALE_SMOOTH);
		ImageIcon changechcheckIcon = new ImageIcon(changechcheck);

		System.out.println("@@@ : " + mainframe.formattedDateTime1);

		int i = existingframe.ix;
		String str = writetxtfile.list.get(i);
		String[] str2 = str.split("/");

		// Assuming you have two date strings
		String dateString1 = mainframe.formattedDateTime;
		String dateString2 = str2[3];
		long daysDifference;

		// Parse the date strings into Date objects
		Date date1 = parseDate(dateString1);
		Date date2 = parseDate(dateString2);

		// Calculate the difference in days
		daysDifference = calculateDaysDifference(date1, date2);

		System.out.println("Difference in days: " + daysDifference);

		// �λ縻 �����ִ� JLabel
		JLabel hijb = new JLabel();
		hijb.setFont(new Font("Bauhaus", Font.BOLD, 35));
		hijb.setForeground(Color.white);
		hijb.setBounds(30, 100, 500, 100);
		c.add(hijb);

		// ���� �ϼ� �����ִ� JLabel
		JLabel rdjb = new JLabel();
		rdjb.setFont(new Font("Bauhaus", Font.BOLD, 20));
		rdjb.setForeground(Color.yellow);
		rdjb.setBounds(65, 160, 400, 200);
		c.add(rdjb);

		if (daysDifference < 1) {
			remaindate = false;
			hijb.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;����� �� ���ų� <br>�Ⱓ�� ���� Ƽ���Դϴ�.");
		} else {
			remaindate = true;
			hijb.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;���õ� JAVA GYM�� <br>�̿����ּż� �����մϴ�!");
			rdjb.setText("ȸ������ ȸ������ " + daysDifference + "�� ���ҽ��ϴ�.");
		}

		// Ȯ�� ��ư �̹��� �ִ� JLabel
		JLabel chjb = new JLabel(changecheckIcon);
		chjb.setBounds(185, 320, 80, 30);
		c.add(chjb);
		chjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				chjb.setIcon(changechcheckIcon);
			}

			public void mouseExited(MouseEvent e) {
				chjb.setIcon(changecheckIcon);
			}

			public void mousePressed(MouseEvent e) {
				if (remaindate = true) {
					new mainframe();
					setVisible(false);
				} 
			}
		});

		// Ƽ�� �̹��� �ִ� JLabel
		JLabel tcfjb = new JLabel(changeticketIcon);
		tcfjb.setBounds(0, 0, 470, 370);
		c.add(tcfjb);

		setSize(470, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private static Date parseDate(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace(); // Handle parsing exception as needed
			return null;
		}
	}

	private static long calculateDaysDifference(Date date1, Date date2) {
		// Calculate the difference in milliseconds
		long differenceInMillis = date2.getTime() - date1.getTime();

		// Convert milliseconds to days
		return differenceInMillis / (24 * 60 * 60 * 1000);
	}
}
