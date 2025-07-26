import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class payframe extends JFrame {

	// 가격을 천원 단위로 ',' 넣기 위한 코드
	DecimalFormat formatter = new DecimalFormat("#,###");

	static giftcardframe gift = null;
	static creditcardframe credit = null;
	static applepayframe appl = null;
	static samsungpayframe sam = null;
	static naverpayframe naver = null;
	static paycoframe co = null;
	static kakaopayframe kakao = null;

	public payframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 모바일상품권 이미지
		ImageIcon giftcardIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\giftcard.png");
		Image giftcardImage = giftcardIcon.getImage();
		Image sgiftcardImage = giftcardImage.getScaledInstance(140, 90, Image.SCALE_SMOOTH);
		ImageIcon sgiftcardIcon = new ImageIcon(sgiftcardImage);

		// 신용카드 이미지
		ImageIcon creditcardIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\creditcard.png");
		Image creditcardImage = creditcardIcon.getImage();
		Image screditcardImage = creditcardImage.getScaledInstance(140, 90, Image.SCALE_SMOOTH);
		ImageIcon screditcardIcon = new ImageIcon(screditcardImage);

		// 애플페이 이미지
		ImageIcon applepayIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\applepay.png");
		Image applepayImage = applepayIcon.getImage();
		Image sapplepayImage = applepayImage.getScaledInstance(140, 90, Image.SCALE_SMOOTH);
		ImageIcon sapplepayIcon = new ImageIcon(sapplepayImage);

		// 삼성페이 이미지
		ImageIcon samsungpayIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\samsungpay.png");
		Image samsungpayImage = samsungpayIcon.getImage();
		Image ssamsungpayImage = samsungpayImage.getScaledInstance(140, 90, Image.SCALE_SMOOTH);
		ImageIcon ssamsungpayIcon = new ImageIcon(ssamsungpayImage);

		// 네이버페이 이미지
		ImageIcon naverpayIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\naverpay.png");
		Image naverpayImage = naverpayIcon.getImage();
		Image snaverpayImage = naverpayImage.getScaledInstance(140, 90, Image.SCALE_SMOOTH);
		ImageIcon snaverpayIcon = new ImageIcon(snaverpayImage);

		// 페이코 이미지
		ImageIcon paycoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\payco.png");
		Image paycoImage = paycoIcon.getImage();
		Image spaycoImage = paycoImage.getScaledInstance(140, 90, Image.SCALE_SMOOTH);
		ImageIcon spaycoIcon = new ImageIcon(spaycoImage);

		// 카카오페이 이미지
		ImageIcon kakaopayIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\kakaopay.png");
		Image kakaopayImage = kakaopayIcon.getImage();
		Image skakaopayImage = kakaopayImage.getScaledInstance(140, 90, Image.SCALE_SMOOTH);
		ImageIcon skakaopayIcon = new ImageIcon(skakaopayImage);

		// 주문 금액 및 결제 금액 정보 넣는 이미지
		ImageIcon infoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\information.png");
		Image infoImage = infoIcon.getImage();
		Image sinfoImage = infoImage.getScaledInstance(440, 200, Image.SCALE_SMOOTH);
		ImageIcon sinfoIcon = new ImageIcon(sinfoImage);

		// MADE BY. 김성건 텍스트 넣는 JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. 김성건");
		ksgJLabel.setBounds(390, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// 모바일상품권 이미지 넣는 JLabel
		JLabel giftcardJLabel = new JLabel(sgiftcardIcon);
		giftcardJLabel.setBounds(40, 30, sgiftcardIcon.getIconWidth(), sgiftcardIcon.getIconHeight());
		c.add(giftcardJLabel);
		giftcardJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				gift = new giftcardframe();
			}
		});

		// 신용카드 이미지 넣는 JLabel
		JLabel creditcardJLabel = new JLabel(screditcardIcon);
		creditcardJLabel.setBounds(40, 130, screditcardIcon.getIconWidth(), screditcardIcon.getIconHeight());
		c.add(creditcardJLabel);
		creditcardJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				credit = new creditcardframe();
			}
		});

		// 애플페이 이미지 넣는 JLabel
		JLabel applepayJLabel = new JLabel(sapplepayIcon);
		applepayJLabel.setBounds(40, 230, sapplepayIcon.getIconWidth(), sapplepayIcon.getIconHeight());
		c.add(applepayJLabel);
		applepayJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				appl = new applepayframe();
			}
		});

		// 삼성페이 이미지 넣는 JLabel
		JLabel samsungpayJLabel = new JLabel(ssamsungpayIcon);
		samsungpayJLabel.setBounds(190, 230, ssamsungpayIcon.getIconWidth(), ssamsungpayIcon.getIconHeight());
		c.add(samsungpayJLabel);
		samsungpayJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sam = new samsungpayframe();
			}
		});

		// 네이버페이 이미지 넣는 JLabel
		JLabel naverpayJLabel = new JLabel(snaverpayIcon);
		naverpayJLabel.setBounds(340, 230, snaverpayIcon.getIconWidth(), snaverpayIcon.getIconHeight());
		c.add(naverpayJLabel);
		naverpayJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				naver = new naverpayframe();
			}
		});

		// 페이코 이미지 넣는 JLabel
		JLabel paycoJLabel = new JLabel(spaycoIcon);
		paycoJLabel.setBounds(40, 330, spaycoIcon.getIconWidth(), spaycoIcon.getIconHeight());
		c.add(paycoJLabel);
		paycoJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				co = new paycoframe();
			}
		});

		// 카카오페이 이미지 넣는 JLabel
		JLabel kakaopayJLabel = new JLabel(skakaopayIcon);
		kakaopayJLabel.setBounds(190, 330, skakaopayIcon.getIconWidth(), skakaopayIcon.getIconHeight());
		c.add(kakaopayJLabel);
		kakaopayJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				kakao = new kakaopayframe();
			}
		});

		// 주문금액 텍스트 넣는 JLabel
		JLabel orderpriceJLabel = new JLabel("주문금액");
		orderpriceJLabel.setBounds(60, 440, 100, 30);
		orderpriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(orderpriceJLabel);

		// 총 주문금액 넣는 JLabel
		JLabel totalpriceJLabel = new JLabel(formatter.format(Integer.parseInt(orderdetailsframe.totalprice)));
		totalpriceJLabel.setBounds(360, 440, 80, 30);
		totalpriceJLabel.setHorizontalAlignment(JLabel.RIGHT);
		totalpriceJLabel.setForeground(Color.red);
		totalpriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(totalpriceJLabel);

		// ?원 텍스트 넣는 JLabel
		JLabel won1JLabel = new JLabel("원");
		won1JLabel.setBounds(440, 440, 100, 30);
		won1JLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(won1JLabel);

		// 할인금액 텍스트 넣는 JLabel
		JLabel discountpriceJLabel = new JLabel("할인금액");
		discountpriceJLabel.setBounds(60, 490, 100, 30);
		discountpriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(discountpriceJLabel);

		// 할인금액 넣는 JLabel
		JLabel discountJLabel = new JLabel(orderdetailsframe.discountprice);
		discountJLabel.setBounds(360, 490, 80, 30);
		discountJLabel.setHorizontalAlignment(JLabel.RIGHT);
		discountJLabel.setForeground(Color.red);
		discountJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(discountJLabel);

		// ?원 텍스트 넣는 JLabel
		JLabel won2JLabel = new JLabel("원");
		won2JLabel.setBounds(440, 490, 100, 30);
		won2JLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(won2JLabel);

		// 결제한 금액 텍스트 넣는 JLabel
		JLabel paidpriceJLabel = new JLabel("결제한 금액");
		paidpriceJLabel.setBounds(60, 540, 100, 30);
		paidpriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(paidpriceJLabel);

		// 결제한 금액 넣는 JLabel
		JLabel paidJLabel = new JLabel(orderdetailsframe.paidprice);
		paidJLabel.setBounds(360, 540, 80, 30);
		paidJLabel.setHorizontalAlignment(JLabel.RIGHT);
		paidJLabel.setForeground(Color.red);
		paidJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(paidJLabel);

		// ?원 텍스트 넣는 JLabel
		JLabel won3JLabel = new JLabel("원");
		won3JLabel.setBounds(440, 540, 100, 30);
		won3JLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(won3JLabel);

		// 결제할 금액 텍스트 넣는 JLabel
		JLabel paypriceJLabel = new JLabel("결제할 금액");
		paypriceJLabel.setBounds(60, 590, 100, 30);
		paypriceJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(paypriceJLabel);

		// 결제할 금액 넣는 JLabel
		JLabel payJLabel = new JLabel(formatter.format((Integer.parseInt(orderdetailsframe.totalprice))
				- (Integer.parseInt(orderdetailsframe.discountprice))));
		payJLabel.setBounds(360, 590, 80, 30);
		payJLabel.setHorizontalAlignment(JLabel.RIGHT);
		payJLabel.setForeground(Color.red);
		payJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(payJLabel);

		// ?원 텍스트 넣는 JLabel
		JLabel won4JLabel = new JLabel("원");
		won4JLabel.setBounds(440, 590, 100, 30);
		won4JLabel.setFont(new Font("Bauhaus", Font.PLAIN, 17));
		c.add(won4JLabel);

		// 주문 금액 및 결제 금액 정보 넣는 이미지 넣는 JLabel
		JLabel infoJLabel = new JLabel(sinfoIcon);
		infoJLabel.setBounds(40, 430, sinfoIcon.getIconWidth(), sinfoIcon.getIconHeight());
		c.add(infoJLabel);

		setSize(520, 750);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
