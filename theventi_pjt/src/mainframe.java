import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.BreakIterator;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class mainframe extends JFrame {
	// 주문목록을 넣는 ArrayList
	static ArrayList<String> Order = new ArrayList<>();
	
	// ordernumberframe에서 주문번호를 보여주기 위한 번호
	static int ordernumber = 1;

	// 상단에 있는 메뉴 항목 구분 번호
	static int sortnum = 1;
	// 페이지 구분 번호
	static int pagenum = 1;
	// 메뉴 구분 번호
	static int menunum;

	// 가격을 세자리 간격으로 ',' 넣기 위한 코드
	static DecimalFormat formatter = new DecimalFormat("#,###");
	// 장바구니 개수
	static int basket = 0;
	static public JLabel basketJLabel;
	// 총 결제금액
	static int payment;
	static public JLabel paymentJLabel;

	// 주문한 1번째 메뉴 삭제 버튼 이미지 넣는 JLabel
	static public JLabel remove1JLabel;
	// 주문한 2번째 메뉴 삭제 버튼 이미지 넣는 JLabel
	static public JLabel remove2JLabel;

	// 선택한 1번쨰 메뉴 이미지 넣는 JLabel
	static public JLabel chosemenu1imageJLabel;
	// 선택한 2번째 메뉴 이미지 넣는 JLabel
	static public JLabel chosemenu2imageJLabel;

	// 선택한 1번째 메뉴 이름 넣는 JLabel
	static public JLabel chosemenu1nameJLabel;
	// 선택한 2번째 메뉴 이름 넣는 JLabel
	static public JLabel chosemenu2nameJLabel;

	// 선택한 1번째 메뉴 옵션 넣는 JLabel
	static public JLabel chosemenu1optionJLabel;
	// 선택한 2번째 메뉴 옵션 넣는 JLabel
	static public JLabel chosemenu2optionJLabel;

	// 선택한 1번째 메뉴 가격 넣는 JLabel
	static public JLabel chosemenu1priceJLabel;
	// 선택한 2번째 메뉴 가격 넣는 JLabel
	static public JLabel chosemenu2priceJLabel;

	// 1번째 메뉴 수량 빼는 이미지 넣는 JLabel
	static public JLabel minus1JLabel;
	// 2번째 메뉴 수량 빼는 이미지 넣는 JLabel
	static public JLabel minus2JLabel;

	// 1번째 메뉴 수량 넣는 JLabel
	static public JLabel chosemenu1quantityJLabel;
	// 2번째 메뉴 수량 넣는 JLabel
	static public JLabel chosemenu2quantityJLabel;

	// 1번째 메뉴 수량
	static public int menu1quantity;
	// 2번째 메뉴 수량
	static public int menu2quantity;

	// 1번째 메뉴 수량 더하는 이미지 넣는 JLabel
	static public JLabel plus1JLabel;
	// 2번째 메뉴 수량 더하는 이미지 넣는 JLabel
	static public JLabel plus2JLabel;

	// 메뉴 페이지 올리는 이미지 넣는 JLabel
	static public JLabel upJLabel;
	// 메뉴 페이지 내리는 이미지 넣는 JLabel
	static public JLabel downJLabel;

	// ArrayList Order에 있는 String형 내용을 ","을 기준으로 split해서 저장하는 String형 배열
	static String[] str;
	static String[] str1;
	static String[] str2;

	// 페이지 넘길 때 필요한 index
	static int upindex = 0;
	static int downindex = upindex + 1;

	// 메뉴 페이지 올리는 이미지 ↑
	static ImageIcon upIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\up.png");
	static Image upImage = upIcon.getImage();
	static Image supImage = upImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	static ImageIcon supIcon = new ImageIcon(supImage);

	// 메뉴 페이지 올리는 선택된 이미지 ↑
	static ImageIcon tupIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\tup.png");
	static Image tupImage = tupIcon.getImage();
	static Image stupImage = tupImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	static ImageIcon stupIcon = new ImageIcon(stupImage);

	// 메뉴 페이지 내리는 이미지 ↓
	static ImageIcon downIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\down.png");
	static Image downImage = downIcon.getImage();
	static Image sdownImage = downImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	static ImageIcon sdownIcon = new ImageIcon(sdownImage);

	// 메뉴 페이지 내리는 선택된 이미지 ↓
	static ImageIcon tdownIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\tdown.png");
	static Image tdownImage = tdownIcon.getImage();
	static Image stdownImage = tdownImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	static ImageIcon stdownIcon = new ImageIcon(stdownImage);

	static public void optionFrameDisposed() {
		if (optionframe.order == true) {
			basketJLabel.setText(Integer.toString(basket));
			paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
					+ "원 결제하기</center></body></html>");
			remove1JLabel.setVisible(true);
			str1 = Order.get(upindex).split(",");
			new chosemenuimage(str1[0]);
			chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
			chosemenu1imageJLabel.setVisible(true);
			chosemenu1nameJLabel.setText(str1[1]);
			chosemenu1nameJLabel.setVisible(true);
			chosemenu1optionJLabel.setText(str1[2]);
			chosemenu1optionJLabel.setVisible(true);
			chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
			chosemenu1priceJLabel.setVisible(true);
			chosemenu1quantityJLabel.setText(str1[4]);
			chosemenu1quantityJLabel.setVisible(true);
			minus1JLabel.setVisible(true);
			plus1JLabel.setVisible(true);
			if (Order.size() >= 2) {
				remove2JLabel.setVisible(true);
				str2 = Order.get(downindex).split(",");
				new chosemenuimage(str2[0]);
				chosemenu2imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
				chosemenu2imageJLabel.setVisible(true);
				chosemenu2nameJLabel.setText(str2[1]);
				chosemenu2nameJLabel.setVisible(true);
				chosemenu2optionJLabel.setText(str2[2]);
				chosemenu2optionJLabel.setVisible(true);
				chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "원");
				chosemenu2priceJLabel.setVisible(true);
				chosemenu2quantityJLabel.setText(str2[4]);
				chosemenu2quantityJLabel.setVisible(true);
				minus2JLabel.setVisible(true);
				plus2JLabel.setVisible(true);
			}
			// ArrayList Order의 사이즈에 따라 upJLabel과 downJLabel 설정
			if (Order.size() > 2) {
				upJLabel.setVisible(true);
				downJLabel.setVisible(true);
			} else {
				upJLabel.setVisible(false);
				downJLabel.setVisible(false);
			}
		}
		optionframe.order = false;
	}

	public mainframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// 홈 버튼 이미지
		ImageIcon homeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\home.png");
		Image homeImage = homeIcon.getImage();
		Image shomeImage = homeImage.getScaledInstance(150, 50, Image.SCALE_SMOOTH);
		ImageIcon shomeIcon = new ImageIcon(shomeImage);

		// 로고 이미지
		ImageIcon logoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\logo.png");
		Image logoImage = logoIcon.getImage();
		Image slogoImage = logoImage.getScaledInstance(410, 50, Image.SCALE_SMOOTH);
		ImageIcon slogoIcon = new ImageIcon(slogoImage);

		// 커피(아이스) 항목 이미지
		ImageIcon icecoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\icecoffee.png");
		Image icecoffeeImage = icecoffeeIcon.getImage();
		Image sicecoffeeImage = icecoffeeImage.getScaledInstance(145, 50, Image.SCALE_SMOOTH);
		ImageIcon sicecoffeeIcon = new ImageIcon(sicecoffeeImage);

		// 커피(아이스) 항목 선택된 이미지
		ImageIcon ticecoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\ticecoffee.png");
		Image ticecoffeeImage = ticecoffeeIcon.getImage();
		Image sticecoffeeImage = ticecoffeeImage.getScaledInstance(145, 50, Image.SCALE_SMOOTH);
		ImageIcon sticecoffeeIcon = new ImageIcon(sticecoffeeImage);

		// 커피(핫) 항목 이미지
		ImageIcon hotcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\hotcoffee.png");
		Image hotcoffeeImage = hotcoffeeIcon.getImage();
		Image shotcoffeeImage = hotcoffeeImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon shotcoffeeIcon = new ImageIcon(shotcoffeeImage);

		// 커피(핫) 항목 선택된 이미지
		ImageIcon thotcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\thotcoffee.png");
		Image thotcoffeeImage = thotcoffeeIcon.getImage();
		Image sthotcoffeeImage = thotcoffeeImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sthotcoffeeIcon = new ImageIcon(sthotcoffeeImage);

		// 베버리지 항목 이미지
		ImageIcon beverageIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\beverage.png");
		Image beverageImage = beverageIcon.getImage();
		Image sbeverageImage = beverageImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sbeverageIcon = new ImageIcon(sbeverageImage);

		// 베버리지 항목 선택된 이미지
		ImageIcon tbeverageIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\tbeverage.png");
		Image tbeverageImage = tbeverageIcon.getImage();
		Image stbeverageImage = tbeverageImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon stbeverageIcon = new ImageIcon(stbeverageImage);

		// 아이스 블렌디드 항목 이미지
		ImageIcon iceblendedIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\iceblended.png");
		Image iceblendedImage = iceblendedIcon.getImage();
		Image siceblendedImage = iceblendedImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon siceblendedIcon = new ImageIcon(siceblendedImage);

		// 아이스 블렌디드 항목 선택된 이미지
		ImageIcon ticeblendedIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\ticeblended.png");
		Image ticeblendedImage = ticeblendedIcon.getImage();
		Image sticeblendedImage = ticeblendedImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sticeblendedIcon = new ImageIcon(sticeblendedImage);

		// 버블티/티 항목 이미지
		ImageIcon teaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\tea.png");
		Image teaImage = teaIcon.getImage();
		Image steaImage = teaImage.getScaledInstance(145, 50, Image.SCALE_SMOOTH);
		ImageIcon steaIcon = new ImageIcon(steaImage);

		// 버블티/티 항목 선택된 이미지
		ImageIcon tteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\ttea.png");
		Image tteaImage = tteaIcon.getImage();
		Image stteaImage = tteaImage.getScaledInstance(145, 50, Image.SCALE_SMOOTH);
		ImageIcon stteaIcon = new ImageIcon(stteaImage);

		// 주스/에이드 항목 이미지
		ImageIcon juiceIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\juice.png");
		Image juiceImage = juiceIcon.getImage();
		Image sjuiceImage = juiceImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sjuiceIcon = new ImageIcon(sjuiceImage);

		// 주스/에이드 항목 선택된 이미지
		ImageIcon tjuiceIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\tjuice.png");
		Image tjuiceImage = tjuiceIcon.getImage();
		Image stjuiceImage = tjuiceImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon stjuiceIcon = new ImageIcon(stjuiceImage);

		// 사이드메뉴/RTD 항목 이미지
		ImageIcon sideIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\side.png");
		Image sideImage = sideIcon.getImage();
		Image ssideImage = sideImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon ssideIcon = new ImageIcon(ssideImage);

		// 사이드메뉴/RTD 항목 선택된 이미지
		ImageIcon tsideIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\tside.png");
		Image tsideImage = tsideIcon.getImage();
		Image stsideImage = tsideImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon stsideIcon = new ImageIcon(stsideImage);

		// 빈칸 항목 이미지
		ImageIcon blankIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\blank.png");
		Image blankImage = blankIcon.getImage();
		Image sblankImage = blankImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sblankIcon = new ImageIcon(sblankImage);

		// (아이스) 아메리카노 메뉴 이미지
		ImageIcon iceamericanoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)아메리카노.png");
		Image iceamericanoImage = iceamericanoIcon.getImage();
		Image siceamericanoImage = iceamericanoImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon siceamericanoIcon = new ImageIcon(siceamericanoImage);

		// (아이스) 믹스커피 메뉴 이미지
		ImageIcon icemixedcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)믹스커피.png");
		Image icemixedcoffeeImage = icemixedcoffeeIcon.getImage();
		Image sicemixedcoffeeImage = icemixedcoffeeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicemixedcoffeeIcon = new ImageIcon(sicemixedcoffeeImage);

		// (아이스) 바닐라딥라떼 메뉴 이미지
		ImageIcon icevanilladeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)바닐라딥라떼.png");
		Image icevanilladeeplatteImage = icevanilladeeplatteIcon.getImage();
		Image sicevanilladeeplatteImage = icevanilladeeplatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicevanilladeeplatteIcon = new ImageIcon(sicevanilladeeplatteImage);

		// (아이스) 바닐라크림콜드브루 메뉴 이미지
		ImageIcon icevanillacreamcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)바닐라크림콜드브루.png");
		Image icevanillacreamcoldbrewImage = icevanillacreamcoldbrewIcon.getImage();
		Image sicevanillacreamcoldbrewImage = icevanillacreamcoldbrewImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sicevanillacreamcoldbrewIcon = new ImageIcon(sicevanillacreamcoldbrewImage);

		// (아이스) 아이스크림라떼 메뉴 이미지
		ImageIcon iceicecreamlatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)아이스크림라떼.png");
		Image iceicecreamlatteImage = iceicecreamlatteIcon.getImage();
		Image siceicecreamlatteImage = iceicecreamlatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon siceicecreamlatteIcon = new ImageIcon(siceicecreamlatteImage);

		// (아이스) 오트카페라떼 메뉴 이미지
		ImageIcon iceoatcafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)오트카페라떼.png");
		Image iceoatcafelatteImage = iceoatcafelatteIcon.getImage();
		Image siceoatcafelatteImage = iceoatcafelatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon siceoatcafelatteIcon = new ImageIcon(siceoatcafelatteImage);

		// (아이스) 카라멜마끼아또 메뉴 이미지
		ImageIcon icecaramelmacchiatoIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)카라멜마끼아또.png");
		Image icecaramelmacchiatoImage = icecaramelmacchiatoIcon.getImage();
		Image sicecaramelmacchiatoImage = icecaramelmacchiatoImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecaramelmacchiatoIcon = new ImageIcon(sicecaramelmacchiatoImage);

		// (아이스) 카페라떼 메뉴 이미지
		ImageIcon icecafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)카페라떼.png");
		Image icecafelatteImage = icecafelatteIcon.getImage();
		Image sicecafelatteImage = icecafelatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecafelatteIcon = new ImageIcon(sicecafelatteImage);

		// (아이스) 카페모카 메뉴 이미지
		ImageIcon icecafemochaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)카페모카.png");
		Image icecafemochaImage = icecafemochaIcon.getImage();
		Image sicecafemochaImage = icecafemochaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecafemochaIcon = new ImageIcon(sicecafemochaImage);

		// (아이스) 코코넛라떼 메뉴 이미지
		ImageIcon icecoconutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)코코넛라떼.png");
		Image icecoconutImage = icecoconutlatteIcon.getImage();
		Image sicecoconutImage = icecoconutImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecoconutIcon = new ImageIcon(sicecoconutImage);

		// (아이스) 콜드브루 메뉴 이미지
		ImageIcon icecoldbrewIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)콜드브루.png");
		Image icecoldbrewImage = icecoldbrewIcon.getImage();
		Image sicecoldbrewImage = icecoldbrewImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecoldbrewIcon = new ImageIcon(sicecoldbrewImage);

		// (아이스) 콜드브루라떼 메뉴 이미지
		ImageIcon icecoldbrewlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)콜드브루라떼.png");
		Image icecoldbrewlatteImage = icecoldbrewlatteIcon.getImage();
		Image sicecoldbrewlatteImage = icecoldbrewlatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecoldbrewlatteIcon = new ImageIcon(sicecoldbrewlatteImage);

		// (아이스) 토피넛라떼 메뉴 이미지
		ImageIcon icetoffeenutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)토피넛라떼.png");
		Image icetoffeenutlatteImage = icetoffeenutlatteIcon.getImage();
		Image sicetoffeenutlatteImage = icetoffeenutlatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicetoffeenutlatteIcon = new ImageIcon(sicetoffeenutlatteImage);

		// (아이스) 헤이즐넛딥라떼 메뉴 이미지
		ImageIcon icehazelnutdeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)헤이즐넛딥라떼.png");
		Image icehazelnutdeepImage = icehazelnutdeeplatteIcon.getImage();
		Image sicehazelnutdeepImage = icehazelnutdeepImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicehazelnutdeeplatteIcon = new ImageIcon(sicehazelnutdeepImage);

		// (아이스) 헤이즐넛크림콜드브루 메뉴 이미지
		ImageIcon icehazelnutcreamcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)헤이즐넛크림콜드브루.png");
		Image icehazelnutcreamcoldbrewImage = icehazelnutcreamcoldbrewIcon.getImage();
		Image sicehazelnutcreamcoldbrewImage = icehazelnutcreamcoldbrewImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sicehazelnutcreamcoldbrewIcon = new ImageIcon(sicehazelnutcreamcoldbrewImage);

		// 커피(아이스) 1p 이미지
		ImageIcon icecoffee1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\1p.png");
		Image icecoffee1pImage = icecoffee1pIcon.getImage();
		Image sicecoffee1pImage = icecoffee1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sicecoffee1pIcon = new ImageIcon(sicecoffee1pImage);

		// 커피(아이스) 1p 선택된 이미지
		ImageIcon ticecoffee1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t1p.png");
		Image ticecoffee1pImage = ticecoffee1pIcon.getImage();
		Image sticecoffee1pImage = ticecoffee1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticecoffee1pIcon = new ImageIcon(sticecoffee1pImage);

		// 커피(아이스) 2p 이미지
		ImageIcon icecoffee2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\2p.png");
		Image icecoffee2pImage = icecoffee2pIcon.getImage();
		Image sicecoffee2pImage = icecoffee2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sicecoffee2pIcon = new ImageIcon(sicecoffee2pImage);

		// 커피(아이스) 2p 선택된 이미지
		ImageIcon ticecoffee2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t2p.png");
		Image ticecoffee2pImage = ticecoffee2pIcon.getImage();
		Image sticecoffee2pImage = ticecoffee2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticecoffee2pIcon = new ImageIcon(sticecoffee2pImage);

		// (핫) 아메리카노 메뉴 이미지
		ImageIcon hotamericanoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)아메리카노.png");
		Image hotamericanoImage = hotamericanoIcon.getImage();
		Image shotamericanoImage = hotamericanoImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon shotamericanoIcon = new ImageIcon(shotamericanoImage);

		// (핫) 믹스커피 메뉴 이미지
		ImageIcon hotmixedcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)믹스커피.png");
		Image hotmixedcoffeeImage = hotmixedcoffeeIcon.getImage();
		Image shotmixedcoffeeImage = hotmixedcoffeeImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotmixedcoffeeIcon = new ImageIcon(shotmixedcoffeeImage);

		// (핫) 바닐라딥라떼 메뉴 이미지
		ImageIcon hotvanilladeeplatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)바닐라딥라떼.png");
		Image hotvanilladeeplatteImage = hotvanilladeeplatteIcon.getImage();
		Image shotvanilladeeplatteImage = hotvanilladeeplatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotvanilladeeplatteIcon = new ImageIcon(shotvanilladeeplatteImage);

		// (핫) 연유라떼 메뉴 이미지
		ImageIcon hotcondensedmilklatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)연유라떼.png");
		Image hotcondensedmilklatteImage = hotcondensedmilklatteIcon.getImage();
		Image shotcondensedmilklatteImage = hotcondensedmilklatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcondensedmilklatteIcon = new ImageIcon(shotcondensedmilklatteImage);

		// (핫) 오트카페라떼 메뉴 이미지
		ImageIcon hotoatcafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)오트카페라떼.png");
		Image hotoatcafelatteImage = hotoatcafelatteIcon.getImage();
		Image shotoatcafelatteImage = hotoatcafelatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotoatcafelatteIcon = new ImageIcon(shotoatcafelatteImage);

		// (핫) 카라멜마끼아또 메뉴 이미지
		ImageIcon hotcaramelmacchiatoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)카라멜마끼아또.png");
		Image hotcaramelmacchiatoImage = hotcaramelmacchiatoIcon.getImage();
		Image shotcaramelmacchiatoImage = hotcaramelmacchiatoImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcaramelmacchiatoIcon = new ImageIcon(shotcaramelmacchiatoImage);

		// (핫) 카페라떼 메뉴 이미지
		ImageIcon hotcafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)카페라떼.png");
		Image hotcafelatteImage = hotcafelatteIcon.getImage();
		Image shotcafelatteImage = hotcafelatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcafelatteIcon = new ImageIcon(shotcafelatteImage);

		// (핫) 카페모카 메뉴 이미지
		ImageIcon hotcafemochaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)카페모카.png");
		Image hotcafemochaImage = hotcafemochaIcon.getImage();
		Image shotcafemochaImage = hotcafemochaImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcafemochaIcon = new ImageIcon(shotcafemochaImage);

		// (핫) 코코넛라떼 메뉴 이미지
		ImageIcon hotcoconutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)코코넛라떼.png");
		Image hotcoconutlatteImage = hotcoconutlatteIcon.getImage();
		Image shotcoconutlatteImage = hotcoconutlatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcoconutlatteIcon = new ImageIcon(shotcoconutlatteImage);

		// (핫) 토피넛라떼 메뉴 이미지
		ImageIcon hottoffeenutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)토피넛라떼.png");
		Image hottoffeenutlatteImage = hottoffeenutlatteIcon.getImage();
		Image shottoffeenutlatteImage = hottoffeenutlatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shottoffeenutlatteIcon = new ImageIcon(shottoffeenutlatteImage);

		// (핫) 헤이즐넛딥라떼 메뉴 이미지
		ImageIcon hothazelnutdeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)헤이즐넛딥라떼.png");
		Image hothazelnutdeeplatteImage = hothazelnutdeeplatteIcon.getImage();
		Image shothazelnutdeeplatteImage = hothazelnutdeeplatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shothazelnutdeeplatteIcon = new ImageIcon(shothazelnutdeeplatteImage);

		// 커피(핫) 1p 이미지
		ImageIcon hotcoffee1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\1p.png");
		Image hotcoffee1pImage = hotcoffee1pIcon.getImage();
		Image shotcoffee1pImage = hotcoffee1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon shotcoffee1pIcon = new ImageIcon(shotcoffee1pImage);

		// 커피(핫) 1p 선택된 이미지
		ImageIcon thotcoffee1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t1p.png");
		Image thotcoffee1pImage = thotcoffee1pIcon.getImage();
		Image sthotcoffee1pImage = thotcoffee1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sthotcoffee1pIcon = new ImageIcon(sthotcoffee1pImage);

		// 커피(핫) 2p 이미지
		ImageIcon hotcoffee2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\2p.png");
		Image hotcoffee2pImage = hotcoffee2pIcon.getImage();
		Image shotcoffee2pImage = hotcoffee2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon shotcoffee2pIcon = new ImageIcon(shotcoffee2pImage);

		// 커피(핫) 2p 선택된 이미지
		ImageIcon thotcoffee2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t2p.png");
		Image thotcoffee2pImage = thotcoffee2pIcon.getImage();
		Image sthotcoffee2pImage = thotcoffee2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sthotcoffee2pIcon = new ImageIcon(sthotcoffee2pImage);

		// 군고구마라떼 메뉴 이미지
		ImageIcon sweetpotatolatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\군고구마라떼.png");
		Image sweetpotatolatteImage = sweetpotatolatteIcon.getImage();
		Image ssweetpotatolatteImage = sweetpotatolatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssweetpotatolatteIcon = new ImageIcon(ssweetpotatolatteImage);

		// 딸기라떼 메뉴 이미지
		ImageIcon strawberrylatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\딸기라떼.png");
		Image strawberrylatteImage = strawberrylatteIcon.getImage();
		Image sstrawberrylatteImage = strawberrylatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrylatteIcon = new ImageIcon(sstrawberrylatteImage);

		// 로얄밀크티 메뉴 이미지
		ImageIcon royalmilkteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\로얄밀크티.png");
		Image royalmilkteaImage = royalmilkteaIcon.getImage();
		Image sroyalmilkteaImage = royalmilkteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sroyalmilkteaIcon = new ImageIcon(sroyalmilkteaImage);

		// 말차라떼 메뉴 이미지
		ImageIcon matchalatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\말차라떼.png");
		Image matchalatteImage = matchalatteIcon.getImage();
		Image smatchalatteImage = matchalatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smatchalatteIcon = new ImageIcon(smatchalatteImage);

		// 말차아인슈페너 메뉴 이미지
		ImageIcon matchaeinspennerIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\말차아인슈페너.png");
		Image matchaeinispennerImage = matchaeinspennerIcon.getImage();
		Image smatchaeinispennerImage = matchaeinispennerImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smatchaeinspennerIcon = new ImageIcon(smatchaeinispennerImage);

		// 멜팅초코 메뉴 이미지
		ImageIcon meltingchocoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\멜팅초코.png");
		Image meltingchocoImage = meltingchocoIcon.getImage();
		Image smeltingchocoImage = meltingchocoImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smeltingchocoIcon = new ImageIcon(smeltingchocoImage);

		// 미숫가루 메뉴 이미지
		ImageIcon mixedgrainpowderIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\미숫가루.png");
		Image mixedgrainpowderImage = mixedgrainpowderIcon.getImage();
		Image smixedgrainpowderImage = mixedgrainpowderImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smixedgrainpowderIcon = new ImageIcon(smixedgrainpowderImage);

		// 미숫가루라떼 메뉴 이미지
		ImageIcon mixedgrainpowderlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\미숫가루라떼.png");
		Image mixedgrainpowderlatteImage = mixedgrainpowderlatteIcon.getImage();
		Image smixedgrainpowderlatteImage = mixedgrainpowderlatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smixedgrainpowderlatteIcon = new ImageIcon(smixedgrainpowderlatteImage);

		// 초코라떼 메뉴 이미지
		ImageIcon chocolatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\초코라떼.png");
		Image chocolatteImage = chocolatteIcon.getImage();
		Image schocolatteImage = chocolatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon schocolatteIcon = new ImageIcon(schocolatteImage);

		// 베버리지 1p 이미지
		ImageIcon beverage1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\1p.png");
		Image beverage1pImage = beverage1pIcon.getImage();
		Image sbeverage1pImage = beverage1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sbeverage1pIcon = new ImageIcon(sbeverage1pImage);

		// 베버리지 1p 선택된 이미지
		ImageIcon tbeverage1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t1p.png");
		Image tbeverage1pImage = tbeverage1pIcon.getImage();
		Image stbeverage1pImage = tbeverage1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stbeverage1pIcon = new ImageIcon(stbeverage1pImage);

		// 베버리지 2p 이미지
		ImageIcon beverage2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\2p.png");
		Image beverage2pImage = beverage2pIcon.getImage();
		Image sbeverage2pImage = beverage2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sbeverage2pIcon = new ImageIcon(sbeverage2pImage);

		// 베버리지 2p 선택된 이미지
		ImageIcon tbeverage2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t2p.png");
		Image tbeverage2pImage = tbeverage2pIcon.getImage();
		Image stbeverage2pImage = tbeverage2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stbeverage2pIcon = new ImageIcon(stbeverage2pImage);

		// 딸기쉐이크 메뉴 이미지
		ImageIcon strawberryshakeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\딸기쉐이크.png");
		Image strawberryshakeImage = strawberryshakeIcon.getImage();
		Image sstrawberryshakeImage = strawberryshakeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sstrawberryshakeIcon = new ImageIcon(sstrawberryshakeImage);

		// 딸기요거트스무디 메뉴 이미지
		ImageIcon strawberryyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\딸기요거트스무디.png");
		Image strawberryyogurtsmoothieImage = strawberryyogurtsmoothieIcon.getImage();
		Image sstrawberryyogurtsmoothieImage = strawberryyogurtsmoothieImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sstrawberryyogurtsmoothieIcon = new ImageIcon(sstrawberryyogurtsmoothieImage);

		// 말차프라페 메뉴 이미지
		ImageIcon matchafrappeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\말차프라페.png");
		Image matchfrappeImage = matchafrappeIcon.getImage();
		Image smatchafrappeImage = matchfrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smatchafrappeIcon = new ImageIcon(smatchafrappeImage);

		// 망고요거트스무디 메뉴 이미지
		ImageIcon mangoyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\망고요거트스무디.png");
		Image mangoyogurtsmoothieImage = mangoyogurtsmoothieIcon.getImage();
		Image smangoyogurtsmoothieImage = mangoyogurtsmoothieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smangoyogurtsmoothieIcon = new ImageIcon(smangoyogurtsmoothieImage);

		// 망고패션크러쉬 메뉴 이미지
		ImageIcon mangofashioncrushIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\망고패션크러쉬.png");
		Image mangofashioncrushImage = mangofashioncrushIcon.getImage();
		Image smangofashioncrushImage = mangofashioncrushImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smangofashioncrushIcon = new ImageIcon(smangofashioncrushImage);

		// 민트초코칩프라페 메뉴 이미지
		ImageIcon mintchocochipfrappeIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\민트초코칩프라페.png");
		Image mintchocochipfrappeImage = mintchocochipfrappeIcon.getImage();
		Image smintchocochipfrappeImage = mintchocochipfrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smintchocochipfrappeIcon = new ImageIcon(smintchocochipfrappeImage);

		// 밀크쉐이크 메뉴 이미지
		ImageIcon milkshakeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\밀크쉐이크.png");
		Image milkshakeImage = milkshakeIcon.getImage();
		Image smilkshakeImage = milkshakeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smilkshakeIcon = new ImageIcon(smilkshakeImage);

		// 블루베리요거트스무디 메뉴 이미지
		ImageIcon blueberryyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\블루베리요거트스무디.png");
		Image blueberryyogurtsmoothieImage = blueberryyogurtsmoothieIcon.getImage();
		Image sblueberryyogurtsmoothieImage = blueberryyogurtsmoothieImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sblueberryyogurtsmoothieIcon = new ImageIcon(sblueberryyogurtsmoothieImage);

		// 에스프레소쉐이크 메뉴 이미지
		ImageIcon espressoshakeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\에스프레소쉐이크.png");
		Image espressoshakeImage = espressoshakeIcon.getImage();
		Image sespressoshakeImage = espressoshakeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sespressoshakeIcon = new ImageIcon(sespressoshakeImage);

		// 유자배크러쉬 메뉴 이미지
		ImageIcon citronpearcrushIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\유자배크러쉬.png");
		Image citronpearcrushImage = citronpearcrushIcon.getImage();
		Image scitronpearcrushImage = citronpearcrushImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scitronpearcrushIcon = new ImageIcon(scitronpearcrushImage);

		// 자두피치크러쉬 메뉴 이미지
		ImageIcon plumpeachcrushIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\자두피치크러쉬.png");
		Image plumpeachcrushImage = plumpeachcrushIcon.getImage();
		Image splumpeachcrushImage = plumpeachcrushImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon splumpeachcrushIcon = new ImageIcon(splumpeachcrushImage);

		// 자바칩프라페 메뉴 이미지
		ImageIcon javachipfrappeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\자바칩프라페.png");
		Image javachipfrappeImage = javachipfrappeIcon.getImage();
		Image sjavachipfrappeImage = javachipfrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sjavachipfrappeIcon = new ImageIcon(sjavachipfrappeImage);

		// 초코쉐이크 메뉴 이미지
		ImageIcon chocoshakeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\초코쉐이크.png");
		Image chocoshakeImage = chocoshakeIcon.getImage();
		Image schocoshakeImage = chocoshakeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon schocoshakeIcon = new ImageIcon(schocoshakeImage);

		// 코코넛커피프라페 메뉴 이미지
		ImageIcon coconutcoffeefrappeIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\코코넛커피프라페.png");
		Image coconutcoffeefrappeImage = coconutcoffeefrappeIcon.getImage();
		Image scoconutcoffeefrappeImage = coconutcoffeefrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scoconutcoffeefrappeIcon = new ImageIcon(scoconutcoffeefrappeImage);

		// 코코초코프라페 메뉴 이미지
		ImageIcon cocochocofrappeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\코코초코프라페.png");
		Image cocochocofrappeImage = cocochocofrappeIcon.getImage();
		Image scocochocofrappeImage = cocochocofrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scocochocofrappeIcon = new ImageIcon(scocochocofrappeImage);

		// 쿠키앤크림프라페 메뉴 이미지
		ImageIcon cookiencreamfrappeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\쿠키앤크림프라페.png");
		Image cookiencreamfrappeImage = cookiencreamfrappeIcon.getImage();
		Image scookiencreamfrappeImage = cookiencreamfrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scookiencreamfrappeIcon = new ImageIcon(scookiencreamfrappeImage);

		// 포도베리크러쉬 메뉴 이미지
		ImageIcon grapeberrycrushIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\포도베리크러쉬.png");
		Image grapeberrycrushImage = grapeberrycrushIcon.getImage();
		Image sgrapeberrycrushImage = grapeberrycrushImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgrapeberrycrushIcon = new ImageIcon(sgrapeberrycrushImage);

		// 플레인요거트스무디 메뉴 이미지
		ImageIcon plainyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\플레인요거트스무디.png");
		Image plainyogurtsmoothieImage = plainyogurtsmoothieIcon.getImage();
		Image splainyogurtsmoothieImage = plainyogurtsmoothieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon splainyogurtsmoothieIcon = new ImageIcon(splainyogurtsmoothieImage);

		// 아이스 블렌디드 1p 이미지
		ImageIcon iceblended1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\1p.png");
		Image iceblended1pImage = iceblended1pIcon.getImage();
		Image siceblended1pImage = iceblended1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon siceblended1pIcon = new ImageIcon(siceblended1pImage);

		// 아이스 블렌디드 1p 선택된 이미지
		ImageIcon ticeblended1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t1p.png");
		Image ticeblended1pImage = ticeblended1pIcon.getImage();
		Image sticeblended1pImage = ticeblended1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticeblended1pIcon = new ImageIcon(sticeblended1pImage);

		// 아이스 블렌디드 2p 이미지
		ImageIcon iceblended2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\2p.png");
		Image iceblended2pImage = iceblended2pIcon.getImage();
		Image siceblended2pImage = iceblended2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon siceblended2pIcon = new ImageIcon(siceblended2pImage);

		// 아이스 블렌디드 2p 선택된 이미지
		ImageIcon ticeblended2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t2p.png");
		Image ticeblended2pImage = ticeblended2pIcon.getImage();
		Image sticeblended2pImage = ticeblended2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticeblended2pIcon = new ImageIcon(sticeblended2pImage);

		// 아이스 블렌디드 3p 이미지
		ImageIcon iceblended3pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\3p.png");
		Image iceblended3pImage = iceblended3pIcon.getImage();
		Image siceblended3pImage = iceblended3pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon siceblended3pIcon = new ImageIcon(siceblended3pImage);

		// 아이스 블렌디드 3p 선택된 이미지
		ImageIcon ticeblended3pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t3p.png");
		Image ticeblended3pImage = ticeblended3pIcon.getImage();
		Image sticeblended3pImage = ticeblended3pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticeblended3pIcon = new ImageIcon(sticeblended3pImage);

		// 레몬민트티 메뉴 이미지
		ImageIcon lemonmintteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\레몬민트티.png");
		Image lemonmintteaImage = lemonmintteaIcon.getImage();
		Image slemonmintteaImage = lemonmintteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon slemonmintteaIcon = new ImageIcon(slemonmintteaImage);

		// 리치캐모마일 메뉴 이미지
		ImageIcon litchichamomileIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\리치캐모마일.png");
		Image litchichamomileImage = litchichamomileIcon.getImage();
		Image slitchichamomileImage = litchichamomileImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon slitchichamomileIcon = new ImageIcon(slitchichamomileImage);

		// 복숭아아이스티 메뉴 이미지
		ImageIcon peachiceteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\복숭아아이스티.png");
		Image peachiceteaImage = peachiceteaIcon.getImage();
		Image speachiceteaImage = peachiceteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon speachiceteaIcon = new ImageIcon(speachiceteaImage);

		// 애플히비스커스 메뉴 이미지
		ImageIcon applehibiscusIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\애플히비스커스.png");
		Image applehibiscusImage = applehibiscusIcon.getImage();
		Image sapplehibiscusImage = applehibiscusImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sapplehibiscusIcon = new ImageIcon(sapplehibiscusImage);

		// 유자애플티 메뉴 이미지
		ImageIcon citronappleteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\유자애플티.png");
		Image citronappleteaImage = citronappleteaIcon.getImage();
		Image scitronappleteaImage = citronappleteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scitronappleteaIcon = new ImageIcon(scitronappleteaImage);

		// 유자캐모마일티 메뉴 이미지
		ImageIcon citronchamomileteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\유자캐모마일티.png");
		Image citronchamomileteaImage = citronchamomileteaIcon.getImage();
		Image scitronchamomileteaImage = citronchamomileteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scitronchamomileteaIcon = new ImageIcon(scitronchamomileteaImage);

		// 자몽허니블랙티 메뉴 이미지
		ImageIcon grapefruithoneyblackteaIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\자몽허니블랙티.png");
		Image grapefruithoneyblackteaImage = grapefruithoneyblackteaIcon.getImage();
		Image sgrapefruithoneyblackteaImage = grapefruithoneyblackteaImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sgrapefruithoneyblackteaIcon = new ImageIcon(sgrapefruithoneyblackteaImage);

		// 청귤얼그레이 메뉴 이미지
		ImageIcon greentangerineearlgrayIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\청귤얼그레이.png");
		Image greentangerineearlgrayImage = greentangerineearlgrayIcon.getImage();
		Image sgreentangerineearlgrayImage = greentangerineearlgrayImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sgreentangerineearlgrayIcon = new ImageIcon(sgreentangerineearlgrayImage);

		// 타로버블티 메뉴 이미지
		ImageIcon tarobubbleteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\타로버블티.png");
		Image tarobubbleteaImage = tarobubbleteaIcon.getImage();
		Image starobubbleteaImage = tarobubbleteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon starobubbleteaIcon = new ImageIcon(starobubbleteaImage);

		// 트리플민트 메뉴 이미지
		ImageIcon tripplemintIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\트리플민트.png");
		Image tripplemintImage = tripplemintIcon.getImage();
		Image stripplemintImage = tripplemintImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon stripplemintIcon = new ImageIcon(stripplemintImage);

		// 허니레몬티 메뉴 이미지
		ImageIcon honeylemonteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\허니레몬티.png");
		Image honeylemonteaImage = honeylemonteaIcon.getImage();
		Image shoneylemonteaImage = honeylemonteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon shoneylemonteaIcon = new ImageIcon(shoneylemonteaImage);

		// 허니유자티 메뉴 이미지
		ImageIcon honeycitronteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\허니유자티.png");
		Image honeycitronteaImage = honeycitronteaIcon.getImage();
		Image shoneycitronteaImage = honeycitronteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon shoneycitronteaIcon = new ImageIcon(shoneycitronteaImage);

		// 허니자몽티 메뉴 이미지
		ImageIcon honeygrapefruitteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\허니자몽티.png");
		Image honeygrapefruitteaImage = honeygrapefruitteaIcon.getImage();
		Image shoneygrapefruitteaImage = honeygrapefruitteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon shoneygrapefruitteaIcon = new ImageIcon(shoneygrapefruitteaImage);

		// 흑설탕버블티 메뉴 이미지
		ImageIcon brownsugarbubbleteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\흑설탕버블티.png");
		Image bronwsugarbubbleteaImage = brownsugarbubbleteaIcon.getImage();
		Image sbronwsugarbubbleteaImage = bronwsugarbubbleteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sbrownsugarbubbleteaIcon = new ImageIcon(sbronwsugarbubbleteaImage);

		// 버블티/티 1p 이미지
		ImageIcon tea1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\1p.png");
		Image tea1pImage = tea1pIcon.getImage();
		Image stea1pImage = tea1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stea1pIcon = new ImageIcon(stea1pImage);

		// 버블티/티 1p 선택된 이미지
		ImageIcon ttea1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t1p.png");
		Image ttea1pImage = ttea1pIcon.getImage();
		Image sttea1pImage = ttea1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sttea1pIcon = new ImageIcon(sttea1pImage);

		// 버블티/티 2p 이미지
		ImageIcon tea2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\2p.png");
		Image tea2pImage = tea2pIcon.getImage();
		Image stea2pImage = tea2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stea2pIcon = new ImageIcon(stea2pImage);

		// 버블티/티 2p 선택된 이미지
		ImageIcon ttea2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t2p.png");
		Image ttea2pImage = ttea2pIcon.getImage();
		Image sttea2pImage = ttea2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sttea2pIcon = new ImageIcon(sttea2pImage);

		// 레몬에이드 메뉴 이미지
		ImageIcon lemonadeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\레몬에이드.png");
		Image lemonadeImage = lemonadeIcon.getImage();
		Image slemonadeImage = lemonadeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon slemonadeIcon = new ImageIcon(slemonadeImage);

		// 망플단 메뉴 이미지
		ImageIcon manpledanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\망플단.png");
		Image manpledanImage = manpledanIcon.getImage();
		Image smanpledanImage = manpledanImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smanpledanIcon = new ImageIcon(smanpledanImage);

		// 메론소다 메뉴 이미지
		ImageIcon melonsodaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\메론소다.png");
		Image melonsodaImage = melonsodaIcon.getImage();
		Image smelonsodaImage = melonsodaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smelonsodaIcon = new ImageIcon(smelonsodaImage);

		// 사딸바 메뉴 이미지
		ImageIcon saddalbiIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\사딸비.png");
		Image saddalbiImage = saddalbiIcon.getImage();
		Image ssaddalbiImage = saddalbiImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssaddalbiIcon = new ImageIcon(ssaddalbiImage);

		// 애플망고에이드 메뉴 이미지
		ImageIcon applemangoadeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\애플망고에이드.png");
		Image applemangoadeImage = applemangoadeIcon.getImage();
		Image sapplemangoadeImage = applemangoadeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sapplemangoadeIcon = new ImageIcon(sapplemangoadeImage);

		// 오사당 메뉴 이미지
		ImageIcon osadangIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\오사당.png");
		Image osadangImage = osadangIcon.getImage();
		Image sosadangImage = osadangImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sosadangIcon = new ImageIcon(sosadangImage);

		// 자몽에이드 메뉴 이미지
		ImageIcon grapefruitadeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\자몽에이드.png");
		Image grapefruitadeImage = grapefruitadeIcon.getImage();
		Image sgrapefruitadeImage = grapefruitadeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgrapefruitadeIcon = new ImageIcon(sgrapefruitadeImage);

		// 체리콕 메뉴 이미지
		ImageIcon cherrycokeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\체리콕.png");
		Image cherrycokeImage = cherrycokeIcon.getImage();
		Image scherrycokeImage = cherrycokeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scherrycokeIcon = new ImageIcon(scherrycokeImage);

		// 크림소다 메뉴 이미지
		ImageIcon creamsodaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\크림소다.png");
		Image creamsodaImage = creamsodaIcon.getImage();
		Image screamsodaImage = creamsodaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon screamsodaIcon = new ImageIcon(screamsodaImage);

		// 포도에이드 메뉴 이미지
		ImageIcon grapeadeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\포도에이드.png");
		Image grapeadeImage = grapeadeIcon.getImage();
		Image sgrapeadeImage = grapeadeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgrapeadeIcon = new ImageIcon(sgrapeadeImage);

		// 주스/에이드 1p 이미지
		ImageIcon juice1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\1p.png");
		Image juice1pImage = juice1pIcon.getImage();
		Image sjuice1pImage = juice1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sjuice1pIcon = new ImageIcon(sjuice1pImage);

		// 주스/에이드 1p 선택된 이미지
		ImageIcon tjuice1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t1p.png");
		Image tjuice1pImage = tjuice1pIcon.getImage();
		Image stjuice1pImage = tjuice1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stjuice1pIcon = new ImageIcon(stjuice1pImage);

		// 주스/에이드 2p 이미지
		ImageIcon juice2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\2p.png");
		Image juice2pImage = juice2pIcon.getImage();
		Image sjuice2pImage = juice2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sjuice2pIcon = new ImageIcon(sjuice2pImage);

		// 주스/에이드 2p 선택된 이미지
		ImageIcon tjuice2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t2p.png");
		Image tjuice2pImage = tjuice2pIcon.getImage();
		Image stjuice2pImage = tjuice2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stjuice2pIcon = new ImageIcon(stjuice2pImage);

		// 콜드브루 메뉴 이미지
		ImageIcon coldbrewIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\콜드브루 500ml.png");
		Image coldbrewImage = coldbrewIcon.getImage();
		Image scoldbrewImage = coldbrewImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scoldbrewIcon = new ImageIcon(scoldbrewImage);

		// 디카페인 콜드브루 메뉴 이미지
		ImageIcon decafeinatedcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\디카페인 콜드브루 500ml.png");
		Image decafeinatedcoldbrewImage = decafeinatedcoldbrewIcon.getImage();
		Image sdecafeinatedcoldbrewImage = decafeinatedcoldbrewImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sdecafeinatedcoldbrewIcon = new ImageIcon(sdecafeinatedcoldbrewImage);

		// 갈릭크룽지 메뉴 이미지
		ImageIcon garlicIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\갈릭 크룽지.png");
		Image garlicImage = garlicIcon.getImage();
		Image sgarlicImage = garlicImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgarlicIcon = new ImageIcon(sgarlicImage);

		// 스윗크룽지 메뉴 이미지
		ImageIcon sweetIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\스윗 크룽지.png");
		Image sweetImage = sweetIcon.getImage();
		Image ssweetImage = sweetImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssweetIcon = new ImageIcon(ssweetImage);

		// 고메소금빵 메뉴 이미지
		ImageIcon gourmetbreadIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\고메소금빵.png");
		Image gourmetbreadImage = gourmetbreadIcon.getImage();
		Image sgourmetbreadImage = gourmetbreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgourmetbreadIcon = new ImageIcon(sgourmetbreadImage);

		// 바질토마토 치킨 소금빵 메뉴 이미지
		ImageIcon basilbreadIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\바질토마토 치킨 소금빵.png");
		Image basilbreadImage = basilbreadIcon.getImage();
		Image sbasilbreadImage = basilbreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sbasilbreadIcon = new ImageIcon(sbasilbreadImage);

		// 에멘탈 햄치즈 소금빵 메뉴 이미지
		ImageIcon emmentalbreadIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\에멘탈 햄치즈 소금빵.png");
		Image emmentalbreadImage = emmentalbreadIcon.getImage();
		Image semmentalbreadImage = emmentalbreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon semmentalbreadIcon = new ImageIcon(semmentalbreadImage);

		// 닥터넛츠 메뉴 이미지
		ImageIcon drnutsIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\닥터넛츠 피칸.png");
		Image drnutsImage = drnutsIcon.getImage();
		Image sdrnutsImage = drnutsImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sdrnutsIcon = new ImageIcon(sdrnutsImage);

		// 달콤 어니언 핫도그 메뉴 이미지
		ImageIcon sweethotdogIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\달콤 어니언 핫도그.png");
		Image sweethotdogImage = sweethotdogIcon.getImage();
		Image ssweethotdogImage = sweethotdogImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssweethotdogIcon = new ImageIcon(ssweethotdogImage);

		// 매콤 칠리 핫도그 메뉴 이미지
		ImageIcon spicyhotdogIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\매콤 칠리 핫도그.png");
		Image spicyhotdogImage = spicyhotdogIcon.getImage();
		Image sspicyhotdogImage = spicyhotdogImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sspicyhotdogIcon = new ImageIcon(sspicyhotdogImage);

		// 달콤촉촉 고구마빵 메뉴 이미지
		ImageIcon sweetpotatobreadIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\달콤촉촉 고구마빵.png");
		Image sweetpotatobreadImage = sweetpotatobreadIcon.getImage();
		Image ssweetpotatobreadImage = sweetpotatobreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssweetpotatobreadIcon = new ImageIcon(ssweetpotatobreadImage);

		// 포슬쫀득 감자빵 메뉴 이미지
		ImageIcon potatobreadIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\포슬쫀득 감자빵.png");
		Image potatobreadImage = potatobreadIcon.getImage();
		Image spotatobreadImage = potatobreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon spotatobreadIcon = new ImageIcon(spotatobreadImage);

		// 당근치즈 브라우니 메뉴 이미지
		ImageIcon carrotcheeseIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\당근치즈 브라우니.png");
		Image carrotcheeseImage = carrotcheeseIcon.getImage();
		Image scarrotcheeseImage = carrotcheeseImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scarrotcheeseIcon = new ImageIcon(scarrotcheeseImage);

		// 더블초코 스모어 촉촉쿠키 메뉴 이미지
		ImageIcon doublechococookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\더블초코 스모어 촉촉쿠키.png");
		Image doublechococookieImage = doublechococookieIcon.getImage();
		Image sdoublechococookieImage = doublechococookieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sdoublechococookieIcon = new ImageIcon(sdoublechococookieImage);

		// 크랜베리 초코칩 촉촉쿠키 메뉴 이미지
		ImageIcon cranberrycookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\크랜베리 초코칩 촉촉쿠키.png");
		Image cranberrycookieImage = cranberrycookieIcon.getImage();
		Image scranberrycookieImage = cranberrycookieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scranberrycookieIcon = new ImageIcon(scranberrycookieImage);

		// 화이트초코 말차 촉촉쿠키 메뉴 이미지
		ImageIcon whitechococookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\화이트초코 말차 촉촉쿠키.png");
		Image whitechococookieImage = whitechococookieIcon.getImage();
		Image swhitechococookieImage = whitechococookieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon swhitechococookieIcon = new ImageIcon(swhitechococookieImage);

		// 딸기에 몽당 파이 메뉴 이미지
		ImageIcon strawberrypieIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\딸기에 퐁당 파이.png");
		Image strawberrypieImage = strawberrypieIcon.getImage();
		Image sstrawberrypieImage = strawberrypieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrypieIcon = new ImageIcon(sstrawberrypieImage);

		// 초코에 퐁당 파이 메뉴 이미지
		ImageIcon chocopieIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\초코에 퐁당 파이.png");
		Image chocopieImage = chocopieIcon.getImage();
		Image schocopieImage = chocopieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon schocopieIcon = new ImageIcon(schocopieImage);

		// 미니 붕어빵(커스타드) 메뉴 이미지
		ImageIcon minicustardIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\미니붕어빵(커스타드).png");
		Image minicustardImage = minicustardIcon.getImage();
		Image sminicustardImage = minicustardImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sminicustardIcon = new ImageIcon(sminicustardImage);

		// 미니 붕어빵(통팥) 메뉴 이미지
		ImageIcon miniredbeanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\미니붕어빵(통팥).png");
		Image miniredbeanImage = miniredbeanIcon.getImage();
		Image sminiredbeanImage = miniredbeanImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sminiredbeanIcon = new ImageIcon(sminiredbeanImage);

		// 딸기요거 벤카롱 메뉴 이미지
		ImageIcon strawberrymacaroonIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\딸기요거 벤카롱.png");
		Image strawberrymacaroonImage = strawberrymacaroonIcon.getImage();
		Image sstrawberrymacaroonImage = strawberrymacaroonImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrymacaroonIcon = new ImageIcon(sstrawberrymacaroonImage);

		// 말차초코 벤카롱 메뉴 이미지
		ImageIcon matchamacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\말차초코 벤카롱.png");
		Image matchamacaroonImage = matchamacaroonIcon.getImage();
		Image smatchamacaroonImage = matchamacaroonImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smatchamacaroonIcon = new ImageIcon(smatchamacaroonImage);

		// 코코초코 벤카롱 메뉴 이미지
		ImageIcon cocomacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\코코초코 벤카롱.png");
		Image cocomacaroonImage = cocomacaroonIcon.getImage();
		Image scocomacaroonImage = cocomacaroonImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scocomacaroonIcon = new ImageIcon(scocomacaroonImage);

		// 쿠키크림 벤카롱 메뉴 이미지
		ImageIcon cookiemacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\쿠키크림 벤카롱.png");
		Image cookiemacaroonImage = cookiemacaroonIcon.getImage();
		Image scookiemacaroonImage = cookiemacaroonImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scookiemacaroonIcon = new ImageIcon(scookiemacaroonImage);

		// 사이드메뉴/RTD 1p 이미지
		ImageIcon side1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\1p.png");
		Image side1pImage = side1pIcon.getImage();
		Image sside1pImage = side1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sside1pIcon = new ImageIcon(sside1pImage);

		// 사이드메뉴/RTD 1p 선택된 이미지
		ImageIcon tside1pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t1p.png");
		Image tside1pImage = tside1pIcon.getImage();
		Image stside1pImage = tside1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stside1pIcon = new ImageIcon(stside1pImage);

		// 사이드메뉴/RTD 2p 이미지
		ImageIcon side2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\2p.png");
		Image side2pImage = side2pIcon.getImage();
		Image sside2pImage = side2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sside2pIcon = new ImageIcon(sside2pImage);

		// 사이드메뉴/RTD 2p 선택된 이미지
		ImageIcon tside2pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t2p.png");
		Image tside2pImage = tside2pIcon.getImage();
		Image stside2pImage = tside2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stside2pIcon = new ImageIcon(stside2pImage);

		// 사이드메뉴/RTD 3p 이미지
		ImageIcon side3pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\3p.png");
		Image side3pImage = side3pIcon.getImage();
		Image sside3pImage = side3pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sside3pIcon = new ImageIcon(sside3pImage);

		// 사이드메뉴/RTD 3p 선택된 이미지
		ImageIcon tside3pIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\t3p.png");
		Image tside3pImage = tside3pIcon.getImage();
		Image stside3pImage = tside3pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stside3pIcon = new ImageIcon(stside3pImage);

		// 주문한 메뉴 삭제버튼 이미지
		ImageIcon removeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\remove.png");
		Image removeImage = removeIcon.getImage();
		Image sremoveImage = removeImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon sremoveIcon = new ImageIcon(sremoveImage);

		// 전체삭제 메뉴 이미지
		ImageIcon deleteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\delete.png");
		Image deleteImage = deleteIcon.getImage();
		Image sdeleteImage = deleteImage.getScaledInstance(110, 35, Image.SCALE_SMOOTH);
		ImageIcon sdeleteIcon = new ImageIcon(sdeleteImage);

		// 선택된 메뉴가 들어가는 메뉴판 이미지
		ImageIcon menuIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\menu.png");
		Image menuImage = menuIcon.getImage();
		Image smenuImage = menuImage.getScaledInstance(570, 170, Image.SCALE_SMOOTH);
		ImageIcon smenuIcon = new ImageIcon(smenuImage);

		// 메뉴 수량 빼는 이미지
		ImageIcon minusIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\minus.png");
		Image minusImage = minusIcon.getImage();
		Image sminusImage = minusImage.getScaledInstance(19, 19, Image.SCALE_SMOOTH);
		ImageIcon sminusIcon = new ImageIcon(sminusImage);

		// 메뉴 수량 더하는 이미지
		ImageIcon plusIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 항목\\plus.png");
		Image plusImage = plusIcon.getImage();
		Image splusImage = plusImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon splusIcon = new ImageIcon(splusImage);
		
		// MADE BY. 김성건 텍스트 넣는 JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. 김성건");
		ksgJLabel.setBounds(420, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// 홈 버튼 이미지 넣는 JLabel
		JLabel homeJLabel = new JLabel(shomeIcon);
		homeJLabel.setBounds(0, 0, 138, 45);
		c.add(homeJLabel);
		homeJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new imageslideshow();
				dispose();
			}
		});

		// 로고 이미지 넣는 JLabel
		JLabel logoJLabel = new JLabel(slogoIcon);
		logoJLabel.setBounds(130, 0, 412, 45);
		c.add(logoJLabel);

		// 커피(아이스) 항목 이미지 넣는 JLabel
		JLabel icecoffeeJLabel = new JLabel(sticecoffeeIcon);
		icecoffeeJLabel.setBounds(0, 42, 138, 50);
		c.add(icecoffeeJLabel);
		icecoffeeJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 1;
				pagenum = 1;
			}
		});

		// 커피(핫) 항목 이미지 넣는 JLabel
		JLabel hotcoffeeJLabel = new JLabel(shotcoffeeIcon);
		hotcoffeeJLabel.setBounds(134, 42, 138, 50);
		c.add(hotcoffeeJLabel);
		hotcoffeeJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 2;
				pagenum = 1;
			}
		});

		// 베버리지 항목 이미지 넣는 JLabel
		JLabel beverageJLabel = new JLabel(sbeverageIcon);
		beverageJLabel.setBounds(268, 42, 138, 50);
		c.add(beverageJLabel);
		beverageJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 3;
				pagenum = 1;
			}
		});

		// 아이스 블렌디드 항목 이미지 넣는 JLabel
		JLabel iceblendedJLabel = new JLabel(siceblendedIcon);
		iceblendedJLabel.setBounds(402, 42, 138, 50);
		c.add(iceblendedJLabel);
		iceblendedJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 4;
				pagenum = 1;
			}
		});

		// 버블티/티 항목 이미지 넣는 JLabel
		JLabel teaJLabel = new JLabel(steaIcon);
		teaJLabel.setBounds(0, 88, 138, 50);
		c.add(teaJLabel);
		teaJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 5;
				pagenum = 1;
			}
		});

		// 주스/에이드 항목 이미지 넣는 JLabel
		JLabel juiceJLabel = new JLabel(sjuiceIcon);
		juiceJLabel.setBounds(134, 88, 138, 50);
		c.add(juiceJLabel);
		juiceJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 6;
				pagenum = 1;
			}
		});

		// 사이드메뉴/RTD 항목 이미지 넣는 JLabel
		JLabel sideJLabel = new JLabel(ssideIcon);
		sideJLabel.setBounds(268, 88, 138, 50);
		c.add(sideJLabel);
		sideJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 7;
				pagenum = 1;
			}
		});

		// 빈칸 항목 이미지 넣는 JLabel
		JLabel blankJLabel = new JLabel(sblankIcon);
		blankJLabel.setBounds(402, 88, 138, 50);
		c.add(blankJLabel);

		// 1번쨰 메뉴 이미지 넣는 JLabel
		JLabel menu1JLabel = new JLabel(siceamericanoIcon);
		menu1JLabel.setBounds(14, 135, 110, 170);
		c.add(menu1JLabel);
		menu1JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				menunum = 1;
				JLabel choseJLabel = (JLabel) e.getSource();
				ImageIcon icon = (ImageIcon) choseJLabel.getIcon();
				new optionframe(icon, sortnum, pagenum, menunum);
			}
		});

		// 1번쨰 메뉴 이름 넣는 JLabel
		JLabel menu1nameJLabel = new JLabel("(아이스)아메리카노");
		menu1nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu1nameJLabel.setForeground(Color.black);
		menu1nameJLabel.setBounds(25, 290, 300, 30);
		c.add(menu1nameJLabel);

		// 1번쨰 메뉴 가격 넣는 JLabel
		JLabel menu1priceJLabel = new JLabel("2,000원");
		menu1priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu1priceJLabel.setForeground(Color.black);
		menu1priceJLabel.setBounds(82, 305, 300, 30);
		c.add(menu1priceJLabel);

		// 2번쨰 메뉴 이미지 넣는 JLabel
		JLabel menu2JLabel = new JLabel(sicemixedcoffeeIcon);
		menu2JLabel.setBounds(148, 135, 110, 170);
		c.add(menu2JLabel);
		menu2JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				menunum = 2;
				JLabel choseJLabel = (JLabel) e.getSource();
				ImageIcon icon = (ImageIcon) choseJLabel.getIcon();
				new optionframe(icon, sortnum, pagenum, menunum);
			}
		});

		// 2번쨰 메뉴 이름 넣는 JLabel
		JLabel menu2nameJLabel = new JLabel("(아이스)믹스커피");
		menu2nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu2nameJLabel.setForeground(Color.black);
		menu2nameJLabel.setBounds(166, 290, 300, 30);
		c.add(menu2nameJLabel);

		// 2번째 메뉴 가격 넣는 JLabel
		JLabel menu2priceJLabel = new JLabel("3,000원");
		menu2priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu2priceJLabel.setForeground(Color.black);
		menu2priceJLabel.setBounds(214, 305, 300, 30);
		c.add(menu2priceJLabel);

		// 3번째 메뉴 이미지 넣는 JLabel
		JLabel menu3JLabel = new JLabel(sicevanilladeeplatteIcon);
		menu3JLabel.setBounds(282, 135, 110, 170);
		c.add(menu3JLabel);
		menu3JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				menunum = 3;
				JLabel choseJLabel = (JLabel) e.getSource();
				ImageIcon icon = (ImageIcon) choseJLabel.getIcon();
				new optionframe(icon, sortnum, pagenum, menunum);
			}
		});

		// 3번째 메뉴 이름 넣는 JLabel
		JLabel menu3nameJLabel = new JLabel("(아이스)바닐라딥라떼");
		menu3nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu3nameJLabel.setForeground(Color.black);
		menu3nameJLabel.setBounds(290, 290, 300, 30);
		c.add(menu3nameJLabel);

		// 3번째 메뉴 가격 넣는 JLabel
		JLabel menu3priceJLabel = new JLabel("4,000원");
		menu3priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu3priceJLabel.setForeground(Color.black);
		menu3priceJLabel.setBounds(350, 305, 300, 30);
		c.add(menu3priceJLabel);

		// 4번째 메뉴 이미지 넣는 JLabel
		JLabel menu4JLabel = new JLabel(sicevanillacreamcoldbrewIcon);
		menu4JLabel.setBounds(416, 135, 110, 170);
		c.add(menu4JLabel);
		menu4JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				menunum = 4;
				JLabel choseJLabel = (JLabel) e.getSource();
				ImageIcon icon = (ImageIcon) choseJLabel.getIcon();
				new optionframe(icon, sortnum, pagenum, menunum);
			}
		});

		// 4번째 메뉴 이름 넣는 JLabel
		JLabel menu4nameJLabel = new JLabel("(아이스)바닐라크림콜드브루");
		menu4nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu4nameJLabel.setForeground(Color.black);
		menu4nameJLabel.setBounds(405, 290, 300, 30);
		c.add(menu4nameJLabel);

		// 4번째 메뉴 가격 넣는 JLabel
		JLabel menu4priceJLabel = new JLabel("4,500원");
		menu4priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu4priceJLabel.setForeground(Color.black);
		menu4priceJLabel.setBounds(486, 305, 300, 30);
		c.add(menu4priceJLabel);

		// 5번째 메뉴 이미지 넣는 JLabel
		JLabel menu5JLabel = new JLabel(siceicecreamlatteIcon);
		menu5JLabel.setBounds(14, 340, 110, 170);
		c.add(menu5JLabel);
		menu5JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				menunum = 5;
				JLabel choseJLabel = (JLabel) e.getSource();
				ImageIcon icon = (ImageIcon) choseJLabel.getIcon();
				new optionframe(icon, sortnum, pagenum, menunum);
			}
		});

		// 5번째 메뉴 이름 넣는 JLabel
		JLabel menu5nameJLabel = new JLabel("(아이스)아이스크림라떼");
		menu5nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu5nameJLabel.setForeground(Color.black);
		menu5nameJLabel.setBounds(22, 495, 300, 30);
		c.add(menu5nameJLabel);

		// 5번째 메뉴 가격 넣는 JLabel
		JLabel menu5priceJLabel = new JLabel("4,400원");
		menu5priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu5priceJLabel.setForeground(Color.black);
		menu5priceJLabel.setBounds(82, 510, 300, 30);
		c.add(menu5priceJLabel);

		// 6번째 메뉴 이미지 넣는 JLabel
		JLabel menu6JLabel = new JLabel(siceoatcafelatteIcon);
		menu6JLabel.setBounds(148, 340, 110, 170);
		c.add(menu6JLabel);
		menu6JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				menunum = 6;
				JLabel choseJLabel = (JLabel) e.getSource();
				ImageIcon icon = (ImageIcon) choseJLabel.getIcon();
				new optionframe(icon, sortnum, pagenum, menunum);
			}
		});

		// 6번째 메뉴 이름 넣는 JLabel
		JLabel menu6nameJLabel = new JLabel("(아이스)오트카페라떼");
		menu6nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu6nameJLabel.setForeground(Color.black);
		menu6nameJLabel.setBounds(155, 495, 300, 30);
		c.add(menu6nameJLabel);

		// 6번째 메뉴 가격 넣는 JLabel
		JLabel menu6priceJLabel = new JLabel("4,300원");
		menu6priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu6priceJLabel.setForeground(Color.black);
		menu6priceJLabel.setBounds(214, 510, 300, 30);
		c.add(menu6priceJLabel);

		// 7번째 메뉴 이미지 넣는 JLabel
		JLabel menu7JLabel = new JLabel(sicecaramelmacchiatoIcon);
		menu7JLabel.setBounds(282, 340, 110, 170);
		c.add(menu7JLabel);
		menu7JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				menunum = 7;
				JLabel choseJLabel = (JLabel) e.getSource();
				ImageIcon icon = (ImageIcon) choseJLabel.getIcon();
				new optionframe(icon, sortnum, pagenum, menunum);
			}
		});

		// 7번째 메뉴 이름 넣는 JLabel
		JLabel menu7nameJLabel = new JLabel("(아이스)카라멜마끼아또");
		menu7nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu7nameJLabel.setForeground(Color.black);
		menu7nameJLabel.setBounds(285, 495, 300, 30);
		c.add(menu7nameJLabel);

		// 7번째 메뉴 가격 넣는 JLabel
		JLabel menu7priceJLabel = new JLabel("4,000원");
		menu7priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu7priceJLabel.setForeground(Color.black);
		menu7priceJLabel.setBounds(350, 510, 300, 30);
		c.add(menu7priceJLabel);

		// 8번째 메뉴 이미지 넣는 JLabel
		JLabel menu8JLabel = new JLabel(sicecafelatteIcon);
		menu8JLabel.setBounds(416, 340, 110, 170);
		c.add(menu8JLabel);
		menu8JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				menunum = 8;
				JLabel choseJLabel = (JLabel) e.getSource();
				ImageIcon icon = (ImageIcon) choseJLabel.getIcon();
				new optionframe(icon, sortnum, pagenum, menunum);
			}
		});

		// 8번째 메뉴 이름 넣는 JLabel
		JLabel menu8nameJLabel = new JLabel("(아이스)카페라떼");
		menu8nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu8nameJLabel.setForeground(Color.black);
		menu8nameJLabel.setBounds(435, 495, 300, 30);
		c.add(menu8nameJLabel);

		// 8번째 메뉴 가격 넣는 JLabel
		JLabel menu8priceJLabel = new JLabel("3,500원");
		menu8priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu8priceJLabel.setForeground(Color.black);
		menu8priceJLabel.setBounds(480, 510, 300, 30);
		c.add(menu8priceJLabel);

		// 커피(아이스) 1p 이미지 넣는 JLabel
		JLabel icecoffee1pJLabel = new JLabel(sticecoffee1pIcon);
		icecoffee1pJLabel.setBounds(235, 580, 30, 30);
		c.add(icecoffee1pJLabel);
		icecoffee1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// 커피(아이스) 2p 이미지 넣는 JLabel
		JLabel icecoffee2pJLabel = new JLabel(sicecoffee2pIcon);
		icecoffee2pJLabel.setBounds(275, 580, 30, 30);
		c.add(icecoffee2pJLabel);
		icecoffee2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// 커피(핫) 1p 이미지 넣는 JLabel
		JLabel hotcoffee1pJLabel = new JLabel(sthotcoffee1pIcon);
		hotcoffee1pJLabel.setBounds(235, 580, 30, 30);
		c.add(hotcoffee1pJLabel);
		hotcoffee1pJLabel.setVisible(false);
		hotcoffee1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// 커피(핫) 2p 이미지 넣는 JLabel
		JLabel hotcoffee2pJLabel = new JLabel(shotcoffee2pIcon);
		hotcoffee2pJLabel.setBounds(275, 580, 30, 30);
		c.add(hotcoffee2pJLabel);
		hotcoffee2pJLabel.setVisible(false);
		hotcoffee2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// 베버리지 1p 이미지 넣는 JLabel
		JLabel beverage1pJLabel = new JLabel(stbeverage1pIcon);
		beverage1pJLabel.setBounds(235, 580, 30, 30);
		c.add(beverage1pJLabel);
		beverage1pJLabel.setVisible(false);
		beverage1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// 베버리지 2p 이미지 넣는 JLabel
		JLabel beverage2pJLabel = new JLabel(sbeverage2pIcon);
		beverage2pJLabel.setBounds(275, 580, 30, 30);
		c.add(beverage2pJLabel);
		beverage2pJLabel.setVisible(false);
		beverage2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// 아이스 블렌디드 1p 이미지 넣는 JLabel
		JLabel iceblended1pJLabel = new JLabel(sticeblended1pIcon);
		iceblended1pJLabel.setBounds(215, 580, 30, 30);
		c.add(iceblended1pJLabel);
		iceblended1pJLabel.setVisible(false);
		iceblended1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// 아이스 블렌디드 2p 이미지 넣는 JLabel
		JLabel iceblended2pJLabel = new JLabel(siceblended2pIcon);
		iceblended2pJLabel.setBounds(255, 580, 30, 30);
		c.add(iceblended2pJLabel);
		iceblended2pJLabel.setVisible(false);
		iceblended2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// 아이스 블렌디드 3p 이미지 넣는 JLabel
		JLabel iceblended3pJLabel = new JLabel(siceblended3pIcon);
		iceblended3pJLabel.setBounds(295, 580, 30, 30);
		c.add(iceblended3pJLabel);
		iceblended3pJLabel.setVisible(false);
		iceblended3pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 3;
			}
		});

		// 버블티/티 1p 이미지 넣는 JLabel
		JLabel tea1pJLabel = new JLabel(sttea1pIcon);
		tea1pJLabel.setBounds(235, 580, 30, 30);
		c.add(tea1pJLabel);
		tea1pJLabel.setVisible(false);
		tea1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// 버블티/티 2p 이미지 넣는 JLabel
		JLabel tea2pJLabel = new JLabel(stea2pIcon);
		tea2pJLabel.setBounds(275, 580, 30, 30);
		c.add(tea2pJLabel);
		tea2pJLabel.setVisible(false);
		tea2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// 주스/에이드 1p 이미지 넣는 JLabel
		JLabel juice1pJLabel = new JLabel(stjuice1pIcon);
		juice1pJLabel.setBounds(235, 580, 30, 30);
		c.add(juice1pJLabel);
		juice1pJLabel.setVisible(false);
		juice1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// 버블티/티 2p 이미지 넣는 JLabel
		JLabel juice2pJLabel = new JLabel(sjuice2pIcon);
		juice2pJLabel.setBounds(275, 580, 30, 30);
		c.add(juice2pJLabel);
		juice2pJLabel.setVisible(false);
		juice2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// 사이드메뉴/RTD 1p 이미지 넣는 JLabel
		JLabel side1pJLabel = new JLabel(stside1pIcon);
		side1pJLabel.setBounds(215, 580, 30, 30);
		c.add(side1pJLabel);
		side1pJLabel.setVisible(false);
		side1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// 사이드메뉴/RTD 2p 이미지 넣는 JLabel
		JLabel side2pJLabel = new JLabel(sside2pIcon);
		side2pJLabel.setBounds(255, 580, 30, 30);
		c.add(side2pJLabel);
		side2pJLabel.setVisible(false);
		side2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// 사이드메뉴/RTD 3p 이미지 넣는 JLabel
		JLabel side3pJLabel = new JLabel(sside3pIcon);
		side3pJLabel.setBounds(295, 580, 30, 30);
		c.add(side3pJLabel);
		side3pJLabel.setVisible(false);
		side3pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 3;
			}
		});

		// 주문한 1번째 메뉴 삭제 이미지 넣는 JLabel
		remove1JLabel = new JLabel(sremoveIcon);
		remove1JLabel.setBounds(25, 640, 20, 20);
		c.add(remove1JLabel);
		remove1JLabel.setVisible(false);

		// 선택한 1번쨰 메뉴 이미지 넣는 JLabel
		chosemenu1imageJLabel = new JLabel();
		chosemenu1imageJLabel.setBounds(55, 630, 25, 40);
		c.add(chosemenu1imageJLabel);
		chosemenu1imageJLabel.setVisible(false);

		// 선택한 1번쨰 메뉴 이름 넣는 JLabel
		chosemenu1nameJLabel = new JLabel();
		chosemenu1nameJLabel.setBounds(85, 630, 200, 20);
		c.add(chosemenu1nameJLabel);
		chosemenu1nameJLabel.setVisible(false);

		// 선택한 1번째 메뉴 옵션 넣는 JLabel
		chosemenu1optionJLabel = new JLabel();
		chosemenu1optionJLabel.setBounds(85, 650, 250, 20);
		chosemenu1optionJLabel.setForeground(Color.gray);
		c.add(chosemenu1optionJLabel);
		chosemenu1optionJLabel.setVisible(false);

		// 선택한 1번째 메뉴 가격 넣는 JLabel
		chosemenu1priceJLabel = new JLabel();
		chosemenu1priceJLabel.setBounds(360, 640, 100, 20);
		chosemenu1priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenu1priceJLabel);
		chosemenu1priceJLabel.setVisible(false);

		// 1번째 메뉴 수량 빼는 이미지 넣는 JLabel
		minus1JLabel = new JLabel(sminusIcon);
		minus1JLabel.setBounds(430, 641, 19, 19);
		c.add(minus1JLabel);
		minus1JLabel.setVisible(false);

		// 1번째 메뉴 수량 넣는 JLabel
		chosemenu1quantityJLabel = new JLabel();
		chosemenu1quantityJLabel.setBounds(460, 635, 50, 30);
		chosemenu1quantityJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenu1quantityJLabel);
		chosemenu1quantityJLabel.setVisible(false);

		// 1번쨰 메뉴 수량 더하는 이미지 넣는 JLabel
		plus1JLabel = new JLabel(splusIcon);
		plus1JLabel.setBounds(480, 640, 20, 20);
		c.add(plus1JLabel);
		plus1JLabel.setVisible(false);

		minus1JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				str1 = Order.get(upindex).split(",");
				menu1quantity = Integer.parseInt(str1[4]);
				if (menu1quantity > 1) {
					--menu1quantity;
					chosemenu1quantityJLabel.setText(Integer.toString(menu1quantity));
					Order.set(upindex, str1[0] + ","  +str1[1] + "," + str1[2] + "," + str1[3] + ","  + menu1quantity);
					--basket;
					basketJLabel.setText(Integer.toString(basket));
					payment -= Integer.parseInt(str1[3]);
					paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
							+ "원 결제하기</center></body></html>");
				}
			}
		});

		plus1JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				str1 = Order.get(upindex).split(",");
				menu1quantity = Integer.parseInt(str1[4]);
				++menu1quantity;
				chosemenu1quantityJLabel.setText(Integer.toString(menu1quantity));
				Order.set(upindex, str1[0] + "," + str1[1] + "," + str1[2] + "," + str1[3] + "," + menu1quantity);
				++basket;
				basketJLabel.setText(Integer.toString(basket));
				payment += Integer.parseInt(str1[3]);
				paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
						+ "원 결제하기</center></body></html>");
			}
		});

		// 주문한 2번쨰 메뉴 삭제 이미지 넣는 JLabel
		remove2JLabel = new JLabel(sremoveIcon);
		remove2JLabel.setBounds(25, 680, 20, 20);
		c.add(remove2JLabel);
		remove2JLabel.setVisible(false);

		// 선택한 2번쨰 메뉴 이미지 넣는 JLabel
		chosemenu2imageJLabel = new JLabel();
		chosemenu2imageJLabel.setBounds(55, 670, 25, 40);
		c.add(chosemenu2imageJLabel);
		chosemenu2imageJLabel.setVisible(false);

		// 선택한 2번쨰 메뉴 이름 넣는 JLabel
		chosemenu2nameJLabel = new JLabel();
		chosemenu2nameJLabel.setBounds(85, 670, 200, 20);
		c.add(chosemenu2nameJLabel);
		chosemenu2nameJLabel.setVisible(false);

		// 선택한 2번째 메뉴 옵션 넣는 JLabel
		chosemenu2optionJLabel = new JLabel();
		chosemenu2optionJLabel.setBounds(85, 690, 250, 20);
		chosemenu2optionJLabel.setForeground(Color.gray);
		c.add(chosemenu2optionJLabel);
		chosemenu2optionJLabel.setVisible(false);

		// 선택한 2번째 메뉴 가격 넣는 JLabel
		chosemenu2priceJLabel = new JLabel();
		chosemenu2priceJLabel.setBounds(360, 680, 100, 20);
		chosemenu2priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenu2priceJLabel);
		chosemenu2priceJLabel.setVisible(false);

		// 2번째 메뉴 수량 빼는 이미지 넣는 JLabel
		minus2JLabel = new JLabel(sminusIcon);
		minus2JLabel.setBounds(430, 681, 19, 19);
		c.add(minus2JLabel);
		minus2JLabel.setVisible(false);

		// 2번째 메뉴 수량 넣는 JLabel
		chosemenu2quantityJLabel = new JLabel();
		chosemenu2quantityJLabel.setBounds(460, 675, 50, 30);
		chosemenu2quantityJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenu2quantityJLabel);
		chosemenu2quantityJLabel.setVisible(false);

		// 2번쨰 메뉴 수량 더하는 이미지 넣는 JLabel
		plus2JLabel = new JLabel(splusIcon);
		plus2JLabel.setBounds(480, 680, 20, 20);
		c.add(plus2JLabel);
		plus2JLabel.setVisible(false);
		
		minus2JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				str2 = Order.get(downindex).split(",");
				menu2quantity = Integer.parseInt(str2[4]);
				if (menu2quantity > 1) {
					--menu2quantity;
					chosemenu2quantityJLabel.setText(Integer.toString(menu2quantity));
					Order.set(downindex, str2[0] + ","  +str2[1] + "," + str2[2] + "," + str2[3] + ","  + menu2quantity);
					--basket;
					basketJLabel.setText(Integer.toString(basket));
					payment -= Integer.parseInt(str2[3]);
					paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
							+ "원 결제하기</center></body></html>");
				}
			}
		});
		
		plus2JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				str2 = Order.get(downindex).split(",");
				menu2quantity = Integer.parseInt(str2[4]);
				++menu2quantity;
				chosemenu2quantityJLabel.setText(Integer.toString(menu2quantity));
				Order.set(downindex, str2[0] + "," + str2[1] + "," + str2[2] + "," + str2[3] + "," + menu2quantity);
				++basket;
				basketJLabel.setText(Integer.toString(basket));
				payment += Integer.parseInt(str2[3]);
				paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
						+ "원 결제하기</center></body></html>");
			}
		});

		// 메뉴 페이지 올리는 이미지 넣는 JLabel
		upJLabel = new JLabel(supIcon);
		upJLabel.setBounds(510, 640, 20, 20);
		c.add(upJLabel);
		upJLabel.setVisible(false);

		// 메뉴 페이지 내리는 이미지 넣는 JLabel
		downJLabel = new JLabel(stdownIcon);
		downJLabel.setBounds(510, 680, 20, 20);
		c.add(downJLabel);
		downJLabel.setVisible(false);

		remove1JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (Order.size() > 0) {
					str = Order.get(upindex).split(",");
				}
				Order.remove(upindex);
				if (upindex != 0) {
					--upindex;
					downindex = upindex + 1;
				}
				if (Order.size() < 3) {
					upJLabel.setVisible(false);
					downJLabel.setVisible(false);
					if (Order.size() == 2) {
						str1 = Order.get(upindex).split(",");
						new chosemenuimage(str1[0]);
						chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
						chosemenu1imageJLabel.setVisible(true);
						chosemenu1nameJLabel.setText(str1[1]);
						chosemenu1nameJLabel.setVisible(true);
						chosemenu1optionJLabel.setText(str1[2]);
						chosemenu1optionJLabel.setVisible(true);
						chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
						chosemenu1priceJLabel.setVisible(true);
						chosemenu1quantityJLabel.setText(str1[4]);
						chosemenu1quantityJLabel.setVisible(true);

						str2 = Order.get(downindex).split(",");
						new chosemenuimage(str2[0]);
						chosemenu2imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
						chosemenu2imageJLabel.setVisible(true);
						chosemenu2nameJLabel.setText(str2[1]);
						chosemenu2nameJLabel.setVisible(true);
						chosemenu2optionJLabel.setText(str2[2]);
						chosemenu2optionJLabel.setVisible(true);
						chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "원");
						chosemenu2priceJLabel.setVisible(true);
						chosemenu2quantityJLabel.setText(str2[4]);
						chosemenu2quantityJLabel.setVisible(true);

						basket -= Integer.parseInt(str[4]);
						basketJLabel.setText(Integer.toString(basket));
						payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
						paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
								+ "원 결제하기</center></body></html>");

					} else if (Order.size() == 1) {
						str1 = Order.get(upindex).split(",");
						new chosemenuimage(str1[0]);
						chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
						chosemenu1imageJLabel.setVisible(true);
						chosemenu1nameJLabel.setText(str1[1]);
						chosemenu1nameJLabel.setVisible(true);
						chosemenu1optionJLabel.setText(str1[2]);
						chosemenu1optionJLabel.setVisible(true);
						chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
						chosemenu1priceJLabel.setVisible(true);
						chosemenu1quantityJLabel.setText(str1[4]);
						chosemenu1quantityJLabel.setVisible(true);

						remove2JLabel.setVisible(false);
						chosemenu2imageJLabel.setVisible(false);
						chosemenu2nameJLabel.setVisible(false);
						chosemenu2optionJLabel.setVisible(false);
						chosemenu2priceJLabel.setVisible(false);
						chosemenu2quantityJLabel.setVisible(false);
						plus2JLabel.setVisible(false);
						minus2JLabel.setVisible(false);

						basket -= Integer.parseInt(str[4]);
						basketJLabel.setText(Integer.toString(basket));
						payment -= Integer.parseInt(str[3]);
						paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
								+ "원 결제하기</center></body></html>");

					} else {
						remove1JLabel.setVisible(false);
						chosemenu1imageJLabel.setVisible(false);
						chosemenu1nameJLabel.setVisible(false);
						chosemenu1optionJLabel.setVisible(false);
						chosemenu1priceJLabel.setVisible(false);
						chosemenu1quantityJLabel.setVisible(false);
						plus1JLabel.setVisible(false);
						minus1JLabel.setVisible(false);

						basket -= Integer.parseInt(str[4]);
						basketJLabel.setText(Integer.toString(basket));
						payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
						paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
								+ "원 결제하기</center></body></html>");

					}
				} else {
					upJLabel.setVisible(true);
					downJLabel.setVisible(true);

					str1 = Order.get(upindex).split(",");
					new chosemenuimage(str1[0]);
					chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
					chosemenu1imageJLabel.setVisible(true);
					chosemenu1nameJLabel.setText(str1[1]);
					chosemenu1nameJLabel.setVisible(true);
					chosemenu1optionJLabel.setText(str1[2]);
					chosemenu1optionJLabel.setVisible(true);
					chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
					chosemenu1priceJLabel.setVisible(true);
					chosemenu1quantityJLabel.setText(str1[4]);
					chosemenu1quantityJLabel.setVisible(true);

					str2 = Order.get(downindex).split(",");
					new chosemenuimage(str2[0]);
					chosemenu2imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
					chosemenu2imageJLabel.setVisible(true);
					chosemenu2nameJLabel.setText(str2[1]);
					chosemenu2nameJLabel.setVisible(true);
					chosemenu2optionJLabel.setText(str2[2]);
					chosemenu2optionJLabel.setVisible(true);
					chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "원");
					chosemenu2priceJLabel.setVisible(true);
					chosemenu2quantityJLabel.setText(str2[4]);
					chosemenu2quantityJLabel.setVisible(true);

					basket -= Integer.parseInt(str[4]);
					basketJLabel.setText(Integer.toString(basket));
					payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
					paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
							+ "원 결제하기</center></body></html>");

				}
			}
		});

		remove2JLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (Order.size() > 0) {
					str = Order.get(downindex).split(",");
				}
				Order.remove(downindex);
				if (downindex != Order.size() - 1) {
					--downindex;
					if (upindex != 0) {
						--upindex;
					}
				}
				if (Order.size() < 3) {
					upJLabel.setVisible(false);
					downJLabel.setVisible(false);
					if (Order.size() == 2) {
						str1 = Order.get(upindex).split(",");
						new chosemenuimage(str1[0]);
						chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
						chosemenu1imageJLabel.setVisible(true);
						chosemenu1nameJLabel.setText(str1[1]);
						chosemenu1nameJLabel.setVisible(true);
						chosemenu1optionJLabel.setText(str1[2]);
						chosemenu1optionJLabel.setVisible(true);
						chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
						chosemenu1priceJLabel.setVisible(true);
						chosemenu1quantityJLabel.setText(str1[4]);
						chosemenu1quantityJLabel.setVisible(true);

						str2 = Order.get(downindex).split(",");
						new chosemenuimage(str2[0]);
						chosemenu2imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
						chosemenu2imageJLabel.setVisible(true);
						chosemenu2nameJLabel.setText(str2[1]);
						chosemenu2nameJLabel.setVisible(true);
						chosemenu2optionJLabel.setText(str2[2]);
						chosemenu2optionJLabel.setVisible(true);
						chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "원");
						chosemenu2priceJLabel.setVisible(true);
						chosemenu2quantityJLabel.setText(str2[4]);
						chosemenu2quantityJLabel.setVisible(true);

						basket -= Integer.parseInt(str[4]);
						basketJLabel.setText(Integer.toString(basket));
						payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
						paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
								+ "원 결제하기</center></body></html>");

					} else if (Order.size() == 1) {
						str1 = Order.get(upindex).split(",");
						new chosemenuimage(str1[0]);
						chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
						chosemenu1imageJLabel.setVisible(true);
						chosemenu1nameJLabel.setText(str1[1]);
						chosemenu1nameJLabel.setVisible(true);
						chosemenu1optionJLabel.setText(str1[2]);
						chosemenu1optionJLabel.setVisible(true);
						chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
						chosemenu1priceJLabel.setVisible(true);
						chosemenu1quantityJLabel.setText(str1[4]);
						chosemenu1quantityJLabel.setVisible(true);

						remove2JLabel.setVisible(false);
						chosemenu2imageJLabel.setVisible(false);
						chosemenu2nameJLabel.setVisible(false);
						chosemenu2optionJLabel.setVisible(false);
						chosemenu2priceJLabel.setVisible(false);
						chosemenu2quantityJLabel.setVisible(false);
						plus2JLabel.setVisible(false);
						minus2JLabel.setVisible(false);

						basket -= Integer.parseInt(str[4]);
						basketJLabel.setText(Integer.toString(basket));
						payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
						paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
								+ "원 결제하기</center></body></html>");
					}
				} else {
					upJLabel.setVisible(true);
					downJLabel.setVisible(true);

					str1 = Order.get(upindex).split(",");
					new chosemenuimage(str1[0]);
					chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
					chosemenu1imageJLabel.setVisible(true);
					chosemenu1nameJLabel.setText(str1[1]);
					chosemenu1nameJLabel.setVisible(true);
					chosemenu1optionJLabel.setText(str1[2]);
					chosemenu1optionJLabel.setVisible(true);
					chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
					chosemenu1priceJLabel.setVisible(true);
					chosemenu1quantityJLabel.setText(str1[4]);
					chosemenu1quantityJLabel.setVisible(true);

					str2 = Order.get(downindex).split(",");
					new chosemenuimage(str2[0]);
					chosemenu2imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
					chosemenu2imageJLabel.setVisible(true);
					chosemenu2nameJLabel.setText(str2[1]);
					chosemenu2nameJLabel.setVisible(true);
					chosemenu2optionJLabel.setText(str2[2]);
					chosemenu2optionJLabel.setVisible(true);
					chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "원");
					chosemenu2priceJLabel.setVisible(true);
					chosemenu2quantityJLabel.setText(str2[4]);
					chosemenu2quantityJLabel.setVisible(true);

					basket -= Integer.parseInt(str[4]);
					basketJLabel.setText(Integer.toString(basket));
					payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
					paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
							+ "원 결제하기</center></body></html>");
				}
			}
		});

		upJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (upindex != 0) {
					upindex -= 1;
					downindex = upindex + 1;

					str1 = Order.get(upindex).split(",");
					new chosemenuimage(str1[0]);
					chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
					chosemenu1imageJLabel.setVisible(true);
					chosemenu1nameJLabel.setText(str1[1]);
					chosemenu1nameJLabel.setVisible(true);
					chosemenu1optionJLabel.setText(str1[2]);
					chosemenu1optionJLabel.setVisible(true);
					chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
					chosemenu1priceJLabel.setVisible(true);
					chosemenu1quantityJLabel.setText(str1[4]);
					chosemenu1quantityJLabel.setVisible(true);

					str2 = Order.get(downindex).split(",");
					new chosemenuimage(str2[0]);
					chosemenu2imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
					chosemenu2imageJLabel.setVisible(true);
					chosemenu2nameJLabel.setText(str2[1]);
					chosemenu2nameJLabel.setVisible(true);
					chosemenu2optionJLabel.setText(str2[2]);
					chosemenu2optionJLabel.setVisible(true);
					chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "원");
					chosemenu2priceJLabel.setVisible(true);
					chosemenu2quantityJLabel.setText(str2[4]);
					chosemenu2quantityJLabel.setVisible(true);

					if (upindex == 0) {
						upJLabel.setIcon(supIcon);
					}
				}
				downJLabel.setIcon(stdownIcon);
			}
		});

		downJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (downindex != Order.size() - 1) {
					++upindex;
					downindex = upindex + 1;

					str1 = Order.get(upindex).split(",");
					new chosemenuimage(str1[0]);
					chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
					chosemenu1imageJLabel.setVisible(true);
					chosemenu1nameJLabel.setText(str1[1]);
					chosemenu1nameJLabel.setVisible(true);
					chosemenu1optionJLabel.setText(str1[2]);
					chosemenu1optionJLabel.setVisible(true);
					chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "원");
					chosemenu1priceJLabel.setVisible(true);
					chosemenu1quantityJLabel.setText(str1[4]);
					chosemenu1quantityJLabel.setVisible(true);

					str2 = Order.get(downindex).split(",");
					new chosemenuimage(str2[0]);
					chosemenu2imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
					chosemenu2imageJLabel.setVisible(true);
					chosemenu2nameJLabel.setText(str2[1]);
					chosemenu2nameJLabel.setVisible(true);
					chosemenu2optionJLabel.setText(str2[2]);
					chosemenu2optionJLabel.setVisible(true);
					chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "원");
					chosemenu2priceJLabel.setVisible(true);
					chosemenu2quantityJLabel.setText(str2[4]);
					chosemenu2quantityJLabel.setVisible(true);

					if (downindex == Order.size() - 1) {
						downJLabel.setIcon(sdownIcon);
					}
				}
				upJLabel.setIcon(stupIcon);
			}
		});

		// 전체삭제 메뉴 넣는 JLabel
		JLabel deleteJLabel = new JLabel(sdeleteIcon);
		deleteJLabel.setBounds(48, 720, 150, 55);
		c.add(deleteJLabel);
		deleteJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				remove1JLabel.setVisible(false);
				chosemenu1imageJLabel.setVisible(false);
				chosemenu1nameJLabel.setVisible(false);
				chosemenu1optionJLabel.setVisible(false);
				chosemenu1priceJLabel.setVisible(false);
				chosemenu1quantityJLabel.setVisible(false);
				minus1JLabel.setVisible(false);
				plus1JLabel.setVisible(false);
				remove2JLabel.setVisible(false);
				chosemenu2imageJLabel.setVisible(false);
				chosemenu2nameJLabel.setVisible(false);
				chosemenu2optionJLabel.setVisible(false);
				chosemenu2priceJLabel.setVisible(false);
				chosemenu2quantityJLabel.setVisible(false);
				minus2JLabel.setVisible(false);
				plus2JLabel.setVisible(false);
				downJLabel.setVisible(false);
				upJLabel.setVisible(false);
				basket = 0;
				basketJLabel.setText(Integer.toString(basket));
				payment = 0;
				paymentJLabel.setText("<html><body><center>총 " + basket + "개 상품<br>" + formatter.format(payment)
						+ "원 결제하기</center></body></html>");
				Order.clear();
			}
		});

		// 장바구니 개수 넣는 JLabel
		basketJLabel = new JLabel(Integer.toString(basket));
		basketJLabel.setBounds(43, 723, 20, 20);
		basketJLabel.setForeground(Color.white);
		basketJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(basketJLabel);

		// 상품 개수와 결제금액 넣는 JLabel
		paymentJLabel = new JLabel(
				"<html><body><center>총 " + basket + "개 상품<br>" + payment + "원 결제하기</center></body></html>",
				SwingConstants.CENTER);
		paymentJLabel.setBounds(318, 721, 250, 50);
		paymentJLabel.setForeground(Color.white);
		paymentJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		c.add(paymentJLabel);
		paymentJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (Order.size() > 0) {
					new orderdetailsframe(Order);
				}
			}
		});

		// 선택된 메뉴가 들어가는 메뉴판 이미지 넣는 JLabel
		JLabel menuJLabel = new JLabel(smenuIcon);
		menuJLabel.setBounds(0, 530, 540, 320);
		c.add(menuJLabel);

		// 커피(아이스) 항목 선택되면 바뀌는 Listener
		icecoffeeJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffeeJLabel.setIcon(sticecoffeeIcon);
				hotcoffeeJLabel.setIcon(shotcoffeeIcon);
				beverageJLabel.setIcon(sbeverageIcon);
				iceblendedJLabel.setIcon(siceblendedIcon);
				teaJLabel.setIcon(steaIcon);
				juiceJLabel.setIcon(sjuiceIcon);
				sideJLabel.setIcon(ssideIcon);
				menu1JLabel.setIcon(siceamericanoIcon);
				menu1nameJLabel.setText("(아이스)아메리카노");
				menu1priceJLabel.setText("2,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sicemixedcoffeeIcon);
				menu2nameJLabel.setText("(아이스)믹스커피");
				menu2priceJLabel.setText("3,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sicevanilladeeplatteIcon);
				menu3nameJLabel.setText("(아이스)바닐라딥라떼");
				menu3priceJLabel.setText("4,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sicevanillacreamcoldbrewIcon);
				menu4nameJLabel.setText("(아이스)바닐라크림콜드브루");
				menu4priceJLabel.setText("4,500원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(siceicecreamlatteIcon);
				menu5nameJLabel.setText("(아이스)아이스크림라떼");
				menu5priceJLabel.setText("4,400원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(siceoatcafelatteIcon);
				menu6nameJLabel.setText("(아이스)오트카페라떼");
				menu6priceJLabel.setText("4,300원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sicecaramelmacchiatoIcon);
				menu7nameJLabel.setText("(아이스)카라멜마끼아또");
				menu7priceJLabel.setText("4,000원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sicecafelatteIcon);
				menu8nameJLabel.setText("(아이스)카페라떼");
				menu8priceJLabel.setText("3,500원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
				icecoffee1pJLabel.setVisible(true);
				icecoffee2pJLabel.setVisible(true);
				icecoffee1pJLabel.setIcon(sticecoffee1pIcon);
				icecoffee2pJLabel.setIcon(sicecoffee2pIcon);
				hotcoffee1pJLabel.setVisible(false);
				hotcoffee2pJLabel.setVisible(false);
				beverage1pJLabel.setVisible(false);
				beverage2pJLabel.setVisible(false);
				iceblended1pJLabel.setVisible(false);
				iceblended2pJLabel.setVisible(false);
				iceblended3pJLabel.setVisible(false);
				tea1pJLabel.setVisible(false);
				tea2pJLabel.setVisible(false);
				juice1pJLabel.setVisible(false);
				juice2pJLabel.setVisible(false);
				side1pJLabel.setVisible(false);
				side2pJLabel.setVisible(false);
				side3pJLabel.setVisible(false);
			}
		});

		// 커피(아이스) 1p 선택되면 바뀌는 Listener
		icecoffee1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffee1pJLabel.setIcon(sticecoffee1pIcon);
				icecoffee2pJLabel.setIcon(sicecoffee2pIcon);
				menu1JLabel.setIcon(siceamericanoIcon);
				menu1nameJLabel.setText("(아이스)아메리카노");
				menu1priceJLabel.setText("2,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sicemixedcoffeeIcon);
				menu2nameJLabel.setText("(아이스)믹스커피");
				menu2priceJLabel.setText("3,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sicevanilladeeplatteIcon);
				menu3nameJLabel.setText("(아이스)바닐라딥라떼");
				menu3priceJLabel.setText("4,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sicevanillacreamcoldbrewIcon);
				menu4nameJLabel.setText("(아이스)바닐라크림콜드브루");
				menu4priceJLabel.setText("4,500원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(siceicecreamlatteIcon);
				menu5nameJLabel.setText("(아이스)아이스크림라떼");
				menu5priceJLabel.setText("4,400원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(siceoatcafelatteIcon);
				menu6nameJLabel.setText("(아이스)오트카페라떼");
				menu6priceJLabel.setText("4,300원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sicecaramelmacchiatoIcon);
				menu7nameJLabel.setText("(아이스)카라멜마끼아또");
				menu7priceJLabel.setText("4,000원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sicecafelatteIcon);
				menu8nameJLabel.setText("(아이스)카페라떼");
				menu8priceJLabel.setText("3,500원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 커피(아이스) 2p 선택되면 바뀌는 Listener
		icecoffee2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffee1pJLabel.setIcon(sicecoffee1pIcon);
				icecoffee2pJLabel.setIcon(sticecoffee2pIcon);
				menu1JLabel.setIcon(sicecafemochaIcon);
				menu1nameJLabel.setText("(아이스)카페모카");
				menu1priceJLabel.setText("4,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sicecoconutIcon);
				menu2nameJLabel.setText("(아이스)코코넛라떼");
				menu2priceJLabel.setText("4,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sicecoldbrewIcon);
				menu3nameJLabel.setText("(아이스)콜드브루");
				menu3priceJLabel.setText("3,800원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sicecoldbrewlatteIcon);
				menu4nameJLabel.setText("(아이스)콜드브루라떼");
				menu4priceJLabel.setText("4,300원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sicetoffeenutlatteIcon);
				menu5nameJLabel.setText("(아이스)토피넛라떼");
				menu5priceJLabel.setText("4,200원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sicehazelnutdeeplatteIcon);
				menu6nameJLabel.setText("(아이스)헤이즐넛딥라떼");
				menu6priceJLabel.setText("4,000원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sicehazelnutcreamcoldbrewIcon);
				menu7nameJLabel.setText("(아이스)헤이즐넛크림콜드브루");
				menu7priceJLabel.setText("4,500원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setVisible(false);
				menu8nameJLabel.setVisible(false);
				menu8priceJLabel.setVisible(false);
			}
		});

		// 커피(핫) 항목 선택되면 바뀌는 Listener
		hotcoffeeJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffeeJLabel.setIcon(sicecoffeeIcon);
				hotcoffeeJLabel.setIcon(sthotcoffeeIcon);
				beverageJLabel.setIcon(sbeverageIcon);
				iceblendedJLabel.setIcon(siceblendedIcon);
				teaJLabel.setIcon(steaIcon);
				juiceJLabel.setIcon(sjuiceIcon);
				sideJLabel.setIcon(ssideIcon);
				menu1JLabel.setIcon(shotamericanoIcon);
				menu1nameJLabel.setText("(핫)아메리카노");
				menu1priceJLabel.setText("2,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(shotmixedcoffeeIcon);
				menu2nameJLabel.setText("(핫)믹스커피");
				menu2priceJLabel.setText("3,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(shotvanilladeeplatteIcon);
				menu3nameJLabel.setText("(핫)바닐라딥라떼");
				menu3priceJLabel.setText("4,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(shotcondensedmilklatteIcon);
				menu4nameJLabel.setText("(핫)연유라떼");
				menu4priceJLabel.setText("4,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(shotoatcafelatteIcon);
				menu5nameJLabel.setText("(핫)오트카페라떼");
				menu5priceJLabel.setText("4,300원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(shotcaramelmacchiatoIcon);
				menu6nameJLabel.setText("(핫)카라멜마끼아또");
				menu6priceJLabel.setText("4,000원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(shotcafelatteIcon);
				menu7nameJLabel.setText("(핫)카페라떼");
				menu7priceJLabel.setText("3,500원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(shotcafemochaIcon);
				menu8nameJLabel.setText("(핫)카페모카");
				menu8priceJLabel.setText("4,000원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
				icecoffee1pJLabel.setVisible(false);
				icecoffee2pJLabel.setVisible(false);
				hotcoffee1pJLabel.setIcon(sthotcoffee1pIcon);
				hotcoffee1pJLabel.setVisible(true);
				hotcoffee2pJLabel.setIcon(shotcoffee2pIcon);
				hotcoffee2pJLabel.setVisible(true);
				beverage1pJLabel.setVisible(false);
				beverage2pJLabel.setVisible(false);
				iceblended1pJLabel.setVisible(false);
				iceblended2pJLabel.setVisible(false);
				iceblended3pJLabel.setVisible(false);
				tea1pJLabel.setVisible(false);
				tea2pJLabel.setVisible(false);
				juice1pJLabel.setVisible(false);
				juice2pJLabel.setVisible(false);
				side1pJLabel.setVisible(false);
				side2pJLabel.setVisible(false);
				side3pJLabel.setVisible(false);
			}
		});

		// 커피(핫) 1p 선택되면 바뀌는 Listener
		hotcoffee1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				hotcoffee1pJLabel.setIcon(sthotcoffee1pIcon);
				hotcoffee2pJLabel.setIcon(shotcoffee2pIcon);
				menu1JLabel.setIcon(shotamericanoIcon);
				menu1nameJLabel.setText("(핫)아메리카노");
				menu1priceJLabel.setText("2,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(shotmixedcoffeeIcon);
				menu2nameJLabel.setText("(핫)믹스커피");
				menu2priceJLabel.setText("3,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(shotvanilladeeplatteIcon);
				menu3nameJLabel.setText("(핫)바닐라딥라떼");
				menu3priceJLabel.setText("4,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(shotcondensedmilklatteIcon);
				menu4nameJLabel.setText("(핫)연유라떼");
				menu4priceJLabel.setText("4,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(shotoatcafelatteIcon);
				menu5nameJLabel.setText("(핫)오트카페라떼");
				menu5priceJLabel.setText("4,300원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(shotcaramelmacchiatoIcon);
				menu6nameJLabel.setText("(핫)카라멜마끼아또");
				menu6priceJLabel.setText("4,000원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(shotcafelatteIcon);
				menu7nameJLabel.setText("(핫)카페라떼");
				menu7priceJLabel.setText("3,500원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(shotcafemochaIcon);
				menu8nameJLabel.setText("(핫)카페모카");
				menu8priceJLabel.setText("4,000원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 커피(핫) 2p 선택되면 바뀌는 Listener
		hotcoffee2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				hotcoffee1pJLabel.setIcon(shotcoffee1pIcon);
				hotcoffee2pJLabel.setIcon(sthotcoffee2pIcon);
				menu1JLabel.setIcon(shotcoconutlatteIcon);
				menu1nameJLabel.setText("(핫)코코넛라떼");
				menu1priceJLabel.setText("4,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(shottoffeenutlatteIcon);
				menu2nameJLabel.setText("(핫)토피넛라떼");
				menu2priceJLabel.setText("4,200원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(shothazelnutdeeplatteIcon);
				menu3nameJLabel.setText("(핫)헤이즐넛딥라떼");
				menu3priceJLabel.setText("4,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setVisible(false);
				menu4nameJLabel.setVisible(false);
				menu4priceJLabel.setVisible(false);
				menu5JLabel.setVisible(false);
				menu5nameJLabel.setVisible(false);
				menu5priceJLabel.setVisible(false);
				menu6JLabel.setVisible(false);
				menu6nameJLabel.setVisible(false);
				menu6priceJLabel.setVisible(false);
				menu7JLabel.setVisible(false);
				menu7nameJLabel.setVisible(false);
				menu7priceJLabel.setVisible(false);
				menu8JLabel.setVisible(false);
				menu8nameJLabel.setVisible(false);
				menu8priceJLabel.setVisible(false);
			}
		});

		// 베버리지 항목 선택되면 바뀌는 Listener
		beverageJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffeeJLabel.setIcon(sicecoffeeIcon);
				hotcoffeeJLabel.setIcon(shotcoffeeIcon);
				beverageJLabel.setIcon(stbeverageIcon);
				iceblendedJLabel.setIcon(siceblendedIcon);
				teaJLabel.setIcon(steaIcon);
				juiceJLabel.setIcon(sjuiceIcon);
				sideJLabel.setIcon(ssideIcon);
				menu1JLabel.setIcon(ssweetpotatolatteIcon);
				menu1nameJLabel.setText("군고구마라떼");
				menu1priceJLabel.setText("4,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sstrawberrylatteIcon);
				menu2nameJLabel.setText("딸기라떼");
				menu2priceJLabel.setText("4,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sroyalmilkteaIcon);
				menu3nameJLabel.setText("로얄밀크티");
				menu3priceJLabel.setText("4,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(smatchalatteIcon);
				menu4nameJLabel.setText("말차라떼");
				menu4priceJLabel.setText("4,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(smatchaeinspennerIcon);
				menu5nameJLabel.setText("말차아인슈페너");
				menu5priceJLabel.setText("4,000원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smeltingchocoIcon);
				menu6nameJLabel.setText("멜팅초코");
				menu6priceJLabel.setText("4,400원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(smixedgrainpowderIcon);
				menu7nameJLabel.setText("미숫가루");
				menu7priceJLabel.setText("3,500원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(smixedgrainpowderlatteIcon);
				menu8nameJLabel.setText("미숫가루라떼");
				menu8priceJLabel.setText("4,000원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
				icecoffee1pJLabel.setVisible(false);
				icecoffee2pJLabel.setVisible(false);
				hotcoffee1pJLabel.setVisible(false);
				hotcoffee2pJLabel.setVisible(false);
				beverage1pJLabel.setIcon(stbeverage1pIcon);
				beverage1pJLabel.setVisible(true);
				beverage2pJLabel.setIcon(sbeverage2pIcon);
				beverage2pJLabel.setVisible(true);
				iceblended1pJLabel.setVisible(false);
				iceblended2pJLabel.setVisible(false);
				iceblended3pJLabel.setVisible(false);
				tea1pJLabel.setVisible(false);
				tea2pJLabel.setVisible(false);
				juice1pJLabel.setVisible(false);
				juice2pJLabel.setVisible(false);
				side1pJLabel.setVisible(false);
				side2pJLabel.setVisible(false);
				side3pJLabel.setVisible(false);
			}
		});

		// 베버리지 1p 선택되면 바뀌는 Listener
		beverage1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				beverage1pJLabel.setIcon(stbeverage1pIcon);
				beverage2pJLabel.setIcon(sbeverage2pIcon);
				menu1JLabel.setIcon(ssweetpotatolatteIcon);
				menu1nameJLabel.setText("군고구마라떼");
				menu1priceJLabel.setText("4,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sstrawberrylatteIcon);
				menu2nameJLabel.setText("딸기라떼");
				menu2priceJLabel.setText("4,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sroyalmilkteaIcon);
				menu3nameJLabel.setText("로얄밀크티");
				menu3priceJLabel.setText("4,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(smatchalatteIcon);
				menu4nameJLabel.setText("말차라떼");
				menu4priceJLabel.setText("4,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(smatchaeinspennerIcon);
				menu5nameJLabel.setText("말차아인슈페너");
				menu5priceJLabel.setText("4,000원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smeltingchocoIcon);
				menu6nameJLabel.setText("멜팅초코");
				menu6priceJLabel.setText("4,400원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(smixedgrainpowderIcon);
				menu7nameJLabel.setText("미숫가루");
				menu7priceJLabel.setText("3,500원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(smixedgrainpowderlatteIcon);
				menu8nameJLabel.setText("미숫가루라떼");
				menu8priceJLabel.setText("4,000원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 베버리지 2p 선택되면 바뀌는 Listener
		beverage2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				beverage1pJLabel.setIcon(sbeverage1pIcon);
				beverage2pJLabel.setIcon(stbeverage2pIcon);
				menu1JLabel.setIcon(schocolatteIcon);
				menu1nameJLabel.setText("초코라떼");
				menu1priceJLabel.setText("4,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setVisible(false);
				menu2nameJLabel.setVisible(false);
				menu2priceJLabel.setVisible(false);
				menu3JLabel.setVisible(false);
				menu3nameJLabel.setVisible(false);
				menu3priceJLabel.setVisible(false);
				menu4JLabel.setVisible(false);
				menu4nameJLabel.setVisible(false);
				menu4priceJLabel.setVisible(false);
				menu5JLabel.setVisible(false);
				menu5nameJLabel.setVisible(false);
				menu5priceJLabel.setVisible(false);
				menu6JLabel.setVisible(false);
				menu6nameJLabel.setVisible(false);
				menu6priceJLabel.setVisible(false);
				menu7JLabel.setVisible(false);
				menu7nameJLabel.setVisible(false);
				menu7priceJLabel.setVisible(false);
				menu8JLabel.setVisible(false);
				menu8nameJLabel.setVisible(false);
				menu8priceJLabel.setVisible(false);
			}
		});

		// 아이스 블렌디드 항목 선택되면 바뀌는 Listener
		iceblendedJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffeeJLabel.setIcon(sicecoffeeIcon);
				hotcoffeeJLabel.setIcon(shotcoffeeIcon);
				beverageJLabel.setIcon(sbeverageIcon);
				iceblendedJLabel.setIcon(sticeblendedIcon);
				teaJLabel.setIcon(steaIcon);
				juiceJLabel.setIcon(sjuiceIcon);
				sideJLabel.setIcon(ssideIcon);
				menu1JLabel.setIcon(sstrawberryshakeIcon);
				menu1nameJLabel.setText("딸기쉐이크");
				menu1priceJLabel.setText("4,400원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sstrawberryyogurtsmoothieIcon);
				menu2nameJLabel.setText("딸기요거트스무디");
				menu2priceJLabel.setText("4,400원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(smatchafrappeIcon);
				menu3nameJLabel.setText("말차프라페");
				menu3priceJLabel.setText("4,400원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(smangoyogurtsmoothieIcon);
				menu4nameJLabel.setText("망고요거트스무디");
				menu4priceJLabel.setText("4,400원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(smangofashioncrushIcon);
				menu5nameJLabel.setText("망고패션크러쉬");
				menu5priceJLabel.setText("4,700원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smintchocochipfrappeIcon);
				menu6nameJLabel.setText("민트초코칩프라페");
				menu6priceJLabel.setText("4,400원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(smilkshakeIcon);
				menu7nameJLabel.setText("밀크쉐이크");
				menu7priceJLabel.setText("4,400원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sblueberryyogurtsmoothieIcon);
				menu8nameJLabel.setText("블루베리요거트스무디");
				menu8priceJLabel.setText("4,400원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
				icecoffee1pJLabel.setVisible(false);
				icecoffee2pJLabel.setVisible(false);
				hotcoffee1pJLabel.setVisible(false);
				hotcoffee2pJLabel.setVisible(false);
				beverage1pJLabel.setVisible(false);
				beverage2pJLabel.setVisible(false);
				iceblended1pJLabel.setVisible(true);
				iceblended1pJLabel.setIcon(sticeblended1pIcon);
				iceblended2pJLabel.setVisible(true);
				iceblended2pJLabel.setIcon(siceblended2pIcon);
				iceblended3pJLabel.setVisible(true);
				iceblended3pJLabel.setIcon(siceblended3pIcon);
				tea1pJLabel.setVisible(false);
				tea2pJLabel.setVisible(false);
				juice1pJLabel.setVisible(false);
				juice2pJLabel.setVisible(false);
				side1pJLabel.setVisible(false);
				side2pJLabel.setVisible(false);
				side3pJLabel.setVisible(false);
			}
		});

		// 아이스블렌디드 1p 선택되면 바뀌는 Listener
		iceblended1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				iceblended1pJLabel.setIcon(sticeblended1pIcon);
				iceblended2pJLabel.setIcon(siceblended2pIcon);
				iceblended3pJLabel.setIcon(siceblended3pIcon);
				menu1JLabel.setIcon(sstrawberryshakeIcon);
				menu1nameJLabel.setText("딸기쉐이크");
				menu1priceJLabel.setText("4,400원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sstrawberryyogurtsmoothieIcon);
				menu2nameJLabel.setText("딸기요거트스무디");
				menu2priceJLabel.setText("4,400원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(smatchafrappeIcon);
				menu3nameJLabel.setText("말차프라페");
				menu3priceJLabel.setText("4,400원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(smangoyogurtsmoothieIcon);
				menu4nameJLabel.setText("망고요거트스무디");
				menu4priceJLabel.setText("4,400원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(smangofashioncrushIcon);
				menu5nameJLabel.setText("망고패션크러쉬");
				menu5priceJLabel.setText("4,700원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smintchocochipfrappeIcon);
				menu6nameJLabel.setText("민트초코칩프라페");
				menu6priceJLabel.setText("4,400원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(smilkshakeIcon);
				menu7nameJLabel.setText("밀크쉐이크");
				menu7priceJLabel.setText("4,400원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sblueberryyogurtsmoothieIcon);
				menu8nameJLabel.setText("블루베리요거트스무디");
				menu8priceJLabel.setText("4,400원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 아이스블렌디드 2p 선택되면 바뀌는 Listener
		iceblended2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				iceblended1pJLabel.setIcon(siceblended1pIcon);
				iceblended2pJLabel.setIcon(sticeblended2pIcon);
				iceblended3pJLabel.setIcon(siceblended3pIcon);
				menu1JLabel.setIcon(sespressoshakeIcon);
				menu1nameJLabel.setText("에스프레소쉐이크");
				menu1priceJLabel.setText("4,400원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(scitronpearcrushIcon);
				menu2nameJLabel.setText("유자배크러쉬");
				menu2priceJLabel.setText("4,700원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(splumpeachcrushIcon);
				menu3nameJLabel.setText("자두피치크러쉬");
				menu3priceJLabel.setText("4,700원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sjavachipfrappeIcon);
				menu4nameJLabel.setText("자바칩프라페");
				menu4priceJLabel.setText("4,400원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(schocoshakeIcon);
				menu5nameJLabel.setText("초코쉐이크");
				menu5priceJLabel.setText("4,400원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(scoconutcoffeefrappeIcon);
				menu6nameJLabel.setText("코코넛커피프라페");
				menu6priceJLabel.setText("5,000원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(scocochocofrappeIcon);
				menu7nameJLabel.setText("코코초코프라페");
				menu7priceJLabel.setText("4,400원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(scookiencreamfrappeIcon);
				menu8nameJLabel.setText("쿠키앤크림프라페");
				menu8priceJLabel.setText("4,400원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 아이스블렌디드 3p 선택되면 바뀌는 Listener
		iceblended3pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				iceblended1pJLabel.setIcon(siceblended1pIcon);
				iceblended2pJLabel.setIcon(siceblended2pIcon);
				iceblended3pJLabel.setIcon(sticeblended3pIcon);
				menu1JLabel.setIcon(sgrapeberrycrushIcon);
				menu1nameJLabel.setText("포도베리크러쉬");
				menu1priceJLabel.setText("4,700원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(splainyogurtsmoothieIcon);
				menu2nameJLabel.setText("플레인요거트스무디");
				menu2priceJLabel.setText("4,400원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setVisible(false);
				menu3nameJLabel.setVisible(false);
				menu3priceJLabel.setVisible(false);
				menu4JLabel.setVisible(false);
				menu4nameJLabel.setVisible(false);
				menu4priceJLabel.setVisible(false);
				menu5JLabel.setVisible(false);
				menu5nameJLabel.setVisible(false);
				menu5priceJLabel.setVisible(false);
				menu6JLabel.setVisible(false);
				menu6nameJLabel.setVisible(false);
				menu6priceJLabel.setVisible(false);
				menu7JLabel.setVisible(false);
				menu7nameJLabel.setVisible(false);
				menu7priceJLabel.setVisible(false);
				menu8JLabel.setVisible(false);
				menu8nameJLabel.setVisible(false);
				menu8priceJLabel.setVisible(false);
			}
		});

		// 버블티/티 항목 선택되면 바뀌는 Listener
		teaJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffeeJLabel.setIcon(sicecoffeeIcon);
				hotcoffeeJLabel.setIcon(shotcoffeeIcon);
				beverageJLabel.setIcon(sbeverageIcon);
				iceblendedJLabel.setIcon(siceblendedIcon);
				teaJLabel.setIcon(stteaIcon);
				juiceJLabel.setIcon(sjuiceIcon);
				sideJLabel.setIcon(ssideIcon);
				menu1JLabel.setIcon(slemonmintteaIcon);
				menu1nameJLabel.setText("레몬민트티");
				menu1priceJLabel.setText("4,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(slitchichamomileIcon);
				menu2nameJLabel.setText("리치캐모마일");
				menu2priceJLabel.setText("3,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(speachiceteaIcon);
				menu3nameJLabel.setText("복숭아아이스티");
				menu3priceJLabel.setText("3,500원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sapplehibiscusIcon);
				menu4nameJLabel.setText("애플히비스커스");
				menu4priceJLabel.setText("3,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(scitronappleteaIcon);
				menu5nameJLabel.setText("유자애플티");
				menu5priceJLabel.setText("4,000원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(scitronchamomileteaIcon);
				menu6nameJLabel.setText("유자캐모마일티");
				menu6priceJLabel.setText("4,000원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sgrapefruithoneyblackteaIcon);
				menu7nameJLabel.setText("자몽허니블랙티");
				menu7priceJLabel.setText("4,000원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sgreentangerineearlgrayIcon);
				menu8nameJLabel.setText("청귤얼그레이");
				menu8priceJLabel.setText("3,000원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
				icecoffee1pJLabel.setVisible(false);
				icecoffee2pJLabel.setVisible(false);
				hotcoffee1pJLabel.setVisible(false);
				hotcoffee2pJLabel.setVisible(false);
				beverage1pJLabel.setVisible(false);
				beverage2pJLabel.setVisible(false);
				iceblended1pJLabel.setVisible(false);
				iceblended2pJLabel.setVisible(false);
				iceblended3pJLabel.setVisible(false);
				tea1pJLabel.setVisible(true);
				tea1pJLabel.setIcon(sttea1pIcon);
				tea2pJLabel.setVisible(true);
				tea2pJLabel.setIcon(stea2pIcon);
				juice1pJLabel.setVisible(false);
				juice2pJLabel.setVisible(false);
				side1pJLabel.setVisible(false);
				side2pJLabel.setVisible(false);
				side3pJLabel.setVisible(false);
			}
		});

		// 버블티/티 1p 선택되면 바뀌는 Listener
		tea1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				tea1pJLabel.setIcon(sttea1pIcon);
				tea2pJLabel.setIcon(stea2pIcon);
				menu1JLabel.setIcon(slemonmintteaIcon);
				menu1nameJLabel.setText("레몬민트티");
				menu1priceJLabel.setText("4,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(slitchichamomileIcon);
				menu2nameJLabel.setText("리치캐모마일");
				menu2priceJLabel.setText("3,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(speachiceteaIcon);
				menu3nameJLabel.setText("복숭아아이스티");
				menu3priceJLabel.setText("3,500원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sapplehibiscusIcon);
				menu4nameJLabel.setText("애플히비스커스");
				menu4priceJLabel.setText("3,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(scitronappleteaIcon);
				menu5nameJLabel.setText("유자애플티");
				menu5priceJLabel.setText("4,000원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(scitronchamomileteaIcon);
				menu6nameJLabel.setText("유자캐모마일티");
				menu6priceJLabel.setText("4,000원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sgrapefruithoneyblackteaIcon);
				menu7nameJLabel.setText("자몽허니블랙티");
				menu7priceJLabel.setText("4,000원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sgreentangerineearlgrayIcon);
				menu8nameJLabel.setText("청귤얼그레이");
				menu8priceJLabel.setText("3,000원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 버블티/티 2p 선택되면 바뀌는 Listener
		tea2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				tea1pJLabel.setIcon(stea1pIcon);
				tea2pJLabel.setIcon(sttea2pIcon);
				menu1JLabel.setIcon(starobubbleteaIcon);
				menu1nameJLabel.setText("타로버블티");
				menu1priceJLabel.setText("3,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(stripplemintIcon);
				menu2nameJLabel.setText("트리플민트");
				menu2priceJLabel.setText("3,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(shoneylemonteaIcon);
				menu3nameJLabel.setText("허니레몬티");
				menu3priceJLabel.setText("3,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(shoneycitronteaIcon);
				menu4nameJLabel.setText("허니유자티");
				menu4priceJLabel.setText("3,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(shoneygrapefruitteaIcon);
				menu5nameJLabel.setText("허니자몽티");
				menu5priceJLabel.setText("3,000원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sbrownsugarbubbleteaIcon);
				menu6nameJLabel.setText("흑설탕버블티");
				menu6priceJLabel.setText("3,000원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setVisible(false);
				menu7nameJLabel.setVisible(false);
				menu7priceJLabel.setVisible(false);
				menu8JLabel.setVisible(false);
				menu8nameJLabel.setVisible(false);
				menu8priceJLabel.setVisible(false);
			}
		});

		// 주스/에이드 항목 선택되면 바뀌는 Listener
		juiceJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffeeJLabel.setIcon(sicecoffeeIcon);
				hotcoffeeJLabel.setIcon(shotcoffeeIcon);
				beverageJLabel.setIcon(sbeverageIcon);
				iceblendedJLabel.setIcon(siceblendedIcon);
				teaJLabel.setIcon(steaIcon);
				juiceJLabel.setIcon(stjuiceIcon);
				sideJLabel.setIcon(ssideIcon);
				menu1JLabel.setIcon(slemonadeIcon);
				menu1nameJLabel.setText("레몬에이드");
				menu1priceJLabel.setText("4,400원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(smanpledanIcon);
				menu2nameJLabel.setText("망플단");
				menu2priceJLabel.setText("4,300원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(smelonsodaIcon);
				menu3nameJLabel.setText("메론소다");
				menu3priceJLabel.setText("4,400원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(ssaddalbiIcon);
				menu4nameJLabel.setText("사딸비");
				menu4priceJLabel.setText("4,300원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sapplemangoadeIcon);
				menu5nameJLabel.setText("애플망고에이드");
				menu5priceJLabel.setText("4,400원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sosadangIcon);
				menu6nameJLabel.setText("오사당");
				menu6priceJLabel.setText("4,300원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sgrapefruitadeIcon);
				menu7nameJLabel.setText("자몽에이드");
				menu7priceJLabel.setText("4,400원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(scherrycokeIcon);
				menu8nameJLabel.setText("체리콕");
				menu8priceJLabel.setText("4,400원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
				icecoffee1pJLabel.setVisible(false);
				icecoffee2pJLabel.setVisible(false);
				hotcoffee1pJLabel.setVisible(false);
				hotcoffee2pJLabel.setVisible(false);
				beverage1pJLabel.setVisible(false);
				beverage2pJLabel.setVisible(false);
				iceblended1pJLabel.setVisible(false);
				iceblended2pJLabel.setVisible(false);
				iceblended3pJLabel.setVisible(false);
				tea1pJLabel.setVisible(false);
				tea2pJLabel.setVisible(false);
				juice1pJLabel.setVisible(true);
				juice1pJLabel.setIcon(stjuice1pIcon);
				juice2pJLabel.setVisible(true);
				juice2pJLabel.setIcon(sjuice2pIcon);
				side1pJLabel.setVisible(false);
				side2pJLabel.setVisible(false);
				side3pJLabel.setVisible(false);
			}
		});

		// 주스/에이드 1p 선택되면 바뀌는 Listener
		juice1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				juice1pJLabel.setIcon(stjuice1pIcon);
				juice2pJLabel.setIcon(sjuice2pIcon);
				menu1JLabel.setIcon(slemonadeIcon);
				menu1nameJLabel.setText("레몬에이드");
				menu1priceJLabel.setText("4,400원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(smanpledanIcon);
				menu2nameJLabel.setText("망플단");
				menu2priceJLabel.setText("4,300원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(smelonsodaIcon);
				menu3nameJLabel.setText("메론소다");
				menu3priceJLabel.setText("4,400원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(ssaddalbiIcon);
				menu4nameJLabel.setText("사딸비");
				menu4priceJLabel.setText("4,300원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sapplemangoadeIcon);
				menu5nameJLabel.setText("애플망고에이드");
				menu5priceJLabel.setText("4,400원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sosadangIcon);
				menu6nameJLabel.setText("오사당");
				menu6priceJLabel.setText("4,300원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sgrapefruitadeIcon);
				menu7nameJLabel.setText("자몽에이드");
				menu7priceJLabel.setText("4,400원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(scherrycokeIcon);
				menu8nameJLabel.setText("체리콕");
				menu8priceJLabel.setText("4,400원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 주스/에이드 2p 선택되면 바뀌는 Listener
		juice2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				juice1pJLabel.setIcon(sjuice1pIcon);
				juice2pJLabel.setIcon(stjuice2pIcon);
				menu1JLabel.setIcon(screamsodaIcon);
				menu1nameJLabel.setText("크림소다");
				menu1priceJLabel.setText("4,400원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sgrapeadeIcon);
				menu2nameJLabel.setText("포도에이드");
				menu2priceJLabel.setText("4,400원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setVisible(false);
				menu3nameJLabel.setVisible(false);
				menu3priceJLabel.setVisible(false);
				menu4JLabel.setVisible(false);
				menu4nameJLabel.setVisible(false);
				menu4priceJLabel.setVisible(false);
				menu5JLabel.setVisible(false);
				menu5nameJLabel.setVisible(false);
				menu5priceJLabel.setVisible(false);
				menu6JLabel.setVisible(false);
				menu6nameJLabel.setVisible(false);
				menu6priceJLabel.setVisible(false);
				menu7JLabel.setVisible(false);
				menu7nameJLabel.setVisible(false);
				menu7priceJLabel.setVisible(false);
				menu8JLabel.setVisible(false);
				menu8nameJLabel.setVisible(false);
				menu8priceJLabel.setVisible(false);
			}
		});

		// 사이드메뉴/RTD 항목 선택되면 바뀌는 Listener
		sideJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffeeJLabel.setIcon(sicecoffeeIcon);
				hotcoffeeJLabel.setIcon(shotcoffeeIcon);
				beverageJLabel.setIcon(sbeverageIcon);
				iceblendedJLabel.setIcon(siceblendedIcon);
				teaJLabel.setIcon(steaIcon);
				juiceJLabel.setIcon(sjuiceIcon);
				sideJLabel.setIcon(stsideIcon);
				menu1JLabel.setIcon(scoldbrewIcon);
				menu1nameJLabel.setText("콜드브루 500ml");
				menu1priceJLabel.setText("12,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sdecafeinatedcoldbrewIcon);
				menu2nameJLabel.setText("디카페인 콜드브루 500ml");
				menu2priceJLabel.setText("12,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sgarlicIcon);
				menu3nameJLabel.setText("갈릭 크룽지");
				menu3priceJLabel.setText("2,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(ssweetIcon);
				menu4nameJLabel.setText("스윗 크룽지");
				menu4priceJLabel.setText("2,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sgourmetbreadIcon);
				menu5nameJLabel.setText("고메소금빵");
				menu5priceJLabel.setText("3,500원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sbasilbreadIcon);
				menu6nameJLabel.setText("바질토마토 치킨 소금빵");
				menu6priceJLabel.setText("5,300원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(semmentalbreadIcon);
				menu7nameJLabel.setText("에멘탈 햄치즈 소금빵");
				menu7priceJLabel.setText("5,300원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sdrnutsIcon);
				menu8nameJLabel.setText("닥터넛츠 피칸");
				menu8priceJLabel.setText("2,500원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
				icecoffee1pJLabel.setVisible(false);
				icecoffee2pJLabel.setVisible(false);
				hotcoffee1pJLabel.setVisible(false);
				hotcoffee2pJLabel.setVisible(false);
				beverage1pJLabel.setVisible(false);
				beverage2pJLabel.setVisible(false);
				iceblended1pJLabel.setVisible(false);
				iceblended2pJLabel.setVisible(false);
				iceblended3pJLabel.setVisible(false);
				tea1pJLabel.setVisible(false);
				tea2pJLabel.setVisible(false);
				juice1pJLabel.setVisible(false);
				juice2pJLabel.setVisible(false);
				side1pJLabel.setVisible(true);
				side1pJLabel.setIcon(stside1pIcon);
				side2pJLabel.setVisible(true);
				side2pJLabel.setIcon(sside2pIcon);
				side3pJLabel.setVisible(true);
				side3pJLabel.setIcon(sside3pIcon);
			}
		});

		// 사이드메뉴/RTD 1p 선택되면 바뀌는 Listener
		side1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				side1pJLabel.setIcon(stside1pIcon);
				side2pJLabel.setIcon(sside2pIcon);
				side3pJLabel.setIcon(sside3pIcon);
				menu1JLabel.setIcon(scoldbrewIcon);
				menu1nameJLabel.setText("콜드브루 500ml");
				menu1priceJLabel.setText("12,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sdecafeinatedcoldbrewIcon);
				menu2nameJLabel.setText("디카페인 콜드브루 500ml");
				menu2priceJLabel.setText("12,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sgarlicIcon);
				menu3nameJLabel.setText("갈릭 크룽지");
				menu3priceJLabel.setText("2,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(ssweetIcon);
				menu4nameJLabel.setText("스윗 크룽지");
				menu4priceJLabel.setText("2,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sgourmetbreadIcon);
				menu5nameJLabel.setText("고메소금빵");
				menu5priceJLabel.setText("3,500원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sbasilbreadIcon);
				menu6nameJLabel.setText("바질토마토 치킨 소금빵");
				menu6priceJLabel.setText("5,300원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(semmentalbreadIcon);
				menu7nameJLabel.setText("에멘탈 햄치즈 소금빵");
				menu7priceJLabel.setText("5,300원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sdrnutsIcon);
				menu8nameJLabel.setText("닥터넛츠 피칸");
				menu8priceJLabel.setText("2,500원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 사이드메뉴/RTD 2p 선택되면 바뀌는 Listener
		side2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				side1pJLabel.setIcon(sside1pIcon);
				side2pJLabel.setIcon(stside2pIcon);
				side3pJLabel.setIcon(sside3pIcon);
				menu1JLabel.setIcon(ssweethotdogIcon);
				menu1nameJLabel.setText("달콤 어니언 핫도그");
				menu1priceJLabel.setText("4,800원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sspicyhotdogIcon);
				menu2nameJLabel.setText("매콤 칠리 핫도그");
				menu2priceJLabel.setText("4,800원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(ssweetpotatobreadIcon);
				menu3nameJLabel.setText("달콤촉촉 고구마빵");
				menu3priceJLabel.setText("4,000원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(spotatobreadIcon);
				menu4nameJLabel.setText("포슬쫀득 감자빵");
				menu4priceJLabel.setText("4,000원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(scarrotcheeseIcon);
				menu5nameJLabel.setText("당근치즈 브라우니");
				menu5priceJLabel.setText("5,000원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sdoublechococookieIcon);
				menu6nameJLabel.setText("더블초코 스모어 촉촉쿠키");
				menu6priceJLabel.setText("3,500원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(scranberrycookieIcon);
				menu7nameJLabel.setText("크랜베리 초코칩 촉촉쿠키");
				menu7priceJLabel.setText("3,500원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(swhitechococookieIcon);
				menu8nameJLabel.setText("화이트초코 말차 촉촉쿠키");
				menu8priceJLabel.setText("3,500원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// 사이드메뉴/RTD 3p 선택되면 바뀌는 Listener
		side3pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				side1pJLabel.setIcon(sside1pIcon);
				side2pJLabel.setIcon(sside2pIcon);
				side3pJLabel.setIcon(stside3pIcon);
				menu1JLabel.setIcon(sstrawberrypieIcon);
				menu1nameJLabel.setText("딸기에 퐁당 파이");
				menu1priceJLabel.setText("4,000원");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(schocopieIcon);
				menu2nameJLabel.setText("초코에 퐁당 파이");
				menu2priceJLabel.setText("4,000원");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sminicustardIcon);
				menu3nameJLabel.setText("미니 붕어빵(커스타드)");
				menu3priceJLabel.setText("3,300원");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sminiredbeanIcon);
				menu4nameJLabel.setText("미니 붕어빵(통팥)");
				menu4priceJLabel.setText("3,300원");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sstrawberrymacaroonIcon);
				menu5nameJLabel.setText("딸기요거 벤카롱");
				menu5priceJLabel.setText("3,000원");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smatchamacaroonIcon);
				menu6nameJLabel.setText("말차초코 벤카롱");
				menu6priceJLabel.setText("3,000원");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(scocomacaroonIcon);
				menu7nameJLabel.setText("코코초코 벤카롱");
				menu7priceJLabel.setText("3,000원");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(scookiemacaroonIcon);
				menu8nameJLabel.setText("쿠키크림 벤카롱");
				menu8priceJLabel.setText("3,000원");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		setSize(550, 820);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
