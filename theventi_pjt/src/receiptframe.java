import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class receiptframe extends JFrame {

	// ���� ��¥ ��������
	static LocalDateTime currentDate = LocalDateTime.now();
	static String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

	static int OrderNumber;

	public receiptframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// �� �̹���
		ImageIcon yesIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\yes.png");
		Image yesImage = yesIcon.getImage();
		Image syesImage = yesImage.getScaledInstance(170, 40, Image.SCALE_SMOOTH);
		ImageIcon syesIcon = new ImageIcon(syesImage);

		// �ƴϿ� �̹���
		ImageIcon noIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\no.png");
		Image noImage = noIcon.getImage();
		Image snoImage = noImage.getScaledInstance(170, 40, Image.SCALE_SMOOTH);
		ImageIcon snoIcon = new ImageIcon(snoImage);

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(330, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// ������ ��� ���� ����� JLabel
		JLabel receiptJLabel = new JLabel("������ ����� �Ͻðڽ��ϱ�?");
		receiptJLabel.setBounds(90, 60, 400, 30);
		receiptJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(receiptJLabel);

		// �� �ؽ�Ʈ �ִ� JLabel
		JLabel tyesJLabel = new JLabel("��");
		tyesJLabel.setBounds(115, 170, 50, 20);
		tyesJLabel.setForeground(Color.white);
		tyesJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(tyesJLabel);

		// �� �̹��� �ִ� JLabel
		JLabel yesJLabel = new JLabel(syesIcon);
		yesJLabel.setBounds(40, 160, syesIcon.getIconWidth(), syesIcon.getIconHeight());
		c.add(yesJLabel);
		yesJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				membershipframe.payF.dispose();
				if (payframe.gift != null) {
					payframe.gift.dispose();
				}
				if (payframe.credit != null) {
					payframe.credit.dispose();
				}
				if (payframe.appl != null) {
					payframe.appl.dispose();
				}
				if (payframe.sam != null) {
					payframe.sam.dispose();
				}
				if (payframe.naver != null) {
					payframe.naver.dispose();
				}
				if (payframe.co != null) {
					payframe.co.dispose();
				}
				if (payframe.kakao != null) {
					payframe.kakao.dispose();
				}
				dispose();
				mainframe.remove1JLabel.setVisible(false);
				mainframe.chosemenu1imageJLabel.setVisible(false);
				mainframe.chosemenu1nameJLabel.setVisible(false);
				mainframe.chosemenu1optionJLabel.setVisible(false);
				mainframe.chosemenu1priceJLabel.setVisible(false);
				mainframe.chosemenu1quantityJLabel.setVisible(false);
				mainframe.minus1JLabel.setVisible(false);
				mainframe.plus1JLabel.setVisible(false);
				mainframe.remove2JLabel.setVisible(false);
				mainframe.chosemenu2imageJLabel.setVisible(false);
				mainframe.chosemenu2nameJLabel.setVisible(false);
				mainframe.chosemenu2optionJLabel.setVisible(false);
				mainframe.chosemenu2priceJLabel.setVisible(false);
				mainframe.chosemenu2quantityJLabel.setVisible(false);
				mainframe.minus2JLabel.setVisible(false);
				mainframe.plus2JLabel.setVisible(false);
				mainframe.downJLabel.setVisible(false);
				mainframe.upJLabel.setVisible(false);
				mainframe.basket = 0;
				mainframe.basketJLabel.setText(Integer.toString(mainframe.basket));
				mainframe.payment = 0;
				mainframe.paymentJLabel.setText("<html><body><center>�� " + mainframe.basket + "�� ��ǰ<br>"
						+ mainframe.formatter.format(mainframe.payment) + "�� �����ϱ�</center></body></html>");
				mainframe.Order.clear();
				new receiptingframe();
			}
		});

		// �ƴϿ� �ؽ�Ʈ �ִ� JLabel
		JLabel tnoJLabel = new JLabel("�ƴϿ�");
		tnoJLabel.setBounds(275, 170, 100, 20);
		tnoJLabel.setForeground(Color.red);
		tnoJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(tnoJLabel);

		// �ƴϿ� �̹��� �ִ� JLabel
		JLabel noJLabel = new JLabel(snoIcon);
		noJLabel.setBounds(220, 160, snoIcon.getIconWidth(), snoIcon.getIconHeight());
		c.add(noJLabel);
		noJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				membershipframe.payF.dispose();
				if (payframe.gift != null) {
					payframe.gift.dispose();
				}
				if (payframe.credit != null) {
					payframe.credit.dispose();
				}
				if (payframe.appl != null) {
					payframe.appl.dispose();
				}
				if (payframe.sam != null) {
					payframe.sam.dispose();
				}
				if (payframe.naver != null) {
					payframe.naver.dispose();
				}
				if (payframe.co != null) {
					payframe.co.dispose();
				}
				if (payframe.kakao != null) {
					payframe.kakao.dispose();
				}
				dispose();
				mainframe.remove1JLabel.setVisible(false);
				mainframe.chosemenu1imageJLabel.setVisible(false);
				mainframe.chosemenu1nameJLabel.setVisible(false);
				mainframe.chosemenu1optionJLabel.setVisible(false);
				mainframe.chosemenu1priceJLabel.setVisible(false);
				mainframe.chosemenu1quantityJLabel.setVisible(false);
				mainframe.minus1JLabel.setVisible(false);
				mainframe.plus1JLabel.setVisible(false);
				mainframe.remove2JLabel.setVisible(false);
				mainframe.chosemenu2imageJLabel.setVisible(false);
				mainframe.chosemenu2nameJLabel.setVisible(false);
				mainframe.chosemenu2optionJLabel.setVisible(false);
				mainframe.chosemenu2priceJLabel.setVisible(false);
				mainframe.chosemenu2quantityJLabel.setVisible(false);
				mainframe.minus2JLabel.setVisible(false);
				mainframe.plus2JLabel.setVisible(false);
				mainframe.downJLabel.setVisible(false);
				mainframe.upJLabel.setVisible(false);
				mainframe.basket = 0;
				mainframe.basketJLabel.setText(Integer.toString(mainframe.basket));
				mainframe.payment = 0;
				mainframe.paymentJLabel.setText("<html><body><center>�� " + mainframe.basket + "�� ��ǰ<br>"
						+ mainframe.formatter.format(mainframe.payment) + "�� �����ϱ�</center></body></html>");
				mainframe.Order.clear();
				insertdata();
				new ordernumberframe();
			}
		});

		setSize(450, 280);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void insertdata() {
		String url = "jdbc:mysql://localhost:3306/theventi";
		String user = "root";
		String password = "1234";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// JDBC ����̹� �ڵ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			// order_num ���� ���� (���� �������� �ִ� order_num���� 1 ū �� ����)
			String getOrderNumSQL = "SELECT order_num FROM orderlist ORDER BY order_num DESC LIMIT 1";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(getOrderNumSQL);

			int newOrderNumber = 1; // �⺻��
			if (resultSet.next()) {
				String lastOrderNum = resultSet.getString("order_num");
				System.out.println("error3 : " + lastOrderNum);
				String[] parts = lastOrderNum.split(",");
				parts[1] = parts[1].replaceAll("\\s+", "");
				int lastOrderNumber = Integer.parseInt(parts[1]);

				String newOrderNum = "";
				
				if (parts[0].equals(formattedDate)) {
					newOrderNumber = lastOrderNumber + 1;
					newOrderNum = formattedDate + "," + newOrderNumber;
					OrderNumber = newOrderNumber;
				} else {
					newOrderNumber = 1;
					newOrderNum = formattedDate + "," + newOrderNumber;
					OrderNumber = newOrderNumber;
				}

				System.out.println("error1 : " + newOrderNum);

				// ���� orderlist ���̺� ���ο� order_num ����
				String insertOrderNumSQL = "INSERT INTO orderlist (order_num, order_price) VALUES ('" + newOrderNum + "', " + orderdetailsframe.totalprice + ")";
				System.out.println("error2 : " + insertOrderNumSQL);
				statement.executeUpdate(insertOrderNumSQL);

				// �ֹ� �׸���� orderdetail ���̺� ����
				for (int i = 0; i < orderdetailsframe.orderlist.size(); ++i) {
					String[] str = orderdetailsframe.orderlist.get(i).split(",");

					String orderName = str[0];
					String orderQuantity = str[1];

					// orderdetail ���̺� ������ ����
					String insertSQL = "INSERT INTO orderdetail (order_num, order_name, order_quantity) VALUES ('"
							+ newOrderNum + "', '" + orderName + "', " + orderQuantity + ")";
					System.out.println("error : " + insertSQL);
					statement.executeUpdate(insertSQL);
				}

				System.out.println("���ο� �ֹ���ȣ: " + newOrderNum + "�� �����ͺ��̽��� ����Ǿ����ϴ�.");

			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� �� �����ϴ�.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� �Ǵ� ���� ���� �� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
