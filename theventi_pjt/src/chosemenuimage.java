import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class chosemenuimage extends JFrame {

	static public ImageIcon chosemenuImageIcon;
	static public String chosemenuname;

	public chosemenuimage(String chosemenu) {
		// (���̽�)�Ƹ޸�ī�� �޴� �̹���
		ImageIcon iceamericanoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�Ƹ޸�ī��.png");
		Image iceamericanoImage = iceamericanoIcon.getImage();
		Image siceamericanoImage = iceamericanoImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon siceamericanoIcon = new ImageIcon(siceamericanoImage);

		// (���̽�)�ͽ�Ŀ�� �޴� �̹���
		ImageIcon icemixedcoffeeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ͽ�Ŀ��.png");
		Image icemixedcoffeeImage = icemixedcoffeeIcon.getImage();
		Image sicemixedcoffeeImage = icemixedcoffeeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicemixedcoffeeIcon = new ImageIcon(sicemixedcoffeeImage);

		// (���̽�)�ٴҶ���� �޴� �̹���
		ImageIcon icevanilladeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ٴҶ����.png");
		Image icevanilladeeplatteImage = icevanilladeeplatteIcon.getImage();
		Image sicevanilladeeplatteImage = icevanilladeeplatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicevanilladeeplatteIcon = new ImageIcon(sicevanilladeeplatteImage);

		// (���̽�)�ٴҶ�ũ���ݵ��� �޴� �̹���
		ImageIcon icevanillacreamcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ٴҶ�ũ���ݵ���.png");
		Image icevanillacreamcoldbrewImage = icevanillacreamcoldbrewIcon.getImage();
		Image sicevanillacreamcoldbrewImage = icevanillacreamcoldbrewImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sicevanillacreamcoldbrewIcon = new ImageIcon(sicevanillacreamcoldbrewImage);

		// (���̽�)���̽�ũ���� �޴� �̹���
		ImageIcon iceicecreamlatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)���̽�ũ����.png");
		Image iceicecreamlatteImage = iceicecreamlatteIcon.getImage();
		Image siceicecreamlatteImage = iceicecreamlatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon siceicecreamlatteIcon = new ImageIcon(siceicecreamlatteImage);

		// (���̽�)��Ʈī��� �޴� �̹���
		ImageIcon iceoatcafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)��Ʈī���.png");
		Image iceoatcafelatteImage = iceoatcafelatteIcon.getImage();
		Image siceoatcafelatteImage = iceoatcafelatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon siceoatcafelatteIcon = new ImageIcon(siceoatcafelatteImage);

		// (���̽�)ī��Ḷ���ƶ� �޴� �̹���
		ImageIcon icecaramelmacchiatoIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)ī��Ḷ���ƶ�.png");
		Image icecaramelmacchiatoImage = icecaramelmacchiatoIcon.getImage();
		Image sicecaramelmacchiatoImage = icecaramelmacchiatoImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecaramelmacchiatoIcon = new ImageIcon(sicecaramelmacchiatoImage);

		// (���̽�)ī��� �޴� �̹���
		ImageIcon icecafelatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)ī���.png");
		Image icecafelatteImage = icecafelatteIcon.getImage();
		Image sicecafelatteImage = icecafelatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecafelatteIcon = new ImageIcon(sicecafelatteImage);

		// (���̽�)ī���ī �޴� �̹���
		ImageIcon icecafemochaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)ī���ī.png");
		Image icecafemochaImage = icecafemochaIcon.getImage();
		Image sicecafemochaImage = icecafemochaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecafemochaIcon = new ImageIcon(sicecafemochaImage);

		// (���̽�)���ڳӶ� �޴� �̹���
		ImageIcon icecoconutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)���ڳӶ�.png");
		Image icecoconutImage = icecoconutlatteIcon.getImage();
		Image sicecoconutImage = icecoconutImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecoconutIcon = new ImageIcon(sicecoconutImage);

		// (���̽�)�ݵ��� �޴� �̹���
		ImageIcon icecoldbrewIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ݵ���.png");
		Image icecoldbrewImage = icecoldbrewIcon.getImage();
		Image sicecoldbrewImage = icecoldbrewImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecoldbrewIcon = new ImageIcon(sicecoldbrewImage);

		// (���̽�)�ݵ���� �޴� �̹���
		ImageIcon icecoldbrewlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�ݵ����.png");
		Image icecoldbrewlatteImage = icecoldbrewlatteIcon.getImage();
		Image sicecoldbrewlatteImage = icecoldbrewlatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicecoldbrewlatteIcon = new ImageIcon(sicecoldbrewlatteImage);

		// (���̽�)���ǳӶ� �޴� �̹���
		ImageIcon icetoffeenutlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)���ǳӶ�.png");
		Image icetoffeenutlatteImage = icetoffeenutlatteIcon.getImage();
		Image sicetoffeenutlatteImage = icetoffeenutlatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicetoffeenutlatteIcon = new ImageIcon(sicetoffeenutlatteImage);

		// (���̽�)������ӵ��� �޴� �̹���
		ImageIcon icehazelnutdeeplatteIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)������ӵ���.png");
		Image icehazelnutdeepImage = icehazelnutdeeplatteIcon.getImage();
		Image sicehazelnutdeepImage = icehazelnutdeepImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sicehazelnutdeeplatteIcon = new ImageIcon(sicehazelnutdeepImage);

		// (���̽�)�������ũ���ݵ��� �޴� �̹���
		ImageIcon icehazelnutcreamcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(���̽�)\\(���̽�)�������ũ���ݵ���.png");
		Image icehazelnutcreamcoldbrewImage = icehazelnutcreamcoldbrewIcon.getImage();
		Image sicehazelnutcreamcoldbrewImage = icehazelnutcreamcoldbrewImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sicehazelnutcreamcoldbrewIcon = new ImageIcon(sicehazelnutcreamcoldbrewImage);

		// (��) �Ƹ޸�ī�� �޴� �̹���
		ImageIcon hotamericanoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\Ŀ��(��)\\(��)�Ƹ޸�ī��.png");
		Image hotamericanoImage = hotamericanoIcon.getImage();
		Image shotamericanoImage = hotamericanoImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
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

		// �������� �޴� �̹���
		ImageIcon sweetpotatolatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\��������.png");
		Image sweetpotatolatteImage = sweetpotatolatteIcon.getImage();
		Image ssweetpotatolatteImage = sweetpotatolatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssweetpotatolatteIcon = new ImageIcon(ssweetpotatolatteImage);

		// ����� �޴� �̹���
		ImageIcon strawberrylatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�����.png");
		Image strawberrylatteImage = strawberrylatteIcon.getImage();
		Image sstrawberrylatteImage = strawberrylatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrylatteIcon = new ImageIcon(sstrawberrylatteImage);

		// �ξ��ũƼ �޴� �̹���
		ImageIcon royalmilkteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�ξ��ũƼ.png");
		Image royalmilkteaImage = royalmilkteaIcon.getImage();
		Image sroyalmilkteaImage = royalmilkteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sroyalmilkteaIcon = new ImageIcon(sroyalmilkteaImage);

		// ������ �޴� �̹���
		ImageIcon matchalatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\������.png");
		Image matchalatteImage = matchalatteIcon.getImage();
		Image smatchalatteImage = matchalatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smatchalatteIcon = new ImageIcon(smatchalatteImage);

		// �������ν���� �޴� �̹���
		ImageIcon matchaeinspennerIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�������ν����.png");
		Image matchaeinispennerImage = matchaeinspennerIcon.getImage();
		Image smatchaeinispennerImage = matchaeinispennerImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smatchaeinspennerIcon = new ImageIcon(smatchaeinispennerImage);

		// �������� �޴� �̹���
		ImageIcon meltingchocoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\��������.png");
		Image meltingchocoImage = meltingchocoIcon.getImage();
		Image smeltingchocoImage = meltingchocoImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smeltingchocoIcon = new ImageIcon(smeltingchocoImage);

		// �̼����� �޴� �̹���
		ImageIcon mixedgrainpowderIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�̼�����.png");
		Image mixedgrainpowderImage = mixedgrainpowderIcon.getImage();
		Image smixedgrainpowderImage = mixedgrainpowderImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smixedgrainpowderIcon = new ImageIcon(smixedgrainpowderImage);

		// �̼������ �޴� �̹���
		ImageIcon mixedgrainpowderlatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\�̼������.png");
		Image mixedgrainpowderlatteImage = mixedgrainpowderlatteIcon.getImage();
		Image smixedgrainpowderlatteImage = mixedgrainpowderlatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smixedgrainpowderlatteIcon = new ImageIcon(smixedgrainpowderlatteImage);

		// ���ڶ� �޴� �̹���
		ImageIcon chocolatteIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\��������\\���ڶ�.png");
		Image chocolatteImage = chocolatteIcon.getImage();
		Image schocolatteImage = chocolatteImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon schocolatteIcon = new ImageIcon(schocolatteImage);

		// ���⽦��ũ �޴� �̹���
		ImageIcon strawberryshakeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���⽦��ũ.png");
		Image strawberryshakeImage = strawberryshakeIcon.getImage();
		Image sstrawberryshakeImage = strawberryshakeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sstrawberryshakeIcon = new ImageIcon(sstrawberryshakeImage);

		// ������Ʈ������ �޴� �̹���
		ImageIcon strawberryyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\������Ʈ������.png");
		Image strawberryyogurtsmoothieImage = strawberryyogurtsmoothieIcon.getImage();
		Image sstrawberryyogurtsmoothieImage = strawberryyogurtsmoothieImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sstrawberryyogurtsmoothieIcon = new ImageIcon(sstrawberryyogurtsmoothieImage);

		// ���������� �޴� �̹���
		ImageIcon matchafrappeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\����������.png");
		Image matchfrappeImage = matchafrappeIcon.getImage();
		Image smatchafrappeImage = matchfrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smatchafrappeIcon = new ImageIcon(smatchafrappeImage);

		// ������Ʈ������ �޴� �̹���
		ImageIcon mangoyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\������Ʈ������.png");
		Image mangoyogurtsmoothieImage = mangoyogurtsmoothieIcon.getImage();
		Image smangoyogurtsmoothieImage = mangoyogurtsmoothieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smangoyogurtsmoothieIcon = new ImageIcon(smangoyogurtsmoothieImage);

		// �����м�ũ���� �޴� �̹���
		ImageIcon mangofashioncrushIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\�����м�ũ����.png");
		Image mangofashioncrushImage = mangofashioncrushIcon.getImage();
		Image smangofashioncrushImage = mangofashioncrushImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smangofashioncrushIcon = new ImageIcon(smangofashioncrushImage);

		// ��Ʈ����Ĩ������ �޴� �̹���
		ImageIcon mintchocochipfrappeIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��Ʈ����Ĩ������.png");
		Image mintchocochipfrappeImage = mintchocochipfrappeIcon.getImage();
		Image smintchocochipfrappeImage = mintchocochipfrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smintchocochipfrappeIcon = new ImageIcon(smintchocochipfrappeImage);

		// ��ũ����ũ �޴� �̹���
		ImageIcon milkshakeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��ũ����ũ.png");
		Image milkshakeImage = milkshakeIcon.getImage();
		Image smilkshakeImage = milkshakeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smilkshakeIcon = new ImageIcon(smilkshakeImage);

		// ��纣�����Ʈ������ �޴� �̹���
		ImageIcon blueberryyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��纣�����Ʈ������.png");
		Image blueberryyogurtsmoothieImage = blueberryyogurtsmoothieIcon.getImage();
		Image sblueberryyogurtsmoothieImage = blueberryyogurtsmoothieImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sblueberryyogurtsmoothieIcon = new ImageIcon(sblueberryyogurtsmoothieImage);

		// ���������ҽ���ũ �޴� �̹���
		ImageIcon espressoshakeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���������ҽ���ũ.png");
		Image espressoshakeImage = espressoshakeIcon.getImage();
		Image sespressoshakeImage = espressoshakeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sespressoshakeIcon = new ImageIcon(sespressoshakeImage);

		// ���ڹ�ũ���� �޴� �̹���
		ImageIcon citronpearcrushIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���ڹ�ũ����.png");
		Image citronpearcrushImage = citronpearcrushIcon.getImage();
		Image scitronpearcrushImage = citronpearcrushImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scitronpearcrushIcon = new ImageIcon(scitronpearcrushImage);

		// �ڵ���ġũ���� �޴� �̹���
		ImageIcon plumpeachcrushIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\�ڵ���ġũ����.png");
		Image plumpeachcrushImage = plumpeachcrushIcon.getImage();
		Image splumpeachcrushImage = plumpeachcrushImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon splumpeachcrushIcon = new ImageIcon(splumpeachcrushImage);

		// �ڹ�Ĩ������ �޴� �̹���
		ImageIcon javachipfrappeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\�ڹ�Ĩ������.png");
		Image javachipfrappeImage = javachipfrappeIcon.getImage();
		Image sjavachipfrappeImage = javachipfrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sjavachipfrappeIcon = new ImageIcon(sjavachipfrappeImage);

		// ���ڽ���ũ �޴� �̹���
		ImageIcon chocoshakeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���ڽ���ũ.png");
		Image chocoshakeImage = chocoshakeIcon.getImage();
		Image schocoshakeImage = chocoshakeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon schocoshakeIcon = new ImageIcon(schocoshakeImage);

		// ���ڳ�Ŀ�������� �޴� �̹���
		ImageIcon coconutcoffeefrappeIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\���ڳ�Ŀ��������.png");
		Image coconutcoffeefrappeImage = coconutcoffeefrappeIcon.getImage();
		Image scoconutcoffeefrappeImage = coconutcoffeefrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scoconutcoffeefrappeIcon = new ImageIcon(scoconutcoffeefrappeImage);

		// �������������� �޴� �̹���
		ImageIcon cocochocofrappeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��������������.png");
		Image cocochocofrappeImage = cocochocofrappeIcon.getImage();
		Image scocochocofrappeImage = cocochocofrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scocochocofrappeIcon = new ImageIcon(scocochocofrappeImage);

		// ��Ű��ũ�������� �޴� �̹���
		ImageIcon cookiencreamfrappeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��Ű��ũ��������.png");
		Image cookiencreamfrappeImage = cookiencreamfrappeIcon.getImage();
		Image scookiencreamfrappeImage = cookiencreamfrappeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scookiencreamfrappeIcon = new ImageIcon(scookiencreamfrappeImage);

		// ��������ũ���� �޴� �̹���
		ImageIcon grapeberrycrushIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\��������ũ����.png");
		Image grapeberrycrushImage = grapeberrycrushIcon.getImage();
		Image sgrapeberrycrushImage = grapeberrycrushImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgrapeberrycrushIcon = new ImageIcon(sgrapeberrycrushImage);

		// �÷��ο��Ʈ������ �޴� �̹���
		ImageIcon plainyogurtsmoothieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̽� �����\\�÷��ο��Ʈ������.png");
		Image plainyogurtsmoothieImage = plainyogurtsmoothieIcon.getImage();
		Image splainyogurtsmoothieImage = plainyogurtsmoothieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon splainyogurtsmoothieIcon = new ImageIcon(splainyogurtsmoothieImage);

		// �����ƮƼ �޴� �̹���
		ImageIcon lemonmintteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�����ƮƼ.png");
		Image lemonmintteaImage = lemonmintteaIcon.getImage();
		Image slemonmintteaImage = lemonmintteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon slemonmintteaIcon = new ImageIcon(slemonmintteaImage);

		// ��ġĳ���� �޴� �̹���
		ImageIcon litchichamomileIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\��ġĳ����.png");
		Image litchichamomileImage = litchichamomileIcon.getImage();
		Image slitchichamomileImage = litchichamomileImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon slitchichamomileIcon = new ImageIcon(slitchichamomileImage);

		// �����ƾ��̽�Ƽ �޴� �̹���
		ImageIcon peachiceteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�����ƾ��̽�Ƽ.png");
		Image peachiceteaImage = peachiceteaIcon.getImage();
		Image speachiceteaImage = peachiceteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon speachiceteaIcon = new ImageIcon(speachiceteaImage);

		// ��������Ŀ�� �޴� �̹���
		ImageIcon applehibiscusIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\��������Ŀ��.png");
		Image applehibiscusImage = applehibiscusIcon.getImage();
		Image sapplehibiscusImage = applehibiscusImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sapplehibiscusIcon = new ImageIcon(sapplehibiscusImage);

		// ���ھ���Ƽ �޴� �̹���
		ImageIcon citronappleteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\���ھ���Ƽ.png");
		Image citronappleteaImage = citronappleteaIcon.getImage();
		Image scitronappleteaImage = citronappleteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scitronappleteaIcon = new ImageIcon(scitronappleteaImage);

		// ����ĳ����Ƽ �޴� �̹���
		ImageIcon citronchamomileteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\����ĳ����Ƽ.png");
		Image citronchamomileteaImage = citronchamomileteaIcon.getImage();
		Image scitronchamomileteaImage = citronchamomileteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scitronchamomileteaIcon = new ImageIcon(scitronchamomileteaImage);

		// �ڸ���Ϻ�Ƽ �޴� �̹���
		ImageIcon grapefruithoneyblackteaIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�ڸ���Ϻ�Ƽ.png");
		Image grapefruithoneyblackteaImage = grapefruithoneyblackteaIcon.getImage();
		Image sgrapefruithoneyblackteaImage = grapefruithoneyblackteaImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sgrapefruithoneyblackteaIcon = new ImageIcon(sgrapefruithoneyblackteaImage);

		// û�־�׷��� �޴� �̹���
		ImageIcon greentangerineearlgrayIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\û�־�׷���.png");
		Image greentangerineearlgrayImage = greentangerineearlgrayIcon.getImage();
		Image sgreentangerineearlgrayImage = greentangerineearlgrayImage.getScaledInstance(25, 40,
				Image.SCALE_SMOOTH);
		ImageIcon sgreentangerineearlgrayIcon = new ImageIcon(sgreentangerineearlgrayImage);

		// Ÿ�ι���Ƽ �޴� �̹���
		ImageIcon tarobubbleteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\Ÿ�ι���Ƽ.png");
		Image tarobubbleteaImage = tarobubbleteaIcon.getImage();
		Image starobubbleteaImage = tarobubbleteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon starobubbleteaIcon = new ImageIcon(starobubbleteaImage);

		// Ʈ���ù�Ʈ �޴� �̹���
		ImageIcon tripplemintIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\Ʈ���ù�Ʈ.png");
		Image tripplemintImage = tripplemintIcon.getImage();
		Image stripplemintImage = tripplemintImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon stripplemintIcon = new ImageIcon(stripplemintImage);

		// ��Ϸ���Ƽ �޴� �̹���
		ImageIcon honeylemonteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\��Ϸ���Ƽ.png");
		Image honeylemonteaImage = honeylemonteaIcon.getImage();
		Image shoneylemonteaImage = honeylemonteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon shoneylemonteaIcon = new ImageIcon(shoneylemonteaImage);

		// �������Ƽ �޴� �̹���
		ImageIcon honeycitronteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�������Ƽ.png");
		Image honeycitronteaImage = honeycitronteaIcon.getImage();
		Image shoneycitronteaImage = honeycitronteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon shoneycitronteaIcon = new ImageIcon(shoneycitronteaImage);

		// ����ڸ�Ƽ �޴� �̹���
		ImageIcon honeygrapefruitteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\����ڸ�Ƽ.png");
		Image honeygrapefruitteaImage = honeygrapefruitteaIcon.getImage();
		Image shoneygrapefruitteaImage = honeygrapefruitteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon shoneygrapefruitteaIcon = new ImageIcon(shoneygrapefruitteaImage);

		// �漳������Ƽ �޴� �̹���
		ImageIcon brownsugarbubbleteaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\����Ƽ, Ƽ\\�漳������Ƽ.png");
		Image bronwsugarbubbleteaImage = brownsugarbubbleteaIcon.getImage();
		Image sbronwsugarbubbleteaImage = bronwsugarbubbleteaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sbrownsugarbubbleteaIcon = new ImageIcon(sbronwsugarbubbleteaImage);

		// �����̵� �޴� �̹���
		ImageIcon lemonadeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�����̵�.png");
		Image lemonadeImage = lemonadeIcon.getImage();
		Image slemonadeImage = lemonadeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon slemonadeIcon = new ImageIcon(slemonadeImage);

		// ���ô� �޴� �̹���
		ImageIcon manpledanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\���ô�.png");
		Image manpledanImage = manpledanIcon.getImage();
		Image smanpledanImage = manpledanImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smanpledanIcon = new ImageIcon(smanpledanImage);

		// �޷мҴ� �޴� �̹���
		ImageIcon melonsodaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�޷мҴ�.png");
		Image melonsodaImage = melonsodaIcon.getImage();
		Image smelonsodaImage = melonsodaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smelonsodaIcon = new ImageIcon(smelonsodaImage);

		// ����� �޴� �̹���
		ImageIcon saddalbiIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�����.png");
		Image saddalbiImage = saddalbiIcon.getImage();
		Image ssaddalbiImage = saddalbiImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssaddalbiIcon = new ImageIcon(ssaddalbiImage);

		// ���ø����̵� �޴� �̹���
		ImageIcon applemangoadeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\���ø����̵�.png");
		Image applemangoadeImage = applemangoadeIcon.getImage();
		Image sapplemangoadeImage = applemangoadeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sapplemangoadeIcon = new ImageIcon(sapplemangoadeImage);

		// ����� �޴� �̹���
		ImageIcon osadangIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�����.png");
		Image osadangImage = osadangIcon.getImage();
		Image sosadangImage = osadangImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sosadangIcon = new ImageIcon(sosadangImage);

		// �ڸ����̵� �޴� �̹���
		ImageIcon grapefruitadeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�ڸ����̵�.png");
		Image grapefruitadeImage = grapefruitadeIcon.getImage();
		Image sgrapefruitadeImage = grapefruitadeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgrapefruitadeIcon = new ImageIcon(sgrapefruitadeImage);

		// ü���� �޴� �̹���
		ImageIcon cherrycokeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\ü����.png");
		Image cherrycokeImage = cherrycokeIcon.getImage();
		Image scherrycokeImage = cherrycokeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scherrycokeIcon = new ImageIcon(scherrycokeImage);

		// ũ���Ҵ� �޴� �̹���
		ImageIcon creamsodaIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\ũ���Ҵ�.png");
		Image creamsodaImage = creamsodaIcon.getImage();
		Image screamsodaImage = creamsodaImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon screamsodaIcon = new ImageIcon(screamsodaImage);

		// �������̵� �޴� �̹���
		ImageIcon grapeadeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\�ֽ�, ���̵�\\�������̵�.png");
		Image grapeadeImage = grapeadeIcon.getImage();
		Image sgrapeadeImage = grapeadeImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgrapeadeIcon = new ImageIcon(sgrapeadeImage);

		// �ݵ��� �޴� �̹���
		ImageIcon coldbrewIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�ݵ��� 500ml.png");
		Image coldbrewImage = coldbrewIcon.getImage();
		Image scoldbrewImage = coldbrewImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scoldbrewIcon = new ImageIcon(scoldbrewImage);

		// ��ī���� �ݵ��� �޴� �̹���
		ImageIcon decafeinatedcoldbrewIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\��ī���� �ݵ��� 500ml.png");
		Image decafeinatedcoldbrewImage = decafeinatedcoldbrewIcon.getImage();
		Image sdecafeinatedcoldbrewImage = decafeinatedcoldbrewImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sdecafeinatedcoldbrewIcon = new ImageIcon(sdecafeinatedcoldbrewImage);

		// ����ũ���� �޴� �̹���
		ImageIcon garlicIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���� ũ����.png");
		Image garlicImage = garlicIcon.getImage();
		Image sgarlicImage = garlicImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgarlicIcon = new ImageIcon(sgarlicImage);

		// ����ũ���� �޴� �̹���
		ImageIcon sweetIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���� ũ����.png");
		Image sweetImage = sweetIcon.getImage();
		Image ssweetImage = sweetImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssweetIcon = new ImageIcon(ssweetImage);

		// ��޼ұݻ� �޴� �̹���
		ImageIcon gourmetbreadIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\��޼ұݻ�.png");
		Image gourmetbreadImage = gourmetbreadIcon.getImage();
		Image sgourmetbreadImage = gourmetbreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sgourmetbreadIcon = new ImageIcon(sgourmetbreadImage);

		// �����丶�� ġŲ �ұݻ� �޴� �̹���
		ImageIcon basilbreadIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�����丶�� ġŲ �ұݻ�.png");
		Image basilbreadImage = basilbreadIcon.getImage();
		Image sbasilbreadImage = basilbreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sbasilbreadIcon = new ImageIcon(sbasilbreadImage);

		// ����Ż ��ġ�� �ұݻ� �޴� �̹���
		ImageIcon emmentalbreadIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\����Ż ��ġ�� �ұݻ�.png");
		Image emmentalbreadImage = emmentalbreadIcon.getImage();
		Image semmentalbreadImage = emmentalbreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon semmentalbreadIcon = new ImageIcon(semmentalbreadImage);

		// ���ͳ��� �޴� �̹���
		ImageIcon drnutsIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���ͳ��� ��ĭ.png");
		Image drnutsImage = drnutsIcon.getImage();
		Image sdrnutsImage = drnutsImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sdrnutsIcon = new ImageIcon(sdrnutsImage);

		// ���� ��Ͼ� �ֵ��� �޴� �̹���
		ImageIcon sweethotdogIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���� ��Ͼ� �ֵ���.png");
		Image sweethotdogImage = sweethotdogIcon.getImage();
		Image ssweethotdogImage = sweethotdogImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssweethotdogIcon = new ImageIcon(ssweethotdogImage);

		// ���� ĥ�� �ֵ��� �޴� �̹���
		ImageIcon spicyhotdogIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���� ĥ�� �ֵ���.png");
		Image spicyhotdogImage = spicyhotdogIcon.getImage();
		Image sspicyhotdogImage = spicyhotdogImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sspicyhotdogIcon = new ImageIcon(sspicyhotdogImage);

		// �������� ������ �޴� �̹���
		ImageIcon sweetpotatobreadIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�������� ������.png");
		Image sweetpotatobreadImage = sweetpotatobreadIcon.getImage();
		Image ssweetpotatobreadImage = sweetpotatobreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon ssweetpotatobreadIcon = new ImageIcon(ssweetpotatobreadImage);

		// �����˵� ���ڻ� �޴� �̹���
		ImageIcon potatobreadIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�����˵� ���ڻ�.png");
		Image potatobreadImage = potatobreadIcon.getImage();
		Image spotatobreadImage = potatobreadImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon spotatobreadIcon = new ImageIcon(spotatobreadImage);

		// ���ġ�� ����� �޴� �̹���
		ImageIcon carrotcheeseIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���ġ�� �����.png");
		Image carrotcheeseImage = carrotcheeseIcon.getImage();
		Image scarrotcheeseImage = carrotcheeseImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scarrotcheeseIcon = new ImageIcon(scarrotcheeseImage);

		// �������� ����� ������Ű �޴� �̹���
		ImageIcon doublechococookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�������� ����� ������Ű.png");
		Image doublechococookieImage = doublechococookieIcon.getImage();
		Image sdoublechococookieImage = doublechococookieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sdoublechococookieIcon = new ImageIcon(sdoublechococookieImage);

		// ũ������ ����Ĩ ������Ű �޴� �̹���
		ImageIcon cranberrycookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\ũ������ ����Ĩ ������Ű.png");
		Image cranberrycookieImage = cranberrycookieIcon.getImage();
		Image scranberrycookieImage = cranberrycookieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scranberrycookieIcon = new ImageIcon(scranberrycookieImage);

		// ȭ��Ʈ���� ���� ������Ű �޴� �̹���
		ImageIcon whitechococookieIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\ȭ��Ʈ���� ���� ������Ű.png");
		Image whitechococookieImage = whitechococookieIcon.getImage();
		Image swhitechococookieImage = whitechococookieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon swhitechococookieIcon = new ImageIcon(swhitechococookieImage);

		// ���⿡ ���� ���� �޴� �̹���
		ImageIcon strawberrypieIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���⿡ ���� ����.png");
		Image strawberrypieImage = strawberrypieIcon.getImage();
		Image sstrawberrypieImage = strawberrypieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrypieIcon = new ImageIcon(sstrawberrypieImage);

		// ���ڿ� ���� ���� �޴� �̹���
		ImageIcon chocopieIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\���ڿ� ���� ����.png");
		Image chocopieImage = chocopieIcon.getImage();
		Image schocopieImage = chocopieImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon schocopieIcon = new ImageIcon(schocopieImage);

		// �̴� �ؾ(Ŀ��Ÿ��) �޴� �̹���
		ImageIcon minicustardIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�̴Ϻؾ(Ŀ��Ÿ��).png");
		Image minicustardImage = minicustardIcon.getImage();
		Image sminicustardImage = minicustardImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sminicustardIcon = new ImageIcon(sminicustardImage);

		// �̴� �ؾ(����) �޴� �̹���
		ImageIcon miniredbeanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�̴Ϻؾ(����).png");
		Image miniredbeanImage = miniredbeanIcon.getImage();
		Image sminiredbeanImage = miniredbeanImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sminiredbeanIcon = new ImageIcon(sminiredbeanImage);

		// ������ ��ī�� �޴� �̹���
		ImageIcon strawberrymacaroonIcon = new ImageIcon(
				"D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\������ ��ī��.png");
		Image strawberrymacaroonImage = strawberrymacaroonIcon.getImage();
		Image sstrawberrymacaroonImage = strawberrymacaroonImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon sstrawberrymacaroonIcon = new ImageIcon(sstrawberrymacaroonImage);

		// �������� ��ī�� �޴� �̹���
		ImageIcon matchamacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�������� ��ī��.png");
		Image matchamacaroonImage = matchamacaroonIcon.getImage();
		Image smatchamacaroonImage = matchamacaroonImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon smatchamacaroonIcon = new ImageIcon(smatchamacaroonImage);

		// �������� ��ī�� �޴� �̹���
		ImageIcon cocomacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\�������� ��ī��.png");
		Image cocomacaroonImage = cocomacaroonIcon.getImage();
		Image scocomacaroonImage = cocomacaroonImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scocomacaroonIcon = new ImageIcon(scocomacaroonImage);

		// ��Űũ�� ��ī�� �޴� �̹���
		ImageIcon cookiemacaroonIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �̹���\\���̵�޴�, RTD\\��Űũ�� ��ī��.png");
		Image cookiemacaroonImage = cookiemacaroonIcon.getImage();
		Image scookiemacaroonImage = cookiemacaroonImage.getScaledInstance(25, 40, Image.SCALE_SMOOTH);
		ImageIcon scookiemacaroonIcon = new ImageIcon(scookiemacaroonImage);

		// optionframe class���� ������ �޴� ��ȣ�� ���ؼ� �׿� �ش��ϴ� �޴� ���� �ִ� �ڵ�
		if (chosemenu.equals("111")) {
			chosemenuImageIcon = siceamericanoIcon;
			chosemenuname = "(���̽�)�Ƹ޸�ī��";
		} else if (chosemenu.equals("112")) {
			chosemenuImageIcon = sicemixedcoffeeIcon;
			chosemenuname = "(���̽�)�ͽ�Ŀ��";
		} else if (chosemenu.equals("113")) {
			chosemenuImageIcon = sicevanilladeeplatteIcon;
			chosemenuname = "(���̽�)�ٴҶ����";
		} else if (chosemenu.equals("114")) {
			chosemenuImageIcon = sicevanillacreamcoldbrewIcon;
			chosemenuname = "(���̽�)�ٴҶ�ũ���ݵ���";
		} else if (chosemenu.equals("115")) {
			chosemenuImageIcon = siceicecreamlatteIcon;
			chosemenuname = "(���̽�)���̽�ũ����";
		} else if (chosemenu.equals("116")) {
			chosemenuImageIcon = siceoatcafelatteIcon;
			chosemenuname = "(���̽�)��Ʈī���";
		} else if (chosemenu.equals("117")) {
			chosemenuImageIcon = sicecaramelmacchiatoIcon;
			chosemenuname = "(���̽�)ī��Ḷ���ƶ�";
		} else if (chosemenu.equals("118")) {
			chosemenuImageIcon = sicecafelatteIcon;
			chosemenuname = "(���̽�)ī���";
		} else if (chosemenu.equals("121")) {
			chosemenuImageIcon = sicecafemochaIcon;
			chosemenuname = "(���̽�)ī���ī";
		} else if (chosemenu.equals("122")) {
			chosemenuImageIcon = sicecoconutIcon;
			chosemenuname = "(���̽�)���ڳӶ�";
		} else if (chosemenu.equals("123")) {
			chosemenuImageIcon = sicecoldbrewIcon;
			chosemenuname = "(���̽�)�ݵ���";
		} else if (chosemenu.equals("124")) {
			chosemenuImageIcon = sicecoldbrewlatteIcon;
			chosemenuname = "(���̽�)�ݵ����";
		} else if (chosemenu.equals("125")) {
			chosemenuImageIcon = sicetoffeenutlatteIcon;
			chosemenuname = "(���̽�)���ǳӶ�";
		} else if (chosemenu.equals("126")) {
			chosemenuImageIcon = sicehazelnutdeeplatteIcon;
			chosemenuname = "(���̽�)������ӵ���";
		} else if (chosemenu.equals("127")) {
			chosemenuImageIcon = sicehazelnutcreamcoldbrewIcon;
			chosemenuname = "(���̽�)�������ũ���ݵ���";
		} else if (chosemenu.equals("211")) {
			chosemenuImageIcon = shotamericanoIcon;
			chosemenuname = "(��)�Ƹ޸�ī��";
		} else if (chosemenu.equals("212")) {
			chosemenuImageIcon = shotmixedcoffeeIcon;
			chosemenuname = "(��)�ͽ�Ŀ��";
		} else if (chosemenu.equals("213")) {
			chosemenuImageIcon = shotvanilladeeplatteIcon;
			chosemenuname = "��(�ٴҶ����)";
		} else if (chosemenu.equals("214")) {
			chosemenuImageIcon = shotcondensedmilklatteIcon;
			chosemenuname = "��(������)";
		} else if (chosemenu.equals("215")) {
			chosemenuImageIcon = shotoatcafelatteIcon;
			chosemenuname = "��(��Ʈī���)";
		} else if (chosemenu.equals("216")) {
			chosemenuImageIcon = shotcaramelmacchiatoIcon;
			chosemenuname = "��(ī��Ḷ���ƶ�)";
		} else if (chosemenu.equals("217")) {
			chosemenuImageIcon = shotcafelatteIcon;
			chosemenuname = "��(ī���)";
		} else if (chosemenu.equals("218")) {
			chosemenuImageIcon = shotcafemochaIcon;
			chosemenuname = "��(ī���ī)";
		} else if (chosemenu.equals("221")) {
			chosemenuImageIcon = shotcoconutlatteIcon;
			chosemenuname = "��(���ڳӶ�)";
		} else if (chosemenu.equals("222")) {
			chosemenuImageIcon = shottoffeenutlatteIcon;
			chosemenuname = "��(���ǳӶ�)";
		} else if (chosemenu.equals("223")) {
			chosemenuImageIcon = shothazelnutdeeplatteIcon;
			chosemenuname = "��(������ӵ���)";
		} else if (chosemenu.equals("311")) {
			chosemenuImageIcon = ssweetpotatolatteIcon;
			chosemenuname = "��������";
		} else if (chosemenu.equals("312")) {
			chosemenuImageIcon = sstrawberrylatteIcon;
			chosemenuname = "�����";
		} else if (chosemenu.equals("313")) {
			chosemenuImageIcon = sroyalmilkteaIcon;
			chosemenuname = "�ξ��ũƼ";
		} else if (chosemenu.equals("314")) {
			chosemenuImageIcon = smatchalatteIcon;
			chosemenuname = "������";
		} else if (chosemenu.equals("315")) {
			chosemenuImageIcon = smatchaeinspennerIcon;
			chosemenuname = "�������ν����";
		} else if (chosemenu.equals("316")) {
			chosemenuImageIcon = smeltingchocoIcon;
			chosemenuname = "��������";
		} else if (chosemenu.equals("317")) {
			chosemenuImageIcon = smixedgrainpowderIcon;
			chosemenuname = "�̼�����";
		} else if (chosemenu.equals("318")) {
			chosemenuImageIcon = smixedgrainpowderlatteIcon;
			chosemenuname = "�̼������";
		} else if (chosemenu.equals("321")) {
			chosemenuImageIcon = schocolatteIcon;
			chosemenuname = "���ڶ�";
		} else if (chosemenu.equals("411")) {
			chosemenuImageIcon = sstrawberryshakeIcon;
			chosemenuname = "���⽦��ũ";
		} else if (chosemenu.equals("412")) {
			chosemenuImageIcon = sstrawberryyogurtsmoothieIcon;
			chosemenuname = "������Ʈ������";
		} else if (chosemenu.equals("413")) {
			chosemenuImageIcon = smatchafrappeIcon;
			chosemenuname = "����������";
		} else if (chosemenu.equals("414")) {
			chosemenuImageIcon = smangoyogurtsmoothieIcon;
			chosemenuname = "������Ʈ������";
		} else if (chosemenu.equals("415")) {
			chosemenuImageIcon = smangofashioncrushIcon;
			chosemenuname = "�����м�ũ����";
		} else if (chosemenu.equals("416")) {
			chosemenuImageIcon = smintchocochipfrappeIcon;
			chosemenuname = "��Ʈ����Ĩ������";
		} else if (chosemenu.equals("417")) {
			chosemenuImageIcon = smilkshakeIcon;
			chosemenuname = "��ũ����ũ";
		} else if (chosemenu.equals("418")) {
			chosemenuImageIcon = sblueberryyogurtsmoothieIcon;
			chosemenuname = "��纣�����Ʈ������";
		} else if (chosemenu.equals("421")) {
			chosemenuImageIcon = sespressoshakeIcon;
			chosemenuname = "���������ҽ���ũ";
		} else if (chosemenu.equals("422")) {
			chosemenuImageIcon = scitronpearcrushIcon;
			chosemenuname = "���ڹ�ũ����";
		} else if (chosemenu.equals("423")) {
			chosemenuImageIcon = splumpeachcrushIcon;
			chosemenuname = "�ڵ���ġũ����";
		} else if (chosemenu.equals("424")) {
			chosemenuImageIcon = sjavachipfrappeIcon;
			chosemenuname = "�ڹ�Ĩ������";
		} else if (chosemenu.equals("425")) {
			chosemenuImageIcon = schocoshakeIcon;
			chosemenuname = "���ڽ���ũ";
		} else if (chosemenu.equals("426")) {
			chosemenuImageIcon = scoconutcoffeefrappeIcon;
			chosemenuname = "���ڳ�Ŀ��������";
		} else if (chosemenu.equals("427")) {
			chosemenuImageIcon = scocochocofrappeIcon;
			chosemenuname = "��������������";
		} else if (chosemenu.equals("428")) {
			chosemenuImageIcon = scookiencreamfrappeIcon;
			chosemenuname = "��Ű��ũ��������";
		} else if (chosemenu.equals("431")) {
			chosemenuImageIcon = sgrapeberrycrushIcon;
			chosemenuname = "��������ũ����";
		} else if (chosemenu.equals("432")) {
			chosemenuImageIcon = splainyogurtsmoothieIcon;
			chosemenuname = "�÷��ο��Ʈ������";
		} else if (chosemenu.equals("511")) {
			chosemenuImageIcon = slemonmintteaIcon;
			chosemenuname = "�����ƮƼ";
		} else if (chosemenu.equals("512")) {
			chosemenuImageIcon = slitchichamomileIcon;
			chosemenuname = "��ġĳ����";
		} else if (chosemenu.equals("513")) {
			chosemenuImageIcon = speachiceteaIcon;
			chosemenuname = "�����ƾ��̽�Ƽ";
		} else if (chosemenu.equals("514")) {
			chosemenuImageIcon = sapplehibiscusIcon;
			chosemenuname = "��������Ŀ��";
		} else if (chosemenu.equals("515")) {
			chosemenuImageIcon = scitronappleteaIcon;
			chosemenuname = "���ھ���Ƽ";
		} else if (chosemenu.equals("516")) {
			chosemenuImageIcon = scitronchamomileteaIcon;
			chosemenuname = "����ĳ����Ƽ";
		} else if (chosemenu.equals("517")) {
			chosemenuImageIcon = sgrapefruithoneyblackteaIcon;
			chosemenuname = "�ڸ���Ϻ�Ƽ";
		} else if (chosemenu.equals("518")) {
			chosemenuImageIcon = sgreentangerineearlgrayIcon;
			chosemenuname = "û�־�׷���";
		} else if (chosemenu.equals("521")) {
			chosemenuImageIcon = starobubbleteaIcon;
			chosemenuname = "Ÿ�ι���Ƽ";
		} else if (chosemenu.equals("522")) {
			chosemenuImageIcon = stripplemintIcon;
			chosemenuname = "Ʈ���ù�Ʈ";
		} else if (chosemenu.equals("523")) {
			chosemenuImageIcon = shoneylemonteaIcon;
			chosemenuname = "��Ϸ���Ƽ";
		} else if (chosemenu.equals("524")) {
			chosemenuImageIcon = shoneycitronteaIcon;
			chosemenuname = "�������Ƽ";
		} else if (chosemenu.equals("525")) {
			chosemenuImageIcon = shoneygrapefruitteaIcon;
			chosemenuname = "����ڸ�Ƽ";
		} else if (chosemenu.equals("526")) {
			chosemenuImageIcon = sbrownsugarbubbleteaIcon;
			chosemenuname = "�漳������Ƽ";
		} else if (chosemenu.equals("611")) {
			chosemenuImageIcon = slemonadeIcon;
			chosemenuname = "�����̵�";
		} else if (chosemenu.equals("612")) {
			chosemenuImageIcon = smanpledanIcon;
			chosemenuname = "���ô�";
		} else if (chosemenu.equals("613")) {
			chosemenuImageIcon = smelonsodaIcon;
			chosemenuname = "�޷мҴ�";
		} else if (chosemenu.equals("614")) {
			chosemenuImageIcon = ssaddalbiIcon;
			chosemenuname = "�����";
		} else if (chosemenu.equals("615")) {
			chosemenuImageIcon = sapplemangoadeIcon;
			chosemenuname = "���ø����̵�";
		} else if (chosemenu.equals("616")) {
			chosemenuImageIcon = sosadangIcon;
			chosemenuname = "�����";
		} else if (chosemenu.equals("617")) {
			chosemenuImageIcon = sgrapefruitadeIcon;
			chosemenuname = "�ڸ����̵�";
		} else if (chosemenu.equals("618")) {
			chosemenuImageIcon = scherrycokeIcon;
			chosemenuname = "ü����";
		} else if (chosemenu.equals("621")) {
			chosemenuImageIcon = screamsodaIcon;
			chosemenuname = "ũ���Ҵ�";
		} else if (chosemenu.equals("622")) {
			chosemenuImageIcon = sgrapeadeIcon;
			chosemenuname = "�������̵�";
		} else if (chosemenu.equals("711")) {
			chosemenuImageIcon = scoldbrewIcon;
			chosemenuname = "�ݵ��� 500ml";
		} else if (chosemenu.equals("712")) {
			chosemenuImageIcon = sdecafeinatedcoldbrewIcon;
			chosemenuname = "��ī���� �ݵ��� 500ml";
		} else if (chosemenu.equals("713")) {
			chosemenuImageIcon = sgarlicIcon;
			chosemenuname = "����ũ����";
		} else if (chosemenu.equals("714")) {
			chosemenuImageIcon = ssweetIcon;
			chosemenuname = "����ũ����";
		} else if (chosemenu.equals("715")) {
			chosemenuImageIcon = sgourmetbreadIcon;
			chosemenuname = "��޼ұݻ�";
		} else if (chosemenu.equals("716")) {
			chosemenuImageIcon = sbasilbreadIcon;
			chosemenuname = "�����丶�� ġŲ �ұݻ�";
		} else if (chosemenu.equals("717")) {
			chosemenuImageIcon = semmentalbreadIcon;
			chosemenuname = "����Ż ��ġ�� �ұݻ�";
		} else if (chosemenu.equals("718")) {
			chosemenuImageIcon = sdrnutsIcon;
			chosemenuname = "���ͳ��� ��ĭ";
		} else if (chosemenu.equals("721")) {
			chosemenuImageIcon = ssweethotdogIcon;
			chosemenuname = "���� ��Ͼ� �ֵ���";
		} else if (chosemenu.equals("722")) {
			chosemenuImageIcon = sspicyhotdogIcon;
			chosemenuname = "���� ĥ�� �ֵ���";
		} else if (chosemenu.equals("723")) {
			chosemenuImageIcon = ssweetpotatobreadIcon;
			chosemenuname = "�������� ������";
		} else if (chosemenu.equals("724")) {
			chosemenuImageIcon = spotatobreadIcon;
			chosemenuname = "�����˵� ���ڻ�";
		} else if (chosemenu.equals("725")) {
			chosemenuImageIcon = scarrotcheeseIcon;
			chosemenuname = "���ġ�� �����";
		} else if (chosemenu.equals("726")) {
			chosemenuImageIcon = sdoublechococookieIcon;
			chosemenuname = "�������� ����� ������Ű";
		} else if (chosemenu.equals("727")) {
			chosemenuImageIcon = scranberrycookieIcon;
			chosemenuname = "ũ������ ����Ĩ ������Ű";
		} else if (chosemenu.equals("728")) {
			chosemenuImageIcon = swhitechococookieIcon;
			chosemenuname = "ȭ��Ʈ���� ���� ������Ű";
		} else if (chosemenu.equals("731")) {
			chosemenuImageIcon = sstrawberrypieIcon;
			chosemenuname = "���⿡ ���� ����";
		} else if (chosemenu.equals("732")) {
			chosemenuImageIcon = schocopieIcon;
			chosemenuname = "���ڿ� ���� ����";
		} else if (chosemenu.equals("733")) {
			chosemenuImageIcon = sminicustardIcon;
			chosemenuname = "�̴� �ؾ(Ŀ��Ÿ��)";
		} else if (chosemenu.equals("734")) {
			chosemenuImageIcon = sminiredbeanIcon;
			chosemenuname = "�̴� �ؾ(����)";
		} else if (chosemenu.equals("735")) {
			chosemenuImageIcon = sstrawberrymacaroonIcon;
			chosemenuname = "������ ��ī��";
		} else if (chosemenu.equals("736")) {
			chosemenuImageIcon = smatchamacaroonIcon;
			chosemenuname = "�������� ��ī��";
		} else if (chosemenu.equals("737")) {
			chosemenuImageIcon = scocomacaroonIcon;
			chosemenuname = "�������� ��ī��";
		} else if (chosemenu.equals("738")) {
			chosemenuImageIcon = scookiemacaroonIcon;
			chosemenuname = "��Űũ�� ��ī��";
		} 
	}
}
