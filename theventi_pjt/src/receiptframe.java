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

	// 현재 날짜 가져오기
	static LocalDateTime currentDate = LocalDateTime.now();
	static String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

	static int OrderNumber;

	public receiptframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 예 이미지
		ImageIcon yesIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\yes.png");
		Image yesImage = yesIcon.getImage();
		Image syesImage = yesImage.getScaledInstance(170, 40, Image.SCALE_SMOOTH);
		ImageIcon syesIcon = new ImageIcon(syesImage);

		// 아니오 이미지
		ImageIcon noIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\no.png");
		Image noImage = noIcon.getImage();
		Image snoImage = noImage.getScaledInstance(170, 40, Image.SCALE_SMOOTH);
		ImageIcon snoIcon = new ImageIcon(snoImage);

		// MADE BY. 김성건 텍스트 넣는 JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. 김성건");
		ksgJLabel.setBounds(330, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// 영수증 출력 여부 물어보는 JLabel
		JLabel receiptJLabel = new JLabel("영수증 출력을 하시겠습니까?");
		receiptJLabel.setBounds(90, 60, 400, 30);
		receiptJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(receiptJLabel);

		// 예 텍스트 넣는 JLabel
		JLabel tyesJLabel = new JLabel("예");
		tyesJLabel.setBounds(115, 170, 50, 20);
		tyesJLabel.setForeground(Color.white);
		tyesJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(tyesJLabel);

		// 예 이미지 넣는 JLabel
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
				mainframe.paymentJLabel.setText("<html><body><center>총 " + mainframe.basket + "개 상품<br>"
						+ mainframe.formatter.format(mainframe.payment) + "원 결제하기</center></body></html>");
				mainframe.Order.clear();
				new receiptingframe();
			}
		});

		// 아니오 텍스트 넣는 JLabel
		JLabel tnoJLabel = new JLabel("아니오");
		tnoJLabel.setBounds(275, 170, 100, 20);
		tnoJLabel.setForeground(Color.red);
		tnoJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(tnoJLabel);

		// 아니오 이미지 넣는 JLabel
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
				mainframe.paymentJLabel.setText("<html><body><center>총 " + mainframe.basket + "개 상품<br>"
						+ mainframe.formatter.format(mainframe.payment) + "원 결제하기</center></body></html>");
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
			// JDBC 드라이버 코드
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			// order_num 생성 로직 (제일 마지막에 있는 order_num보다 1 큰 값 생성)
			String getOrderNumSQL = "SELECT order_num FROM orderlist ORDER BY order_num DESC LIMIT 1";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(getOrderNumSQL);

			int newOrderNumber = 1; // 기본값
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

				// 먼저 orderlist 테이블에 새로운 order_num 삽입
				String insertOrderNumSQL = "INSERT INTO orderlist (order_num, order_price) VALUES ('" + newOrderNum + "', " + orderdetailsframe.totalprice + ")";
				System.out.println("error2 : " + insertOrderNumSQL);
				statement.executeUpdate(insertOrderNumSQL);

				// 주문 항목들을 orderdetail 테이블에 저장
				for (int i = 0; i < orderdetailsframe.orderlist.size(); ++i) {
					String[] str = orderdetailsframe.orderlist.get(i).split(",");

					String orderName = str[0];
					String orderQuantity = str[1];

					// orderdetail 테이블에 데이터 삽입
					String insertSQL = "INSERT INTO orderdetail (order_num, order_name, order_quantity) VALUES ('"
							+ newOrderNum + "', '" + orderName + "', " + orderQuantity + ")";
					System.out.println("error : " + insertSQL);
					statement.executeUpdate(insertSQL);
				}

				System.out.println("새로운 주문번호: " + newOrderNum + "이 데이터베이스에 저장되었습니다.");

			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 또는 쿼리 실행 중 오류가 발생했습니다.");
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
