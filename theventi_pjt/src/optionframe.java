import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class optionframe extends JFrame {
	// ���õ� sortnum, pagenum, menunum�� ��ģ String�� ����
	static String chosemenu = "";

	// ���õ� �޴� �̸�, ����, �ɼ�
	static String chosemenuname = "";
	static String chosemenuprice = "";
	static String chosemenuoption = "";
	static String chosemenuquantity = "1";

	// ������ �޴��� �ɼ��� ���ϱ� ���� 1���� �迭
	static String[] str;

	// ������ �޴��� �ɼ��� ���ϱ� ���� boolean�� ����
	boolean compare = false;
	static int compareindex;
	static int increasequantity;

	// ������ �ɼǵ�
	String option = "�ɼ� : ";
	String sizeoption = "20oz";

	// ���õ� ���� ���� ��ȣ(�⺻�����δ� ���ϵ� ���� ����)
	int beannum = 1;

	// ������ õ�� ������ ',' �ֱ� ���� �ڵ�
	DecimalFormat formatter = new DecimalFormat("#,###");

	// ���� ����, ������ �߰���, ���κ����, ���߰���
	static int finalprice;
	int sizeprice = 1000;
	int beanprice = 500;
	int shotprice = 500;

	// ������ �߰���, ���κ����, ���߰��� ������ ���� boolean�� ����
	boolean size = false;
	boolean bean = false;
	boolean shot = false;

	// �ֹ��� ��Ҵ��� �����ϱ� ���� boolean�� ����
	static boolean order = false;

	public optionframe(ImageIcon icon, int sortnum, int pagenum, int menunum) {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // DISPOSE_ON_CLOSE�� �� �����Ӹ� ������ ��
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// mainframe���� ������ sortnum, pagenum, menunum ��ġ��
		chosemenu = Integer.toString(sortnum) + Integer.toString(pagenum) + Integer.toString(menunum);

		// ��Ƽ ������ �̹���
		ImageIcon ventisizeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\ventisize.png");
		Image ventisizeImage = ventisizeIcon.getImage();
		Image sventisizeImage = ventisizeImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sventisizeIcon = new ImageIcon(sventisizeImage);

		// ��Ƽ ������ ���õ� �̹���
		ImageIcon tventisizeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tventisize.png");
		Image tventisizeImage = tventisizeIcon.getImage();
		Image stventisizeImage = tventisizeImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stventisizeIcon = new ImageIcon(stventisizeImage);

		// ����Ƽ ������ �̹���
		ImageIcon theventisizeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\theventisize.png");
		Image theventisizeImage = theventisizeIcon.getImage();
		Image stheventisizeImage = theventisizeImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stheventisizeIcon = new ImageIcon(stheventisizeImage);

		// ����Ƽ ������ ���õ� �̹���
		ImageIcon ttheventisizeIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\ttheventisize.png");
		Image ttheventisizeImage = ttheventisizeIcon.getImage();
		Image sttheventisizeImage = ttheventisizeImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sttheventisizeIcon = new ImageIcon(sttheventisizeImage);

		// ���ϵ� ���� �̹���
		ImageIcon mildbeanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\mildbean.png");
		Image mildbeanImage = mildbeanIcon.getImage();
		Image smildbeanImage = mildbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon smildbeanIcon = new ImageIcon(smildbeanImage);

		// ���ϵ� ���� ���õ� �̹���
		ImageIcon tmildbeanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tmildbean.png");
		Image tmildbeanImage = tmildbeanIcon.getImage();
		Image stmildbeanImage = tmildbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stmildbeanIcon = new ImageIcon(stmildbeanImage);

		// ��ũ ���� �̹���
		ImageIcon darkbeanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\darkbean.png");
		Image darkbeanImage = darkbeanIcon.getImage();
		Image sdarkbeanImage = darkbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sdarkbeanIcon = new ImageIcon(sdarkbeanImage);

		// ��ũ ���� ���õ� �̹���
		ImageIcon tdarkbeanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tdarkbean.png");
		Image tdarkbeanImage = tdarkbeanIcon.getImage();
		Image stdarkbeanImage = tdarkbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stdarkbeanIcon = new ImageIcon(stdarkbeanImage);

		// ��ī�� ���� �̹���
		ImageIcon decafbeanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\decafbean.png");
		Image decafbeanImage = decafbeanIcon.getImage();
		Image sdecafbeanImage = decafbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sdecafbeanIcon = new ImageIcon(sdecafbeanImage);

		// ��ī�� ���� ���õ� �̹���
		ImageIcon tdecafbeanIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tdecafbean.png");
		Image tdecafbeanImage = tdecafbeanIcon.getImage();
		Image stdecafbeanImage = tdecafbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stdecafbeanIcon = new ImageIcon(stdecafbeanImage);

		// �⺻(2��) �̹���
		ImageIcon basicshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\basicshot.png");
		Image basicshotImage = basicshotIcon.getImage();
		Image sbasicshotImage = basicshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sbasicshotIcon = new ImageIcon(sbasicshotImage);

		// �⺻(2��) ���õ� �̹���
		ImageIcon tbasicshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tbasicshot.png");
		Image tbasicshotImage = tbasicshotIcon.getImage();
		Image stbasicshotImage = tbasicshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stbasicshotIcon = new ImageIcon(stbasicshotImage);

		// ���ϰ�(1��) �̹���
		ImageIcon lessshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\lessshot.png");
		Image lessshotImage = lessshotIcon.getImage();
		Image slessshotImage = lessshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon slessshotIcon = new ImageIcon(slessshotImage);

		// ���ϰ�(1��) ���õ� �̹���
		ImageIcon tlessshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tlessshot.png");
		Image tlessshotImage = tlessshotIcon.getImage();
		Image stlessshotImage = tlessshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stlessshotIcon = new ImageIcon(stlessshotImage);

		// ���ϵ���μ��߰�(+2��) �̹���
		ImageIcon mildshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\mildshot.png");
		Image mildshotImage = mildshotIcon.getImage();
		Image smildshotImage = mildshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon smildshotIcon = new ImageIcon(smildshotImage);

		// ���ϵ���μ��߰�(+2��) ���õ� �̹���
		ImageIcon tmildshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tmildshot.png");
		Image tmildshotImage = tmildshotIcon.getImage();
		Image stmildshotImage = tmildshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stmildshotIcon = new ImageIcon(stmildshotImage);

		// ��ũ���μ��߰�(+2��) �̹���
		ImageIcon darkshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\darkshot.png");
		Image darkshotImage = darkshotIcon.getImage();
		Image sdarkshotImage = darkshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sdarkshotIcon = new ImageIcon(sdarkshotImage);

		// ��ũ���μ��߰�(+2��) ���õ� �̹���
		ImageIcon tdarkshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tdarkshot.png");
		Image tdarkshotImage = tdarkshotIcon.getImage();
		Image stdarkshotImage = tdarkshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stdarkshotIcon = new ImageIcon(stdarkshotImage);

		// ��ī�����μ��߰�(+2��) �̹���
		ImageIcon decafshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\decafshot.png");
		Image decafshotImage = decafshotIcon.getImage();
		Image sdecafshotImage = decafshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sdecafshotIcon = new ImageIcon(sdecafshotImage);

		// ��ī�����μ��߰�(+2��) ���õ� �̹���
		ImageIcon tdecafshotIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\tdecafshot.png");
		Image tdecafshotImage = tdecafshotIcon.getImage();
		Image stdecafshotImage = tdecafshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stdecafshotIcon = new ImageIcon(stdecafshotImage);

		// ��� ��ư �̹���
		ImageIcon cancelIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\cancel.png");
		Image cancelImage = cancelIcon.getImage();
		Image scancelImage = cancelImage.getScaledInstance(200, 45, Image.SCALE_SMOOTH);
		ImageIcon scancelIcon = new ImageIcon(scancelImage);

		// �ֹ� ��� ��ư �̹���
		ImageIcon addorderIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �ɼ� �׸�\\addorder.png");
		Image addorderImage = addorderIcon.getImage();
		Image saddorderImage = addorderImage.getScaledInstance(200, 45, Image.SCALE_SMOOTH);
		ImageIcon saddorderIcon = new ImageIcon(saddorderImage);

		// ���õ� �޴� ������ ���� �ڵ�
		if (sortnum == 1 && pagenum == 1 && menunum == 1) {
			chosemenuname = "(���̽�)�Ƹ޸�ī��";
			chosemenuprice = "2000";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 2) {
			chosemenuname = "(���̽�)�ͽ�Ŀ��";
			chosemenuprice = "3000";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 3) {
			chosemenuname = "(���̽�)�ٴҶ����";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 4) {
			chosemenuname = "(���̽�)�ٴҶ�ũ���ݵ���";
			chosemenuprice = "4500";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 5) {
			chosemenuname = "(���̽�)���̽�ũ����";
			chosemenuprice = "4400";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 6) {
			chosemenuname = "(���̽�)��Ʈī���";
			chosemenuprice = "4300";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 7) {
			chosemenuname = "(���̽�)ī��Ḷ���ƶ�";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 8) {
			chosemenuname = "(���̽�)ī���";
			chosemenuprice = "3500";
		}
		// ==================================================================
		else if (sortnum == 1 && pagenum == 2 && menunum == 1) {
			chosemenuname = "(���̽�)ī���ī";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 2) {
			chosemenuname = "(���̽�)���ڳӶ�";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 3) {
			chosemenuname = "(���̽�)�ݵ���";
			chosemenuprice = "3800";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 4) {
			chosemenuname = "(���̽�)�ݵ����";
			chosemenuprice = "4300";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 5) {
			chosemenuname = "(���̽�)���ǳӶ�";
			chosemenuprice = "4200";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 6) {
			chosemenuname = "(���̽�)������ӵ���";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 7) {
			chosemenuname = "(���̽�)�������ũ���ݵ���";
			chosemenuprice = "4500";
		}
		// ==================================================================
		else if (sortnum == 2 && pagenum == 1 && menunum == 1) {
			chosemenuname = "(��)�Ƹ޸�ī��";
			chosemenuprice = "2000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 2) {
			chosemenuname = "(��)�ͽ�Ŀ��";
			chosemenuprice = "3000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 3) {
			chosemenuname = "(��)�ٴҶ����";
			chosemenuprice = "4000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 4) {
			chosemenuname = "(��)������";
			chosemenuprice = "4000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 5) {
			chosemenuname = "(��)��Ʈī���";
			chosemenuprice = "4300";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 6) {
			chosemenuname = "(��)ī��Ḷ���ƶ�";
			chosemenuprice = "4000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 7) {
			chosemenuname = "(��)ī���";
			chosemenuprice = "3500";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 8) {
			chosemenuname = "(��)ī���ī";
			chosemenuprice = "4000";
		}
		// ==================================================================
		else if (sortnum == 2 && pagenum == 2 && menunum == 1) {
			chosemenuname = "(��)���ڳӶ�";
			chosemenuprice = "4000";
		} else if (sortnum == 2 && pagenum == 2 && menunum == 2) {
			chosemenuname = "(��)���ǳӶ�";
			chosemenuprice = "4200";
		} else if (sortnum == 2 && pagenum == 2 && menunum == 3) {
			chosemenuname = "(��)������ӵ���";
			chosemenuprice = "4000";
		}
		// ==================================================================
		else if (sortnum == 3 && pagenum == 1 && menunum == 1) {
			chosemenuname = "��������";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 2) {
			chosemenuname = "�����";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 3) {
			chosemenuname = "�ξ��ũƼ";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 4) {
			chosemenuname = "������";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 5) {
			chosemenuname = "�������ν����";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 6) {
			chosemenuname = "��������";
			chosemenuprice = "4400";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 7) {
			chosemenuname = "�̼�����";
			chosemenuprice = "3500";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 8) {
			chosemenuname = "�̼������";
			chosemenuprice = "3500";
		}
		// ==================================================================
		else if (sortnum == 3 && pagenum == 2 && menunum == 1) {
			chosemenuname = "���ڶ�";
			chosemenuprice = "4000";
		}
		// ==================================================================
		else if (sortnum == 4 && pagenum == 1 && menunum == 1) {
			chosemenuname = "���⽦��ũ";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 2) {
			chosemenuname = "������Ʈ������";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 3) {
			chosemenuname = "����������";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 4) {
			chosemenuname = "������Ʈ������";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 5) {
			chosemenuname = "�����м�ũ����";
			chosemenuprice = "4700";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 6) {
			chosemenuname = "��Ʈ����Ĩ������";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 7) {
			chosemenuname = "��ũ����ũ";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 8) {
			chosemenuname = "��纣�����Ʈ������";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 4 && pagenum == 2 && menunum == 1) {
			chosemenuname = "���������ҽ���ũ";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 2) {
			chosemenuname = "���ڹ�ũ����";
			chosemenuprice = "4700";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 3) {
			chosemenuname = "�ڵ���ġũ����";
			chosemenuprice = "4700";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 4) {
			chosemenuname = "�ڹ�Ĩ������";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 5) {
			chosemenuname = "���ڽ���ũ";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 6) {
			chosemenuname = "���ڳ�Ŀ��������";
			chosemenuprice = "5000";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 7) {
			chosemenuname = "��������������";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 8) {
			chosemenuname = "��Ű��ũ��������";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 4 && pagenum == 3 && menunum == 1) {
			chosemenuname = "��������ũ����";
			chosemenuprice = "4700";
		} else if (sortnum == 4 && pagenum == 3 && menunum == 2) {
			chosemenuname = "�÷��ο��Ʈ������";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 5 && pagenum == 1 && menunum == 1) {
			chosemenuname = "�����ƮƼ";
			chosemenuprice = "4000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 2) {
			chosemenuname = "��ġĳ����";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 3) {
			chosemenuname = "�����ƾ��̽�Ƽ";
			chosemenuprice = "3500";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 4) {
			chosemenuname = "��������Ŀ��";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 5) {
			chosemenuname = "���ھ���Ƽ";
			chosemenuprice = "4000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 6) {
			chosemenuname = "����ĳ����Ƽ";
			chosemenuprice = "4000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 7) {
			chosemenuname = "�ڸ���Ϻ�Ƽ";
			chosemenuprice = "4000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 8) {
			chosemenuname = "û�־�׷���";
			chosemenuprice = "3000";
		}
		// ==================================================================
		else if (sortnum == 5 && pagenum == 2 && menunum == 1) {
			chosemenuname = "Ÿ�ι���Ƽ";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 2) {
			chosemenuname = "Ʈ���ù�Ʈ";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 3) {
			chosemenuname = "��Ϸ���Ƽ";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 4) {
			chosemenuname = "�������Ƽ";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 5) {
			chosemenuname = "����ڸ�Ƽ";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 6) {
			chosemenuname = "�漳������Ƽ";
			chosemenuprice = "3000";
		}
		// ==================================================================
		else if (sortnum == 6 && pagenum == 1 && menunum == 1) {
			chosemenuname = "�����̵�";
			chosemenuprice = "4000";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 2) {
			chosemenuname = "���ô�";
			chosemenuprice = "4300";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 3) {
			chosemenuname = "�޷мҴ�";
			chosemenuprice = "4400";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 4) {
			chosemenuname = "�����";
			chosemenuprice = "4300";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 5) {
			chosemenuname = "���ø����̵�";
			chosemenuprice = "4400";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 6) {
			chosemenuname = "�����";
			chosemenuprice = "4300";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 7) {
			chosemenuname = "�ڸ����̵�";
			chosemenuprice = "4400";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 8) {
			chosemenuname = "ü����";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 6 && pagenum == 2 && menunum == 1) {
			chosemenuname = "ũ���Ҵ�";
			chosemenuprice = "4400";
		} else if (sortnum == 6 && pagenum == 2 && menunum == 2) {
			chosemenuname = "�������̵�";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 7 && pagenum == 1 && menunum == 1) {
			chosemenuname = "�ݵ��� 500ml";
			chosemenuprice = "12000";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 2) {
			chosemenuname = "��ī���� �ݵ��� 500ml";
			chosemenuprice = "12000";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 3) {
			chosemenuname = "���� ũ����";
			chosemenuprice = "2000";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 4) {
			chosemenuname = "���� ũ����";
			chosemenuprice = "2000";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 5) {
			chosemenuname = "��޼ұݻ�";
			chosemenuprice = "3500";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 6) {
			chosemenuname = "�����丶�� ġŲ �ұݻ�";
			chosemenuprice = "5300";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 7) {
			chosemenuname = "����Ż ��ġ�� �ұݻ�";
			chosemenuprice = "5300";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 8) {
			chosemenuname = "���ͳ��� ��ĭ";
			chosemenuprice = "2500";
		}
		// ==================================================================
		else if (sortnum == 7 && pagenum == 2 && menunum == 1) {
			chosemenuname = "���� ��Ͼ� �ֵ���";
			chosemenuprice = "4800";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 2) {
			chosemenuname = "���� ĥ�� �ֵ���";
			chosemenuprice = "4800";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 3) {
			chosemenuname = "�������� ������";
			chosemenuprice = "4000";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 4) {
			chosemenuname = "�����˵� ���ڻ�";
			chosemenuprice = "4000";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 5) {
			chosemenuname = "���ġ�� �����";
			chosemenuprice = "5000";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 6) {
			chosemenuname = "�������� ����� ������Ű";
			chosemenuprice = "3500";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 7) {
			chosemenuname = "ũ������ ����Ĩ ������Ű";
			chosemenuprice = "3500";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 8) {
			chosemenuname = "ȭ��Ʈ���� ���� ������Ű";
			chosemenuprice = "3500";
		}
		// ==================================================================
		else if (sortnum == 7 && pagenum == 3 && menunum == 1) {
			chosemenuname = "���⿡ ���� ����";
			chosemenuprice = "4000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 2) {
			chosemenuname = "���ڿ� ���� ����";
			chosemenuprice = "4000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 3) {
			chosemenuname = "�̴� �ؾ(Ŀ��Ÿ��)";
			chosemenuprice = "3300";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 4) {
			chosemenuname = "�̴� �ؾ(����)";
			chosemenuprice = "3300";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 5) {
			chosemenuname = "������ ��ī��";
			chosemenuprice = "3000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 6) {
			chosemenuname = "�������� ��ī��";
			chosemenuprice = "3000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 7) {
			chosemenuname = "�������� ��ī��";
			chosemenuprice = "3000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 8) {
			chosemenuname = "��Űũ�� ��ī��";
			chosemenuprice = "3000";
		}

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(390, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// ���õ� �޴� �̹���
		ImageIcon choseIcon = icon;
		Image choseImage = choseIcon.getImage();
		Image schoseImage = choseImage.getScaledInstance(70, 120, Image.SCALE_SMOOTH);
		ImageIcon schoseIcon = new ImageIcon(schoseImage);

		// ���õ� �޴� �̹��� �ִ� JLabel
		JLabel chosemenuJLabel = new JLabel(schoseIcon);
		chosemenuJLabel.setBounds(15, 5, 70, 120);
		c.add(chosemenuJLabel);

		// ���õ� �޴� �̸� �ִ� JLabel
		JLabel chosemenunameJLabel = new JLabel(chosemenuname);
		chosemenunameJLabel.setBounds(100, 35, 250, 50);
		chosemenunameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenunameJLabel);

		// ���õ� �޴� ���� �ִ� JLabel
		JLabel chosemenupriceJLabel = new JLabel(formatter.format(Integer.parseInt(chosemenuprice)) + "��");
		chosemenupriceJLabel.setBounds(430, 35, 250, 50);
		chosemenupriceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenupriceJLabel);

		finalprice = Integer.parseInt(chosemenuprice);
		// ������ �ɼǵ� �ִ� JLabel
		JLabel optionJLabel = new JLabel(option + sizeoption);

		if (sortnum != 7) {
			// ������ �ɼǵ� �ִ� JLabel
			optionJLabel.setBounds(15, 115, 250, 50);
			optionJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
			c.add(optionJLabel);

			if (sortnum == 1 || sortnum == 2) {
				optionJLabel.setText(option + sizeoption + "/���ϵ����/�⺻(2��)");
			}

			// ������ ���� ���� �ִ� JLabel
			JLabel selectsizeJLabel = new JLabel("�������(�ʼ�, ���ϼ���)");
			selectsizeJLabel.setBounds(30, 140, 250, 50);
			selectsizeJLabel.setForeground(Color.red);
			selectsizeJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
			c.add(selectsizeJLabel);

			// ��Ƽ ������ �̹��� �ִ� JLabel
			JLabel ventisizeJLabel = new JLabel(stventisizeIcon);
			ventisizeJLabel.setBounds(28, 175, 60, 60);
			c.add(ventisizeJLabel);

			// ����Ƽ ������ �̹��� �ִ� JLabel
			JLabel theventisizeJLabel = new JLabel(stheventisizeIcon);
			theventisizeJLabel.setBounds(100, 175, 60, 60);
			c.add(theventisizeJLabel);

			// ��Ƽ ������ �̹��� Ŭ������ �� �߻��ϴ� Listener
			ventisizeJLabel.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					ventisizeJLabel.setIcon(stventisizeIcon);
					theventisizeJLabel.setIcon(stheventisizeIcon);
					sizeoption = "20oz";
					if (sortnum == 1 || sortnum == 2) {
						optionJLabel.setText(option + sizeoption + "/���ϵ����/�⺻(2��)");
					} else {
						optionJLabel.setText(option + sizeoption);
					}
					if (size == true) {
						finalprice -= sizeprice;
						chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
					}
					size = false;
				}
			});

			// ����Ƽ ������ �̹��� Ŭ������ �� �߻��ϴ� Listener
			theventisizeJLabel.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					ventisizeJLabel.setIcon(sventisizeIcon);
					theventisizeJLabel.setIcon(sttheventisizeIcon);
					sizeoption = "32oz";
					if (sortnum == 1 || sortnum == 2) {
						optionJLabel.setText(option + sizeoption + "/���ϵ����/�⺻(2��)");
					} else {
						optionJLabel.setText(option + sizeoption);
					}
					if (size == false) {
						finalprice += sizeprice;
						chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
					}
					size = true;
				}
			});

			if (sortnum == 1 || sortnum == 2) {
				// ���� ���� ���� �ִ� JLabel
				JLabel selectbeanJLabel = new JLabel("���� ����(�ʼ�, ���ϼ���)");
				selectbeanJLabel.setBounds(30, 220, 250, 50);
				selectbeanJLabel.setForeground(Color.red);
				selectbeanJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
				c.add(selectbeanJLabel);

				// ���ϵ� ���� �̹��� �ִ� JLabel
				JLabel mildbeanJLabel = new JLabel(stmildbeanIcon);
				mildbeanJLabel.setBounds(28, 255, 60, 60);
				c.add(mildbeanJLabel);

				// ��ũ ���� �̹��� �ִ� JLabel
				JLabel darkbeanJLabel = new JLabel(sdarkbeanIcon);
				darkbeanJLabel.setBounds(100, 255, 60, 60);
				c.add(darkbeanJLabel);

				// ��ī�� ���� �̹��� �ִ� JLabel
				JLabel decafbeanJLabel = new JLabel(sdecafbeanIcon);
				decafbeanJLabel.setBounds(172, 255, 60, 60);
				c.add(decafbeanJLabel);

				// �� ���� ���� �ִ� JLabel
				JLabel selectshotJLabel = new JLabel("������(�ʼ�, ���ϼ���)");
				selectshotJLabel.setBounds(30, 300, 250, 50);
				selectshotJLabel.setForeground(Color.red);
				selectshotJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
				c.add(selectshotJLabel);

				// �⺻(2��) �̹��� �ִ� JLabel
				JLabel basicshotJLabel = new JLabel(stbasicshotIcon);
				basicshotJLabel.setBounds(28, 335, 60, 60);
				c.add(basicshotJLabel);

				// ���ϰ�(1��) �̹��� �ִ� JLabel
				JLabel lessshotJLabel = new JLabel(slessshotIcon);
				lessshotJLabel.setBounds(100, 335, 60, 60);
				c.add(lessshotJLabel);

				// ���߰�(+2��) �̹��� �ִ� JLabel
				JLabel addshotJLabel = new JLabel(smildshotIcon);
				addshotJLabel.setBounds(172, 335, 60, 60);
				c.add(addshotJLabel);

				// ���ϵ� ���� �̹��� Ŭ������ �� �߻��ϴ� Listener
				mildbeanJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						mildbeanJLabel.setIcon(stmildbeanIcon);
						darkbeanJLabel.setIcon(sdarkbeanIcon);
						decafbeanJLabel.setIcon(sdecafbeanIcon);
						basicshotJLabel.setIcon(stbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						addshotJLabel.setIcon(smildshotIcon);
						optionJLabel.setText(option + sizeoption + "/���ϵ����/�⺻(2��)");
						beannum = 1;
						if (bean == true) {
							finalprice -= beanprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
						}
						if (shot == true) {
							finalprice -= shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
						}
						shot = false;
						bean = false;
					}
				});

				// ��ũ ���� �̹��� Ŭ������ �� �߻��ϴ� Listener
				darkbeanJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						mildbeanJLabel.setIcon(smildbeanIcon);
						darkbeanJLabel.setIcon(stdarkbeanIcon);
						decafbeanJLabel.setIcon(sdecafbeanIcon);
						basicshotJLabel.setIcon(stbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						addshotJLabel.setIcon(sdarkshotIcon);
						optionJLabel.setText(option + sizeoption + "/��ũ����/�⺻(2��)");
						beannum = 2;
						if (bean == true) {
							finalprice -= beanprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
						}
						if (shot == true) {
							finalprice -= shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
						}
						shot = false;
						bean = false;
					}
				});

				// ��ī�� ���� �̹��� Ŭ������ �� �߻��ϴ� Listener
				decafbeanJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						mildbeanJLabel.setIcon(smildbeanIcon);
						darkbeanJLabel.setIcon(sdarkbeanIcon);
						decafbeanJLabel.setIcon(stdecafbeanIcon);
						basicshotJLabel.setIcon(stbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						addshotJLabel.setIcon(sdecafshotIcon);
						optionJLabel.setText(option + sizeoption + "/��ī���ο���/�⺻(2��)");
						beannum = 3;
						if (bean == false) {
							finalprice += beanprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
						}
						bean = true;
					}
				});

				// �⺻(2��) �̹��� Ŭ������ �� �߻��ϴ� Listener
				basicshotJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						basicshotJLabel.setIcon(stbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						if (beannum == 1) {
							addshotJLabel.setIcon(smildshotIcon);
							optionJLabel.setText(option + sizeoption + "/���ϵ����/�⺻(2��)");
						} else if (beannum == 2) {
							addshotJLabel.setIcon(sdarkshotIcon);
							optionJLabel.setText(option + sizeoption + "/��ũ����/�⺻(2��)");
						} else if (beannum == 3) {
							addshotJLabel.setIcon(sdecafshotIcon);
							optionJLabel.setText(option + sizeoption + "/��ī���ο���/�⺻(2��)");
						}
						if (shot == true) {
							finalprice -= shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
						}
						shot = false;
					}
				});

				// ���ϰ�(1��) �̹��� Ŭ������ �� �߻��ϴ� Listener
				lessshotJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						basicshotJLabel.setIcon(sbasicshotIcon);
						lessshotJLabel.setIcon(stlessshotIcon);
						if (beannum == 1) {
							addshotJLabel.setIcon(smildshotIcon);
							optionJLabel.setText(option + sizeoption + "/���ϵ����/���ϰ�(1��)");
						} else if (beannum == 2) {
							addshotJLabel.setIcon(sdarkshotIcon);
							optionJLabel.setText(option + sizeoption + "/��ũ����/���ϰ�(1��)");
						} else if (beannum == 3) {
							addshotJLabel.setIcon(sdecafshotIcon);
							optionJLabel.setText(option + sizeoption + "/��ī���ο���/���ϰ�(1��)");
						}
						if (shot == true) {
							finalprice -= shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
						}
						shot = false;
					}
				});

				// ���߰�(+2��) �̹��� Ŭ������ �� �߻��ϴ� Listener
				addshotJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						basicshotJLabel.setIcon(sbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						if (beannum == 1) {
							addshotJLabel.setIcon(stmildshotIcon);
							optionJLabel.setText(option + sizeoption + "/���ϵ����/���߰�(+2��)");
						} else if (beannum == 2) {
							addshotJLabel.setIcon(stdarkshotIcon);
							optionJLabel.setText(option + sizeoption + "/��ũ����/���߰�(+2��)");
						} else if (beannum == 3) {
							addshotJLabel.setIcon(stdecafshotIcon);
							optionJLabel.setText(option + sizeoption + "/��ī���ο���/���߰�(+2��)");
						}
						if (shot == false) {
							finalprice += shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "��");
						}
						shot = true;
					}
				});
			}
		} else {
			optionJLabel.setText("");
		}

		// �ɼ� ���� ȭ�� �ݴ� JLabel
		JLabel cancelJLabel = new JLabel(scancelIcon);
		cancelJLabel.setBounds(45, 550, 200, 45);
		c.add(cancelJLabel);
		cancelJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				order = false;
				dispose();
			}
		});

		// �ɼ� ���� �� �ֹ���Ͽ� �ִ� JLabel
		JLabel addorderJLabel = new JLabel(saddorderIcon);
		addorderJLabel.setBounds(255, 550, 200, 45);
		c.add(addorderJLabel);
		addorderJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				order = true;
				chosemenuoption = optionJLabel.getText();
				mainframe.basket++;
				mainframe.payment += finalprice;
				for (int i = 0; i < mainframe.Order.size(); ++i) {
					str = mainframe.Order.get(i).split(",");
					if (chosemenu.equals(str[0]) && chosemenuoption.equals(str[2])) {
						compare = true;
						compareindex = i;
					}
				}
				if (compare == false) {
					mainframe.Order.add(chosemenu + "," + chosemenuname + "," + chosemenuoption + "," + finalprice + ","
							+ chosemenuquantity);
				} else {
					str = mainframe.Order.get(compareindex).split(",");
					increasequantity = Integer.parseInt(str[4]);
					++increasequantity;
					mainframe.Order.set(compareindex, chosemenu + "," + chosemenuname + "," + chosemenuoption + ","
							+ finalprice + "," + Integer.toString(increasequantity));
				}
				dispose();
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				mainframe.optionFrameDisposed();
			}
		});

		setSize(520, 650);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
