import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class chosemenuimage extends JFrame {

	static public ImageIcon chosemenuImageIcon;
	static public String chosemenuname;

	public chosemenuimage(String chosemenu) {
		// (아이스)아메리카노 메뉴 이미지
		ImageIcon iceamericanoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)아메리카노.png");
		Image iceamericanoImage = iceamericanoIcon.getImage();
		Image siceamericanoImage = iceamericanoImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon siceamericanoIcon = new ImageIcon(siceamericanoImage);

		// (아이스)믹스커피 메뉴 이미지
		ImageIcon icemixedcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)믹스커피.png");
		Image icemixedcoffeeImage = icemixedcoffeeIcon.getImage();
		Image sicemixedcoffeeImage = icemixedcoffeeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicemixedcoffeeIcon = new ImageIcon(sicemixedcoffeeImage);

		// (아이스)바닐라딥라떼 메뉴 이미지
		ImageIcon icevanilladeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)바닐라딥라떼.png");
		Image icevanilladeeplatteImage = icevanilladeeplatteIcon.getImage();
		Image sicevanilladeeplatteImage = icevanilladeeplatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicevanilladeeplatteIcon = new ImageIcon(sicevanilladeeplatteImage);

		// (아이스)바닐라크림콜드브루 메뉴 이미지
		ImageIcon icevanillacreamcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)바닐라크림콜드브루.png");
		Image icevanillacreamcoldbrewImage = icevanillacreamcoldbrewIcon.getImage();
		Image sicevanillacreamcoldbrewImage = icevanillacreamcoldbrewImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sicevanillacreamcoldbrewIcon = new ImageIcon(sicevanillacreamcoldbrewImage);

		// (아이스)아이스크림라떼 메뉴 이미지
		ImageIcon iceicecreamlatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)아이스크림라떼.png");
		Image iceicecreamlatteImage = iceicecreamlatteIcon.getImage();
		Image siceicecreamlatteImage = iceicecreamlatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon siceicecreamlatteIcon = new ImageIcon(siceicecreamlatteImage);

		// (아이스)오트카페라떼 메뉴 이미지
		ImageIcon iceoatcafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)오트카페라떼.png");
		Image iceoatcafelatteImage = iceoatcafelatteIcon.getImage();
		Image siceoatcafelatteImage = iceoatcafelatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon siceoatcafelatteIcon = new ImageIcon(siceoatcafelatteImage);

		// (아이스)카라멜마끼아또 메뉴 이미지
		ImageIcon icecaramelmacchiatoIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)카라멜마끼아또.png");
		Image icecaramelmacchiatoImage = icecaramelmacchiatoIcon.getImage();
		Image sicecaramelmacchiatoImage = icecaramelmacchiatoImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecaramelmacchiatoIcon = new ImageIcon(sicecaramelmacchiatoImage);

		// (아이스)카페라떼 메뉴 이미지
		ImageIcon icecafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)카페라떼.png");
		Image icecafelatteImage = icecafelatteIcon.getImage();
		Image sicecafelatteImage = icecafelatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecafelatteIcon = new ImageIcon(sicecafelatteImage);

		// (아이스)카페모카 메뉴 이미지
		ImageIcon icecafemochaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)카페모카.png");
		Image icecafemochaImage = icecafemochaIcon.getImage();
		Image sicecafemochaImage = icecafemochaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecafemochaIcon = new ImageIcon(sicecafemochaImage);

		// (아이스)코코넛라떼 메뉴 이미지
		ImageIcon icecoconutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)코코넛라떼.png");
		Image icecoconutImage = icecoconutlatteIcon.getImage();
		Image sicecoconutImage = icecoconutImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecoconutIcon = new ImageIcon(sicecoconutImage);

		// (아이스)콜드브루 메뉴 이미지
		ImageIcon icecoldbrewIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)콜드브루.png");
		Image icecoldbrewImage = icecoldbrewIcon.getImage();
		Image sicecoldbrewImage = icecoldbrewImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecoldbrewIcon = new ImageIcon(sicecoldbrewImage);

		// (아이스)콜드브루라떼 메뉴 이미지
		ImageIcon icecoldbrewlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)콜드브루라떼.png");
		Image icecoldbrewlatteImage = icecoldbrewlatteIcon.getImage();
		Image sicecoldbrewlatteImage = icecoldbrewlatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecoldbrewlatteIcon = new ImageIcon(sicecoldbrewlatteImage);

		// (아이스)토피넛라떼 메뉴 이미지
		ImageIcon icetoffeenutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)토피넛라떼.png");
		Image icetoffeenutlatteImage = icetoffeenutlatteIcon.getImage();
		Image sicetoffeenutlatteImage = icetoffeenutlatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicetoffeenutlatteIcon = new ImageIcon(sicetoffeenutlatteImage);

		// (아이스)헤이즐넛딥라떼 메뉴 이미지
		ImageIcon icehazelnutdeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)헤이즐넛딥라떼.png");
		Image icehazelnutdeepImage = icehazelnutdeeplatteIcon.getImage();
		Image sicehazelnutdeepImage = icehazelnutdeepImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicehazelnutdeeplatteIcon = new ImageIcon(sicehazelnutdeepImage);

		// (아이스)헤이즐넛크림콜드브루 메뉴 이미지
		ImageIcon icehazelnutcreamcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(아이스)\\(아이스)헤이즐넛크림콜드브루.png");
		Image icehazelnutcreamcoldbrewImage = icehazelnutcreamcoldbrewIcon.getImage();
		Image sicehazelnutcreamcoldbrewImage = icehazelnutcreamcoldbrewImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sicehazelnutcreamcoldbrewIcon = new ImageIcon(sicehazelnutcreamcoldbrewImage);

		// (핫) 아메리카노 메뉴 이미지
		ImageIcon hotamericanoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\커피(핫)\\(핫)아메리카노.png");
		Image hotamericanoImage = hotamericanoIcon.getImage();
		Image shotamericanoImage = hotamericanoImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
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

		// 군고구마라떼 메뉴 이미지
		ImageIcon sweetpotatolatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\군고구마라떼.png");
		Image sweetpotatolatteImage = sweetpotatolatteIcon.getImage();
		Image ssweetpotatolatteImage = sweetpotatolatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssweetpotatolatteIcon = new ImageIcon(ssweetpotatolatteImage);

		// 딸기라떼 메뉴 이미지
		ImageIcon strawberrylatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\딸기라떼.png");
		Image strawberrylatteImage = strawberrylatteIcon.getImage();
		Image sstrawberrylatteImage = strawberrylatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrylatteIcon = new ImageIcon(sstrawberrylatteImage);

		// 로얄밀크티 메뉴 이미지
		ImageIcon royalmilkteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\로얄밀크티.png");
		Image royalmilkteaImage = royalmilkteaIcon.getImage();
		Image sroyalmilkteaImage = royalmilkteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sroyalmilkteaIcon = new ImageIcon(sroyalmilkteaImage);

		// 말차라떼 메뉴 이미지
		ImageIcon matchalatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\말차라떼.png");
		Image matchalatteImage = matchalatteIcon.getImage();
		Image smatchalatteImage = matchalatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smatchalatteIcon = new ImageIcon(smatchalatteImage);

		// 말차아인슈페너 메뉴 이미지
		ImageIcon matchaeinspennerIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\말차아인슈페너.png");
		Image matchaeinispennerImage = matchaeinspennerIcon.getImage();
		Image smatchaeinispennerImage = matchaeinispennerImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smatchaeinspennerIcon = new ImageIcon(smatchaeinispennerImage);

		// 멜팅초코 메뉴 이미지
		ImageIcon meltingchocoIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\멜팅초코.png");
		Image meltingchocoImage = meltingchocoIcon.getImage();
		Image smeltingchocoImage = meltingchocoImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smeltingchocoIcon = new ImageIcon(smeltingchocoImage);

		// 미숫가루 메뉴 이미지
		ImageIcon mixedgrainpowderIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\미숫가루.png");
		Image mixedgrainpowderImage = mixedgrainpowderIcon.getImage();
		Image smixedgrainpowderImage = mixedgrainpowderImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smixedgrainpowderIcon = new ImageIcon(smixedgrainpowderImage);

		// 미숫가루라떼 메뉴 이미지
		ImageIcon mixedgrainpowderlatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\미숫가루라떼.png");
		Image mixedgrainpowderlatteImage = mixedgrainpowderlatteIcon.getImage();
		Image smixedgrainpowderlatteImage = mixedgrainpowderlatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smixedgrainpowderlatteIcon = new ImageIcon(smixedgrainpowderlatteImage);

		// 초코라떼 메뉴 이미지
		ImageIcon chocolatteIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\베버리지\\초코라떼.png");
		Image chocolatteImage = chocolatteIcon.getImage();
		Image schocolatteImage = chocolatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon schocolatteIcon = new ImageIcon(schocolatteImage);

		// 딸기쉐이크 메뉴 이미지
		ImageIcon strawberryshakeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\딸기쉐이크.png");
		Image strawberryshakeImage = strawberryshakeIcon.getImage();
		Image sstrawberryshakeImage = strawberryshakeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sstrawberryshakeIcon = new ImageIcon(sstrawberryshakeImage);

		// 딸기요거트스무디 메뉴 이미지
		ImageIcon strawberryyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\딸기요거트스무디.png");
		Image strawberryyogurtsmoothieImage = strawberryyogurtsmoothieIcon.getImage();
		Image sstrawberryyogurtsmoothieImage = strawberryyogurtsmoothieImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sstrawberryyogurtsmoothieIcon = new ImageIcon(sstrawberryyogurtsmoothieImage);

		// 말차프라페 메뉴 이미지
		ImageIcon matchafrappeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\말차프라페.png");
		Image matchfrappeImage = matchafrappeIcon.getImage();
		Image smatchafrappeImage = matchfrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smatchafrappeIcon = new ImageIcon(smatchafrappeImage);

		// 망고요거트스무디 메뉴 이미지
		ImageIcon mangoyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\망고요거트스무디.png");
		Image mangoyogurtsmoothieImage = mangoyogurtsmoothieIcon.getImage();
		Image smangoyogurtsmoothieImage = mangoyogurtsmoothieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smangoyogurtsmoothieIcon = new ImageIcon(smangoyogurtsmoothieImage);

		// 망고패션크러쉬 메뉴 이미지
		ImageIcon mangofashioncrushIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\망고패션크러쉬.png");
		Image mangofashioncrushImage = mangofashioncrushIcon.getImage();
		Image smangofashioncrushImage = mangofashioncrushImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smangofashioncrushIcon = new ImageIcon(smangofashioncrushImage);

		// 민트초코칩프라페 메뉴 이미지
		ImageIcon mintchocochipfrappeIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\민트초코칩프라페.png");
		Image mintchocochipfrappeImage = mintchocochipfrappeIcon.getImage();
		Image smintchocochipfrappeImage = mintchocochipfrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smintchocochipfrappeIcon = new ImageIcon(smintchocochipfrappeImage);

		// 밀크쉐이크 메뉴 이미지
		ImageIcon milkshakeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\밀크쉐이크.png");
		Image milkshakeImage = milkshakeIcon.getImage();
		Image smilkshakeImage = milkshakeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smilkshakeIcon = new ImageIcon(smilkshakeImage);

		// 블루베리요거트스무디 메뉴 이미지
		ImageIcon blueberryyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\블루베리요거트스무디.png");
		Image blueberryyogurtsmoothieImage = blueberryyogurtsmoothieIcon.getImage();
		Image sblueberryyogurtsmoothieImage = blueberryyogurtsmoothieImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sblueberryyogurtsmoothieIcon = new ImageIcon(sblueberryyogurtsmoothieImage);

		// 에스프레소쉐이크 메뉴 이미지
		ImageIcon espressoshakeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\에스프레소쉐이크.png");
		Image espressoshakeImage = espressoshakeIcon.getImage();
		Image sespressoshakeImage = espressoshakeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sespressoshakeIcon = new ImageIcon(sespressoshakeImage);

		// 유자배크러쉬 메뉴 이미지
		ImageIcon citronpearcrushIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\유자배크러쉬.png");
		Image citronpearcrushImage = citronpearcrushIcon.getImage();
		Image scitronpearcrushImage = citronpearcrushImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scitronpearcrushIcon = new ImageIcon(scitronpearcrushImage);

		// 자두피치크러쉬 메뉴 이미지
		ImageIcon plumpeachcrushIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\자두피치크러쉬.png");
		Image plumpeachcrushImage = plumpeachcrushIcon.getImage();
		Image splumpeachcrushImage = plumpeachcrushImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon splumpeachcrushIcon = new ImageIcon(splumpeachcrushImage);

		// 자바칩프라페 메뉴 이미지
		ImageIcon javachipfrappeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\자바칩프라페.png");
		Image javachipfrappeImage = javachipfrappeIcon.getImage();
		Image sjavachipfrappeImage = javachipfrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sjavachipfrappeIcon = new ImageIcon(sjavachipfrappeImage);

		// 초코쉐이크 메뉴 이미지
		ImageIcon chocoshakeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\초코쉐이크.png");
		Image chocoshakeImage = chocoshakeIcon.getImage();
		Image schocoshakeImage = chocoshakeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon schocoshakeIcon = new ImageIcon(schocoshakeImage);

		// 코코넛커피프라페 메뉴 이미지
		ImageIcon coconutcoffeefrappeIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\코코넛커피프라페.png");
		Image coconutcoffeefrappeImage = coconutcoffeefrappeIcon.getImage();
		Image scoconutcoffeefrappeImage = coconutcoffeefrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scoconutcoffeefrappeIcon = new ImageIcon(scoconutcoffeefrappeImage);

		// 코코초코프라페 메뉴 이미지
		ImageIcon cocochocofrappeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\코코초코프라페.png");
		Image cocochocofrappeImage = cocochocofrappeIcon.getImage();
		Image scocochocofrappeImage = cocochocofrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scocochocofrappeIcon = new ImageIcon(scocochocofrappeImage);

		// 쿠키앤크림프라페 메뉴 이미지
		ImageIcon cookiencreamfrappeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\쿠키앤크림프라페.png");
		Image cookiencreamfrappeImage = cookiencreamfrappeIcon.getImage();
		Image scookiencreamfrappeImage = cookiencreamfrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scookiencreamfrappeIcon = new ImageIcon(scookiencreamfrappeImage);

		// 포도베리크러쉬 메뉴 이미지
		ImageIcon grapeberrycrushIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\포도베리크러쉬.png");
		Image grapeberrycrushImage = grapeberrycrushIcon.getImage();
		Image sgrapeberrycrushImage = grapeberrycrushImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgrapeberrycrushIcon = new ImageIcon(sgrapeberrycrushImage);

		// 플레인요거트스무디 메뉴 이미지
		ImageIcon plainyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\아이스 블렌디드\\플레인요거트스무디.png");
		Image plainyogurtsmoothieImage = plainyogurtsmoothieIcon.getImage();
		Image splainyogurtsmoothieImage = plainyogurtsmoothieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon splainyogurtsmoothieIcon = new ImageIcon(splainyogurtsmoothieImage);

		// 레몬민트티 메뉴 이미지
		ImageIcon lemonmintteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\레몬민트티.png");
		Image lemonmintteaImage = lemonmintteaIcon.getImage();
		Image slemonmintteaImage = lemonmintteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon slemonmintteaIcon = new ImageIcon(slemonmintteaImage);

		// 리치캐모마일 메뉴 이미지
		ImageIcon litchichamomileIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\리치캐모마일.png");
		Image litchichamomileImage = litchichamomileIcon.getImage();
		Image slitchichamomileImage = litchichamomileImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon slitchichamomileIcon = new ImageIcon(slitchichamomileImage);

		// 복숭아아이스티 메뉴 이미지
		ImageIcon peachiceteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\복숭아아이스티.png");
		Image peachiceteaImage = peachiceteaIcon.getImage();
		Image speachiceteaImage = peachiceteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon speachiceteaIcon = new ImageIcon(speachiceteaImage);

		// 애플히비스커스 메뉴 이미지
		ImageIcon applehibiscusIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\애플히비스커스.png");
		Image applehibiscusImage = applehibiscusIcon.getImage();
		Image sapplehibiscusImage = applehibiscusImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sapplehibiscusIcon = new ImageIcon(sapplehibiscusImage);

		// 유자애플티 메뉴 이미지
		ImageIcon citronappleteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\유자애플티.png");
		Image citronappleteaImage = citronappleteaIcon.getImage();
		Image scitronappleteaImage = citronappleteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scitronappleteaIcon = new ImageIcon(scitronappleteaImage);

		// 유자캐모마일티 메뉴 이미지
		ImageIcon citronchamomileteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\유자캐모마일티.png");
		Image citronchamomileteaImage = citronchamomileteaIcon.getImage();
		Image scitronchamomileteaImage = citronchamomileteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scitronchamomileteaIcon = new ImageIcon(scitronchamomileteaImage);

		// 자몽허니블랙티 메뉴 이미지
		ImageIcon grapefruithoneyblackteaIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\자몽허니블랙티.png");
		Image grapefruithoneyblackteaImage = grapefruithoneyblackteaIcon.getImage();
		Image sgrapefruithoneyblackteaImage = grapefruithoneyblackteaImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sgrapefruithoneyblackteaIcon = new ImageIcon(sgrapefruithoneyblackteaImage);

		// 청귤얼그레이 메뉴 이미지
		ImageIcon greentangerineearlgrayIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\청귤얼그레이.png");
		Image greentangerineearlgrayImage = greentangerineearlgrayIcon.getImage();
		Image sgreentangerineearlgrayImage = greentangerineearlgrayImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sgreentangerineearlgrayIcon = new ImageIcon(sgreentangerineearlgrayImage);

		// 타로버블티 메뉴 이미지
		ImageIcon tarobubbleteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\타로버블티.png");
		Image tarobubbleteaImage = tarobubbleteaIcon.getImage();
		Image starobubbleteaImage = tarobubbleteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon starobubbleteaIcon = new ImageIcon(starobubbleteaImage);

		// 트리플민트 메뉴 이미지
		ImageIcon tripplemintIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\트리플민트.png");
		Image tripplemintImage = tripplemintIcon.getImage();
		Image stripplemintImage = tripplemintImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon stripplemintIcon = new ImageIcon(stripplemintImage);

		// 허니레몬티 메뉴 이미지
		ImageIcon honeylemonteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\허니레몬티.png");
		Image honeylemonteaImage = honeylemonteaIcon.getImage();
		Image shoneylemonteaImage = honeylemonteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon shoneylemonteaIcon = new ImageIcon(shoneylemonteaImage);

		// 허니유자티 메뉴 이미지
		ImageIcon honeycitronteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\허니유자티.png");
		Image honeycitronteaImage = honeycitronteaIcon.getImage();
		Image shoneycitronteaImage = honeycitronteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon shoneycitronteaIcon = new ImageIcon(shoneycitronteaImage);

		// 허니자몽티 메뉴 이미지
		ImageIcon honeygrapefruitteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\허니자몽티.png");
		Image honeygrapefruitteaImage = honeygrapefruitteaIcon.getImage();
		Image shoneygrapefruitteaImage = honeygrapefruitteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon shoneygrapefruitteaIcon = new ImageIcon(shoneygrapefruitteaImage);

		// 흑설탕버블티 메뉴 이미지
		ImageIcon brownsugarbubbleteaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\버블티, 티\\흑설탕버블티.png");
		Image bronwsugarbubbleteaImage = brownsugarbubbleteaIcon.getImage();
		Image sbronwsugarbubbleteaImage = bronwsugarbubbleteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sbrownsugarbubbleteaIcon = new ImageIcon(sbronwsugarbubbleteaImage);

		// 레몬에이드 메뉴 이미지
		ImageIcon lemonadeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\레몬에이드.png");
		Image lemonadeImage = lemonadeIcon.getImage();
		Image slemonadeImage = lemonadeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon slemonadeIcon = new ImageIcon(slemonadeImage);

		// 망플단 메뉴 이미지
		ImageIcon manpledanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\망플단.png");
		Image manpledanImage = manpledanIcon.getImage();
		Image smanpledanImage = manpledanImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smanpledanIcon = new ImageIcon(smanpledanImage);

		// 메론소다 메뉴 이미지
		ImageIcon melonsodaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\메론소다.png");
		Image melonsodaImage = melonsodaIcon.getImage();
		Image smelonsodaImage = melonsodaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smelonsodaIcon = new ImageIcon(smelonsodaImage);

		// 사딸바 메뉴 이미지
		ImageIcon saddalbiIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\사딸비.png");
		Image saddalbiImage = saddalbiIcon.getImage();
		Image ssaddalbiImage = saddalbiImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssaddalbiIcon = new ImageIcon(ssaddalbiImage);

		// 애플망고에이드 메뉴 이미지
		ImageIcon applemangoadeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\애플망고에이드.png");
		Image applemangoadeImage = applemangoadeIcon.getImage();
		Image sapplemangoadeImage = applemangoadeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sapplemangoadeIcon = new ImageIcon(sapplemangoadeImage);

		// 오사당 메뉴 이미지
		ImageIcon osadangIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\오사당.png");
		Image osadangImage = osadangIcon.getImage();
		Image sosadangImage = osadangImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sosadangIcon = new ImageIcon(sosadangImage);

		// 자몽에이드 메뉴 이미지
		ImageIcon grapefruitadeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\자몽에이드.png");
		Image grapefruitadeImage = grapefruitadeIcon.getImage();
		Image sgrapefruitadeImage = grapefruitadeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgrapefruitadeIcon = new ImageIcon(sgrapefruitadeImage);

		// 체리콕 메뉴 이미지
		ImageIcon cherrycokeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\체리콕.png");
		Image cherrycokeImage = cherrycokeIcon.getImage();
		Image scherrycokeImage = cherrycokeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scherrycokeIcon = new ImageIcon(scherrycokeImage);

		// 크림소다 메뉴 이미지
		ImageIcon creamsodaIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\크림소다.png");
		Image creamsodaImage = creamsodaIcon.getImage();
		Image screamsodaImage = creamsodaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon screamsodaIcon = new ImageIcon(screamsodaImage);

		// 포도에이드 메뉴 이미지
		ImageIcon grapeadeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\주스, 에이드\\포도에이드.png");
		Image grapeadeImage = grapeadeIcon.getImage();
		Image sgrapeadeImage = grapeadeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgrapeadeIcon = new ImageIcon(sgrapeadeImage);

		// 콜드브루 메뉴 이미지
		ImageIcon coldbrewIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\콜드브루 500ml.png");
		Image coldbrewImage = coldbrewIcon.getImage();
		Image scoldbrewImage = coldbrewImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scoldbrewIcon = new ImageIcon(scoldbrewImage);

		// 디카페인 콜드브루 메뉴 이미지
		ImageIcon decafeinatedcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\디카페인 콜드브루 500ml.png");
		Image decafeinatedcoldbrewImage = decafeinatedcoldbrewIcon.getImage();
		Image sdecafeinatedcoldbrewImage = decafeinatedcoldbrewImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sdecafeinatedcoldbrewIcon = new ImageIcon(sdecafeinatedcoldbrewImage);

		// 갈릭크룽지 메뉴 이미지
		ImageIcon garlicIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\갈릭 크룽지.png");
		Image garlicImage = garlicIcon.getImage();
		Image sgarlicImage = garlicImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgarlicIcon = new ImageIcon(sgarlicImage);

		// 스윗크룽지 메뉴 이미지
		ImageIcon sweetIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\스윗 크룽지.png");
		Image sweetImage = sweetIcon.getImage();
		Image ssweetImage = sweetImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssweetIcon = new ImageIcon(ssweetImage);

		// 고메소금빵 메뉴 이미지
		ImageIcon gourmetbreadIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\고메소금빵.png");
		Image gourmetbreadImage = gourmetbreadIcon.getImage();
		Image sgourmetbreadImage = gourmetbreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgourmetbreadIcon = new ImageIcon(sgourmetbreadImage);

		// 바질토마토 치킨 소금빵 메뉴 이미지
		ImageIcon basilbreadIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\바질토마토 치킨 소금빵.png");
		Image basilbreadImage = basilbreadIcon.getImage();
		Image sbasilbreadImage = basilbreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sbasilbreadIcon = new ImageIcon(sbasilbreadImage);

		// 에멘탈 햄치즈 소금빵 메뉴 이미지
		ImageIcon emmentalbreadIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\에멘탈 햄치즈 소금빵.png");
		Image emmentalbreadImage = emmentalbreadIcon.getImage();
		Image semmentalbreadImage = emmentalbreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon semmentalbreadIcon = new ImageIcon(semmentalbreadImage);

		// 닥터넛츠 메뉴 이미지
		ImageIcon drnutsIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\닥터넛츠 피칸.png");
		Image drnutsImage = drnutsIcon.getImage();
		Image sdrnutsImage = drnutsImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sdrnutsIcon = new ImageIcon(sdrnutsImage);

		// 달콤 어니언 핫도그 메뉴 이미지
		ImageIcon sweethotdogIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\달콤 어니언 핫도그.png");
		Image sweethotdogImage = sweethotdogIcon.getImage();
		Image ssweethotdogImage = sweethotdogImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssweethotdogIcon = new ImageIcon(ssweethotdogImage);

		// 매콤 칠리 핫도그 메뉴 이미지
		ImageIcon spicyhotdogIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\매콤 칠리 핫도그.png");
		Image spicyhotdogImage = spicyhotdogIcon.getImage();
		Image sspicyhotdogImage = spicyhotdogImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sspicyhotdogIcon = new ImageIcon(sspicyhotdogImage);

		// 달콤촉촉 고구마빵 메뉴 이미지
		ImageIcon sweetpotatobreadIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\달콤촉촉 고구마빵.png");
		Image sweetpotatobreadImage = sweetpotatobreadIcon.getImage();
		Image ssweetpotatobreadImage = sweetpotatobreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssweetpotatobreadIcon = new ImageIcon(ssweetpotatobreadImage);

		// 포슬쫀득 감자빵 메뉴 이미지
		ImageIcon potatobreadIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\포슬쫀득 감자빵.png");
		Image potatobreadImage = potatobreadIcon.getImage();
		Image spotatobreadImage = potatobreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon spotatobreadIcon = new ImageIcon(spotatobreadImage);

		// 당근치즈 브라우니 메뉴 이미지
		ImageIcon carrotcheeseIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\당근치즈 브라우니.png");
		Image carrotcheeseImage = carrotcheeseIcon.getImage();
		Image scarrotcheeseImage = carrotcheeseImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scarrotcheeseIcon = new ImageIcon(scarrotcheeseImage);

		// 더블초코 스모어 촉촉쿠키 메뉴 이미지
		ImageIcon doublechococookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\더블초코 스모어 촉촉쿠키.png");
		Image doublechococookieImage = doublechococookieIcon.getImage();
		Image sdoublechococookieImage = doublechococookieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sdoublechococookieIcon = new ImageIcon(sdoublechococookieImage);

		// 크랜베리 초코칩 촉촉쿠키 메뉴 이미지
		ImageIcon cranberrycookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\크랜베리 초코칩 촉촉쿠키.png");
		Image cranberrycookieImage = cranberrycookieIcon.getImage();
		Image scranberrycookieImage = cranberrycookieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scranberrycookieIcon = new ImageIcon(scranberrycookieImage);

		// 화이트초코 말차 촉촉쿠키 메뉴 이미지
		ImageIcon whitechococookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\화이트초코 말차 촉촉쿠키.png");
		Image whitechococookieImage = whitechococookieIcon.getImage();
		Image swhitechococookieImage = whitechococookieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon swhitechococookieIcon = new ImageIcon(swhitechococookieImage);

		// 딸기에 몽당 파이 메뉴 이미지
		ImageIcon strawberrypieIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\딸기에 퐁당 파이.png");
		Image strawberrypieImage = strawberrypieIcon.getImage();
		Image sstrawberrypieImage = strawberrypieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrypieIcon = new ImageIcon(sstrawberrypieImage);

		// 초코에 퐁당 파이 메뉴 이미지
		ImageIcon chocopieIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\초코에 퐁당 파이.png");
		Image chocopieImage = chocopieIcon.getImage();
		Image schocopieImage = chocopieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon schocopieIcon = new ImageIcon(schocopieImage);

		// 미니 붕어빵(커스타드) 메뉴 이미지
		ImageIcon minicustardIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\미니붕어빵(커스타드).png");
		Image minicustardImage = minicustardIcon.getImage();
		Image sminicustardImage = minicustardImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sminicustardIcon = new ImageIcon(sminicustardImage);

		// 미니 붕어빵(통팥) 메뉴 이미지
		ImageIcon miniredbeanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\미니붕어빵(통팥).png");
		Image miniredbeanImage = miniredbeanIcon.getImage();
		Image sminiredbeanImage = miniredbeanImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sminiredbeanIcon = new ImageIcon(sminiredbeanImage);

		// 딸기요거 벤카롱 메뉴 이미지
		ImageIcon strawberrymacaroonIcon = new ImageIcon(
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\딸기요거 벤카롱.png");
		Image strawberrymacaroonImage = strawberrymacaroonIcon.getImage();
		Image sstrawberrymacaroonImage = strawberrymacaroonImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrymacaroonIcon = new ImageIcon(sstrawberrymacaroonImage);

		// 말차초코 벤카롱 메뉴 이미지
		ImageIcon matchamacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\말차초코 벤카롱.png");
		Image matchamacaroonImage = matchamacaroonIcon.getImage();
		Image smatchamacaroonImage = matchamacaroonImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smatchamacaroonIcon = new ImageIcon(smatchamacaroonImage);

		// 코코초코 벤카롱 메뉴 이미지
		ImageIcon cocomacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\코코초코 벤카롱.png");
		Image cocomacaroonImage = cocomacaroonIcon.getImage();
		Image scocomacaroonImage = cocomacaroonImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scocomacaroonIcon = new ImageIcon(scocomacaroonImage);

		// 쿠키크림 벤카롱 메뉴 이미지
		ImageIcon cookiemacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\사이드메뉴, RTD\\쿠키크림 벤카롱.png");
		Image cookiemacaroonImage = cookiemacaroonIcon.getImage();
		Image scookiemacaroonImage = cookiemacaroonImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scookiemacaroonIcon = new ImageIcon(scookiemacaroonImage);

		// optionframe class에서 선택한 메뉴 번호를 비교해서 그에 해당하는 메뉴 정보 넣는 코드
		if (chosemenu.equals("111")) {
			chosemenuImageIcon = siceamericanoIcon;
			chosemenuname = "(아이스)아메리카노";
		} else if (chosemenu.equals("112")) {
			chosemenuImageIcon = sicemixedcoffeeIcon;
			chosemenuname = "(아이스)믹스커피";
		} else if (chosemenu.equals("113")) {
			chosemenuImageIcon = sicevanilladeeplatteIcon;
			chosemenuname = "(아이스)바닐라딥라떼";
		} else if (chosemenu.equals("114")) {
			chosemenuImageIcon = sicevanillacreamcoldbrewIcon;
			chosemenuname = "(아이스)바닐라크림콜드브루";
		} else if (chosemenu.equals("115")) {
			chosemenuImageIcon = siceicecreamlatteIcon;
			chosemenuname = "(아이스)아이스크림라떼";
		} else if (chosemenu.equals("116")) {
			chosemenuImageIcon = siceoatcafelatteIcon;
			chosemenuname = "(아이스)오트카페라떼";
		} else if (chosemenu.equals("117")) {
			chosemenuImageIcon = sicecaramelmacchiatoIcon;
			chosemenuname = "(아이스)카라멜마끼아또";
		} else if (chosemenu.equals("118")) {
			chosemenuImageIcon = sicecafelatteIcon;
			chosemenuname = "(아이스)카페라떼";
		} else if (chosemenu.equals("121")) {
			chosemenuImageIcon = sicecafemochaIcon;
			chosemenuname = "(아이스)카페모카";
		} else if (chosemenu.equals("122")) {
			chosemenuImageIcon = sicecoconutIcon;
			chosemenuname = "(아이스)코코넛라떼";
		} else if (chosemenu.equals("123")) {
			chosemenuImageIcon = sicecoldbrewIcon;
			chosemenuname = "(아이스)콜드브루";
		} else if (chosemenu.equals("124")) {
			chosemenuImageIcon = sicecoldbrewlatteIcon;
			chosemenuname = "(아이스)콜드브루라떼";
		} else if (chosemenu.equals("125")) {
			chosemenuImageIcon = sicetoffeenutlatteIcon;
			chosemenuname = "(아이스)토피넛라떼";
		} else if (chosemenu.equals("126")) {
			chosemenuImageIcon = sicehazelnutdeeplatteIcon;
			chosemenuname = "(아이스)헤이즐넛딥라떼";
		} else if (chosemenu.equals("127")) {
			chosemenuImageIcon = sicehazelnutcreamcoldbrewIcon;
			chosemenuname = "(아이스)헤이즐넛크림콜드브루";
		} else if (chosemenu.equals("211")) {
			chosemenuImageIcon = shotamericanoIcon;
			chosemenuname = "(핫)아메리카노";
		} else if (chosemenu.equals("212")) {
			chosemenuImageIcon = shotmixedcoffeeIcon;
			chosemenuname = "(핫)믹스커피";
		} else if (chosemenu.equals("213")) {
			chosemenuImageIcon = shotvanilladeeplatteIcon;
			chosemenuname = "핫(바닐라딥라떼)";
		} else if (chosemenu.equals("214")) {
			chosemenuImageIcon = shotcondensedmilklatteIcon;
			chosemenuname = "핫(연유라떼)";
		} else if (chosemenu.equals("215")) {
			chosemenuImageIcon = shotoatcafelatteIcon;
			chosemenuname = "핫(오트카페라떼)";
		} else if (chosemenu.equals("216")) {
			chosemenuImageIcon = shotcaramelmacchiatoIcon;
			chosemenuname = "핫(카라멜마끼아또)";
		} else if (chosemenu.equals("217")) {
			chosemenuImageIcon = shotcafelatteIcon;
			chosemenuname = "핫(카페라떼)";
		} else if (chosemenu.equals("218")) {
			chosemenuImageIcon = shotcafemochaIcon;
			chosemenuname = "핫(카페모카)";
		} else if (chosemenu.equals("221")) {
			chosemenuImageIcon = shotcoconutlatteIcon;
			chosemenuname = "핫(코코넛라떼)";
		} else if (chosemenu.equals("222")) {
			chosemenuImageIcon = shottoffeenutlatteIcon;
			chosemenuname = "핫(토피넛라떼)";
		} else if (chosemenu.equals("223")) {
			chosemenuImageIcon = shothazelnutdeeplatteIcon;
			chosemenuname = "핫(헤이즐넛딥라떼)";
		} else if (chosemenu.equals("311")) {
			chosemenuImageIcon = ssweetpotatolatteIcon;
			chosemenuname = "군고구마라떼";
		} else if (chosemenu.equals("312")) {
			chosemenuImageIcon = sstrawberrylatteIcon;
			chosemenuname = "딸기라떼";
		} else if (chosemenu.equals("313")) {
			chosemenuImageIcon = sroyalmilkteaIcon;
			chosemenuname = "로얄밀크티";
		} else if (chosemenu.equals("314")) {
			chosemenuImageIcon = smatchalatteIcon;
			chosemenuname = "말차라떼";
		} else if (chosemenu.equals("315")) {
			chosemenuImageIcon = smatchaeinspennerIcon;
			chosemenuname = "말차아인슈페너";
		} else if (chosemenu.equals("316")) {
			chosemenuImageIcon = smeltingchocoIcon;
			chosemenuname = "멜팅초코";
		} else if (chosemenu.equals("317")) {
			chosemenuImageIcon = smixedgrainpowderIcon;
			chosemenuname = "미숫가루";
		} else if (chosemenu.equals("318")) {
			chosemenuImageIcon = smixedgrainpowderlatteIcon;
			chosemenuname = "미숫가루라떼";
		} else if (chosemenu.equals("321")) {
			chosemenuImageIcon = schocolatteIcon;
			chosemenuname = "초코라떼";
		} else if (chosemenu.equals("411")) {
			chosemenuImageIcon = sstrawberryshakeIcon;
			chosemenuname = "딸기쉐이크";
		} else if (chosemenu.equals("412")) {
			chosemenuImageIcon = sstrawberryyogurtsmoothieIcon;
			chosemenuname = "딸기요거트스무디";
		} else if (chosemenu.equals("413")) {
			chosemenuImageIcon = smatchafrappeIcon;
			chosemenuname = "말차프라페";
		} else if (chosemenu.equals("414")) {
			chosemenuImageIcon = smangoyogurtsmoothieIcon;
			chosemenuname = "망고요거트스무디";
		} else if (chosemenu.equals("415")) {
			chosemenuImageIcon = smangofashioncrushIcon;
			chosemenuname = "망고패션크러쉬";
		} else if (chosemenu.equals("416")) {
			chosemenuImageIcon = smintchocochipfrappeIcon;
			chosemenuname = "민트초코칩프라페";
		} else if (chosemenu.equals("417")) {
			chosemenuImageIcon = smilkshakeIcon;
			chosemenuname = "밀크쉐이크";
		} else if (chosemenu.equals("418")) {
			chosemenuImageIcon = sblueberryyogurtsmoothieIcon;
			chosemenuname = "블루베리요거트스무디";
		} else if (chosemenu.equals("421")) {
			chosemenuImageIcon = sespressoshakeIcon;
			chosemenuname = "에스프레소쉐이크";
		} else if (chosemenu.equals("422")) {
			chosemenuImageIcon = scitronpearcrushIcon;
			chosemenuname = "유자배크러쉬";
		} else if (chosemenu.equals("423")) {
			chosemenuImageIcon = splumpeachcrushIcon;
			chosemenuname = "자두피치크러쉬";
		} else if (chosemenu.equals("424")) {
			chosemenuImageIcon = sjavachipfrappeIcon;
			chosemenuname = "자바칩프라페";
		} else if (chosemenu.equals("425")) {
			chosemenuImageIcon = schocoshakeIcon;
			chosemenuname = "초코쉐이크";
		} else if (chosemenu.equals("426")) {
			chosemenuImageIcon = scoconutcoffeefrappeIcon;
			chosemenuname = "코코넛커피프라페";
		} else if (chosemenu.equals("427")) {
			chosemenuImageIcon = scocochocofrappeIcon;
			chosemenuname = "코코초코프라페";
		} else if (chosemenu.equals("428")) {
			chosemenuImageIcon = scookiencreamfrappeIcon;
			chosemenuname = "쿠키앤크림프라페";
		} else if (chosemenu.equals("431")) {
			chosemenuImageIcon = sgrapeberrycrushIcon;
			chosemenuname = "포도베리크러쉬";
		} else if (chosemenu.equals("432")) {
			chosemenuImageIcon = splainyogurtsmoothieIcon;
			chosemenuname = "플레인요거트스무디";
		} else if (chosemenu.equals("511")) {
			chosemenuImageIcon = slemonmintteaIcon;
			chosemenuname = "레몬민트티";
		} else if (chosemenu.equals("512")) {
			chosemenuImageIcon = slitchichamomileIcon;
			chosemenuname = "리치캐모마일";
		} else if (chosemenu.equals("513")) {
			chosemenuImageIcon = speachiceteaIcon;
			chosemenuname = "복숭아아이스티";
		} else if (chosemenu.equals("514")) {
			chosemenuImageIcon = sapplehibiscusIcon;
			chosemenuname = "애플히비스커스";
		} else if (chosemenu.equals("515")) {
			chosemenuImageIcon = scitronappleteaIcon;
			chosemenuname = "유자애플티";
		} else if (chosemenu.equals("516")) {
			chosemenuImageIcon = scitronchamomileteaIcon;
			chosemenuname = "유자캐모마일티";
		} else if (chosemenu.equals("517")) {
			chosemenuImageIcon = sgrapefruithoneyblackteaIcon;
			chosemenuname = "자몽허니블랙티";
		} else if (chosemenu.equals("518")) {
			chosemenuImageIcon = sgreentangerineearlgrayIcon;
			chosemenuname = "청귤얼그레이";
		} else if (chosemenu.equals("521")) {
			chosemenuImageIcon = starobubbleteaIcon;
			chosemenuname = "타로버블티";
		} else if (chosemenu.equals("522")) {
			chosemenuImageIcon = stripplemintIcon;
			chosemenuname = "트리플민트";
		} else if (chosemenu.equals("523")) {
			chosemenuImageIcon = shoneylemonteaIcon;
			chosemenuname = "허니레몬티";
		} else if (chosemenu.equals("524")) {
			chosemenuImageIcon = shoneycitronteaIcon;
			chosemenuname = "허니유자티";
		} else if (chosemenu.equals("525")) {
			chosemenuImageIcon = shoneygrapefruitteaIcon;
			chosemenuname = "허니자몽티";
		} else if (chosemenu.equals("526")) {
			chosemenuImageIcon = sbrownsugarbubbleteaIcon;
			chosemenuname = "흑설탕버블티";
		} else if (chosemenu.equals("611")) {
			chosemenuImageIcon = slemonadeIcon;
			chosemenuname = "레몬에이드";
		} else if (chosemenu.equals("612")) {
			chosemenuImageIcon = smanpledanIcon;
			chosemenuname = "망플단";
		} else if (chosemenu.equals("613")) {
			chosemenuImageIcon = smelonsodaIcon;
			chosemenuname = "메론소다";
		} else if (chosemenu.equals("614")) {
			chosemenuImageIcon = ssaddalbiIcon;
			chosemenuname = "사딸바";
		} else if (chosemenu.equals("615")) {
			chosemenuImageIcon = sapplemangoadeIcon;
			chosemenuname = "애플망고에이드";
		} else if (chosemenu.equals("616")) {
			chosemenuImageIcon = sosadangIcon;
			chosemenuname = "오사당";
		} else if (chosemenu.equals("617")) {
			chosemenuImageIcon = sgrapefruitadeIcon;
			chosemenuname = "자몽에이드";
		} else if (chosemenu.equals("618")) {
			chosemenuImageIcon = scherrycokeIcon;
			chosemenuname = "체리콕";
		} else if (chosemenu.equals("621")) {
			chosemenuImageIcon = screamsodaIcon;
			chosemenuname = "크림소다";
		} else if (chosemenu.equals("622")) {
			chosemenuImageIcon = sgrapeadeIcon;
			chosemenuname = "포도에이드";
		} else if (chosemenu.equals("711")) {
			chosemenuImageIcon = scoldbrewIcon;
			chosemenuname = "콜드브루 500ml";
		} else if (chosemenu.equals("712")) {
			chosemenuImageIcon = sdecafeinatedcoldbrewIcon;
			chosemenuname = "디카페인 콜드브루 500ml";
		} else if (chosemenu.equals("713")) {
			chosemenuImageIcon = sgarlicIcon;
			chosemenuname = "갈릭크룽지";
		} else if (chosemenu.equals("714")) {
			chosemenuImageIcon = ssweetIcon;
			chosemenuname = "스윗크룽지";
		} else if (chosemenu.equals("715")) {
			chosemenuImageIcon = sgourmetbreadIcon;
			chosemenuname = "고메소금빵";
		} else if (chosemenu.equals("716")) {
			chosemenuImageIcon = sbasilbreadIcon;
			chosemenuname = "바질토마토 치킨 소금빵";
		} else if (chosemenu.equals("717")) {
			chosemenuImageIcon = semmentalbreadIcon;
			chosemenuname = "에멘탈 햄치즈 소금빵";
		} else if (chosemenu.equals("718")) {
			chosemenuImageIcon = sdrnutsIcon;
			chosemenuname = "닥터넛츠 피칸";
		} else if (chosemenu.equals("721")) {
			chosemenuImageIcon = ssweethotdogIcon;
			chosemenuname = "달콤 어니언 핫도그";
		} else if (chosemenu.equals("722")) {
			chosemenuImageIcon = sspicyhotdogIcon;
			chosemenuname = "매콤 칠리 핫도그";
		} else if (chosemenu.equals("723")) {
			chosemenuImageIcon = ssweetpotatobreadIcon;
			chosemenuname = "달콤촉촉 고구마빵";
		} else if (chosemenu.equals("724")) {
			chosemenuImageIcon = spotatobreadIcon;
			chosemenuname = "포슬쫀득 감자빵";
		} else if (chosemenu.equals("725")) {
			chosemenuImageIcon = scarrotcheeseIcon;
			chosemenuname = "당근치즈 브라우니";
		} else if (chosemenu.equals("726")) {
			chosemenuImageIcon = sdoublechococookieIcon;
			chosemenuname = "더블초코 스모어 촉촉쿠키";
		} else if (chosemenu.equals("727")) {
			chosemenuImageIcon = scranberrycookieIcon;
			chosemenuname = "크랜베리 초코칩 촉촉쿠키";
		} else if (chosemenu.equals("728")) {
			chosemenuImageIcon = swhitechococookieIcon;
			chosemenuname = "화이트초코 말차 촉촉쿠키";
		} else if (chosemenu.equals("731")) {
			chosemenuImageIcon = sstrawberrypieIcon;
			chosemenuname = "딸기에 퐁당 파이";
		} else if (chosemenu.equals("732")) {
			chosemenuImageIcon = schocopieIcon;
			chosemenuname = "초코에 퐁당 파이";
		} else if (chosemenu.equals("733")) {
			chosemenuImageIcon = sminicustardIcon;
			chosemenuname = "미니 붕어빵(커스타드)";
		} else if (chosemenu.equals("734")) {
			chosemenuImageIcon = sminiredbeanIcon;
			chosemenuname = "미니 붕어빵(통팥)";
		} else if (chosemenu.equals("735")) {
			chosemenuImageIcon = sstrawberrymacaroonIcon;
			chosemenuname = "딸기요거 벤카롱";
		} else if (chosemenu.equals("736")) {
			chosemenuImageIcon = smatchamacaroonIcon;
			chosemenuname = "말차초코 벤카롱";
		} else if (chosemenu.equals("737")) {
			chosemenuImageIcon = scocomacaroonIcon;
			chosemenuname = "코코초코 벤카롱";
		} else if (chosemenu.equals("738")) {
			chosemenuImageIcon = scookiemacaroonIcon;
			chosemenuname = "쿠키크림 벤카롱";
		} 
	}
}
