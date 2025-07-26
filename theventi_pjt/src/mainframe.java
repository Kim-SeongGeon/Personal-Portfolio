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
	// �ֹ������ �ִ� ArrayList
	static ArrayList<String> Order = new ArrayList<>();
	
	// ordernumberframe���� �ֹ���ȣ�� �����ֱ� ���� ��ȣ
	static int ordernumber = 1;

	// ��ܿ� �ִ� �޴� �׸� ���� ��ȣ
	static int sortnum = 1;
	// ������ ���� ��ȣ
	static int pagenum = 1;
	// �޴� ���� ��ȣ
	static int menunum;

	// ������ ���ڸ� �������� ',' �ֱ� ���� �ڵ�
	static DecimalFormat formatter = new DecimalFormat("#,###");
	// ��ٱ��� ����
	static int basket = 0;
	static public JLabel basketJLabel;
	// �� �����ݾ�
	static int payment;
	static public JLabel paymentJLabel;

	// �ֹ��� 1��° �޴� ���� ��ư �̹��� �ִ� JLabel
	static public JLabel remove1JLabel;
	// �ֹ��� 2��° �޴� ���� ��ư �̹��� �ִ� JLabel
	static public JLabel remove2JLabel;

	// ������ 1���� �޴� �̹��� �ִ� JLabel
	static public JLabel chosemenu1imageJLabel;
	// ������ 2��° �޴� �̹��� �ִ� JLabel
	static public JLabel chosemenu2imageJLabel;

	// ������ 1��° �޴� �̸� �ִ� JLabel
	static public JLabel chosemenu1nameJLabel;
	// ������ 2��° �޴� �̸� �ִ� JLabel
	static public JLabel chosemenu2nameJLabel;

	// ������ 1��° �޴� �ɼ� �ִ� JLabel
	static public JLabel chosemenu1optionJLabel;
	// ������ 2��° �޴� �ɼ� �ִ� JLabel
	static public JLabel chosemenu2optionJLabel;

	// ������ 1��° �޴� ���� �ִ� JLabel
	static public JLabel chosemenu1priceJLabel;
	// ������ 2��° �޴� ���� �ִ� JLabel
	static public JLabel chosemenu2priceJLabel;

	// 1��° �޴� ���� ���� �̹��� �ִ� JLabel
	static public JLabel minus1JLabel;
	// 2��° �޴� ���� ���� �̹��� �ִ� JLabel
	static public JLabel minus2JLabel;

	// 1��° �޴� ���� �ִ� JLabel
	static public JLabel chosemenu1quantityJLabel;
	// 2��° �޴� ���� �ִ� JLabel
	static public JLabel chosemenu2quantityJLabel;

	// 1��° �޴� ����
	static public int menu1quantity;
	// 2��° �޴� ����
	static public int menu2quantity;

	// 1��° �޴� ���� ���ϴ� �̹��� �ִ� JLabel
	static public JLabel plus1JLabel;
	// 2��° �޴� ���� ���ϴ� �̹��� �ִ� JLabel
	static public JLabel plus2JLabel;

	// �޴� ������ �ø��� �̹��� �ִ� JLabel
	static public JLabel upJLabel;
	// �޴� ������ ������ �̹��� �ִ� JLabel
	static public JLabel downJLabel;

	// ArrayList Order�� �ִ� String�� ������ ","�� �������� split�ؼ� �����ϴ� String�� �迭
	static String[] str;
	static String[] str1;
	static String[] str2;

	// ������ �ѱ� �� �ʿ��� index
	static int upindex = 0;
	static int downindex = upindex + 1;

	// �޴� ������ �ø��� �̹��� ��
	static ImageIcon upIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\up.png");
	static Image upImage = upIcon.getImage();
	static Image supImage = upImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	static ImageIcon supIcon = new ImageIcon(supImage);

	// �޴� ������ �ø��� ���õ� �̹��� ��
	static ImageIcon tupIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\tup.png");
	static Image tupImage = tupIcon.getImage();
	static Image stupImage = tupImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	static ImageIcon stupIcon = new ImageIcon(stupImage);

	// �޴� ������ ������ �̹��� ��
	static ImageIcon downIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\down.png");
	static Image downImage = downIcon.getImage();
	static Image sdownImage = downImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	static ImageIcon sdownIcon = new ImageIcon(sdownImage);

	// �޴� ������ ������ ���õ� �̹��� ��
	static ImageIcon tdownIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\tdown.png");
	static Image tdownImage = tdownIcon.getImage();
	static Image stdownImage = tdownImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	static ImageIcon stdownIcon = new ImageIcon(stdownImage);

	static public void optionFrameDisposed() {
		if (optionframe.order == true) {
			basketJLabel.setText(Integer.toString(basket));
			paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
					+ "�� �����ϱ�</center></body></html>");
			remove1JLabel.setVisible(true);
			str1 = Order.get(upindex).split(",");
			new chosemenuimage(str1[0]);
			chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
			chosemenu1imageJLabel.setVisible(true);
			chosemenu1nameJLabel.setText(str1[1]);
			chosemenu1nameJLabel.setVisible(true);
			chosemenu1optionJLabel.setText(str1[2]);
			chosemenu1optionJLabel.setVisible(true);
			chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
				chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "��");
				chosemenu2priceJLabel.setVisible(true);
				chosemenu2quantityJLabel.setText(str2[4]);
				chosemenu2quantityJLabel.setVisible(true);
				minus2JLabel.setVisible(true);
				plus2JLabel.setVisible(true);
			}
			// ArrayList Order�� ����� ���� upJLabel�� downJLabel ����
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

		// Ȩ ��ư �̹���
		ImageIcon homeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\home.png");
		Image homeImage = homeIcon.getImage();
		Image shomeImage = homeImage.getScaledInstance(150, 50, Image.SCALE_SMOOTH);
		ImageIcon shomeIcon = new ImageIcon(shomeImage);

		// �ΰ� �̹���
		ImageIcon logoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\logo.png");
		Image logoImage = logoIcon.getImage();
		Image slogoImage = logoImage.getScaledInstance(410, 50, Image.SCALE_SMOOTH);
		ImageIcon slogoIcon = new ImageIcon(slogoImage);

		// Ŀ��(���̽�) �׸� �̹���
		ImageIcon icecoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\icecoffee.png");
		Image icecoffeeImage = icecoffeeIcon.getImage();
		Image sicecoffeeImage = icecoffeeImage.getScaledInstance(145, 50, Image.SCALE_SMOOTH);
		ImageIcon sicecoffeeIcon = new ImageIcon(sicecoffeeImage);

		// Ŀ��(���̽�) �׸� ���õ� �̹���
		ImageIcon ticecoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\ticecoffee.png");
		Image ticecoffeeImage = ticecoffeeIcon.getImage();
		Image sticecoffeeImage = ticecoffeeImage.getScaledInstance(145, 50, Image.SCALE_SMOOTH);
		ImageIcon sticecoffeeIcon = new ImageIcon(sticecoffeeImage);

		// Ŀ��(��) �׸� �̹���
		ImageIcon hotcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\hotcoffee.png");
		Image hotcoffeeImage = hotcoffeeIcon.getImage();
		Image shotcoffeeImage = hotcoffeeImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon shotcoffeeIcon = new ImageIcon(shotcoffeeImage);

		// Ŀ��(��) �׸� ���õ� �̹���
		ImageIcon thotcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\thotcoffee.png");
		Image thotcoffeeImage = thotcoffeeIcon.getImage();
		Image sthotcoffeeImage = thotcoffeeImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sthotcoffeeIcon = new ImageIcon(sthotcoffeeImage);

		// �������� �׸� �̹���
		ImageIcon beverageIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\beverage.png");
		Image beverageImage = beverageIcon.getImage();
		Image sbeverageImage = beverageImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sbeverageIcon = new ImageIcon(sbeverageImage);

		// �������� �׸� ���õ� �̹���
		ImageIcon tbeverageIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\tbeverage.png");
		Image tbeverageImage = tbeverageIcon.getImage();
		Image stbeverageImage = tbeverageImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon stbeverageIcon = new ImageIcon(stbeverageImage);

		// ���̽� ����� �׸� �̹���
		ImageIcon iceblendedIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\iceblended.png");
		Image iceblendedImage = iceblendedIcon.getImage();
		Image siceblendedImage = iceblendedImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon siceblendedIcon = new ImageIcon(siceblendedImage);

		// ���̽� ����� �׸� ���õ� �̹���
		ImageIcon ticeblendedIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\ticeblended.png");
		Image ticeblendedImage = ticeblendedIcon.getImage();
		Image sticeblendedImage = ticeblendedImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sticeblendedIcon = new ImageIcon(sticeblendedImage);

		// ����Ƽ/Ƽ �׸� �̹���
		ImageIcon teaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\tea.png");
		Image teaImage = teaIcon.getImage();
		Image steaImage = teaImage.getScaledInstance(145, 50, Image.SCALE_SMOOTH);
		ImageIcon steaIcon = new ImageIcon(steaImage);

		// ����Ƽ/Ƽ �׸� ���õ� �̹���
		ImageIcon tteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\ttea.png");
		Image tteaImage = tteaIcon.getImage();
		Image stteaImage = tteaImage.getScaledInstance(145, 50, Image.SCALE_SMOOTH);
		ImageIcon stteaIcon = new ImageIcon(stteaImage);

		// �ֽ�/���̵� �׸� �̹���
		ImageIcon juiceIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\juice.png");
		Image juiceImage = juiceIcon.getImage();
		Image sjuiceImage = juiceImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sjuiceIcon = new ImageIcon(sjuiceImage);

		// �ֽ�/���̵� �׸� ���õ� �̹���
		ImageIcon tjuiceIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\tjuice.png");
		Image tjuiceImage = tjuiceIcon.getImage();
		Image stjuiceImage = tjuiceImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon stjuiceIcon = new ImageIcon(stjuiceImage);

		// ���̵�޴�/RTD �׸� �̹���
		ImageIcon sideIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\side.png");
		Image sideImage = sideIcon.getImage();
		Image ssideImage = sideImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon ssideIcon = new ImageIcon(ssideImage);

		// ���̵�޴�/RTD �׸� ���õ� �̹���
		ImageIcon tsideIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\tside.png");
		Image tsideImage = tsideIcon.getImage();
		Image stsideImage = tsideImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon stsideIcon = new ImageIcon(stsideImage);

		// ��ĭ �׸� �̹���
		ImageIcon blankIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\blank.png");
		Image blankImage = blankIcon.getImage();
		Image sblankImage = blankImage.getScaledInstance(138, 50, Image.SCALE_SMOOTH);
		ImageIcon sblankIcon = new ImageIcon(sblankImage);

		// (���̽�) �Ƹ޸�ī�� �޴� �̹���
		ImageIcon iceamericanoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�Ƹ޸�ī��.png");
		Image iceamericanoImage = iceamericanoIcon.getImage();
		Image siceamericanoImage = iceamericanoImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon siceamericanoIcon = new ImageIcon(siceamericanoImage);

		// (���̽�) �ͽ�Ŀ�� �޴� �̹���
		ImageIcon icemixedcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ͽ�Ŀ��.png");
		Image icemixedcoffeeImage = icemixedcoffeeIcon.getImage();
		Image sicemixedcoffeeImage = icemixedcoffeeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicemixedcoffeeIcon = new ImageIcon(sicemixedcoffeeImage);

		// (���̽�) �ٴҶ���� �޴� �̹���
		ImageIcon icevanilladeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ٴҶ����.png");
		Image icevanilladeeplatteImage = icevanilladeeplatteIcon.getImage();
		Image sicevanilladeeplatteImage = icevanilladeeplatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicevanilladeeplatteIcon = new ImageIcon(sicevanilladeeplatteImage);

		// (���̽�) �ٴҶ�ũ���ݵ��� �޴� �̹���
		ImageIcon icevanillacreamcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ٴҶ�ũ���ݵ���.png");
		Image icevanillacreamcoldbrewImage = icevanillacreamcoldbrewIcon.getImage();
		Image sicevanillacreamcoldbrewImage = icevanillacreamcoldbrewImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sicevanillacreamcoldbrewIcon = new ImageIcon(sicevanillacreamcoldbrewImage);

		// (���̽�) ���̽�ũ���� �޴� �̹���
		ImageIcon iceicecreamlatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)���̽�ũ����.png");
		Image iceicecreamlatteImage = iceicecreamlatteIcon.getImage();
		Image siceicecreamlatteImage = iceicecreamlatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon siceicecreamlatteIcon = new ImageIcon(siceicecreamlatteImage);

		// (���̽�) ��Ʈī��� �޴� �̹���
		ImageIcon iceoatcafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)��Ʈī���.png");
		Image iceoatcafelatteImage = iceoatcafelatteIcon.getImage();
		Image siceoatcafelatteImage = iceoatcafelatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon siceoatcafelatteIcon = new ImageIcon(siceoatcafelatteImage);

		// (���̽�) ī��Ḷ���ƶ� �޴� �̹���
		ImageIcon icecaramelmacchiatoIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)ī��Ḷ���ƶ�.png");
		Image icecaramelmacchiatoImage = icecaramelmacchiatoIcon.getImage();
		Image sicecaramelmacchiatoImage = icecaramelmacchiatoImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecaramelmacchiatoIcon = new ImageIcon(sicecaramelmacchiatoImage);

		// (���̽�) ī��� �޴� �̹���
		ImageIcon icecafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)ī���.png");
		Image icecafelatteImage = icecafelatteIcon.getImage();
		Image sicecafelatteImage = icecafelatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecafelatteIcon = new ImageIcon(sicecafelatteImage);

		// (���̽�) ī���ī �޴� �̹���
		ImageIcon icecafemochaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)ī���ī.png");
		Image icecafemochaImage = icecafemochaIcon.getImage();
		Image sicecafemochaImage = icecafemochaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecafemochaIcon = new ImageIcon(sicecafemochaImage);

		// (���̽�) ���ڳӶ� �޴� �̹���
		ImageIcon icecoconutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)���ڳӶ�.png");
		Image icecoconutImage = icecoconutlatteIcon.getImage();
		Image sicecoconutImage = icecoconutImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecoconutIcon = new ImageIcon(sicecoconutImage);

		// (���̽�) �ݵ��� �޴� �̹���
		ImageIcon icecoldbrewIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ݵ���.png");
		Image icecoldbrewImage = icecoldbrewIcon.getImage();
		Image sicecoldbrewImage = icecoldbrewImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecoldbrewIcon = new ImageIcon(sicecoldbrewImage);

		// (���̽�) �ݵ���� �޴� �̹���
		ImageIcon icecoldbrewlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ݵ����.png");
		Image icecoldbrewlatteImage = icecoldbrewlatteIcon.getImage();
		Image sicecoldbrewlatteImage = icecoldbrewlatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicecoldbrewlatteIcon = new ImageIcon(sicecoldbrewlatteImage);

		// (���̽�) ���ǳӶ� �޴� �̹���
		ImageIcon icetoffeenutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)���ǳӶ�.png");
		Image icetoffeenutlatteImage = icetoffeenutlatteIcon.getImage();
		Image sicetoffeenutlatteImage = icetoffeenutlatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicetoffeenutlatteIcon = new ImageIcon(sicetoffeenutlatteImage);

		// (���̽�) ������ӵ��� �޴� �̹���
		ImageIcon icehazelnutdeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)������ӵ���.png");
		Image icehazelnutdeepImage = icehazelnutdeeplatteIcon.getImage();
		Image sicehazelnutdeepImage = icehazelnutdeepImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sicehazelnutdeeplatteIcon = new ImageIcon(sicehazelnutdeepImage);

		// (���̽�) �������ũ���ݵ��� �޴� �̹���
		ImageIcon icehazelnutcreamcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�������ũ���ݵ���.png");
		Image icehazelnutcreamcoldbrewImage = icehazelnutcreamcoldbrewIcon.getImage();
		Image sicehazelnutcreamcoldbrewImage = icehazelnutcreamcoldbrewImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sicehazelnutcreamcoldbrewIcon = new ImageIcon(sicehazelnutcreamcoldbrewImage);

		// Ŀ��(���̽�) 1p �̹���
		ImageIcon icecoffee1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\1p.png");
		Image icecoffee1pImage = icecoffee1pIcon.getImage();
		Image sicecoffee1pImage = icecoffee1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sicecoffee1pIcon = new ImageIcon(sicecoffee1pImage);

		// Ŀ��(���̽�) 1p ���õ� �̹���
		ImageIcon ticecoffee1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t1p.png");
		Image ticecoffee1pImage = ticecoffee1pIcon.getImage();
		Image sticecoffee1pImage = ticecoffee1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticecoffee1pIcon = new ImageIcon(sticecoffee1pImage);

		// Ŀ��(���̽�) 2p �̹���
		ImageIcon icecoffee2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\2p.png");
		Image icecoffee2pImage = icecoffee2pIcon.getImage();
		Image sicecoffee2pImage = icecoffee2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sicecoffee2pIcon = new ImageIcon(sicecoffee2pImage);

		// Ŀ��(���̽�) 2p ���õ� �̹���
		ImageIcon ticecoffee2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t2p.png");
		Image ticecoffee2pImage = ticecoffee2pIcon.getImage();
		Image sticecoffee2pImage = ticecoffee2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticecoffee2pIcon = new ImageIcon(sticecoffee2pImage);

		// (��) �Ƹ޸�ī�� �޴� �̹���
		ImageIcon hotamericanoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)�Ƹ޸�ī��.png");
		Image hotamericanoImage = hotamericanoIcon.getImage();
		Image shotamericanoImage = hotamericanoImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon shotamericanoIcon = new ImageIcon(shotamericanoImage);

		// (��) �ͽ�Ŀ�� �޴� �̹���
		ImageIcon hotmixedcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)�ͽ�Ŀ��.png");
		Image hotmixedcoffeeImage = hotmixedcoffeeIcon.getImage();
		Image shotmixedcoffeeImage = hotmixedcoffeeImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotmixedcoffeeIcon = new ImageIcon(shotmixedcoffeeImage);

		// (��) �ٴҶ���� �޴� �̹���
		ImageIcon hotvanilladeeplatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)�ٴҶ����.png");
		Image hotvanilladeeplatteImage = hotvanilladeeplatteIcon.getImage();
		Image shotvanilladeeplatteImage = hotvanilladeeplatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotvanilladeeplatteIcon = new ImageIcon(shotvanilladeeplatteImage);

		// (��) ������ �޴� �̹���
		ImageIcon hotcondensedmilklatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)������.png");
		Image hotcondensedmilklatteImage = hotcondensedmilklatteIcon.getImage();
		Image shotcondensedmilklatteImage = hotcondensedmilklatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcondensedmilklatteIcon = new ImageIcon(shotcondensedmilklatteImage);

		// (��) ��Ʈī��� �޴� �̹���
		ImageIcon hotoatcafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)��Ʈī���.png");
		Image hotoatcafelatteImage = hotoatcafelatteIcon.getImage();
		Image shotoatcafelatteImage = hotoatcafelatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotoatcafelatteIcon = new ImageIcon(shotoatcafelatteImage);

		// (��) ī��Ḷ���ƶ� �޴� �̹���
		ImageIcon hotcaramelmacchiatoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)ī��Ḷ���ƶ�.png");
		Image hotcaramelmacchiatoImage = hotcaramelmacchiatoIcon.getImage();
		Image shotcaramelmacchiatoImage = hotcaramelmacchiatoImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcaramelmacchiatoIcon = new ImageIcon(shotcaramelmacchiatoImage);

		// (��) ī��� �޴� �̹���
		ImageIcon hotcafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)ī���.png");
		Image hotcafelatteImage = hotcafelatteIcon.getImage();
		Image shotcafelatteImage = hotcafelatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcafelatteIcon = new ImageIcon(shotcafelatteImage);

		// (��) ī���ī �޴� �̹���
		ImageIcon hotcafemochaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)ī���ī.png");
		Image hotcafemochaImage = hotcafemochaIcon.getImage();
		Image shotcafemochaImage = hotcafemochaImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcafemochaIcon = new ImageIcon(shotcafemochaImage);

		// (��) ���ڳӶ� �޴� �̹���
		ImageIcon hotcoconutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)���ڳӶ�.png");
		Image hotcoconutlatteImage = hotcoconutlatteIcon.getImage();
		Image shotcoconutlatteImage = hotcoconutlatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shotcoconutlatteIcon = new ImageIcon(shotcoconutlatteImage);

		// (��) ���ǳӶ� �޴� �̹���
		ImageIcon hottoffeenutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)���ǳӶ�.png");
		Image hottoffeenutlatteImage = hottoffeenutlatteIcon.getImage();
		Image shottoffeenutlatteImage = hottoffeenutlatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shottoffeenutlatteIcon = new ImageIcon(shottoffeenutlatteImage);

		// (��) ������ӵ��� �޴� �̹���
		ImageIcon hothazelnutdeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)������ӵ���.png");
		Image hothazelnutdeeplatteImage = hothazelnutdeeplatteIcon.getImage();
		Image shothazelnutdeeplatteImage = hothazelnutdeeplatteImage.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
		ImageIcon shothazelnutdeeplatteIcon = new ImageIcon(shothazelnutdeeplatteImage);

		// Ŀ��(��) 1p �̹���
		ImageIcon hotcoffee1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\1p.png");
		Image hotcoffee1pImage = hotcoffee1pIcon.getImage();
		Image shotcoffee1pImage = hotcoffee1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon shotcoffee1pIcon = new ImageIcon(shotcoffee1pImage);

		// Ŀ��(��) 1p ���õ� �̹���
		ImageIcon thotcoffee1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t1p.png");
		Image thotcoffee1pImage = thotcoffee1pIcon.getImage();
		Image sthotcoffee1pImage = thotcoffee1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sthotcoffee1pIcon = new ImageIcon(sthotcoffee1pImage);

		// Ŀ��(��) 2p �̹���
		ImageIcon hotcoffee2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\2p.png");
		Image hotcoffee2pImage = hotcoffee2pIcon.getImage();
		Image shotcoffee2pImage = hotcoffee2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon shotcoffee2pIcon = new ImageIcon(shotcoffee2pImage);

		// Ŀ��(��) 2p ���õ� �̹���
		ImageIcon thotcoffee2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t2p.png");
		Image thotcoffee2pImage = thotcoffee2pIcon.getImage();
		Image sthotcoffee2pImage = thotcoffee2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sthotcoffee2pIcon = new ImageIcon(sthotcoffee2pImage);

		// �������� �޴� �̹���
		ImageIcon sweetpotatolatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\��������.png");
		Image sweetpotatolatteImage = sweetpotatolatteIcon.getImage();
		Image ssweetpotatolatteImage = sweetpotatolatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssweetpotatolatteIcon = new ImageIcon(ssweetpotatolatteImage);

		// ����� �޴� �̹���
		ImageIcon strawberrylatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�����.png");
		Image strawberrylatteImage = strawberrylatteIcon.getImage();
		Image sstrawberrylatteImage = strawberrylatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrylatteIcon = new ImageIcon(sstrawberrylatteImage);

		// �ξ��ũƼ �޴� �̹���
		ImageIcon royalmilkteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�ξ��ũƼ.png");
		Image royalmilkteaImage = royalmilkteaIcon.getImage();
		Image sroyalmilkteaImage = royalmilkteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sroyalmilkteaIcon = new ImageIcon(sroyalmilkteaImage);

		// ������ �޴� �̹���
		ImageIcon matchalatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\������.png");
		Image matchalatteImage = matchalatteIcon.getImage();
		Image smatchalatteImage = matchalatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smatchalatteIcon = new ImageIcon(smatchalatteImage);

		// �������ν���� �޴� �̹���
		ImageIcon matchaeinspennerIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�������ν����.png");
		Image matchaeinispennerImage = matchaeinspennerIcon.getImage();
		Image smatchaeinispennerImage = matchaeinispennerImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smatchaeinspennerIcon = new ImageIcon(smatchaeinispennerImage);

		// �������� �޴� �̹���
		ImageIcon meltingchocoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\��������.png");
		Image meltingchocoImage = meltingchocoIcon.getImage();
		Image smeltingchocoImage = meltingchocoImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smeltingchocoIcon = new ImageIcon(smeltingchocoImage);

		// �̼����� �޴� �̹���
		ImageIcon mixedgrainpowderIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�̼�����.png");
		Image mixedgrainpowderImage = mixedgrainpowderIcon.getImage();
		Image smixedgrainpowderImage = mixedgrainpowderImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smixedgrainpowderIcon = new ImageIcon(smixedgrainpowderImage);

		// �̼������ �޴� �̹���
		ImageIcon mixedgrainpowderlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�̼������.png");
		Image mixedgrainpowderlatteImage = mixedgrainpowderlatteIcon.getImage();
		Image smixedgrainpowderlatteImage = mixedgrainpowderlatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smixedgrainpowderlatteIcon = new ImageIcon(smixedgrainpowderlatteImage);

		// ���ڶ� �޴� �̹���
		ImageIcon chocolatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\���ڶ�.png");
		Image chocolatteImage = chocolatteIcon.getImage();
		Image schocolatteImage = chocolatteImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon schocolatteIcon = new ImageIcon(schocolatteImage);

		// �������� 1p �̹���
		ImageIcon beverage1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\1p.png");
		Image beverage1pImage = beverage1pIcon.getImage();
		Image sbeverage1pImage = beverage1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sbeverage1pIcon = new ImageIcon(sbeverage1pImage);

		// �������� 1p ���õ� �̹���
		ImageIcon tbeverage1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t1p.png");
		Image tbeverage1pImage = tbeverage1pIcon.getImage();
		Image stbeverage1pImage = tbeverage1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stbeverage1pIcon = new ImageIcon(stbeverage1pImage);

		// �������� 2p �̹���
		ImageIcon beverage2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\2p.png");
		Image beverage2pImage = beverage2pIcon.getImage();
		Image sbeverage2pImage = beverage2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sbeverage2pIcon = new ImageIcon(sbeverage2pImage);

		// �������� 2p ���õ� �̹���
		ImageIcon tbeverage2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t2p.png");
		Image tbeverage2pImage = tbeverage2pIcon.getImage();
		Image stbeverage2pImage = tbeverage2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stbeverage2pIcon = new ImageIcon(stbeverage2pImage);

		// ���⽦��ũ �޴� �̹���
		ImageIcon strawberryshakeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���⽦��ũ.png");
		Image strawberryshakeImage = strawberryshakeIcon.getImage();
		Image sstrawberryshakeImage = strawberryshakeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sstrawberryshakeIcon = new ImageIcon(sstrawberryshakeImage);

		// ������Ʈ������ �޴� �̹���
		ImageIcon strawberryyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\������Ʈ������.png");
		Image strawberryyogurtsmoothieImage = strawberryyogurtsmoothieIcon.getImage();
		Image sstrawberryyogurtsmoothieImage = strawberryyogurtsmoothieImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sstrawberryyogurtsmoothieIcon = new ImageIcon(sstrawberryyogurtsmoothieImage);

		// ���������� �޴� �̹���
		ImageIcon matchafrappeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\����������.png");
		Image matchfrappeImage = matchafrappeIcon.getImage();
		Image smatchafrappeImage = matchfrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smatchafrappeIcon = new ImageIcon(smatchafrappeImage);

		// ������Ʈ������ �޴� �̹���
		ImageIcon mangoyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\������Ʈ������.png");
		Image mangoyogurtsmoothieImage = mangoyogurtsmoothieIcon.getImage();
		Image smangoyogurtsmoothieImage = mangoyogurtsmoothieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smangoyogurtsmoothieIcon = new ImageIcon(smangoyogurtsmoothieImage);

		// �����м�ũ���� �޴� �̹���
		ImageIcon mangofashioncrushIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\�����м�ũ����.png");
		Image mangofashioncrushImage = mangofashioncrushIcon.getImage();
		Image smangofashioncrushImage = mangofashioncrushImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smangofashioncrushIcon = new ImageIcon(smangofashioncrushImage);

		// ��Ʈ����Ĩ������ �޴� �̹���
		ImageIcon mintchocochipfrappeIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��Ʈ����Ĩ������.png");
		Image mintchocochipfrappeImage = mintchocochipfrappeIcon.getImage();
		Image smintchocochipfrappeImage = mintchocochipfrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smintchocochipfrappeIcon = new ImageIcon(smintchocochipfrappeImage);

		// ��ũ����ũ �޴� �̹���
		ImageIcon milkshakeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��ũ����ũ.png");
		Image milkshakeImage = milkshakeIcon.getImage();
		Image smilkshakeImage = milkshakeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smilkshakeIcon = new ImageIcon(smilkshakeImage);

		// ��纣�����Ʈ������ �޴� �̹���
		ImageIcon blueberryyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��纣�����Ʈ������.png");
		Image blueberryyogurtsmoothieImage = blueberryyogurtsmoothieIcon.getImage();
		Image sblueberryyogurtsmoothieImage = blueberryyogurtsmoothieImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sblueberryyogurtsmoothieIcon = new ImageIcon(sblueberryyogurtsmoothieImage);

		// ���������ҽ���ũ �޴� �̹���
		ImageIcon espressoshakeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���������ҽ���ũ.png");
		Image espressoshakeImage = espressoshakeIcon.getImage();
		Image sespressoshakeImage = espressoshakeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sespressoshakeIcon = new ImageIcon(sespressoshakeImage);

		// ���ڹ�ũ���� �޴� �̹���
		ImageIcon citronpearcrushIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���ڹ�ũ����.png");
		Image citronpearcrushImage = citronpearcrushIcon.getImage();
		Image scitronpearcrushImage = citronpearcrushImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scitronpearcrushIcon = new ImageIcon(scitronpearcrushImage);

		// �ڵ���ġũ���� �޴� �̹���
		ImageIcon plumpeachcrushIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\�ڵ���ġũ����.png");
		Image plumpeachcrushImage = plumpeachcrushIcon.getImage();
		Image splumpeachcrushImage = plumpeachcrushImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon splumpeachcrushIcon = new ImageIcon(splumpeachcrushImage);

		// �ڹ�Ĩ������ �޴� �̹���
		ImageIcon javachipfrappeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\�ڹ�Ĩ������.png");
		Image javachipfrappeImage = javachipfrappeIcon.getImage();
		Image sjavachipfrappeImage = javachipfrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sjavachipfrappeIcon = new ImageIcon(sjavachipfrappeImage);

		// ���ڽ���ũ �޴� �̹���
		ImageIcon chocoshakeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���ڽ���ũ.png");
		Image chocoshakeImage = chocoshakeIcon.getImage();
		Image schocoshakeImage = chocoshakeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon schocoshakeIcon = new ImageIcon(schocoshakeImage);

		// ���ڳ�Ŀ�������� �޴� �̹���
		ImageIcon coconutcoffeefrappeIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���ڳ�Ŀ��������.png");
		Image coconutcoffeefrappeImage = coconutcoffeefrappeIcon.getImage();
		Image scoconutcoffeefrappeImage = coconutcoffeefrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scoconutcoffeefrappeIcon = new ImageIcon(scoconutcoffeefrappeImage);

		// �������������� �޴� �̹���
		ImageIcon cocochocofrappeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��������������.png");
		Image cocochocofrappeImage = cocochocofrappeIcon.getImage();
		Image scocochocofrappeImage = cocochocofrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scocochocofrappeIcon = new ImageIcon(scocochocofrappeImage);

		// ��Ű��ũ�������� �޴� �̹���
		ImageIcon cookiencreamfrappeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��Ű��ũ��������.png");
		Image cookiencreamfrappeImage = cookiencreamfrappeIcon.getImage();
		Image scookiencreamfrappeImage = cookiencreamfrappeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scookiencreamfrappeIcon = new ImageIcon(scookiencreamfrappeImage);

		// ��������ũ���� �޴� �̹���
		ImageIcon grapeberrycrushIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��������ũ����.png");
		Image grapeberrycrushImage = grapeberrycrushIcon.getImage();
		Image sgrapeberrycrushImage = grapeberrycrushImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgrapeberrycrushIcon = new ImageIcon(sgrapeberrycrushImage);

		// �÷��ο��Ʈ������ �޴� �̹���
		ImageIcon plainyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\�÷��ο��Ʈ������.png");
		Image plainyogurtsmoothieImage = plainyogurtsmoothieIcon.getImage();
		Image splainyogurtsmoothieImage = plainyogurtsmoothieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon splainyogurtsmoothieIcon = new ImageIcon(splainyogurtsmoothieImage);

		// ���̽� ����� 1p �̹���
		ImageIcon iceblended1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\1p.png");
		Image iceblended1pImage = iceblended1pIcon.getImage();
		Image siceblended1pImage = iceblended1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon siceblended1pIcon = new ImageIcon(siceblended1pImage);

		// ���̽� ����� 1p ���õ� �̹���
		ImageIcon ticeblended1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t1p.png");
		Image ticeblended1pImage = ticeblended1pIcon.getImage();
		Image sticeblended1pImage = ticeblended1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticeblended1pIcon = new ImageIcon(sticeblended1pImage);

		// ���̽� ����� 2p �̹���
		ImageIcon iceblended2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\2p.png");
		Image iceblended2pImage = iceblended2pIcon.getImage();
		Image siceblended2pImage = iceblended2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon siceblended2pIcon = new ImageIcon(siceblended2pImage);

		// ���̽� ����� 2p ���õ� �̹���
		ImageIcon ticeblended2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t2p.png");
		Image ticeblended2pImage = ticeblended2pIcon.getImage();
		Image sticeblended2pImage = ticeblended2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticeblended2pIcon = new ImageIcon(sticeblended2pImage);

		// ���̽� ����� 3p �̹���
		ImageIcon iceblended3pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\3p.png");
		Image iceblended3pImage = iceblended3pIcon.getImage();
		Image siceblended3pImage = iceblended3pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon siceblended3pIcon = new ImageIcon(siceblended3pImage);

		// ���̽� ����� 3p ���õ� �̹���
		ImageIcon ticeblended3pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t3p.png");
		Image ticeblended3pImage = ticeblended3pIcon.getImage();
		Image sticeblended3pImage = ticeblended3pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sticeblended3pIcon = new ImageIcon(sticeblended3pImage);

		// �����ƮƼ �޴� �̹���
		ImageIcon lemonmintteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�����ƮƼ.png");
		Image lemonmintteaImage = lemonmintteaIcon.getImage();
		Image slemonmintteaImage = lemonmintteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon slemonmintteaIcon = new ImageIcon(slemonmintteaImage);

		// ��ġĳ���� �޴� �̹���
		ImageIcon litchichamomileIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\��ġĳ����.png");
		Image litchichamomileImage = litchichamomileIcon.getImage();
		Image slitchichamomileImage = litchichamomileImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon slitchichamomileIcon = new ImageIcon(slitchichamomileImage);

		// �����ƾ��̽�Ƽ �޴� �̹���
		ImageIcon peachiceteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�����ƾ��̽�Ƽ.png");
		Image peachiceteaImage = peachiceteaIcon.getImage();
		Image speachiceteaImage = peachiceteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon speachiceteaIcon = new ImageIcon(speachiceteaImage);

		// ��������Ŀ�� �޴� �̹���
		ImageIcon applehibiscusIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\��������Ŀ��.png");
		Image applehibiscusImage = applehibiscusIcon.getImage();
		Image sapplehibiscusImage = applehibiscusImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sapplehibiscusIcon = new ImageIcon(sapplehibiscusImage);

		// ���ھ���Ƽ �޴� �̹���
		ImageIcon citronappleteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\���ھ���Ƽ.png");
		Image citronappleteaImage = citronappleteaIcon.getImage();
		Image scitronappleteaImage = citronappleteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scitronappleteaIcon = new ImageIcon(scitronappleteaImage);

		// ����ĳ����Ƽ �޴� �̹���
		ImageIcon citronchamomileteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\����ĳ����Ƽ.png");
		Image citronchamomileteaImage = citronchamomileteaIcon.getImage();
		Image scitronchamomileteaImage = citronchamomileteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scitronchamomileteaIcon = new ImageIcon(scitronchamomileteaImage);

		// �ڸ���Ϻ�Ƽ �޴� �̹���
		ImageIcon grapefruithoneyblackteaIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�ڸ���Ϻ�Ƽ.png");
		Image grapefruithoneyblackteaImage = grapefruithoneyblackteaIcon.getImage();
		Image sgrapefruithoneyblackteaImage = grapefruithoneyblackteaImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sgrapefruithoneyblackteaIcon = new ImageIcon(sgrapefruithoneyblackteaImage);

		// û�־�׷��� �޴� �̹���
		ImageIcon greentangerineearlgrayIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\û�־�׷���.png");
		Image greentangerineearlgrayImage = greentangerineearlgrayIcon.getImage();
		Image sgreentangerineearlgrayImage = greentangerineearlgrayImage.getScaledInstance(110, 170,
				Image.SCALE_SMOOTH);
		ImageIcon sgreentangerineearlgrayIcon = new ImageIcon(sgreentangerineearlgrayImage);

		// Ÿ�ι���Ƽ �޴� �̹���
		ImageIcon tarobubbleteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\Ÿ�ι���Ƽ.png");
		Image tarobubbleteaImage = tarobubbleteaIcon.getImage();
		Image starobubbleteaImage = tarobubbleteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon starobubbleteaIcon = new ImageIcon(starobubbleteaImage);

		// Ʈ���ù�Ʈ �޴� �̹���
		ImageIcon tripplemintIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\Ʈ���ù�Ʈ.png");
		Image tripplemintImage = tripplemintIcon.getImage();
		Image stripplemintImage = tripplemintImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon stripplemintIcon = new ImageIcon(stripplemintImage);

		// ��Ϸ���Ƽ �޴� �̹���
		ImageIcon honeylemonteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\��Ϸ���Ƽ.png");
		Image honeylemonteaImage = honeylemonteaIcon.getImage();
		Image shoneylemonteaImage = honeylemonteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon shoneylemonteaIcon = new ImageIcon(shoneylemonteaImage);

		// �������Ƽ �޴� �̹���
		ImageIcon honeycitronteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�������Ƽ.png");
		Image honeycitronteaImage = honeycitronteaIcon.getImage();
		Image shoneycitronteaImage = honeycitronteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon shoneycitronteaIcon = new ImageIcon(shoneycitronteaImage);

		// ����ڸ�Ƽ �޴� �̹���
		ImageIcon honeygrapefruitteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\����ڸ�Ƽ.png");
		Image honeygrapefruitteaImage = honeygrapefruitteaIcon.getImage();
		Image shoneygrapefruitteaImage = honeygrapefruitteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon shoneygrapefruitteaIcon = new ImageIcon(shoneygrapefruitteaImage);

		// �漳������Ƽ �޴� �̹���
		ImageIcon brownsugarbubbleteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�漳������Ƽ.png");
		Image bronwsugarbubbleteaImage = brownsugarbubbleteaIcon.getImage();
		Image sbronwsugarbubbleteaImage = bronwsugarbubbleteaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sbrownsugarbubbleteaIcon = new ImageIcon(sbronwsugarbubbleteaImage);

		// ����Ƽ/Ƽ 1p �̹���
		ImageIcon tea1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\1p.png");
		Image tea1pImage = tea1pIcon.getImage();
		Image stea1pImage = tea1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stea1pIcon = new ImageIcon(stea1pImage);

		// ����Ƽ/Ƽ 1p ���õ� �̹���
		ImageIcon ttea1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t1p.png");
		Image ttea1pImage = ttea1pIcon.getImage();
		Image sttea1pImage = ttea1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sttea1pIcon = new ImageIcon(sttea1pImage);

		// ����Ƽ/Ƽ 2p �̹���
		ImageIcon tea2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\2p.png");
		Image tea2pImage = tea2pIcon.getImage();
		Image stea2pImage = tea2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stea2pIcon = new ImageIcon(stea2pImage);

		// ����Ƽ/Ƽ 2p ���õ� �̹���
		ImageIcon ttea2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t2p.png");
		Image ttea2pImage = ttea2pIcon.getImage();
		Image sttea2pImage = ttea2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sttea2pIcon = new ImageIcon(sttea2pImage);

		// �����̵� �޴� �̹���
		ImageIcon lemonadeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�����̵�.png");
		Image lemonadeImage = lemonadeIcon.getImage();
		Image slemonadeImage = lemonadeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon slemonadeIcon = new ImageIcon(slemonadeImage);

		// ���ô� �޴� �̹���
		ImageIcon manpledanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\���ô�.png");
		Image manpledanImage = manpledanIcon.getImage();
		Image smanpledanImage = manpledanImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smanpledanIcon = new ImageIcon(smanpledanImage);

		// �޷мҴ� �޴� �̹���
		ImageIcon melonsodaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�޷мҴ�.png");
		Image melonsodaImage = melonsodaIcon.getImage();
		Image smelonsodaImage = melonsodaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smelonsodaIcon = new ImageIcon(smelonsodaImage);

		// ����� �޴� �̹���
		ImageIcon saddalbiIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�����.png");
		Image saddalbiImage = saddalbiIcon.getImage();
		Image ssaddalbiImage = saddalbiImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssaddalbiIcon = new ImageIcon(ssaddalbiImage);

		// ���ø����̵� �޴� �̹���
		ImageIcon applemangoadeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\���ø����̵�.png");
		Image applemangoadeImage = applemangoadeIcon.getImage();
		Image sapplemangoadeImage = applemangoadeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sapplemangoadeIcon = new ImageIcon(sapplemangoadeImage);

		// ����� �޴� �̹���
		ImageIcon osadangIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�����.png");
		Image osadangImage = osadangIcon.getImage();
		Image sosadangImage = osadangImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sosadangIcon = new ImageIcon(sosadangImage);

		// �ڸ����̵� �޴� �̹���
		ImageIcon grapefruitadeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�ڸ����̵�.png");
		Image grapefruitadeImage = grapefruitadeIcon.getImage();
		Image sgrapefruitadeImage = grapefruitadeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgrapefruitadeIcon = new ImageIcon(sgrapefruitadeImage);

		// ü���� �޴� �̹���
		ImageIcon cherrycokeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\ü����.png");
		Image cherrycokeImage = cherrycokeIcon.getImage();
		Image scherrycokeImage = cherrycokeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scherrycokeIcon = new ImageIcon(scherrycokeImage);

		// ũ���Ҵ� �޴� �̹���
		ImageIcon creamsodaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\ũ���Ҵ�.png");
		Image creamsodaImage = creamsodaIcon.getImage();
		Image screamsodaImage = creamsodaImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon screamsodaIcon = new ImageIcon(screamsodaImage);

		// �������̵� �޴� �̹���
		ImageIcon grapeadeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�������̵�.png");
		Image grapeadeImage = grapeadeIcon.getImage();
		Image sgrapeadeImage = grapeadeImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgrapeadeIcon = new ImageIcon(sgrapeadeImage);

		// �ֽ�/���̵� 1p �̹���
		ImageIcon juice1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\1p.png");
		Image juice1pImage = juice1pIcon.getImage();
		Image sjuice1pImage = juice1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sjuice1pIcon = new ImageIcon(sjuice1pImage);

		// �ֽ�/���̵� 1p ���õ� �̹���
		ImageIcon tjuice1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t1p.png");
		Image tjuice1pImage = tjuice1pIcon.getImage();
		Image stjuice1pImage = tjuice1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stjuice1pIcon = new ImageIcon(stjuice1pImage);

		// �ֽ�/���̵� 2p �̹���
		ImageIcon juice2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\2p.png");
		Image juice2pImage = juice2pIcon.getImage();
		Image sjuice2pImage = juice2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sjuice2pIcon = new ImageIcon(sjuice2pImage);

		// �ֽ�/���̵� 2p ���õ� �̹���
		ImageIcon tjuice2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t2p.png");
		Image tjuice2pImage = tjuice2pIcon.getImage();
		Image stjuice2pImage = tjuice2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stjuice2pIcon = new ImageIcon(stjuice2pImage);

		// �ݵ��� �޴� �̹���
		ImageIcon coldbrewIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�ݵ��� 500ml.png");
		Image coldbrewImage = coldbrewIcon.getImage();
		Image scoldbrewImage = coldbrewImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scoldbrewIcon = new ImageIcon(scoldbrewImage);

		// ��ī���� �ݵ��� �޴� �̹���
		ImageIcon decafeinatedcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\��ī���� �ݵ��� 500ml.png");
		Image decafeinatedcoldbrewImage = decafeinatedcoldbrewIcon.getImage();
		Image sdecafeinatedcoldbrewImage = decafeinatedcoldbrewImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sdecafeinatedcoldbrewIcon = new ImageIcon(sdecafeinatedcoldbrewImage);

		// ����ũ���� �޴� �̹���
		ImageIcon garlicIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���� ũ����.png");
		Image garlicImage = garlicIcon.getImage();
		Image sgarlicImage = garlicImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgarlicIcon = new ImageIcon(sgarlicImage);

		// ����ũ���� �޴� �̹���
		ImageIcon sweetIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���� ũ����.png");
		Image sweetImage = sweetIcon.getImage();
		Image ssweetImage = sweetImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssweetIcon = new ImageIcon(ssweetImage);

		// ��޼ұݻ� �޴� �̹���
		ImageIcon gourmetbreadIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\��޼ұݻ�.png");
		Image gourmetbreadImage = gourmetbreadIcon.getImage();
		Image sgourmetbreadImage = gourmetbreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sgourmetbreadIcon = new ImageIcon(sgourmetbreadImage);

		// �����丶�� ġŲ �ұݻ� �޴� �̹���
		ImageIcon basilbreadIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�����丶�� ġŲ �ұݻ�.png");
		Image basilbreadImage = basilbreadIcon.getImage();
		Image sbasilbreadImage = basilbreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sbasilbreadIcon = new ImageIcon(sbasilbreadImage);

		// ����Ż ��ġ�� �ұݻ� �޴� �̹���
		ImageIcon emmentalbreadIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\����Ż ��ġ�� �ұݻ�.png");
		Image emmentalbreadImage = emmentalbreadIcon.getImage();
		Image semmentalbreadImage = emmentalbreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon semmentalbreadIcon = new ImageIcon(semmentalbreadImage);

		// ���ͳ��� �޴� �̹���
		ImageIcon drnutsIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���ͳ��� ��ĭ.png");
		Image drnutsImage = drnutsIcon.getImage();
		Image sdrnutsImage = drnutsImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sdrnutsIcon = new ImageIcon(sdrnutsImage);

		// ���� ��Ͼ� �ֵ��� �޴� �̹���
		ImageIcon sweethotdogIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���� ��Ͼ� �ֵ���.png");
		Image sweethotdogImage = sweethotdogIcon.getImage();
		Image ssweethotdogImage = sweethotdogImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssweethotdogIcon = new ImageIcon(ssweethotdogImage);

		// ���� ĥ�� �ֵ��� �޴� �̹���
		ImageIcon spicyhotdogIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���� ĥ�� �ֵ���.png");
		Image spicyhotdogImage = spicyhotdogIcon.getImage();
		Image sspicyhotdogImage = spicyhotdogImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sspicyhotdogIcon = new ImageIcon(sspicyhotdogImage);

		// �������� ������ �޴� �̹���
		ImageIcon sweetpotatobreadIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�������� ������.png");
		Image sweetpotatobreadImage = sweetpotatobreadIcon.getImage();
		Image ssweetpotatobreadImage = sweetpotatobreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon ssweetpotatobreadIcon = new ImageIcon(ssweetpotatobreadImage);

		// �����˵� ���ڻ� �޴� �̹���
		ImageIcon potatobreadIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�����˵� ���ڻ�.png");
		Image potatobreadImage = potatobreadIcon.getImage();
		Image spotatobreadImage = potatobreadImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon spotatobreadIcon = new ImageIcon(spotatobreadImage);

		// ���ġ�� ����� �޴� �̹���
		ImageIcon carrotcheeseIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���ġ�� �����.png");
		Image carrotcheeseImage = carrotcheeseIcon.getImage();
		Image scarrotcheeseImage = carrotcheeseImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scarrotcheeseIcon = new ImageIcon(scarrotcheeseImage);

		// �������� ����� ������Ű �޴� �̹���
		ImageIcon doublechococookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�������� ����� ������Ű.png");
		Image doublechococookieImage = doublechococookieIcon.getImage();
		Image sdoublechococookieImage = doublechococookieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sdoublechococookieIcon = new ImageIcon(sdoublechococookieImage);

		// ũ������ ����Ĩ ������Ű �޴� �̹���
		ImageIcon cranberrycookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\ũ������ ����Ĩ ������Ű.png");
		Image cranberrycookieImage = cranberrycookieIcon.getImage();
		Image scranberrycookieImage = cranberrycookieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scranberrycookieIcon = new ImageIcon(scranberrycookieImage);

		// ȭ��Ʈ���� ���� ������Ű �޴� �̹���
		ImageIcon whitechococookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\ȭ��Ʈ���� ���� ������Ű.png");
		Image whitechococookieImage = whitechococookieIcon.getImage();
		Image swhitechococookieImage = whitechococookieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon swhitechococookieIcon = new ImageIcon(swhitechococookieImage);

		// ���⿡ ���� ���� �޴� �̹���
		ImageIcon strawberrypieIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���⿡ ���� ����.png");
		Image strawberrypieImage = strawberrypieIcon.getImage();
		Image sstrawberrypieImage = strawberrypieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrypieIcon = new ImageIcon(sstrawberrypieImage);

		// ���ڿ� ���� ���� �޴� �̹���
		ImageIcon chocopieIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���ڿ� ���� ����.png");
		Image chocopieImage = chocopieIcon.getImage();
		Image schocopieImage = chocopieImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon schocopieIcon = new ImageIcon(schocopieImage);

		// �̴� �ؾ(Ŀ��Ÿ��) �޴� �̹���
		ImageIcon minicustardIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�̴Ϻؾ(Ŀ��Ÿ��).png");
		Image minicustardImage = minicustardIcon.getImage();
		Image sminicustardImage = minicustardImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sminicustardIcon = new ImageIcon(sminicustardImage);

		// �̴� �ؾ(����) �޴� �̹���
		ImageIcon miniredbeanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�̴Ϻؾ(����).png");
		Image miniredbeanImage = miniredbeanIcon.getImage();
		Image sminiredbeanImage = miniredbeanImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sminiredbeanIcon = new ImageIcon(sminiredbeanImage);

		// ������ ��ī�� �޴� �̹���
		ImageIcon strawberrymacaroonIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\������ ��ī��.png");
		Image strawberrymacaroonImage = strawberrymacaroonIcon.getImage();
		Image sstrawberrymacaroonImage = strawberrymacaroonImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrymacaroonIcon = new ImageIcon(sstrawberrymacaroonImage);

		// �������� ��ī�� �޴� �̹���
		ImageIcon matchamacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�������� ��ī��.png");
		Image matchamacaroonImage = matchamacaroonIcon.getImage();
		Image smatchamacaroonImage = matchamacaroonImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon smatchamacaroonIcon = new ImageIcon(smatchamacaroonImage);

		// �������� ��ī�� �޴� �̹���
		ImageIcon cocomacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�������� ��ī��.png");
		Image cocomacaroonImage = cocomacaroonIcon.getImage();
		Image scocomacaroonImage = cocomacaroonImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scocomacaroonIcon = new ImageIcon(scocomacaroonImage);

		// ��Űũ�� ��ī�� �޴� �̹���
		ImageIcon cookiemacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\��Űũ�� ��ī��.png");
		Image cookiemacaroonImage = cookiemacaroonIcon.getImage();
		Image scookiemacaroonImage = cookiemacaroonImage.getScaledInstance(110, 170, Image.SCALE_SMOOTH);
		ImageIcon scookiemacaroonIcon = new ImageIcon(scookiemacaroonImage);

		// ���̵�޴�/RTD 1p �̹���
		ImageIcon side1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\1p.png");
		Image side1pImage = side1pIcon.getImage();
		Image sside1pImage = side1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sside1pIcon = new ImageIcon(sside1pImage);

		// ���̵�޴�/RTD 1p ���õ� �̹���
		ImageIcon tside1pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t1p.png");
		Image tside1pImage = tside1pIcon.getImage();
		Image stside1pImage = tside1pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stside1pIcon = new ImageIcon(stside1pImage);

		// ���̵�޴�/RTD 2p �̹���
		ImageIcon side2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\2p.png");
		Image side2pImage = side2pIcon.getImage();
		Image sside2pImage = side2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sside2pIcon = new ImageIcon(sside2pImage);

		// ���̵�޴�/RTD 2p ���õ� �̹���
		ImageIcon tside2pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t2p.png");
		Image tside2pImage = tside2pIcon.getImage();
		Image stside2pImage = tside2pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stside2pIcon = new ImageIcon(stside2pImage);

		// ���̵�޴�/RTD 3p �̹���
		ImageIcon side3pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\3p.png");
		Image side3pImage = side3pIcon.getImage();
		Image sside3pImage = side3pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon sside3pIcon = new ImageIcon(sside3pImage);

		// ���̵�޴�/RTD 3p ���õ� �̹���
		ImageIcon tside3pIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\t3p.png");
		Image tside3pImage = tside3pIcon.getImage();
		Image stside3pImage = tside3pImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon stside3pIcon = new ImageIcon(stside3pImage);

		// �ֹ��� �޴� ������ư �̹���
		ImageIcon removeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\remove.png");
		Image removeImage = removeIcon.getImage();
		Image sremoveImage = removeImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon sremoveIcon = new ImageIcon(sremoveImage);

		// ��ü���� �޴� �̹���
		ImageIcon deleteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\delete.png");
		Image deleteImage = deleteIcon.getImage();
		Image sdeleteImage = deleteImage.getScaledInstance(110, 35, Image.SCALE_SMOOTH);
		ImageIcon sdeleteIcon = new ImageIcon(sdeleteImage);

		// ���õ� �޴��� ���� �޴��� �̹���
		ImageIcon menuIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\menu.png");
		Image menuImage = menuIcon.getImage();
		Image smenuImage = menuImage.getScaledInstance(570, 170, Image.SCALE_SMOOTH);
		ImageIcon smenuIcon = new ImageIcon(smenuImage);

		// �޴� ���� ���� �̹���
		ImageIcon minusIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\minus.png");
		Image minusImage = minusIcon.getImage();
		Image sminusImage = minusImage.getScaledInstance(19, 19, Image.SCALE_SMOOTH);
		ImageIcon sminusIcon = new ImageIcon(sminusImage);

		// �޴� ���� ���ϴ� �̹���
		ImageIcon plusIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\plus.png");
		Image plusImage = plusIcon.getImage();
		Image splusImage = plusImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon splusIcon = new ImageIcon(splusImage);
		
		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(420, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// Ȩ ��ư �̹��� �ִ� JLabel
		JLabel homeJLabel = new JLabel(shomeIcon);
		homeJLabel.setBounds(0, 0, 138, 45);
		c.add(homeJLabel);
		homeJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new imageslideshow();
				dispose();
			}
		});

		// �ΰ� �̹��� �ִ� JLabel
		JLabel logoJLabel = new JLabel(slogoIcon);
		logoJLabel.setBounds(130, 0, 412, 45);
		c.add(logoJLabel);

		// Ŀ��(���̽�) �׸� �̹��� �ִ� JLabel
		JLabel icecoffeeJLabel = new JLabel(sticecoffeeIcon);
		icecoffeeJLabel.setBounds(0, 42, 138, 50);
		c.add(icecoffeeJLabel);
		icecoffeeJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 1;
				pagenum = 1;
			}
		});

		// Ŀ��(��) �׸� �̹��� �ִ� JLabel
		JLabel hotcoffeeJLabel = new JLabel(shotcoffeeIcon);
		hotcoffeeJLabel.setBounds(134, 42, 138, 50);
		c.add(hotcoffeeJLabel);
		hotcoffeeJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 2;
				pagenum = 1;
			}
		});

		// �������� �׸� �̹��� �ִ� JLabel
		JLabel beverageJLabel = new JLabel(sbeverageIcon);
		beverageJLabel.setBounds(268, 42, 138, 50);
		c.add(beverageJLabel);
		beverageJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 3;
				pagenum = 1;
			}
		});

		// ���̽� ����� �׸� �̹��� �ִ� JLabel
		JLabel iceblendedJLabel = new JLabel(siceblendedIcon);
		iceblendedJLabel.setBounds(402, 42, 138, 50);
		c.add(iceblendedJLabel);
		iceblendedJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 4;
				pagenum = 1;
			}
		});

		// ����Ƽ/Ƽ �׸� �̹��� �ִ� JLabel
		JLabel teaJLabel = new JLabel(steaIcon);
		teaJLabel.setBounds(0, 88, 138, 50);
		c.add(teaJLabel);
		teaJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 5;
				pagenum = 1;
			}
		});

		// �ֽ�/���̵� �׸� �̹��� �ִ� JLabel
		JLabel juiceJLabel = new JLabel(sjuiceIcon);
		juiceJLabel.setBounds(134, 88, 138, 50);
		c.add(juiceJLabel);
		juiceJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 6;
				pagenum = 1;
			}
		});

		// ���̵�޴�/RTD �׸� �̹��� �ִ� JLabel
		JLabel sideJLabel = new JLabel(ssideIcon);
		sideJLabel.setBounds(268, 88, 138, 50);
		c.add(sideJLabel);
		sideJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sortnum = 7;
				pagenum = 1;
			}
		});

		// ��ĭ �׸� �̹��� �ִ� JLabel
		JLabel blankJLabel = new JLabel(sblankIcon);
		blankJLabel.setBounds(402, 88, 138, 50);
		c.add(blankJLabel);

		// 1���� �޴� �̹��� �ִ� JLabel
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

		// 1���� �޴� �̸� �ִ� JLabel
		JLabel menu1nameJLabel = new JLabel("(���̽�)�Ƹ޸�ī��");
		menu1nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu1nameJLabel.setForeground(Color.black);
		menu1nameJLabel.setBounds(25, 290, 300, 30);
		c.add(menu1nameJLabel);

		// 1���� �޴� ���� �ִ� JLabel
		JLabel menu1priceJLabel = new JLabel("2,000��");
		menu1priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu1priceJLabel.setForeground(Color.black);
		menu1priceJLabel.setBounds(82, 305, 300, 30);
		c.add(menu1priceJLabel);

		// 2���� �޴� �̹��� �ִ� JLabel
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

		// 2���� �޴� �̸� �ִ� JLabel
		JLabel menu2nameJLabel = new JLabel("(���̽�)�ͽ�Ŀ��");
		menu2nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu2nameJLabel.setForeground(Color.black);
		menu2nameJLabel.setBounds(166, 290, 300, 30);
		c.add(menu2nameJLabel);

		// 2��° �޴� ���� �ִ� JLabel
		JLabel menu2priceJLabel = new JLabel("3,000��");
		menu2priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu2priceJLabel.setForeground(Color.black);
		menu2priceJLabel.setBounds(214, 305, 300, 30);
		c.add(menu2priceJLabel);

		// 3��° �޴� �̹��� �ִ� JLabel
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

		// 3��° �޴� �̸� �ִ� JLabel
		JLabel menu3nameJLabel = new JLabel("(���̽�)�ٴҶ����");
		menu3nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu3nameJLabel.setForeground(Color.black);
		menu3nameJLabel.setBounds(290, 290, 300, 30);
		c.add(menu3nameJLabel);

		// 3��° �޴� ���� �ִ� JLabel
		JLabel menu3priceJLabel = new JLabel("4,000��");
		menu3priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu3priceJLabel.setForeground(Color.black);
		menu3priceJLabel.setBounds(350, 305, 300, 30);
		c.add(menu3priceJLabel);

		// 4��° �޴� �̹��� �ִ� JLabel
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

		// 4��° �޴� �̸� �ִ� JLabel
		JLabel menu4nameJLabel = new JLabel("(���̽�)�ٴҶ�ũ���ݵ���");
		menu4nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu4nameJLabel.setForeground(Color.black);
		menu4nameJLabel.setBounds(405, 290, 300, 30);
		c.add(menu4nameJLabel);

		// 4��° �޴� ���� �ִ� JLabel
		JLabel menu4priceJLabel = new JLabel("4,500��");
		menu4priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu4priceJLabel.setForeground(Color.black);
		menu4priceJLabel.setBounds(486, 305, 300, 30);
		c.add(menu4priceJLabel);

		// 5��° �޴� �̹��� �ִ� JLabel
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

		// 5��° �޴� �̸� �ִ� JLabel
		JLabel menu5nameJLabel = new JLabel("(���̽�)���̽�ũ����");
		menu5nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu5nameJLabel.setForeground(Color.black);
		menu5nameJLabel.setBounds(22, 495, 300, 30);
		c.add(menu5nameJLabel);

		// 5��° �޴� ���� �ִ� JLabel
		JLabel menu5priceJLabel = new JLabel("4,400��");
		menu5priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu5priceJLabel.setForeground(Color.black);
		menu5priceJLabel.setBounds(82, 510, 300, 30);
		c.add(menu5priceJLabel);

		// 6��° �޴� �̹��� �ִ� JLabel
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

		// 6��° �޴� �̸� �ִ� JLabel
		JLabel menu6nameJLabel = new JLabel("(���̽�)��Ʈī���");
		menu6nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu6nameJLabel.setForeground(Color.black);
		menu6nameJLabel.setBounds(155, 495, 300, 30);
		c.add(menu6nameJLabel);

		// 6��° �޴� ���� �ִ� JLabel
		JLabel menu6priceJLabel = new JLabel("4,300��");
		menu6priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu6priceJLabel.setForeground(Color.black);
		menu6priceJLabel.setBounds(214, 510, 300, 30);
		c.add(menu6priceJLabel);

		// 7��° �޴� �̹��� �ִ� JLabel
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

		// 7��° �޴� �̸� �ִ� JLabel
		JLabel menu7nameJLabel = new JLabel("(���̽�)ī��Ḷ���ƶ�");
		menu7nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu7nameJLabel.setForeground(Color.black);
		menu7nameJLabel.setBounds(285, 495, 300, 30);
		c.add(menu7nameJLabel);

		// 7��° �޴� ���� �ִ� JLabel
		JLabel menu7priceJLabel = new JLabel("4,000��");
		menu7priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu7priceJLabel.setForeground(Color.black);
		menu7priceJLabel.setBounds(350, 510, 300, 30);
		c.add(menu7priceJLabel);

		// 8��° �޴� �̹��� �ִ� JLabel
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

		// 8��° �޴� �̸� �ִ� JLabel
		JLabel menu8nameJLabel = new JLabel("(���̽�)ī���");
		menu8nameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 10));
		menu8nameJLabel.setForeground(Color.black);
		menu8nameJLabel.setBounds(435, 495, 300, 30);
		c.add(menu8nameJLabel);

		// 8��° �޴� ���� �ִ� JLabel
		JLabel menu8priceJLabel = new JLabel("3,500��");
		menu8priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
		menu8priceJLabel.setForeground(Color.black);
		menu8priceJLabel.setBounds(480, 510, 300, 30);
		c.add(menu8priceJLabel);

		// Ŀ��(���̽�) 1p �̹��� �ִ� JLabel
		JLabel icecoffee1pJLabel = new JLabel(sticecoffee1pIcon);
		icecoffee1pJLabel.setBounds(235, 580, 30, 30);
		c.add(icecoffee1pJLabel);
		icecoffee1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// Ŀ��(���̽�) 2p �̹��� �ִ� JLabel
		JLabel icecoffee2pJLabel = new JLabel(sicecoffee2pIcon);
		icecoffee2pJLabel.setBounds(275, 580, 30, 30);
		c.add(icecoffee2pJLabel);
		icecoffee2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// Ŀ��(��) 1p �̹��� �ִ� JLabel
		JLabel hotcoffee1pJLabel = new JLabel(sthotcoffee1pIcon);
		hotcoffee1pJLabel.setBounds(235, 580, 30, 30);
		c.add(hotcoffee1pJLabel);
		hotcoffee1pJLabel.setVisible(false);
		hotcoffee1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// Ŀ��(��) 2p �̹��� �ִ� JLabel
		JLabel hotcoffee2pJLabel = new JLabel(shotcoffee2pIcon);
		hotcoffee2pJLabel.setBounds(275, 580, 30, 30);
		c.add(hotcoffee2pJLabel);
		hotcoffee2pJLabel.setVisible(false);
		hotcoffee2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// �������� 1p �̹��� �ִ� JLabel
		JLabel beverage1pJLabel = new JLabel(stbeverage1pIcon);
		beverage1pJLabel.setBounds(235, 580, 30, 30);
		c.add(beverage1pJLabel);
		beverage1pJLabel.setVisible(false);
		beverage1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// �������� 2p �̹��� �ִ� JLabel
		JLabel beverage2pJLabel = new JLabel(sbeverage2pIcon);
		beverage2pJLabel.setBounds(275, 580, 30, 30);
		c.add(beverage2pJLabel);
		beverage2pJLabel.setVisible(false);
		beverage2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// ���̽� ����� 1p �̹��� �ִ� JLabel
		JLabel iceblended1pJLabel = new JLabel(sticeblended1pIcon);
		iceblended1pJLabel.setBounds(215, 580, 30, 30);
		c.add(iceblended1pJLabel);
		iceblended1pJLabel.setVisible(false);
		iceblended1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// ���̽� ����� 2p �̹��� �ִ� JLabel
		JLabel iceblended2pJLabel = new JLabel(siceblended2pIcon);
		iceblended2pJLabel.setBounds(255, 580, 30, 30);
		c.add(iceblended2pJLabel);
		iceblended2pJLabel.setVisible(false);
		iceblended2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// ���̽� ����� 3p �̹��� �ִ� JLabel
		JLabel iceblended3pJLabel = new JLabel(siceblended3pIcon);
		iceblended3pJLabel.setBounds(295, 580, 30, 30);
		c.add(iceblended3pJLabel);
		iceblended3pJLabel.setVisible(false);
		iceblended3pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 3;
			}
		});

		// ����Ƽ/Ƽ 1p �̹��� �ִ� JLabel
		JLabel tea1pJLabel = new JLabel(sttea1pIcon);
		tea1pJLabel.setBounds(235, 580, 30, 30);
		c.add(tea1pJLabel);
		tea1pJLabel.setVisible(false);
		tea1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// ����Ƽ/Ƽ 2p �̹��� �ִ� JLabel
		JLabel tea2pJLabel = new JLabel(stea2pIcon);
		tea2pJLabel.setBounds(275, 580, 30, 30);
		c.add(tea2pJLabel);
		tea2pJLabel.setVisible(false);
		tea2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// �ֽ�/���̵� 1p �̹��� �ִ� JLabel
		JLabel juice1pJLabel = new JLabel(stjuice1pIcon);
		juice1pJLabel.setBounds(235, 580, 30, 30);
		c.add(juice1pJLabel);
		juice1pJLabel.setVisible(false);
		juice1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// ����Ƽ/Ƽ 2p �̹��� �ִ� JLabel
		JLabel juice2pJLabel = new JLabel(sjuice2pIcon);
		juice2pJLabel.setBounds(275, 580, 30, 30);
		c.add(juice2pJLabel);
		juice2pJLabel.setVisible(false);
		juice2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// ���̵�޴�/RTD 1p �̹��� �ִ� JLabel
		JLabel side1pJLabel = new JLabel(stside1pIcon);
		side1pJLabel.setBounds(215, 580, 30, 30);
		c.add(side1pJLabel);
		side1pJLabel.setVisible(false);
		side1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 1;
			}
		});

		// ���̵�޴�/RTD 2p �̹��� �ִ� JLabel
		JLabel side2pJLabel = new JLabel(sside2pIcon);
		side2pJLabel.setBounds(255, 580, 30, 30);
		c.add(side2pJLabel);
		side2pJLabel.setVisible(false);
		side2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 2;
			}
		});

		// ���̵�޴�/RTD 3p �̹��� �ִ� JLabel
		JLabel side3pJLabel = new JLabel(sside3pIcon);
		side3pJLabel.setBounds(295, 580, 30, 30);
		c.add(side3pJLabel);
		side3pJLabel.setVisible(false);
		side3pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				pagenum = 3;
			}
		});

		// �ֹ��� 1��° �޴� ���� �̹��� �ִ� JLabel
		remove1JLabel = new JLabel(sremoveIcon);
		remove1JLabel.setBounds(25, 640, 20, 20);
		c.add(remove1JLabel);
		remove1JLabel.setVisible(false);

		// ������ 1���� �޴� �̹��� �ִ� JLabel
		chosemenu1imageJLabel = new JLabel();
		chosemenu1imageJLabel.setBounds(55, 630, 25, 40);
		c.add(chosemenu1imageJLabel);
		chosemenu1imageJLabel.setVisible(false);

		// ������ 1���� �޴� �̸� �ִ� JLabel
		chosemenu1nameJLabel = new JLabel();
		chosemenu1nameJLabel.setBounds(85, 630, 200, 20);
		c.add(chosemenu1nameJLabel);
		chosemenu1nameJLabel.setVisible(false);

		// ������ 1��° �޴� �ɼ� �ִ� JLabel
		chosemenu1optionJLabel = new JLabel();
		chosemenu1optionJLabel.setBounds(85, 650, 250, 20);
		chosemenu1optionJLabel.setForeground(Color.gray);
		c.add(chosemenu1optionJLabel);
		chosemenu1optionJLabel.setVisible(false);

		// ������ 1��° �޴� ���� �ִ� JLabel
		chosemenu1priceJLabel = new JLabel();
		chosemenu1priceJLabel.setBounds(360, 640, 100, 20);
		chosemenu1priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenu1priceJLabel);
		chosemenu1priceJLabel.setVisible(false);

		// 1��° �޴� ���� ���� �̹��� �ִ� JLabel
		minus1JLabel = new JLabel(sminusIcon);
		minus1JLabel.setBounds(430, 641, 19, 19);
		c.add(minus1JLabel);
		minus1JLabel.setVisible(false);

		// 1��° �޴� ���� �ִ� JLabel
		chosemenu1quantityJLabel = new JLabel();
		chosemenu1quantityJLabel.setBounds(460, 635, 50, 30);
		chosemenu1quantityJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenu1quantityJLabel);
		chosemenu1quantityJLabel.setVisible(false);

		// 1���� �޴� ���� ���ϴ� �̹��� �ִ� JLabel
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
					paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
							+ "�� �����ϱ�</center></body></html>");
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
				paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
						+ "�� �����ϱ�</center></body></html>");
			}
		});

		// �ֹ��� 2���� �޴� ���� �̹��� �ִ� JLabel
		remove2JLabel = new JLabel(sremoveIcon);
		remove2JLabel.setBounds(25, 680, 20, 20);
		c.add(remove2JLabel);
		remove2JLabel.setVisible(false);

		// ������ 2���� �޴� �̹��� �ִ� JLabel
		chosemenu2imageJLabel = new JLabel();
		chosemenu2imageJLabel.setBounds(55, 670, 25, 40);
		c.add(chosemenu2imageJLabel);
		chosemenu2imageJLabel.setVisible(false);

		// ������ 2���� �޴� �̸� �ִ� JLabel
		chosemenu2nameJLabel = new JLabel();
		chosemenu2nameJLabel.setBounds(85, 670, 200, 20);
		c.add(chosemenu2nameJLabel);
		chosemenu2nameJLabel.setVisible(false);

		// ������ 2��° �޴� �ɼ� �ִ� JLabel
		chosemenu2optionJLabel = new JLabel();
		chosemenu2optionJLabel.setBounds(85, 690, 250, 20);
		chosemenu2optionJLabel.setForeground(Color.gray);
		c.add(chosemenu2optionJLabel);
		chosemenu2optionJLabel.setVisible(false);

		// ������ 2��° �޴� ���� �ִ� JLabel
		chosemenu2priceJLabel = new JLabel();
		chosemenu2priceJLabel.setBounds(360, 680, 100, 20);
		chosemenu2priceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenu2priceJLabel);
		chosemenu2priceJLabel.setVisible(false);

		// 2��° �޴� ���� ���� �̹��� �ִ� JLabel
		minus2JLabel = new JLabel(sminusIcon);
		minus2JLabel.setBounds(430, 681, 19, 19);
		c.add(minus2JLabel);
		minus2JLabel.setVisible(false);

		// 2��° �޴� ���� �ִ� JLabel
		chosemenu2quantityJLabel = new JLabel();
		chosemenu2quantityJLabel.setBounds(460, 675, 50, 30);
		chosemenu2quantityJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenu2quantityJLabel);
		chosemenu2quantityJLabel.setVisible(false);

		// 2���� �޴� ���� ���ϴ� �̹��� �ִ� JLabel
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
					paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
							+ "�� �����ϱ�</center></body></html>");
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
				paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
						+ "�� �����ϱ�</center></body></html>");
			}
		});

		// �޴� ������ �ø��� �̹��� �ִ� JLabel
		upJLabel = new JLabel(supIcon);
		upJLabel.setBounds(510, 640, 20, 20);
		c.add(upJLabel);
		upJLabel.setVisible(false);

		// �޴� ������ ������ �̹��� �ִ� JLabel
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
						chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
						chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "��");
						chosemenu2priceJLabel.setVisible(true);
						chosemenu2quantityJLabel.setText(str2[4]);
						chosemenu2quantityJLabel.setVisible(true);

						basket -= Integer.parseInt(str[4]);
						basketJLabel.setText(Integer.toString(basket));
						payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
						paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
								+ "�� �����ϱ�</center></body></html>");

					} else if (Order.size() == 1) {
						str1 = Order.get(upindex).split(",");
						new chosemenuimage(str1[0]);
						chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
						chosemenu1imageJLabel.setVisible(true);
						chosemenu1nameJLabel.setText(str1[1]);
						chosemenu1nameJLabel.setVisible(true);
						chosemenu1optionJLabel.setText(str1[2]);
						chosemenu1optionJLabel.setVisible(true);
						chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
						paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
								+ "�� �����ϱ�</center></body></html>");

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
						paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
								+ "�� �����ϱ�</center></body></html>");

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
					chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
					chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "��");
					chosemenu2priceJLabel.setVisible(true);
					chosemenu2quantityJLabel.setText(str2[4]);
					chosemenu2quantityJLabel.setVisible(true);

					basket -= Integer.parseInt(str[4]);
					basketJLabel.setText(Integer.toString(basket));
					payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
					paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
							+ "�� �����ϱ�</center></body></html>");

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
						chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
						chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "��");
						chosemenu2priceJLabel.setVisible(true);
						chosemenu2quantityJLabel.setText(str2[4]);
						chosemenu2quantityJLabel.setVisible(true);

						basket -= Integer.parseInt(str[4]);
						basketJLabel.setText(Integer.toString(basket));
						payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
						paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
								+ "�� �����ϱ�</center></body></html>");

					} else if (Order.size() == 1) {
						str1 = Order.get(upindex).split(",");
						new chosemenuimage(str1[0]);
						chosemenu1imageJLabel.setIcon(chosemenuimage.chosemenuImageIcon);
						chosemenu1imageJLabel.setVisible(true);
						chosemenu1nameJLabel.setText(str1[1]);
						chosemenu1nameJLabel.setVisible(true);
						chosemenu1optionJLabel.setText(str1[2]);
						chosemenu1optionJLabel.setVisible(true);
						chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
						paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
								+ "�� �����ϱ�</center></body></html>");
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
					chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
					chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "��");
					chosemenu2priceJLabel.setVisible(true);
					chosemenu2quantityJLabel.setText(str2[4]);
					chosemenu2quantityJLabel.setVisible(true);

					basket -= Integer.parseInt(str[4]);
					basketJLabel.setText(Integer.toString(basket));
					payment -= Integer.parseInt(str[3]) * Integer.parseInt(str[4]);
					paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
							+ "�� �����ϱ�</center></body></html>");
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
					chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
					chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "��");
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
					chosemenu1priceJLabel.setText(formatter.format(Integer.parseInt(str1[3])) + "��");
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
					chosemenu2priceJLabel.setText(formatter.format(Integer.parseInt(str2[3])) + "��");
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

		// ��ü���� �޴� �ִ� JLabel
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
				paymentJLabel.setText("<html><body><center>�� " + basket + "�� ��ǰ<br>" + formatter.format(payment)
						+ "�� �����ϱ�</center></body></html>");
				Order.clear();
			}
		});

		// ��ٱ��� ���� �ִ� JLabel
		basketJLabel = new JLabel(Integer.toString(basket));
		basketJLabel.setBounds(43, 723, 20, 20);
		basketJLabel.setForeground(Color.white);
		basketJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(basketJLabel);

		// ��ǰ ������ �����ݾ� �ִ� JLabel
		paymentJLabel = new JLabel(
				"<html><body><center>�� " + basket + "�� ��ǰ<br>" + payment + "�� �����ϱ�</center></body></html>",
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

		// ���õ� �޴��� ���� �޴��� �̹��� �ִ� JLabel
		JLabel menuJLabel = new JLabel(smenuIcon);
		menuJLabel.setBounds(0, 530, 540, 320);
		c.add(menuJLabel);

		// Ŀ��(���̽�) �׸� ���õǸ� �ٲ�� Listener
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
				menu1nameJLabel.setText("(���̽�)�Ƹ޸�ī��");
				menu1priceJLabel.setText("2,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sicemixedcoffeeIcon);
				menu2nameJLabel.setText("(���̽�)�ͽ�Ŀ��");
				menu2priceJLabel.setText("3,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sicevanilladeeplatteIcon);
				menu3nameJLabel.setText("(���̽�)�ٴҶ����");
				menu3priceJLabel.setText("4,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sicevanillacreamcoldbrewIcon);
				menu4nameJLabel.setText("(���̽�)�ٴҶ�ũ���ݵ���");
				menu4priceJLabel.setText("4,500��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(siceicecreamlatteIcon);
				menu5nameJLabel.setText("(���̽�)���̽�ũ����");
				menu5priceJLabel.setText("4,400��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(siceoatcafelatteIcon);
				menu6nameJLabel.setText("(���̽�)��Ʈī���");
				menu6priceJLabel.setText("4,300��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sicecaramelmacchiatoIcon);
				menu7nameJLabel.setText("(���̽�)ī��Ḷ���ƶ�");
				menu7priceJLabel.setText("4,000��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sicecafelatteIcon);
				menu8nameJLabel.setText("(���̽�)ī���");
				menu8priceJLabel.setText("3,500��");
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

		// Ŀ��(���̽�) 1p ���õǸ� �ٲ�� Listener
		icecoffee1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffee1pJLabel.setIcon(sticecoffee1pIcon);
				icecoffee2pJLabel.setIcon(sicecoffee2pIcon);
				menu1JLabel.setIcon(siceamericanoIcon);
				menu1nameJLabel.setText("(���̽�)�Ƹ޸�ī��");
				menu1priceJLabel.setText("2,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sicemixedcoffeeIcon);
				menu2nameJLabel.setText("(���̽�)�ͽ�Ŀ��");
				menu2priceJLabel.setText("3,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sicevanilladeeplatteIcon);
				menu3nameJLabel.setText("(���̽�)�ٴҶ����");
				menu3priceJLabel.setText("4,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sicevanillacreamcoldbrewIcon);
				menu4nameJLabel.setText("(���̽�)�ٴҶ�ũ���ݵ���");
				menu4priceJLabel.setText("4,500��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(siceicecreamlatteIcon);
				menu5nameJLabel.setText("(���̽�)���̽�ũ����");
				menu5priceJLabel.setText("4,400��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(siceoatcafelatteIcon);
				menu6nameJLabel.setText("(���̽�)��Ʈī���");
				menu6priceJLabel.setText("4,300��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sicecaramelmacchiatoIcon);
				menu7nameJLabel.setText("(���̽�)ī��Ḷ���ƶ�");
				menu7priceJLabel.setText("4,000��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sicecafelatteIcon);
				menu8nameJLabel.setText("(���̽�)ī���");
				menu8priceJLabel.setText("3,500��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// Ŀ��(���̽�) 2p ���õǸ� �ٲ�� Listener
		icecoffee2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				icecoffee1pJLabel.setIcon(sicecoffee1pIcon);
				icecoffee2pJLabel.setIcon(sticecoffee2pIcon);
				menu1JLabel.setIcon(sicecafemochaIcon);
				menu1nameJLabel.setText("(���̽�)ī���ī");
				menu1priceJLabel.setText("4,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sicecoconutIcon);
				menu2nameJLabel.setText("(���̽�)���ڳӶ�");
				menu2priceJLabel.setText("4,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sicecoldbrewIcon);
				menu3nameJLabel.setText("(���̽�)�ݵ���");
				menu3priceJLabel.setText("3,800��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sicecoldbrewlatteIcon);
				menu4nameJLabel.setText("(���̽�)�ݵ����");
				menu4priceJLabel.setText("4,300��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sicetoffeenutlatteIcon);
				menu5nameJLabel.setText("(���̽�)���ǳӶ�");
				menu5priceJLabel.setText("4,200��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sicehazelnutdeeplatteIcon);
				menu6nameJLabel.setText("(���̽�)������ӵ���");
				menu6priceJLabel.setText("4,000��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sicehazelnutcreamcoldbrewIcon);
				menu7nameJLabel.setText("(���̽�)�������ũ���ݵ���");
				menu7priceJLabel.setText("4,500��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setVisible(false);
				menu8nameJLabel.setVisible(false);
				menu8priceJLabel.setVisible(false);
			}
		});

		// Ŀ��(��) �׸� ���õǸ� �ٲ�� Listener
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
				menu1nameJLabel.setText("(��)�Ƹ޸�ī��");
				menu1priceJLabel.setText("2,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(shotmixedcoffeeIcon);
				menu2nameJLabel.setText("(��)�ͽ�Ŀ��");
				menu2priceJLabel.setText("3,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(shotvanilladeeplatteIcon);
				menu3nameJLabel.setText("(��)�ٴҶ����");
				menu3priceJLabel.setText("4,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(shotcondensedmilklatteIcon);
				menu4nameJLabel.setText("(��)������");
				menu4priceJLabel.setText("4,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(shotoatcafelatteIcon);
				menu5nameJLabel.setText("(��)��Ʈī���");
				menu5priceJLabel.setText("4,300��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(shotcaramelmacchiatoIcon);
				menu6nameJLabel.setText("(��)ī��Ḷ���ƶ�");
				menu6priceJLabel.setText("4,000��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(shotcafelatteIcon);
				menu7nameJLabel.setText("(��)ī���");
				menu7priceJLabel.setText("3,500��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(shotcafemochaIcon);
				menu8nameJLabel.setText("(��)ī���ī");
				menu8priceJLabel.setText("4,000��");
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

		// Ŀ��(��) 1p ���õǸ� �ٲ�� Listener
		hotcoffee1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				hotcoffee1pJLabel.setIcon(sthotcoffee1pIcon);
				hotcoffee2pJLabel.setIcon(shotcoffee2pIcon);
				menu1JLabel.setIcon(shotamericanoIcon);
				menu1nameJLabel.setText("(��)�Ƹ޸�ī��");
				menu1priceJLabel.setText("2,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(shotmixedcoffeeIcon);
				menu2nameJLabel.setText("(��)�ͽ�Ŀ��");
				menu2priceJLabel.setText("3,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(shotvanilladeeplatteIcon);
				menu3nameJLabel.setText("(��)�ٴҶ����");
				menu3priceJLabel.setText("4,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(shotcondensedmilklatteIcon);
				menu4nameJLabel.setText("(��)������");
				menu4priceJLabel.setText("4,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(shotoatcafelatteIcon);
				menu5nameJLabel.setText("(��)��Ʈī���");
				menu5priceJLabel.setText("4,300��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(shotcaramelmacchiatoIcon);
				menu6nameJLabel.setText("(��)ī��Ḷ���ƶ�");
				menu6priceJLabel.setText("4,000��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(shotcafelatteIcon);
				menu7nameJLabel.setText("(��)ī���");
				menu7priceJLabel.setText("3,500��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(shotcafemochaIcon);
				menu8nameJLabel.setText("(��)ī���ī");
				menu8priceJLabel.setText("4,000��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// Ŀ��(��) 2p ���õǸ� �ٲ�� Listener
		hotcoffee2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				hotcoffee1pJLabel.setIcon(shotcoffee1pIcon);
				hotcoffee2pJLabel.setIcon(sthotcoffee2pIcon);
				menu1JLabel.setIcon(shotcoconutlatteIcon);
				menu1nameJLabel.setText("(��)���ڳӶ�");
				menu1priceJLabel.setText("4,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(shottoffeenutlatteIcon);
				menu2nameJLabel.setText("(��)���ǳӶ�");
				menu2priceJLabel.setText("4,200��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(shothazelnutdeeplatteIcon);
				menu3nameJLabel.setText("(��)������ӵ���");
				menu3priceJLabel.setText("4,000��");
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

		// �������� �׸� ���õǸ� �ٲ�� Listener
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
				menu1nameJLabel.setText("��������");
				menu1priceJLabel.setText("4,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sstrawberrylatteIcon);
				menu2nameJLabel.setText("�����");
				menu2priceJLabel.setText("4,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sroyalmilkteaIcon);
				menu3nameJLabel.setText("�ξ��ũƼ");
				menu3priceJLabel.setText("4,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(smatchalatteIcon);
				menu4nameJLabel.setText("������");
				menu4priceJLabel.setText("4,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(smatchaeinspennerIcon);
				menu5nameJLabel.setText("�������ν����");
				menu5priceJLabel.setText("4,000��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smeltingchocoIcon);
				menu6nameJLabel.setText("��������");
				menu6priceJLabel.setText("4,400��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(smixedgrainpowderIcon);
				menu7nameJLabel.setText("�̼�����");
				menu7priceJLabel.setText("3,500��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(smixedgrainpowderlatteIcon);
				menu8nameJLabel.setText("�̼������");
				menu8priceJLabel.setText("4,000��");
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

		// �������� 1p ���õǸ� �ٲ�� Listener
		beverage1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				beverage1pJLabel.setIcon(stbeverage1pIcon);
				beverage2pJLabel.setIcon(sbeverage2pIcon);
				menu1JLabel.setIcon(ssweetpotatolatteIcon);
				menu1nameJLabel.setText("��������");
				menu1priceJLabel.setText("4,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sstrawberrylatteIcon);
				menu2nameJLabel.setText("�����");
				menu2priceJLabel.setText("4,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sroyalmilkteaIcon);
				menu3nameJLabel.setText("�ξ��ũƼ");
				menu3priceJLabel.setText("4,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(smatchalatteIcon);
				menu4nameJLabel.setText("������");
				menu4priceJLabel.setText("4,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(smatchaeinspennerIcon);
				menu5nameJLabel.setText("�������ν����");
				menu5priceJLabel.setText("4,000��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smeltingchocoIcon);
				menu6nameJLabel.setText("��������");
				menu6priceJLabel.setText("4,400��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(smixedgrainpowderIcon);
				menu7nameJLabel.setText("�̼�����");
				menu7priceJLabel.setText("3,500��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(smixedgrainpowderlatteIcon);
				menu8nameJLabel.setText("�̼������");
				menu8priceJLabel.setText("4,000��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// �������� 2p ���õǸ� �ٲ�� Listener
		beverage2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				beverage1pJLabel.setIcon(sbeverage1pIcon);
				beverage2pJLabel.setIcon(stbeverage2pIcon);
				menu1JLabel.setIcon(schocolatteIcon);
				menu1nameJLabel.setText("���ڶ�");
				menu1priceJLabel.setText("4,000��");
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

		// ���̽� ����� �׸� ���õǸ� �ٲ�� Listener
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
				menu1nameJLabel.setText("���⽦��ũ");
				menu1priceJLabel.setText("4,400��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sstrawberryyogurtsmoothieIcon);
				menu2nameJLabel.setText("������Ʈ������");
				menu2priceJLabel.setText("4,400��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(smatchafrappeIcon);
				menu3nameJLabel.setText("����������");
				menu3priceJLabel.setText("4,400��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(smangoyogurtsmoothieIcon);
				menu4nameJLabel.setText("������Ʈ������");
				menu4priceJLabel.setText("4,400��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(smangofashioncrushIcon);
				menu5nameJLabel.setText("�����м�ũ����");
				menu5priceJLabel.setText("4,700��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smintchocochipfrappeIcon);
				menu6nameJLabel.setText("��Ʈ����Ĩ������");
				menu6priceJLabel.setText("4,400��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(smilkshakeIcon);
				menu7nameJLabel.setText("��ũ����ũ");
				menu7priceJLabel.setText("4,400��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sblueberryyogurtsmoothieIcon);
				menu8nameJLabel.setText("��纣�����Ʈ������");
				menu8priceJLabel.setText("4,400��");
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

		// ���̽������ 1p ���õǸ� �ٲ�� Listener
		iceblended1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				iceblended1pJLabel.setIcon(sticeblended1pIcon);
				iceblended2pJLabel.setIcon(siceblended2pIcon);
				iceblended3pJLabel.setIcon(siceblended3pIcon);
				menu1JLabel.setIcon(sstrawberryshakeIcon);
				menu1nameJLabel.setText("���⽦��ũ");
				menu1priceJLabel.setText("4,400��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sstrawberryyogurtsmoothieIcon);
				menu2nameJLabel.setText("������Ʈ������");
				menu2priceJLabel.setText("4,400��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(smatchafrappeIcon);
				menu3nameJLabel.setText("����������");
				menu3priceJLabel.setText("4,400��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(smangoyogurtsmoothieIcon);
				menu4nameJLabel.setText("������Ʈ������");
				menu4priceJLabel.setText("4,400��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(smangofashioncrushIcon);
				menu5nameJLabel.setText("�����м�ũ����");
				menu5priceJLabel.setText("4,700��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smintchocochipfrappeIcon);
				menu6nameJLabel.setText("��Ʈ����Ĩ������");
				menu6priceJLabel.setText("4,400��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(smilkshakeIcon);
				menu7nameJLabel.setText("��ũ����ũ");
				menu7priceJLabel.setText("4,400��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sblueberryyogurtsmoothieIcon);
				menu8nameJLabel.setText("��纣�����Ʈ������");
				menu8priceJLabel.setText("4,400��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// ���̽������ 2p ���õǸ� �ٲ�� Listener
		iceblended2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				iceblended1pJLabel.setIcon(siceblended1pIcon);
				iceblended2pJLabel.setIcon(sticeblended2pIcon);
				iceblended3pJLabel.setIcon(siceblended3pIcon);
				menu1JLabel.setIcon(sespressoshakeIcon);
				menu1nameJLabel.setText("���������ҽ���ũ");
				menu1priceJLabel.setText("4,400��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(scitronpearcrushIcon);
				menu2nameJLabel.setText("���ڹ�ũ����");
				menu2priceJLabel.setText("4,700��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(splumpeachcrushIcon);
				menu3nameJLabel.setText("�ڵ���ġũ����");
				menu3priceJLabel.setText("4,700��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sjavachipfrappeIcon);
				menu4nameJLabel.setText("�ڹ�Ĩ������");
				menu4priceJLabel.setText("4,400��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(schocoshakeIcon);
				menu5nameJLabel.setText("���ڽ���ũ");
				menu5priceJLabel.setText("4,400��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(scoconutcoffeefrappeIcon);
				menu6nameJLabel.setText("���ڳ�Ŀ��������");
				menu6priceJLabel.setText("5,000��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(scocochocofrappeIcon);
				menu7nameJLabel.setText("��������������");
				menu7priceJLabel.setText("4,400��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(scookiencreamfrappeIcon);
				menu8nameJLabel.setText("��Ű��ũ��������");
				menu8priceJLabel.setText("4,400��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// ���̽������ 3p ���õǸ� �ٲ�� Listener
		iceblended3pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				iceblended1pJLabel.setIcon(siceblended1pIcon);
				iceblended2pJLabel.setIcon(siceblended2pIcon);
				iceblended3pJLabel.setIcon(sticeblended3pIcon);
				menu1JLabel.setIcon(sgrapeberrycrushIcon);
				menu1nameJLabel.setText("��������ũ����");
				menu1priceJLabel.setText("4,700��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(splainyogurtsmoothieIcon);
				menu2nameJLabel.setText("�÷��ο��Ʈ������");
				menu2priceJLabel.setText("4,400��");
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

		// ����Ƽ/Ƽ �׸� ���õǸ� �ٲ�� Listener
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
				menu1nameJLabel.setText("�����ƮƼ");
				menu1priceJLabel.setText("4,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(slitchichamomileIcon);
				menu2nameJLabel.setText("��ġĳ����");
				menu2priceJLabel.setText("3,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(speachiceteaIcon);
				menu3nameJLabel.setText("�����ƾ��̽�Ƽ");
				menu3priceJLabel.setText("3,500��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sapplehibiscusIcon);
				menu4nameJLabel.setText("��������Ŀ��");
				menu4priceJLabel.setText("3,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(scitronappleteaIcon);
				menu5nameJLabel.setText("���ھ���Ƽ");
				menu5priceJLabel.setText("4,000��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(scitronchamomileteaIcon);
				menu6nameJLabel.setText("����ĳ����Ƽ");
				menu6priceJLabel.setText("4,000��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sgrapefruithoneyblackteaIcon);
				menu7nameJLabel.setText("�ڸ���Ϻ�Ƽ");
				menu7priceJLabel.setText("4,000��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sgreentangerineearlgrayIcon);
				menu8nameJLabel.setText("û�־�׷���");
				menu8priceJLabel.setText("3,000��");
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

		// ����Ƽ/Ƽ 1p ���õǸ� �ٲ�� Listener
		tea1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				tea1pJLabel.setIcon(sttea1pIcon);
				tea2pJLabel.setIcon(stea2pIcon);
				menu1JLabel.setIcon(slemonmintteaIcon);
				menu1nameJLabel.setText("�����ƮƼ");
				menu1priceJLabel.setText("4,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(slitchichamomileIcon);
				menu2nameJLabel.setText("��ġĳ����");
				menu2priceJLabel.setText("3,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(speachiceteaIcon);
				menu3nameJLabel.setText("�����ƾ��̽�Ƽ");
				menu3priceJLabel.setText("3,500��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sapplehibiscusIcon);
				menu4nameJLabel.setText("��������Ŀ��");
				menu4priceJLabel.setText("3,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(scitronappleteaIcon);
				menu5nameJLabel.setText("���ھ���Ƽ");
				menu5priceJLabel.setText("4,000��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(scitronchamomileteaIcon);
				menu6nameJLabel.setText("����ĳ����Ƽ");
				menu6priceJLabel.setText("4,000��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sgrapefruithoneyblackteaIcon);
				menu7nameJLabel.setText("�ڸ���Ϻ�Ƽ");
				menu7priceJLabel.setText("4,000��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sgreentangerineearlgrayIcon);
				menu8nameJLabel.setText("û�־�׷���");
				menu8priceJLabel.setText("3,000��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// ����Ƽ/Ƽ 2p ���õǸ� �ٲ�� Listener
		tea2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				tea1pJLabel.setIcon(stea1pIcon);
				tea2pJLabel.setIcon(sttea2pIcon);
				menu1JLabel.setIcon(starobubbleteaIcon);
				menu1nameJLabel.setText("Ÿ�ι���Ƽ");
				menu1priceJLabel.setText("3,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(stripplemintIcon);
				menu2nameJLabel.setText("Ʈ���ù�Ʈ");
				menu2priceJLabel.setText("3,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(shoneylemonteaIcon);
				menu3nameJLabel.setText("��Ϸ���Ƽ");
				menu3priceJLabel.setText("3,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(shoneycitronteaIcon);
				menu4nameJLabel.setText("�������Ƽ");
				menu4priceJLabel.setText("3,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(shoneygrapefruitteaIcon);
				menu5nameJLabel.setText("����ڸ�Ƽ");
				menu5priceJLabel.setText("3,000��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sbrownsugarbubbleteaIcon);
				menu6nameJLabel.setText("�漳������Ƽ");
				menu6priceJLabel.setText("3,000��");
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

		// �ֽ�/���̵� �׸� ���õǸ� �ٲ�� Listener
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
				menu1nameJLabel.setText("�����̵�");
				menu1priceJLabel.setText("4,400��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(smanpledanIcon);
				menu2nameJLabel.setText("���ô�");
				menu2priceJLabel.setText("4,300��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(smelonsodaIcon);
				menu3nameJLabel.setText("�޷мҴ�");
				menu3priceJLabel.setText("4,400��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(ssaddalbiIcon);
				menu4nameJLabel.setText("�����");
				menu4priceJLabel.setText("4,300��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sapplemangoadeIcon);
				menu5nameJLabel.setText("���ø����̵�");
				menu5priceJLabel.setText("4,400��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sosadangIcon);
				menu6nameJLabel.setText("�����");
				menu6priceJLabel.setText("4,300��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sgrapefruitadeIcon);
				menu7nameJLabel.setText("�ڸ����̵�");
				menu7priceJLabel.setText("4,400��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(scherrycokeIcon);
				menu8nameJLabel.setText("ü����");
				menu8priceJLabel.setText("4,400��");
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

		// �ֽ�/���̵� 1p ���õǸ� �ٲ�� Listener
		juice1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				juice1pJLabel.setIcon(stjuice1pIcon);
				juice2pJLabel.setIcon(sjuice2pIcon);
				menu1JLabel.setIcon(slemonadeIcon);
				menu1nameJLabel.setText("�����̵�");
				menu1priceJLabel.setText("4,400��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(smanpledanIcon);
				menu2nameJLabel.setText("���ô�");
				menu2priceJLabel.setText("4,300��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(smelonsodaIcon);
				menu3nameJLabel.setText("�޷мҴ�");
				menu3priceJLabel.setText("4,400��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(ssaddalbiIcon);
				menu4nameJLabel.setText("�����");
				menu4priceJLabel.setText("4,300��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sapplemangoadeIcon);
				menu5nameJLabel.setText("���ø����̵�");
				menu5priceJLabel.setText("4,400��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sosadangIcon);
				menu6nameJLabel.setText("�����");
				menu6priceJLabel.setText("4,300��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(sgrapefruitadeIcon);
				menu7nameJLabel.setText("�ڸ����̵�");
				menu7priceJLabel.setText("4,400��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(scherrycokeIcon);
				menu8nameJLabel.setText("ü����");
				menu8priceJLabel.setText("4,400��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// �ֽ�/���̵� 2p ���õǸ� �ٲ�� Listener
		juice2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				juice1pJLabel.setIcon(sjuice1pIcon);
				juice2pJLabel.setIcon(stjuice2pIcon);
				menu1JLabel.setIcon(screamsodaIcon);
				menu1nameJLabel.setText("ũ���Ҵ�");
				menu1priceJLabel.setText("4,400��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sgrapeadeIcon);
				menu2nameJLabel.setText("�������̵�");
				menu2priceJLabel.setText("4,400��");
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

		// ���̵�޴�/RTD �׸� ���õǸ� �ٲ�� Listener
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
				menu1nameJLabel.setText("�ݵ��� 500ml");
				menu1priceJLabel.setText("12,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sdecafeinatedcoldbrewIcon);
				menu2nameJLabel.setText("��ī���� �ݵ��� 500ml");
				menu2priceJLabel.setText("12,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sgarlicIcon);
				menu3nameJLabel.setText("���� ũ����");
				menu3priceJLabel.setText("2,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(ssweetIcon);
				menu4nameJLabel.setText("���� ũ����");
				menu4priceJLabel.setText("2,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sgourmetbreadIcon);
				menu5nameJLabel.setText("��޼ұݻ�");
				menu5priceJLabel.setText("3,500��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sbasilbreadIcon);
				menu6nameJLabel.setText("�����丶�� ġŲ �ұݻ�");
				menu6priceJLabel.setText("5,300��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(semmentalbreadIcon);
				menu7nameJLabel.setText("����Ż ��ġ�� �ұݻ�");
				menu7priceJLabel.setText("5,300��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sdrnutsIcon);
				menu8nameJLabel.setText("���ͳ��� ��ĭ");
				menu8priceJLabel.setText("2,500��");
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

		// ���̵�޴�/RTD 1p ���õǸ� �ٲ�� Listener
		side1pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				side1pJLabel.setIcon(stside1pIcon);
				side2pJLabel.setIcon(sside2pIcon);
				side3pJLabel.setIcon(sside3pIcon);
				menu1JLabel.setIcon(scoldbrewIcon);
				menu1nameJLabel.setText("�ݵ��� 500ml");
				menu1priceJLabel.setText("12,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sdecafeinatedcoldbrewIcon);
				menu2nameJLabel.setText("��ī���� �ݵ��� 500ml");
				menu2priceJLabel.setText("12,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sgarlicIcon);
				menu3nameJLabel.setText("���� ũ����");
				menu3priceJLabel.setText("2,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(ssweetIcon);
				menu4nameJLabel.setText("���� ũ����");
				menu4priceJLabel.setText("2,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sgourmetbreadIcon);
				menu5nameJLabel.setText("��޼ұݻ�");
				menu5priceJLabel.setText("3,500��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sbasilbreadIcon);
				menu6nameJLabel.setText("�����丶�� ġŲ �ұݻ�");
				menu6priceJLabel.setText("5,300��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(semmentalbreadIcon);
				menu7nameJLabel.setText("����Ż ��ġ�� �ұݻ�");
				menu7priceJLabel.setText("5,300��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(sdrnutsIcon);
				menu8nameJLabel.setText("���ͳ��� ��ĭ");
				menu8priceJLabel.setText("2,500��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// ���̵�޴�/RTD 2p ���õǸ� �ٲ�� Listener
		side2pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				side1pJLabel.setIcon(sside1pIcon);
				side2pJLabel.setIcon(stside2pIcon);
				side3pJLabel.setIcon(sside3pIcon);
				menu1JLabel.setIcon(ssweethotdogIcon);
				menu1nameJLabel.setText("���� ��Ͼ� �ֵ���");
				menu1priceJLabel.setText("4,800��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(sspicyhotdogIcon);
				menu2nameJLabel.setText("���� ĥ�� �ֵ���");
				menu2priceJLabel.setText("4,800��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(ssweetpotatobreadIcon);
				menu3nameJLabel.setText("�������� ������");
				menu3priceJLabel.setText("4,000��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(spotatobreadIcon);
				menu4nameJLabel.setText("�����˵� ���ڻ�");
				menu4priceJLabel.setText("4,000��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(scarrotcheeseIcon);
				menu5nameJLabel.setText("���ġ�� �����");
				menu5priceJLabel.setText("5,000��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(sdoublechococookieIcon);
				menu6nameJLabel.setText("�������� ����� ������Ű");
				menu6priceJLabel.setText("3,500��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(scranberrycookieIcon);
				menu7nameJLabel.setText("ũ������ ����Ĩ ������Ű");
				menu7priceJLabel.setText("3,500��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(swhitechococookieIcon);
				menu8nameJLabel.setText("ȭ��Ʈ���� ���� ������Ű");
				menu8priceJLabel.setText("3,500��");
				menu8JLabel.setVisible(true);
				menu8nameJLabel.setVisible(true);
				menu8priceJLabel.setVisible(true);
			}
		});

		// ���̵�޴�/RTD 3p ���õǸ� �ٲ�� Listener
		side3pJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				side1pJLabel.setIcon(sside1pIcon);
				side2pJLabel.setIcon(sside2pIcon);
				side3pJLabel.setIcon(stside3pIcon);
				menu1JLabel.setIcon(sstrawberrypieIcon);
				menu1nameJLabel.setText("���⿡ ���� ����");
				menu1priceJLabel.setText("4,000��");
				menu1JLabel.setVisible(true);
				menu1nameJLabel.setVisible(true);
				menu1priceJLabel.setVisible(true);
				menu2JLabel.setIcon(schocopieIcon);
				menu2nameJLabel.setText("���ڿ� ���� ����");
				menu2priceJLabel.setText("4,000��");
				menu2JLabel.setVisible(true);
				menu2nameJLabel.setVisible(true);
				menu2priceJLabel.setVisible(true);
				menu3JLabel.setIcon(sminicustardIcon);
				menu3nameJLabel.setText("�̴� �ؾ(Ŀ��Ÿ��)");
				menu3priceJLabel.setText("3,300��");
				menu3JLabel.setVisible(true);
				menu3nameJLabel.setVisible(true);
				menu3priceJLabel.setVisible(true);
				menu4JLabel.setIcon(sminiredbeanIcon);
				menu4nameJLabel.setText("�̴� �ؾ(����)");
				menu4priceJLabel.setText("3,300��");
				menu4JLabel.setVisible(true);
				menu4nameJLabel.setVisible(true);
				menu4priceJLabel.setVisible(true);
				menu5JLabel.setIcon(sstrawberrymacaroonIcon);
				menu5nameJLabel.setText("������ ��ī��");
				menu5priceJLabel.setText("3,000��");
				menu5JLabel.setVisible(true);
				menu5nameJLabel.setVisible(true);
				menu5priceJLabel.setVisible(true);
				menu6JLabel.setIcon(smatchamacaroonIcon);
				menu6nameJLabel.setText("�������� ��ī��");
				menu6priceJLabel.setText("3,000��");
				menu6JLabel.setVisible(true);
				menu6nameJLabel.setVisible(true);
				menu6priceJLabel.setVisible(true);
				menu7JLabel.setIcon(scocomacaroonIcon);
				menu7nameJLabel.setText("�������� ��ī��");
				menu7priceJLabel.setText("3,000��");
				menu7JLabel.setVisible(true);
				menu7nameJLabel.setVisible(true);
				menu7priceJLabel.setVisible(true);
				menu8JLabel.setIcon(scookiemacaroonIcon);
				menu8nameJLabel.setText("��Űũ�� ��ī��");
				menu8priceJLabel.setText("3,000��");
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
