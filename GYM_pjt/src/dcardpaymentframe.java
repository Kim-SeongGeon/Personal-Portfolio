import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class dcardpaymentframe extends JFrame {

	private JLabel DateTimejb;
	private JLabel DateTimejb1;
	public static String phonenumber = "";
	public static String formattedDateTime = "";
	public static String formattedDateTime1 = "";

	public dcardpaymentframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.gray);
		c.setLayout(null);

		// 카드 결제 이미지 ImageIcon
		ImageIcon cardpaymentIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\dcp.png");
		Image cardpayment = cardpaymentIcon.getImage();
		Image changecardpayment = cardpayment.getScaledInstance(370, 250, Image.SCALE_SMOOTH);
		ImageIcon changecardpaymentIcon = new ImageIcon(changecardpayment);

		// 결제 버튼 이미지 ImageIcon
		ImageIcon payIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\pay.png");
		Image pay = payIcon.getImage();
		Image changepay = pay.getScaledInstance(130, 40, Image.SCALE_SMOOTH);
		ImageIcon changepayIcon = new ImageIcon(changepay);

		// 결제 버튼 바뀌는 이미지 ImageIcon
		ImageIcon cpayIcon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cpay.png");
		Image cpay = cpayIcon.getImage();
		Image changecpay = cpay.getScaledInstance(130, 40, Image.SCALE_SMOOTH);
		ImageIcon changecpayIcon = new ImageIcon(changecpay);

		// 키패드 초기화 이미지 ImageIcon
		ImageIcon initIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\initialization.png");
		Image init = initIcon.getImage();
		Image changeinit = init.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
		ImageIcon changeinitIcon = new ImageIcon(changeinit);

		// 키패드 초기화 바뀌는 이미지 ImageIcon
		ImageIcon cinitIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cinitialization.png");
		Image cinit = cinitIcon.getImage();
		Image changecinit = cinit.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
		ImageIcon changecinitIcon = new ImageIcon(changecinit);

		// 키패드 0 이미지 ImageIcon
		ImageIcon num0Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num0.png");
		Image num0 = num0Icon.getImage();
		Image changenum0 = num0.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum0Icon = new ImageIcon(changenum0);

		// 키패드 0 바뀌는 이미지 ImageIcon
		ImageIcon cnum0Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum0.png");
		Image cnum0 = cnum0Icon.getImage();
		Image changecnum0 = cnum0.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum0Icon = new ImageIcon(changecnum0);

		// 키패드 지움 이미지 ImageIcon
		ImageIcon deleteIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\delete.png");
		Image delete = deleteIcon.getImage();
		Image changedelete = delete.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
		ImageIcon changedeleteIcon = new ImageIcon(changedelete);

		// 키패드 지움 바뀌는 이미지 ImageIcon
		ImageIcon cdeleteIcon = new ImageIcon(
				"D:\\JAVA Programming\\GYM_pjt\\cdelete.png");
		Image cdelete = cdeleteIcon.getImage();
		Image changecdelete = cdelete.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
		ImageIcon changecdelteIcon = new ImageIcon(changecdelete);

		// 키패드 1 이미지 ImageIcon
		ImageIcon num1Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num1.png");
		Image num1 = num1Icon.getImage();
		Image changenum1 = num1.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum1Icon = new ImageIcon(changenum1);

		// 키패드 1 바뀌는 이미지 ImageIcon
		ImageIcon cnum1Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum1.png");
		Image cnum1 = cnum1Icon.getImage();
		Image changecnum1 = cnum1.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum1Icon = new ImageIcon(changecnum1);

		// 키패드 2 이미지 ImageIcon
		ImageIcon num2Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num2.png");
		Image num2 = num2Icon.getImage();
		Image changenum2 = num2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum2Icon = new ImageIcon(changenum2);

		// 키패드 2 바뀌는 이미지 ImageIcon
		ImageIcon cnum2Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum2.png");
		Image cnum2 = cnum2Icon.getImage();
		Image changecnum2 = cnum2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum2Icon = new ImageIcon(changecnum2);

		// 키패드 3 이미지 ImageIcon
		ImageIcon num3Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num3.png");
		Image num3 = num3Icon.getImage();
		Image changenum3 = num3.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum3Icon = new ImageIcon(changenum3);

		// 키패드 3 바뀌는 이미지 ImageIcon
		ImageIcon cnum3Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum3.png");
		Image cnum3 = cnum3Icon.getImage();
		Image changecnum3 = cnum3.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum3Icon = new ImageIcon(changecnum3);

		// 키패드 4 이미지 ImageIcon
		ImageIcon num4Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num4.png");
		Image num4 = num4Icon.getImage();
		Image changenum4 = num4.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum4Icon = new ImageIcon(changenum4);

		// 키패드 4 바뀌는 이미지 ImageIcon
		ImageIcon cnum4Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum4.png");
		Image cnum4 = cnum4Icon.getImage();
		Image changecnum4 = cnum4.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum4Icon = new ImageIcon(changecnum4);

		// 키패드 5 이미지 ImageIcon
		ImageIcon num5Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num5.png");
		Image num5 = num5Icon.getImage();
		Image changenum5 = num5.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum5Icon = new ImageIcon(changenum5);

		// 키패드 5 바뀌는 이미지 ImageIcon
		ImageIcon cnum5Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum5.png");
		Image cnum5 = cnum5Icon.getImage();
		Image changecnum5 = cnum5.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum5Icon = new ImageIcon(changecnum5);

		// 키패드 6 이미지 ImageIcon
		ImageIcon num6Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num6.png");
		Image num6 = num6Icon.getImage();
		Image changenum6 = num6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum6Icon = new ImageIcon(changenum6);

		// 키패드 6 바뀌는 이미지 ImageIcon
		ImageIcon cnum6Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum6.png");
		Image cnum6 = cnum6Icon.getImage();
		Image changecnum6 = cnum6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum6Icon = new ImageIcon(changecnum6);

		// 키패드 7 이미지 ImageIcon
		ImageIcon num7Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num7.png");
		Image num7 = num7Icon.getImage();
		Image changenum7 = num7.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum7Icon = new ImageIcon(changenum7);

		// 키패드 7 바뀌는 이미지 ImageIcon
		ImageIcon cnum7Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum7.png");
		Image cnum7 = cnum7Icon.getImage();
		Image changecnum7 = cnum7.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum7Icon = new ImageIcon(changecnum7);

		// 키패드 8 이미지 ImageIcon
		ImageIcon num8Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num8.png");
		Image num8 = num8Icon.getImage();
		Image changenum8 = num8.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum8Icon = new ImageIcon(changenum8);

		// 키패드 8 바뀌는 이미지 ImageIcon
		ImageIcon cnum8Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum8.png");
		Image cnum8 = cnum8Icon.getImage();
		Image changecnum8 = cnum8.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum8Icon = new ImageIcon(changecnum8);

		// 키패드 9 이미지 ImageIcon
		ImageIcon num9Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\num9.png");
		Image num9 = num9Icon.getImage();
		Image changenum9 = num9.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changenum9Icon = new ImageIcon(changenum9);

		// 키패드 9 바뀌는 이미지 ImageIcon
		ImageIcon cnum9Icon = new ImageIcon("D:\\JAVA Programming\\GYM_pjt\\cnum9.png");
		Image cnum9 = cnum9Icon.getImage();
		Image changecnum9 = cnum9.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon changecnum9Icon = new ImageIcon(changecnum9);

		// 현재 날짜와 시간을 보여주는 JLabel
		DateTimejb = new JLabel();
		DateTimejb.setFont(new Font("Bauhaus", Font.BOLD, 17));
		DateTimejb.setForeground(Color.RED);
		DateTimejb.setBounds(160, 216, 200, 20);
		c.add(DateTimejb);

		// 현재 날짜와 시간을 보여주는 JLabel
		DateTimejb1 = new JLabel();
		DateTimejb1.setFont(new Font("Bauhaus", Font.BOLD, 17));
		DateTimejb1.setForeground(Color.RED);
		DateTimejb1.setBounds(160, 258, 200, 20);
		c.add(DateTimejb1);

		// 현재 날짜와 시간을 보여주도록 도와주는 파트
		Timer timer = new Timer(1000, e -> updateDateTimejb());
		timer.start();

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
				dcardpaymentframe.phonenumber = "";
				new dailyframe();
				setVisible(false);
			}
		});

		// 휴대폰 번호 들어가는 JLabel
		JLabel pnjb = new JLabel();
		pnjb.setFont(new Font("Bauhaus", Font.BOLD, 18));
		pnjb.setBounds(225, 174, 150, 20);
		pnjb.setOpaque(true);
		pnjb.setForeground(Color.RED);
		pnjb.setBackground(Color.white);
		c.add(pnjb);

		// 카드 결제 정보 넣는 JLabel
		JLabel cpjb = new JLabel(changecardpaymentIcon);
		cpjb.setBounds(30, 40, 400, 250);
		c.add(cpjb);
		
		// 휴대폰 번호 미입력 시 경고문 넣는 JLabel
		JLabel wnjb = new JLabel();
		wnjb.setBounds(150, 15, 200, 25);
		wnjb.setOpaque(true);
		wnjb.setForeground(Color.yellow);
		wnjb.setBackground(Color.gray);
		c.add(wnjb);

		// 결제 버튼 JLabel
		JLabel pjb = new JLabel(changepayIcon);
		pjb.setBounds(155, 630, 130, 40);
		c.add(pjb);
		pjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pjb.setIcon(changecpayIcon);
			}
			
			public void mouseExited(MouseEvent e) {
				pjb.setIcon(changepayIcon);
			}
			public void mousePressed(MouseEvent e) {
				System.out.println("길이 : " + phonenumber.length());
				if (phonenumber.length() != 13) {
					wnjb.setText("※ 휴대폰 번호를 확인바랍니다.");
					System.out.println("휴대폰 번호를 입력하세요.");
				} else {
					System.out.println("결제 하시겠습니까?");
					System.out.println("전화번호 : 010  -  " + pnjb.getText());
					// 현재 시간을 가져오는 부분
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					Calendar cal = Calendar.getInstance();
					String paymentTime = dateFormat.format(cal.getTime());
					System.out.println("결제 시간: " + paymentTime);
					dcardpaymentsuccessframe Dcardpaymentsuccessframe = new dcardpaymentsuccessframe();
					Dcardpaymentsuccessframe.setVisible(true);
					setVisible(false);
				}
			}
		});

		// 키패드 초기화 넣는 JLabel
		JLabel initjb = new JLabel(changeinitIcon);
		initjb.setBounds(110, 550, 60, 60);
		c.add(initjb);
		initjb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				initjb.setIcon(changecinitIcon);
			}

			public void mouseExited(MouseEvent e) {
				initjb.setIcon(changeinitIcon);
			}

			public void mousePressed(MouseEvent e) {
				phonenumber = "";
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 0 넣는 JLabel
		JLabel num0jb = new JLabel(changenum0Icon);
		num0jb.setBounds(190, 550, 60, 60);
		c.add(num0jb);
		num0jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num0jb.setIcon(changecnum0Icon);
			}

			public void mouseExited(MouseEvent e) {
				num0jb.setIcon(changenum0Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "0";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 지움 넣는 JLabel
		JLabel deletejb = new JLabel(changedeleteIcon);
		deletejb.setBounds(270, 550, 60, 60);
		c.add(deletejb);
		deletejb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				deletejb.setIcon(changecdelteIcon);
			}

			public void mouseExited(MouseEvent e) {
				deletejb.setIcon(changedeleteIcon);
			}

			public void mousePressed(MouseEvent e) {
				String currentText = pnjb.getText();
				if (!currentText.isEmpty()) {
					// 숫자와 스페이스바('-')를 모두 지우기
					if (currentText.endsWith("  -  ")) {
						// 숫자와 스페이스바를 모두 지우기 위해 길이를 4자리 전까지로 설정
						currentText = currentText.substring(0, currentText.length() - 6);
					} else {
						// 그 외의 경우에는 마지막 문자만 지우기
						currentText = currentText.substring(0, currentText.length() - 1);
					}
					// 휴대폰 번호 업데이트
					phonenumber = currentText;
					pnjb.setText(phonenumber);
				}
			}
		});

		// 키패드 1 넣는 JLabel
		JLabel num1jb = new JLabel(changenum1Icon);
		num1jb.setBounds(110, 470, 60, 60);
		c.add(num1jb);
		num1jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num1jb.setIcon(changecnum1Icon);
			}

			public void mouseExited(MouseEvent e) {
				num1jb.setIcon(changenum1Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "1";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 2 넣는 JLabel
		JLabel num2jb = new JLabel(changenum2Icon);
		num2jb.setBounds(190, 470, 60, 60);
		c.add(num2jb);
		num2jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num2jb.setIcon(changecnum2Icon);
			}

			public void mouseExited(MouseEvent e) {
				num2jb.setIcon(changenum2Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "2";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 3 넣는 JLabel
		JLabel num3jb = new JLabel(changenum3Icon);
		num3jb.setBounds(270, 470, 60, 60);
		c.add(num3jb);
		num3jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num3jb.setIcon(changecnum3Icon);
			}

			public void mouseExited(MouseEvent e) {
				num3jb.setIcon(changenum3Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "3";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 4 넣는 JLabel
		JLabel num4jb = new JLabel(changenum4Icon);
		num4jb.setBounds(110, 390, 60, 60);
		c.add(num4jb);
		num4jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num4jb.setIcon(changecnum4Icon);
			}

			public void mouseExited(MouseEvent e) {
				num4jb.setIcon(changenum4Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "4";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 5 넣는 JLabel
		JLabel num5jb = new JLabel(changenum5Icon);
		num5jb.setBounds(190, 390, 60, 60);
		c.add(num5jb);
		num5jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num5jb.setIcon(changecnum5Icon);
			}

			public void mouseExited(MouseEvent e) {
				num5jb.setIcon(changenum5Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "5";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 6 넣는 JLabel
		JLabel num6jb = new JLabel(changenum6Icon);
		num6jb.setBounds(270, 390, 60, 60);
		c.add(num6jb);
		num6jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num6jb.setIcon(changecnum6Icon);
			}

			public void mouseExited(MouseEvent e) {
				num6jb.setIcon(changenum6Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "6";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 7 넣는 JLabel
		JLabel num7jb = new JLabel(changenum7Icon);
		num7jb.setBounds(110, 310, 60, 60);
		c.add(num7jb);
		num7jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num7jb.setIcon(changecnum7Icon);
			}

			public void mouseExited(MouseEvent e) {
				num7jb.setIcon(changenum7Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "7";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 8 넣는 JLabel
		JLabel num8jb = new JLabel(changenum8Icon);
		num8jb.setBounds(190, 310, 60, 60);
		c.add(num8jb);
		num8jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num8jb.setIcon(changecnum8Icon);
			}

			public void mouseExited(MouseEvent e) {
				num8jb.setIcon(changenum8Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "8";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		// 키패드 9 넣는 JLabel
		JLabel num9jb = new JLabel(changenum9Icon);
		num9jb.setBounds(270, 310, 60, 60);
		c.add(num9jb);
		num9jb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				num9jb.setIcon(changecnum9Icon);
			}

			public void mouseExited(MouseEvent e) {
				num9jb.setIcon(changenum9Icon);
			}

			public void mousePressed(MouseEvent e) {
				if (phonenumber.length() >= 13) {
					phonenumber += "";
				} else {
					phonenumber += "9";
				}
				if (phonenumber.length() == 4) {
					phonenumber += "  -  ";
				}
				pnjb.setText(phonenumber);
			}
		});

		setSize(470, 750);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void updateDateTimejb() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		formattedDateTime = dateFormat.format(new Date());
		DateTimejb.setText(formattedDateTime);
		cal.add(Calendar.DATE, 1);
		formattedDateTime1 = dateFormat.format(cal.getTime());
		DateTimejb1.setText(formattedDateTime1);
	}
}
