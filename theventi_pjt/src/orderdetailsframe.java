import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class orderdetailsframe extends JFrame {
	// ������ õ�� ������ ',' �ֱ� ���� �ڵ�
	DecimalFormat formatter = new DecimalFormat("#,###");

	// �� ������ ������ �ݾ��� �����ֱ� ���� ����
	static int tq = 0;
	static String totalquantity = "";
	static int tp = 0;
	static String totalprice = "";
	static String discountprice = "0";
	static String paidprice = discountprice;
	static int pp = 0;
	static String payprice = "";
	
	// mainframe�� Arraylist Order �����ؼ� �ִ� ArrayList
	static ArrayList<String> orderlist = new ArrayList<>();

	public orderdetailsframe(ArrayList<String> Order) {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// �ֹ��� �޴� ������ �ִ� �̹���
		ImageIcon infoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\info.png");
		Image infoImage = infoIcon.getImage();
		Image sinfoImage = infoImage.getScaledInstance(450, 550, Image.SCALE_SMOOTH);
		ImageIcon sinfoIcon = new ImageIcon(sinfoImage);

		// Ȯ�� ��ư �̹���
		ImageIcon checkIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\check.png");
		Image checkImage = checkIcon.getImage();
		Image scheckImage = checkImage.getScaledInstance(230, 45, Image.SCALE_SMOOTH);
		ImageIcon scheckIcon = new ImageIcon(scheckImage);

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(390, 730, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// �ֹ�����Ȯ�� �ؽ�Ʈ ���� JLabel
		JLabel checkOrderJLabel = new JLabel("�ֹ�����Ȯ��");
		checkOrderJLabel.setBounds(10, 10, 200, 30);
		checkOrderJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(checkOrderJLabel);

		// �ֹ�����Ȯ�� â �ݴ� x �ؽ�Ʈ �ִ� JLabel
		JLabel payframecloseJLabel = new JLabel("��");
		payframecloseJLabel.setBounds(460, 5, 40, 40);
		payframecloseJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 60));
		c.add(payframecloseJLabel);
		payframecloseJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				dispose();
				tq = 0;
				tp = 0;
			}
		});

		// ������ ����⸦ �ֱ� ���� �ڵ�
		int rwidth = 485;
		int rheight = 4;
		BufferedImage redBarImage = new BufferedImage(rwidth, rheight, BufferedImage.TYPE_INT_RGB);
		Graphics2D r2d = redBarImage.createGraphics();
		r2d.setColor(Color.RED);
		r2d.fillRect(0, 0, rwidth, rheight);
		r2d.dispose();

		// ������ ����� �̹���
		ImageIcon redBarIcon = new ImageIcon(redBarImage);
		// ������ ����� �̹��� �ִ� JLabel
		JLabel redBarLabel = new JLabel(redBarIcon);
		redBarLabel.setBounds(10, 50, 485, 4);
		c.add(redBarLabel);

		// ������ ����⸦ �ֱ� ���� �ڵ�
		int bwidth = 445;
		int bheight = 3;
		BufferedImage blackBarImage = new BufferedImage(bwidth, bheight, BufferedImage.TYPE_INT_RGB);
		Graphics2D b2d = blackBarImage.createGraphics();
		b2d.setColor(Color.black);
		b2d.fillRect(0, 0, bwidth, bheight);
		b2d.dispose();

		// ������ ����� �̹���
		ImageIcon blackBarIcon = new ImageIcon(blackBarImage);
		// ������ ����� �̹��� �ִ� JLabel
		JLabel blackBarJLabel = new JLabel(blackBarIcon);
		blackBarJLabel.setBounds(32, 99, 445, 3);
		c.add(blackBarJLabel);

		// �ֹ������� Ȯ���� �ּ��� �ؽ�Ʈ �ִ� JLabel
		JLabel checkInfoJLabel = new JLabel("�ֹ������� Ȯ���� �ּ���");
		checkInfoJLabel.setBounds(110, 60, 600, 30);
		checkInfoJLabel.setForeground(Color.RED);
		checkInfoJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 25));
		c.add(checkInfoJLabel);

		// ��ǰ�� �ؽ�Ʈ �ִ� JLabel
		JLabel nameJLabel = new JLabel("��ǰ��");
		nameJLabel.setBounds(40, 105, 100, 30);
		nameJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(nameJLabel);

		// ���� �ؽ�Ʈ �ִ� JLabel
		JLabel quantityJLabel = new JLabel("����");
		quantityJLabel.setBounds(280, 105, 100, 30);
		quantityJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(quantityJLabel);

		// ���� �ؽ�Ʈ �ִ� JLabel
		JLabel priceJLabel = new JLabel("����");
		priceJLabel.setBounds(410, 105, 100, 30);
		priceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(priceJLabel);

		// �޴���, �޴�����, �޴����� ����Ʈ �ִ� JLabel �迭 ����
		JLabel[] menunameJLabel = new JLabel[Order.size()];
		JLabel[] menuquantityJLabel = new JLabel[Order.size()];
		JLabel[] menupriceJLabel = new JLabel[Order.size()];

		// �ֹ��� �޴��� ������ ���� JLabel ���� �� �߰�
		for (int i = 0; i < Order.size(); ++i) {
			String[] str = Order.get(i).split(",");
			int namex = 40, quantityx = 290, pricex = 405;
			int y = 145;
			menunameJLabel[i] = new JLabel(str[1]);
			menunameJLabel[i].setBounds(namex, y + (40 * i), 200, 30);
			menunameJLabel[i].setFont(new Font("Bauhaus", Font.PLAIN, 17));
			menunameJLabel[i].setVisible(true);
			c.add(menunameJLabel[i]);

			menuquantityJLabel[i] = new JLabel(str[4]);
			menuquantityJLabel[i].setBounds(quantityx, y + (40 * i), 200, 30);
			menuquantityJLabel[i].setFont(new Font("Bauhaus", Font.PLAIN, 17));
			menuquantityJLabel[i].setVisible(true);
			c.add(menuquantityJLabel[i]);
			tq += Integer.parseInt(str[4]);
			totalquantity = Integer.toString(tq);
			
			orderlist.add(str[1] + "," + str[4]);

			menupriceJLabel[i] = new JLabel(formatter.format((Integer.parseInt(str[3]) * (Integer.parseInt(str[4])))));
			menupriceJLabel[i].setBounds(pricex, y + (40 * i), 200, 30);
			menupriceJLabel[i].setFont(new Font("Bauhaus", Font.PLAIN, 17));
			menupriceJLabel[i].setVisible(true);
			c.add(menupriceJLabel[i]);
			tp += (Integer.parseInt(str[3]) * Integer.parseInt(str[4]));
			totalprice = Integer.toString(tp);
		}

		// �� ���� �ؽ�Ʈ �ִ� JLabel
		JLabel orderquantityJLabel = new JLabel("�� ����");
		orderquantityJLabel.setBounds(40, 493, 100, 30);
		orderquantityJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(orderquantityJLabel);

		// �� ���� �� �ִ� JLabel
		JLabel totalquantityJLabel = new JLabel(totalquantity);
		totalquantityJLabel.setBounds(165, 493, 50, 30);
		totalquantityJLabel.setHorizontalAlignment(JLabel.RIGHT);
		totalquantityJLabel.setForeground(Color.red);
		totalquantityJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(totalquantityJLabel);

		// ?�� �ؽ�Ʈ �ִ� JLabel
		JLabel gaeJLabel = new JLabel("��");
		gaeJLabel.setBounds(220, 493, 100, 30);
		gaeJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(gaeJLabel);

		// �ֹ��ݾ� �ؽ�Ʈ �ִ� JLabel
		JLabel orderpriceJLabel = new JLabel("�ֹ��ݾ�");
		orderpriceJLabel.setBounds(260, 493, 100, 30);
		orderpriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(orderpriceJLabel);

		// �� �ֹ��ݾ� �ִ� JLabel
		JLabel totalpriceJLabel = new JLabel(formatter.format(Integer.parseInt(totalprice)));
		totalpriceJLabel.setBounds(370, 493, 80, 30);
		totalpriceJLabel.setHorizontalAlignment(JLabel.RIGHT);
		totalpriceJLabel.setForeground(Color.red);
		totalpriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(totalpriceJLabel);

		// ?�� �ؽ�Ʈ �ִ� JLabel
		JLabel won1JLabel = new JLabel("��");
		won1JLabel.setBounds(450, 493, 100, 30);
		won1JLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(won1JLabel);

		// ���αݾ� �ؽ�Ʈ �ִ� JLabel
		JLabel discountpriceJLabel = new JLabel("���αݾ�");
		discountpriceJLabel.setBounds(40, 565, 100, 30);
		discountpriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(discountpriceJLabel);

		// �� �ֹ��ݾ� �ִ� JLabel
		JLabel discountJLabel = new JLabel(discountprice);
		discountJLabel.setBounds(165, 565, 50, 30);
		discountJLabel.setHorizontalAlignment(JLabel.RIGHT);
		discountJLabel.setForeground(Color.red);
		discountJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(discountJLabel);

		// ?�� �ؽ�Ʈ �ִ� JLabel
		JLabel won2JLabel = new JLabel("��");
		won2JLabel.setBounds(220, 565, 100, 30);
		won2JLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(won2JLabel);

		// ������ �ݾ� �ؽ�Ʈ �ִ� JLabel
		JLabel paidpriceJLabel = new JLabel("������ �ݾ�");
		paidpriceJLabel.setBounds(260, 565, 100, 30);
		paidpriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(paidpriceJLabel);

		// ������ �ݾ� �ִ� JLabel
		JLabel paidJLabel = new JLabel(paidprice);
		paidJLabel.setBounds(370, 565, 80, 30);
		paidJLabel.setHorizontalAlignment(JLabel.RIGHT);
		paidJLabel.setForeground(Color.red);
		paidJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(paidJLabel);

		// ?�� �ؽ�Ʈ �ִ� JLabel
		JLabel won3JLabel = new JLabel("��");
		won3JLabel.setBounds(450, 565, 100, 30);
		won3JLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(won3JLabel);

		// ������ �ݾ� �ؽ�Ʈ �ִ� JLabel
		JLabel paypriceJLabel = new JLabel("������ �ݾ�");
		paypriceJLabel.setBounds(260, 610, 100, 30);
		paypriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(paypriceJLabel);

		// ������ �ݾ� �ִ� JLabel
		JLabel payJLabel = new JLabel(
				formatter.format((Integer.parseInt(totalprice)) - (Integer.parseInt(discountprice))));
		payJLabel.setBounds(370, 610, 80, 30);
		payJLabel.setHorizontalAlignment(JLabel.RIGHT);
		payJLabel.setForeground(Color.red);
		payJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(payJLabel);

		// ?�� �ؽ�Ʈ �ִ� JLabel
		JLabel won4JLabel = new JLabel("��");
		won4JLabel.setBounds(450, 610, 100, 30);
		won4JLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(won4JLabel);

		// �ֹ��� �޴� ������ �ִ� �̹����� �ִ� JLabel
		JLabel infoJLabel = new JLabel(sinfoIcon);
		infoJLabel.setBounds(30, 100, sinfoIcon.getIconWidth(), sinfoIcon.getIconHeight());
		c.add(infoJLabel);

		// Ȯ�� ��ư �̹��� ���� Ȯ�� �ؽ�Ʈ �ִ� JLabel
		JLabel tcheckJLabel = new JLabel("Ȯ��");
		tcheckJLabel.setBounds(235, 665, 200, 30);
		tcheckJLabel.setForeground(Color.white);
		tcheckJLabel.setFont(new Font("Bauhaus", Font.BOLD, 18));
		c.add(tcheckJLabel);

		// Ȯ�� ��ư �̹��� �ִ� JLabel
		JLabel checkJLabel = new JLabel(scheckIcon);
		checkJLabel.setBounds(140, 660, scheckIcon.getIconWidth(), scheckIcon.getIconHeight());
		c.add(checkJLabel);
		checkJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new membershipframe();
				dispose();
				tq = 0;
				tp = 0;
			}
		});

		setSize(520, 800);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
