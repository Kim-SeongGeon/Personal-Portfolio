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

	static String number = "";
	static payframe payF = null;

	public membershipframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// �������� �̹���
		ImageIcon xpointIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\xpoint.png");
		Image xpointImage = xpointIcon.getImage();
		Image sxpointImage = xpointImage.getScaledInstance(250, 60, Image.SCALE_SMOOTH);
		ImageIcon sxpointIcon = new ImageIcon(sxpointImage);

		// �������� �̹���
		ImageIcon pointIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\point.png");
		Image pointImage = pointIcon.getImage();
		Image spointImage = pointImage.getScaledInstance(260, 60, Image.SCALE_SMOOTH);
		ImageIcon spointIcon = new ImageIcon(spointImage);

		// ��ư 0 �̹���
		ImageIcon btn0Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn0.png");
		Image btn0Image = btn0Icon.getImage();
		Image sbtn0Image = btn0Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn0Icon = new ImageIcon(sbtn0Image);

		// ��ư 1 �̹���
		ImageIcon btn1Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn1.png");
		Image btn1Image = btn1Icon.getImage();
		Image sbtn1Image = btn1Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn1Icon = new ImageIcon(sbtn1Image);

		// ��ư 2 �̹���
		ImageIcon btn2Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn2.png");
		Image btn2Image = btn2Icon.getImage();
		Image sbtn2Image = btn2Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn2Icon = new ImageIcon(sbtn2Image);

		// ��ư 3 �̹���
		ImageIcon btn3Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn3.png");
		Image btn3Image = btn3Icon.getImage();
		Image sbtn3Image = btn3Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn3Icon = new ImageIcon(sbtn3Image);

		// ��ư 4 �̹���
		ImageIcon btn4Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn4.png");
		Image btn4Image = btn4Icon.getImage();
		Image sbtn4Image = btn4Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn4Icon = new ImageIcon(sbtn4Image);

		// ��ư 5 �̹���
		ImageIcon btn5Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn5.png");
		Image btn5Image = btn5Icon.getImage();
		Image sbtn5Image = btn5Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn5Icon = new ImageIcon(sbtn5Image);

		// ��ư 6 �̹���
		ImageIcon btn6Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn6.png");
		Image btn6Image = btn6Icon.getImage();
		Image sbtn6Image = btn6Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn6Icon = new ImageIcon(sbtn6Image);

		// ��ư 7 �̹���
		ImageIcon btn7Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn7.png");
		Image btn7Image = btn7Icon.getImage();
		Image sbtn7Image = btn7Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn7Icon = new ImageIcon(sbtn7Image);

		// ��ư 8 �̹���
		ImageIcon btn8Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn8.png");
		Image btn8Image = btn8Icon.getImage();
		Image sbtn8Image = btn8Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn8Icon = new ImageIcon(sbtn8Image);

		// ��ư 9 �̹���
		ImageIcon btn9Icon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btn9.png");
		Image btn9Image = btn9Icon.getImage();
		Image sbtn9Image = btn9Image.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtn9Icon = new ImageIcon(sbtn9Image);

		// ��ư ��ü ���� �̹���
		ImageIcon btnclearallIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btnclearall.png");
		Image btnclearallImage = btnclearallIcon.getImage();
		Image sbtnclearallImage = btnclearallImage.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtnclearallIcon = new ImageIcon(sbtnclearallImage);

		// ��ư ���� �̹���
		ImageIcon btnclearlastIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\btnclearlast.png");
		Image btnclearlastImage = btnclearlastIcon.getImage();
		Image sbtnclearlastImage = btnclearlastImage.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
		ImageIcon sbtnclearlastIcon = new ImageIcon(sbtnclearlastImage);

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(390, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// '����Ƽ �����' �ؽ�Ʈ �ִ� JLabel
		JLabel theventiJLabel = new JLabel("����Ƽ �����");
		theventiJLabel.setBounds(150, 25, 200, 30);
		theventiJLabel.setHorizontalAlignment(JLabel.CENTER);
		theventiJLabel.setForeground(Color.black);
		theventiJLabel.setFont(new Font("Bauhaus", Font.BOLD, 30));
		c.add(theventiJLabel);

		// '���� �޴��� ��ȣ �Է�' �ؽ�Ʈ �ִ� JLabel
		JLabel membershipJLabel = new JLabel("���� �޴��� ��ȣ �Է�");
		membershipJLabel.setBounds(50, 70, 400, 30);
		membershipJLabel.setHorizontalAlignment(JLabel.CENTER);
		membershipJLabel.setForeground(Color.blue);
		membershipJLabel.setFont(new Font("Bauhaus", Font.BOLD, 30));
		c.add(membershipJLabel);

		// �Է��� �����ī���ȣ �Ǵ� �޴��� ��ȣ�� �ִ� JLabel
		JLabel numberJLabel = new JLabel(number);
		numberJLabel.setBounds(150, 135, 200, 30);
		numberJLabel.setHorizontalAlignment(JLabel.CENTER);
		numberJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(numberJLabel);

		// '�����ī���ȣ/�޴�����ȣ' �ؽ�Ʈ �ִ� JLabel
		JLabel memphoneJLabel = new JLabel("�����ī���ȣ/�޴�����ȣ");
		memphoneJLabel.setBounds(75, 200, 250, 30);
		memphoneJLabel.setHorizontalAlignment(JLabel.CENTER);
		memphoneJLabel.setForeground(Color.blue);
		memphoneJLabel.setFont(new Font("Bauhaus", Font.BOLD, 17));
		c.add(memphoneJLabel);

		// '�� �Է��ϼ���.' �ؽ�Ʈ �ִ� JLabel
		JLabel insertJLabel = new JLabel("�� �Է��ϼ���.");
		insertJLabel.setBounds(235, 200, 250, 30);
		insertJLabel.setHorizontalAlignment(JLabel.CENTER);
		insertJLabel.setForeground(Color.black);
		insertJLabel.setFont(new Font("Bauhaus", Font.BOLD, 17));
		c.add(insertJLabel);

		// ��ư 1 �̹��� �ִ� JLabel
		JLabel btn1JLabel = new JLabel(sbtn1Icon);
		btn1JLabel.setBounds(60, 250, sbtn1Icon.getIconWidth(), sbtn1Icon.getIconHeight());
		c.add(btn1JLabel);
		btn1JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "1";
				numberJLabel.setText(number);
			}
		});

		// ��ư 2 �̹��� �ִ� JLabel
		JLabel btn2JLabel = new JLabel(sbtn2Icon);
		btn2JLabel.setBounds(190, 250, sbtn2Icon.getIconWidth(), sbtn2Icon.getIconHeight());
		c.add(btn2JLabel);
		btn2JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "2";
				numberJLabel.setText(number);
			}
		});

		// ��ư 3 �̹��� �ִ� JLabel
		JLabel btn3JLabel = new JLabel(sbtn3Icon);
		btn3JLabel.setBounds(320, 250, sbtn3Icon.getIconWidth(), sbtn3Icon.getIconHeight());
		c.add(btn3JLabel);
		btn3JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "3";
				numberJLabel.setText(number);
			}
		});

		// ��ư 4 �̹��� �ִ� JLabel
		JLabel btn4JLabel = new JLabel(sbtn4Icon);
		btn4JLabel.setBounds(60, 330, sbtn4Icon.getIconWidth(), sbtn4Icon.getIconHeight());
		c.add(btn4JLabel);
		btn4JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "4";
				numberJLabel.setText(number);
			}
		});

		// ��ư 5 �̹��� �ִ� JLabel
		JLabel btn5JLabel = new JLabel(sbtn5Icon);
		btn5JLabel.setBounds(190, 330, sbtn5Icon.getIconWidth(), sbtn5Icon.getIconHeight());
		c.add(btn5JLabel);
		btn5JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "5";
				numberJLabel.setText(number);
			}
		});

		// ��ư 6 �̹��� �ִ� JLabel
		JLabel btn6JLabel = new JLabel(sbtn6Icon);
		btn6JLabel.setBounds(320, 330, sbtn6Icon.getIconWidth(), sbtn6Icon.getIconHeight());
		c.add(btn6JLabel);
		btn6JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "6";
				numberJLabel.setText(number);
			}
		});

		// ��ư 7 �̹��� �ִ� JLabel
		JLabel btn7JLabel = new JLabel(sbtn7Icon);
		btn7JLabel.setBounds(60, 410, sbtn7Icon.getIconWidth(), sbtn7Icon.getIconHeight());
		c.add(btn7JLabel);
		btn7JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "7";
				numberJLabel.setText(number);
			}
		});

		// ��ư 8 �̹��� �ִ� JLabel
		JLabel btn8JLabel = new JLabel(sbtn8Icon);
		btn8JLabel.setBounds(190, 410, sbtn8Icon.getIconWidth(), sbtn8Icon.getIconHeight());
		c.add(btn8JLabel);
		btn8JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "8";
				numberJLabel.setText(number);
			}
		});

		// ��ư 9 �̹��� �ִ� JLabel
		JLabel btn9JLabel = new JLabel(sbtn9Icon);
		btn9JLabel.setBounds(320, 410, sbtn9Icon.getIconWidth(), sbtn9Icon.getIconHeight());
		c.add(btn9JLabel);
		btn9JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "9";
				numberJLabel.setText(number);
			}
		});

		// ��ư ��ü ���� �̹��� �ִ� JLabel
		JLabel btnclearallJLabel = new JLabel(sbtnclearallIcon);
		btnclearallJLabel.setBounds(60, 490, sbtnclearallIcon.getIconWidth(), sbtnclearallIcon.getIconHeight());
		c.add(btnclearallJLabel);
		btnclearallJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number = "";
				numberJLabel.setText(number);
			}
		});

		// ��ư 0 �̹��� �ִ� JLabel
		JLabel btn0JLabel = new JLabel(sbtn0Icon);
		btn0JLabel.setBounds(190, 490, sbtn0Icon.getIconWidth(), sbtn0Icon.getIconHeight());
		c.add(btn0JLabel);
		btn0JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				number += "0";
				numberJLabel.setText(number);
			}
		});

		// ��ư ���� �̹��� �ִ� JLabel
		JLabel btnclearlastJLabel = new JLabel(sbtnclearlastIcon);
		btnclearlastJLabel.setBounds(320, 490, sbtnclearlastIcon.getIconWidth(), sbtnclearlastIcon.getIconHeight());
		c.add(btnclearlastJLabel);
		btnclearlastJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				String currentnumber = numberJLabel.getText();
				if (!currentnumber.isEmpty()) {
					currentnumber = currentnumber.substring(0, currentnumber.length() - 1);
				}
				number = currentnumber;
				numberJLabel.setText(number);
			}
		});

		// �������� �ؽ�Ʈ �ִ� JLabel
		JLabel xpointJLabel = new JLabel("��������");
		xpointJLabel.setHorizontalAlignment(JLabel.CENTER);
		xpointJLabel.setBounds(70, 670, 100, 30);
		xpointJLabel.setFont(new Font("Bauhaus", Font.BOLD, 17));
		c.add(xpointJLabel);

		// �������� ��ư �̹��� �ִ� JLabel
		JLabel xpointbuttonJLabel = new JLabel(sxpointIcon);
		xpointbuttonJLabel.setHorizontalAlignment(JLabel.LEFT);
		xpointbuttonJLabel.setBounds(0, 655, sxpointIcon.getIconWidth(), sxpointIcon.getIconHeight());
		c.add(xpointbuttonJLabel);
		xpointbuttonJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				payF = new payframe(); // repair
				dispose();
			}
		});

		// �Է¿Ϸ� �ؽ�Ʈ �ִ� JLabel
		JLabel pointJLabel = new JLabel("�Է� �Ϸ�");
		pointJLabel.setHorizontalAlignment(JLabel.CENTER);
		pointJLabel.setBounds(328, 670, 100, 30);
		pointJLabel.setForeground(Color.white);
		pointJLabel.setFont(new Font("Bauhaus", Font.BOLD, 17));
		c.add(pointJLabel);

		// �Է¿Ϸ� ��ư �̹��� �ִ� JLabel
		JLabel pointbuttonJLabel = new JLabel(spointIcon);
		pointbuttonJLabel.setHorizontalAlignment(JLabel.RIGHT);
		pointbuttonJLabel.setBounds(248, 655, spointIcon.getIconWidth(), spointIcon.getIconHeight());
		c.add(pointbuttonJLabel);
		pointbuttonJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				payF = new payframe();
				number = "";
				numberJLabel.setText(number);
				dispose();
			}
		});

		setSize(520, 750);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
