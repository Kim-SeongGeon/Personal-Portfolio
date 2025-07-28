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

public class membershipnumber extends JFrame {

	public static String formattedDateTime = "";
	public static String membershipNumber = "";
	

	public membershipnumber(String phonenumber, String start, String end) {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.black);
		c.setLayout(null);

		// 티켓 이미지 ImageIcon
		ImageIcon ticketIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\ticket.png");
		Image ticket = ticketIcon.getImage();
		Image changeticket = ticket.getScaledInstance(470, 370, Image.SCALE_SMOOTH);
		ImageIcon changeticketIcon = new ImageIcon(changeticket);

		// 티켓 확인 이미지 ImageIcon
		ImageIcon checkIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\ticketcheck.png");
		Image check = checkIcon.getImage();
		Image changecheck = check.getScaledInstance(80, 30, Image.SCALE_SMOOTH);
		ImageIcon changecheckIcon = new ImageIcon(changecheck);

		// 티켓 확인 바뀌는 이미지 ImageIcon
		ImageIcon chcheckIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\chticketcheck.png");
		Image chcheck = chcheckIcon.getImage();
		Image changechcheck = chcheck.getScaledInstance(80, 30, Image.SCALE_SMOOTH);
		ImageIcon changechcheckIcon = new ImageIcon(changechcheck);

		// 회원번호 보여주는 JLabel
		JLabel mnjb = new JLabel();
		mnjb.setFont(new Font("Bauhaus", Font.BOLD, 35));
		mnjb.setForeground(Color.white);
		mnjb.setBounds(85, 130, 350, 50);
		c.add(mnjb);

		// 인사말 넣는 JLabel
		JLabel hijb = new JLabel("자바짐에 오신 것을 환영합니다!");
		hijb.setFont(new Font("Bauhaus", Font.BOLD, 20));
		hijb.setForeground(Color.white);
		hijb.setBounds(78, 240, 500, 50);
		c.add(hijb);

		// 티켓 구분해서 회원번호 맨앞자리 숫자 parse
		String cr = "";
		if (mainframe.part == "d") {
			cr = "1";
		} else if (mainframe.part == "m") {
			cr = "3";
		} else if (mainframe.part == "p") {
			cr = "5";
		}

		// txt 파일의 마지막에 들어있는 정보 중 회원번호 들고와서 1씩 증가
		String str = writetxtfile.list.get(writetxtfile.list.size() - 1);
		String[] str2 = str.split("/");
		for (int i = 0; i < str2.length; ++i) {
			System.out.println(i + "번째 : " + str2[i]);
		}
		int num = Integer.valueOf(str2[0]).intValue();
		int mnum = num % 100000;
		mnum++;

		String formmattedNumber = String.format("%05d", mnum);
		membershipNumber = cr + formmattedNumber;
		mnjb.setText("회원번호 : " + membershipNumber);

		// 입력한 휴대폰 번호 + 시작 날짜 + 종료 날짜 txt 파일로 합침
		String total = membershipNumber + "/010  -  " + phonenumber + "/" + start + "/" + end;
		writetxtfile.list.add(total);
		writetxtfile.saveMembershipNumberToFile(total);

		// 확인 버튼 이미지 넣는 JLabel
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
				new mainframe();
				setVisible(false);
			}
		});

		// 티켓 이미지 넣는 JLabel
		JLabel tcfjb = new JLabel(changeticketIcon);
		tcfjb.setBounds(0, 0, 470, 370);
		c.add(tcfjb);

		setSize(470, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
