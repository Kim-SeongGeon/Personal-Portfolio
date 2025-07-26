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
	// 선택된 sortnum, pagenum, menunum을 합친 String형 변수
	static String chosemenu = "";

	// 선택된 메뉴 이름, 가격, 옵션
	static String chosemenuname = "";
	static String chosemenuprice = "";
	static String chosemenuoption = "";
	static String chosemenuquantity = "1";

	// 선택한 메뉴의 옵션을 비교하기 위한 1차원 배열
	static String[] str;

	// 선택한 메뉴의 옵션을 비교하기 위한 boolean형 변수
	boolean compare = false;
	static int compareindex;
	static int increasequantity;

	// 선택한 옵션들
	String option = "옵션 : ";
	String sizeoption = "20oz";

	// 선택된 원두 구분 번호(기본적으로는 마일드 원두 선택)
	int beannum = 1;

	// 가격을 천원 단위로 ',' 넣기 위한 코드
	DecimalFormat formatter = new DecimalFormat("#,###");

	// 최종 가격, 사이즈 추가금, 원두변경금, 샷추가금
	static int finalprice;
	int sizeprice = 1000;
	int beanprice = 500;
	int shotprice = 500;

	// 사이즈 추가금, 원두변경금, 샷추가금 구분을 위한 boolean형 변수
	boolean size = false;
	boolean bean = false;
	boolean shot = false;

	// 주문을 담았는지 구분하기 위한 boolean형 변수
	static boolean order = false;

	public optionframe(ImageIcon icon, int sortnum, int pagenum, int menunum) {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // DISPOSE_ON_CLOSE는 이 프레임만 닫히게 함
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// mainframe에서 선택한 sortnum, pagenum, menunum 합치기
		chosemenu = Integer.toString(sortnum) + Integer.toString(pagenum) + Integer.toString(menunum);

		// 벤티 사이즈 이미지
		ImageIcon ventisizeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\ventisize.png");
		Image ventisizeImage = ventisizeIcon.getImage();
		Image sventisizeImage = ventisizeImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sventisizeIcon = new ImageIcon(sventisizeImage);

		// 벤티 사이즈 선택된 이미지
		ImageIcon tventisizeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tventisize.png");
		Image tventisizeImage = tventisizeIcon.getImage();
		Image stventisizeImage = tventisizeImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stventisizeIcon = new ImageIcon(stventisizeImage);

		// 더벤티 사이즈 이미지
		ImageIcon theventisizeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\theventisize.png");
		Image theventisizeImage = theventisizeIcon.getImage();
		Image stheventisizeImage = theventisizeImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stheventisizeIcon = new ImageIcon(stheventisizeImage);

		// 더벤티 사이즈 선택된 이미지
		ImageIcon ttheventisizeIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\ttheventisize.png");
		Image ttheventisizeImage = ttheventisizeIcon.getImage();
		Image sttheventisizeImage = ttheventisizeImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sttheventisizeIcon = new ImageIcon(sttheventisizeImage);

		// 마일드 원두 이미지
		ImageIcon mildbeanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\mildbean.png");
		Image mildbeanImage = mildbeanIcon.getImage();
		Image smildbeanImage = mildbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon smildbeanIcon = new ImageIcon(smildbeanImage);

		// 마일드 원두 선택된 이미지
		ImageIcon tmildbeanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tmildbean.png");
		Image tmildbeanImage = tmildbeanIcon.getImage();
		Image stmildbeanImage = tmildbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stmildbeanIcon = new ImageIcon(stmildbeanImage);

		// 다크 원두 이미지
		ImageIcon darkbeanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\darkbean.png");
		Image darkbeanImage = darkbeanIcon.getImage();
		Image sdarkbeanImage = darkbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sdarkbeanIcon = new ImageIcon(sdarkbeanImage);

		// 다크 원두 선택된 이미지
		ImageIcon tdarkbeanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tdarkbean.png");
		Image tdarkbeanImage = tdarkbeanIcon.getImage();
		Image stdarkbeanImage = tdarkbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stdarkbeanIcon = new ImageIcon(stdarkbeanImage);

		// 디카프 원두 이미지
		ImageIcon decafbeanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\decafbean.png");
		Image decafbeanImage = decafbeanIcon.getImage();
		Image sdecafbeanImage = decafbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sdecafbeanIcon = new ImageIcon(sdecafbeanImage);

		// 디카프 원두 선택된 이미지
		ImageIcon tdecafbeanIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tdecafbean.png");
		Image tdecafbeanImage = tdecafbeanIcon.getImage();
		Image stdecafbeanImage = tdecafbeanImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stdecafbeanIcon = new ImageIcon(stdecafbeanImage);

		// 기본(2샷) 이미지
		ImageIcon basicshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\basicshot.png");
		Image basicshotImage = basicshotIcon.getImage();
		Image sbasicshotImage = basicshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sbasicshotIcon = new ImageIcon(sbasicshotImage);

		// 기본(2샷) 선택된 이미지
		ImageIcon tbasicshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tbasicshot.png");
		Image tbasicshotImage = tbasicshotIcon.getImage();
		Image stbasicshotImage = tbasicshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stbasicshotIcon = new ImageIcon(stbasicshotImage);

		// 연하게(1샷) 이미지
		ImageIcon lessshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\lessshot.png");
		Image lessshotImage = lessshotIcon.getImage();
		Image slessshotImage = lessshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon slessshotIcon = new ImageIcon(slessshotImage);

		// 연하게(1샷) 선택된 이미지
		ImageIcon tlessshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tlessshot.png");
		Image tlessshotImage = tlessshotIcon.getImage();
		Image stlessshotImage = tlessshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stlessshotIcon = new ImageIcon(stlessshotImage);

		// 마일드원두샷추가(+2샷) 이미지
		ImageIcon mildshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\mildshot.png");
		Image mildshotImage = mildshotIcon.getImage();
		Image smildshotImage = mildshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon smildshotIcon = new ImageIcon(smildshotImage);

		// 마일드원두샷추가(+2샷) 선택된 이미지
		ImageIcon tmildshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tmildshot.png");
		Image tmildshotImage = tmildshotIcon.getImage();
		Image stmildshotImage = tmildshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stmildshotIcon = new ImageIcon(stmildshotImage);

		// 다크원두샷추가(+2샷) 이미지
		ImageIcon darkshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\darkshot.png");
		Image darkshotImage = darkshotIcon.getImage();
		Image sdarkshotImage = darkshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sdarkshotIcon = new ImageIcon(sdarkshotImage);

		// 다크원두샷추가(+2샷) 선택된 이미지
		ImageIcon tdarkshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tdarkshot.png");
		Image tdarkshotImage = tdarkshotIcon.getImage();
		Image stdarkshotImage = tdarkshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stdarkshotIcon = new ImageIcon(stdarkshotImage);

		// 디카프원두샷추가(+2샷) 이미지
		ImageIcon decafshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\decafshot.png");
		Image decafshotImage = decafshotIcon.getImage();
		Image sdecafshotImage = decafshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon sdecafshotIcon = new ImageIcon(sdecafshotImage);

		// 디카프원두샷추가(+2샷) 선택된 이미지
		ImageIcon tdecafshotIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\tdecafshot.png");
		Image tdecafshotImage = tdecafshotIcon.getImage();
		Image stdecafshotImage = tdecafshotImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon stdecafshotIcon = new ImageIcon(stdecafshotImage);

		// 취소 버튼 이미지
		ImageIcon cancelIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\cancel.png");
		Image cancelImage = cancelIcon.getImage();
		Image scancelImage = cancelImage.getScaledInstance(200, 45, Image.SCALE_SMOOTH);
		ImageIcon scancelIcon = new ImageIcon(scancelImage);

		// 주문 담기 버튼 이미지
		ImageIcon addorderIcon = new ImageIcon("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 옵션 항목\\addorder.png");
		Image addorderImage = addorderIcon.getImage();
		Image saddorderImage = addorderImage.getScaledInstance(200, 45, Image.SCALE_SMOOTH);
		ImageIcon saddorderIcon = new ImageIcon(saddorderImage);

		// 선택된 메뉴 구분을 위한 코드
		if (sortnum == 1 && pagenum == 1 && menunum == 1) {
			chosemenuname = "(아이스)아메리카노";
			chosemenuprice = "2000";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 2) {
			chosemenuname = "(아이스)믹스커피";
			chosemenuprice = "3000";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 3) {
			chosemenuname = "(아이스)바닐라딥라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 4) {
			chosemenuname = "(아이스)바닐라크림콜드브루";
			chosemenuprice = "4500";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 5) {
			chosemenuname = "(아이스)아이스크림라떼";
			chosemenuprice = "4400";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 6) {
			chosemenuname = "(아이스)오트카페라떼";
			chosemenuprice = "4300";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 7) {
			chosemenuname = "(아이스)카라멜마끼아또";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 1 && menunum == 8) {
			chosemenuname = "(아이스)카페라떼";
			chosemenuprice = "3500";
		}
		// ==================================================================
		else if (sortnum == 1 && pagenum == 2 && menunum == 1) {
			chosemenuname = "(아이스)카페모카";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 2) {
			chosemenuname = "(아이스)코코넛라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 3) {
			chosemenuname = "(아이스)콜드브루";
			chosemenuprice = "3800";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 4) {
			chosemenuname = "(아이스)콜드브루라떼";
			chosemenuprice = "4300";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 5) {
			chosemenuname = "(아이스)토피넛라떼";
			chosemenuprice = "4200";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 6) {
			chosemenuname = "(아이스)헤이즐넛딥라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 1 && pagenum == 2 && menunum == 7) {
			chosemenuname = "(아이스)헤이즐넛크림콜드브루";
			chosemenuprice = "4500";
		}
		// ==================================================================
		else if (sortnum == 2 && pagenum == 1 && menunum == 1) {
			chosemenuname = "(핫)아메리카노";
			chosemenuprice = "2000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 2) {
			chosemenuname = "(핫)믹스커피";
			chosemenuprice = "3000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 3) {
			chosemenuname = "(핫)바닐라딥라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 4) {
			chosemenuname = "(핫)연유라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 5) {
			chosemenuname = "(핫)오트카페라떼";
			chosemenuprice = "4300";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 6) {
			chosemenuname = "(핫)카라멜마끼아또";
			chosemenuprice = "4000";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 7) {
			chosemenuname = "(핫)카페라떼";
			chosemenuprice = "3500";
		} else if (sortnum == 2 && pagenum == 1 && menunum == 8) {
			chosemenuname = "(핫)카페모카";
			chosemenuprice = "4000";
		}
		// ==================================================================
		else if (sortnum == 2 && pagenum == 2 && menunum == 1) {
			chosemenuname = "(핫)코코넛라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 2 && pagenum == 2 && menunum == 2) {
			chosemenuname = "(핫)토피넛라떼";
			chosemenuprice = "4200";
		} else if (sortnum == 2 && pagenum == 2 && menunum == 3) {
			chosemenuname = "(핫)헤이즐넛딥라떼";
			chosemenuprice = "4000";
		}
		// ==================================================================
		else if (sortnum == 3 && pagenum == 1 && menunum == 1) {
			chosemenuname = "군고구마라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 2) {
			chosemenuname = "딸기라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 3) {
			chosemenuname = "로얄밀크티";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 4) {
			chosemenuname = "말차라떼";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 5) {
			chosemenuname = "말차아인슈페너";
			chosemenuprice = "4000";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 6) {
			chosemenuname = "멜팅초코";
			chosemenuprice = "4400";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 7) {
			chosemenuname = "미숫가루";
			chosemenuprice = "3500";
		} else if (sortnum == 3 && pagenum == 1 && menunum == 8) {
			chosemenuname = "미숫가루라떼";
			chosemenuprice = "3500";
		}
		// ==================================================================
		else if (sortnum == 3 && pagenum == 2 && menunum == 1) {
			chosemenuname = "초코라떼";
			chosemenuprice = "4000";
		}
		// ==================================================================
		else if (sortnum == 4 && pagenum == 1 && menunum == 1) {
			chosemenuname = "딸기쉐이크";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 2) {
			chosemenuname = "딸기요거트스무디";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 3) {
			chosemenuname = "말차프라페";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 4) {
			chosemenuname = "망고요거트스무디";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 5) {
			chosemenuname = "망고패션크러쉬";
			chosemenuprice = "4700";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 6) {
			chosemenuname = "민트초코칩프라페";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 7) {
			chosemenuname = "밀크쉐이크";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 1 && menunum == 8) {
			chosemenuname = "블루베리요거트스무디";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 4 && pagenum == 2 && menunum == 1) {
			chosemenuname = "에스프레소쉐이크";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 2) {
			chosemenuname = "유자배크러쉬";
			chosemenuprice = "4700";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 3) {
			chosemenuname = "자두피치크러쉬";
			chosemenuprice = "4700";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 4) {
			chosemenuname = "자바칩프라페";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 5) {
			chosemenuname = "초코쉐이크";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 6) {
			chosemenuname = "코코넛커피프라페";
			chosemenuprice = "5000";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 7) {
			chosemenuname = "코코초코프라페";
			chosemenuprice = "4400";
		} else if (sortnum == 4 && pagenum == 2 && menunum == 8) {
			chosemenuname = "쿠키앤크림프라페";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 4 && pagenum == 3 && menunum == 1) {
			chosemenuname = "포도베리크러쉬";
			chosemenuprice = "4700";
		} else if (sortnum == 4 && pagenum == 3 && menunum == 2) {
			chosemenuname = "플레인요거트스무디";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 5 && pagenum == 1 && menunum == 1) {
			chosemenuname = "레몬민트티";
			chosemenuprice = "4000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 2) {
			chosemenuname = "리치캐모마일";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 3) {
			chosemenuname = "복숭아아이스티";
			chosemenuprice = "3500";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 4) {
			chosemenuname = "애플히비스커스";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 5) {
			chosemenuname = "유자애플티";
			chosemenuprice = "4000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 6) {
			chosemenuname = "유자캐모마일티";
			chosemenuprice = "4000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 7) {
			chosemenuname = "자몽허니블랙티";
			chosemenuprice = "4000";
		} else if (sortnum == 5 && pagenum == 1 && menunum == 8) {
			chosemenuname = "청귤얼그레이";
			chosemenuprice = "3000";
		}
		// ==================================================================
		else if (sortnum == 5 && pagenum == 2 && menunum == 1) {
			chosemenuname = "타로버블티";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 2) {
			chosemenuname = "트리플민트";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 3) {
			chosemenuname = "허니레몬티";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 4) {
			chosemenuname = "허니유자티";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 5) {
			chosemenuname = "허니자몽티";
			chosemenuprice = "3000";
		} else if (sortnum == 5 && pagenum == 2 && menunum == 6) {
			chosemenuname = "흑설탕버블티";
			chosemenuprice = "3000";
		}
		// ==================================================================
		else if (sortnum == 6 && pagenum == 1 && menunum == 1) {
			chosemenuname = "레몬에이드";
			chosemenuprice = "4000";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 2) {
			chosemenuname = "망플단";
			chosemenuprice = "4300";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 3) {
			chosemenuname = "메론소다";
			chosemenuprice = "4400";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 4) {
			chosemenuname = "사딸비";
			chosemenuprice = "4300";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 5) {
			chosemenuname = "애플망고에이드";
			chosemenuprice = "4400";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 6) {
			chosemenuname = "오사당";
			chosemenuprice = "4300";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 7) {
			chosemenuname = "자몽에이드";
			chosemenuprice = "4400";
		} else if (sortnum == 6 && pagenum == 1 && menunum == 8) {
			chosemenuname = "체리콕";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 6 && pagenum == 2 && menunum == 1) {
			chosemenuname = "크림소다";
			chosemenuprice = "4400";
		} else if (sortnum == 6 && pagenum == 2 && menunum == 2) {
			chosemenuname = "포도에이드";
			chosemenuprice = "4400";
		}
		// ==================================================================
		else if (sortnum == 7 && pagenum == 1 && menunum == 1) {
			chosemenuname = "콜드브루 500ml";
			chosemenuprice = "12000";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 2) {
			chosemenuname = "디카페인 콜드브루 500ml";
			chosemenuprice = "12000";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 3) {
			chosemenuname = "갈릭 크룽지";
			chosemenuprice = "2000";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 4) {
			chosemenuname = "스윗 크룽지";
			chosemenuprice = "2000";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 5) {
			chosemenuname = "고메소금빵";
			chosemenuprice = "3500";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 6) {
			chosemenuname = "바질토마토 치킨 소금빵";
			chosemenuprice = "5300";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 7) {
			chosemenuname = "에멘탈 햄치즈 소금빵";
			chosemenuprice = "5300";
		} else if (sortnum == 7 && pagenum == 1 && menunum == 8) {
			chosemenuname = "닥터넛츠 피칸";
			chosemenuprice = "2500";
		}
		// ==================================================================
		else if (sortnum == 7 && pagenum == 2 && menunum == 1) {
			chosemenuname = "달콤 어니언 핫도그";
			chosemenuprice = "4800";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 2) {
			chosemenuname = "매콤 칠리 핫도그";
			chosemenuprice = "4800";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 3) {
			chosemenuname = "달콤촉촉 고구마빵";
			chosemenuprice = "4000";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 4) {
			chosemenuname = "포슬쫀득 감자빵";
			chosemenuprice = "4000";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 5) {
			chosemenuname = "당근치즈 브라우니";
			chosemenuprice = "5000";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 6) {
			chosemenuname = "더블초코 스모어 촉촉쿠키";
			chosemenuprice = "3500";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 7) {
			chosemenuname = "크랜베리 초코칩 촉촉쿠키";
			chosemenuprice = "3500";
		} else if (sortnum == 7 && pagenum == 2 && menunum == 8) {
			chosemenuname = "화이트초코 말차 촉촉쿠키";
			chosemenuprice = "3500";
		}
		// ==================================================================
		else if (sortnum == 7 && pagenum == 3 && menunum == 1) {
			chosemenuname = "딸기에 퐁당 파이";
			chosemenuprice = "4000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 2) {
			chosemenuname = "초코에 퐁당 파이";
			chosemenuprice = "4000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 3) {
			chosemenuname = "미니 붕어빵(커스타드)";
			chosemenuprice = "3300";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 4) {
			chosemenuname = "미니 붕어빵(통팥)";
			chosemenuprice = "3300";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 5) {
			chosemenuname = "딸기요거 벤카롱";
			chosemenuprice = "3000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 6) {
			chosemenuname = "말차초코 벤카롱";
			chosemenuprice = "3000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 7) {
			chosemenuname = "코코초코 벤카롱";
			chosemenuprice = "3000";
		} else if (sortnum == 7 && pagenum == 3 && menunum == 8) {
			chosemenuname = "쿠키크림 벤카롱";
			chosemenuprice = "3000";
		}

		// MADE BY. 김성건 텍스트 넣는 JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. 김성건");
		ksgJLabel.setBounds(390, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// 선택된 메뉴 이미지
		ImageIcon choseIcon = icon;
		Image choseImage = choseIcon.getImage();
		Image schoseImage = choseImage.getScaledInstance(70, 120, Image.SCALE_SMOOTH);
		ImageIcon schoseIcon = new ImageIcon(schoseImage);

		// 선택된 메뉴 이미지 넣는 JLabel
		JLabel chosemenuJLabel = new JLabel(schoseIcon);
		chosemenuJLabel.setBounds(15, 5, 70, 120);
		c.add(chosemenuJLabel);

		// 선택된 메뉴 이름 넣는 JLabel
		JLabel chosemenunameJLabel = new JLabel(chosemenuname);
		chosemenunameJLabel.setBounds(100, 35, 250, 50);
		chosemenunameJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenunameJLabel);

		// 선택된 메뉴 가격 넣는 JLabel
		JLabel chosemenupriceJLabel = new JLabel(formatter.format(Integer.parseInt(chosemenuprice)) + "원");
		chosemenupriceJLabel.setBounds(430, 35, 250, 50);
		chosemenupriceJLabel.setFont(new Font("Bauhaus", Font.BOLD, 16));
		c.add(chosemenupriceJLabel);

		finalprice = Integer.parseInt(chosemenuprice);
		// 선택한 옵션들 넣는 JLabel
		JLabel optionJLabel = new JLabel(option + sizeoption);

		if (sortnum != 7) {
			// 선택한 옵션들 넣는 JLabel
			optionJLabel.setBounds(15, 115, 250, 50);
			optionJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
			c.add(optionJLabel);

			if (sortnum == 1 || sortnum == 2) {
				optionJLabel.setText(option + sizeoption + "/마일드원두/기본(2샷)");
			}

			// 사이즈 선택 문구 넣는 JLabel
			JLabel selectsizeJLabel = new JLabel("사이즈선택(필수, 단일선택)");
			selectsizeJLabel.setBounds(30, 140, 250, 50);
			selectsizeJLabel.setForeground(Color.red);
			selectsizeJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
			c.add(selectsizeJLabel);

			// 벤티 사이즈 이미지 넣는 JLabel
			JLabel ventisizeJLabel = new JLabel(stventisizeIcon);
			ventisizeJLabel.setBounds(28, 175, 60, 60);
			c.add(ventisizeJLabel);

			// 더벤티 사이즈 이미지 넣는 JLabel
			JLabel theventisizeJLabel = new JLabel(stheventisizeIcon);
			theventisizeJLabel.setBounds(100, 175, 60, 60);
			c.add(theventisizeJLabel);

			// 벤티 사이즈 이미지 클릭했을 때 발생하는 Listener
			ventisizeJLabel.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					ventisizeJLabel.setIcon(stventisizeIcon);
					theventisizeJLabel.setIcon(stheventisizeIcon);
					sizeoption = "20oz";
					if (sortnum == 1 || sortnum == 2) {
						optionJLabel.setText(option + sizeoption + "/마일드원두/기본(2샷)");
					} else {
						optionJLabel.setText(option + sizeoption);
					}
					if (size == true) {
						finalprice -= sizeprice;
						chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
					}
					size = false;
				}
			});

			// 더벤티 사이즈 이미지 클릭했을 때 발생하는 Listener
			theventisizeJLabel.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					ventisizeJLabel.setIcon(sventisizeIcon);
					theventisizeJLabel.setIcon(sttheventisizeIcon);
					sizeoption = "32oz";
					if (sortnum == 1 || sortnum == 2) {
						optionJLabel.setText(option + sizeoption + "/마일드원두/기본(2샷)");
					} else {
						optionJLabel.setText(option + sizeoption);
					}
					if (size == false) {
						finalprice += sizeprice;
						chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
					}
					size = true;
				}
			});

			if (sortnum == 1 || sortnum == 2) {
				// 원두 선택 문구 넣는 JLabel
				JLabel selectbeanJLabel = new JLabel("원두 선택(필수, 단일선택)");
				selectbeanJLabel.setBounds(30, 220, 250, 50);
				selectbeanJLabel.setForeground(Color.red);
				selectbeanJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
				c.add(selectbeanJLabel);

				// 마일드 원두 이미지 넣는 JLabel
				JLabel mildbeanJLabel = new JLabel(stmildbeanIcon);
				mildbeanJLabel.setBounds(28, 255, 60, 60);
				c.add(mildbeanJLabel);

				// 다크 원두 이미지 넣는 JLabel
				JLabel darkbeanJLabel = new JLabel(sdarkbeanIcon);
				darkbeanJLabel.setBounds(100, 255, 60, 60);
				c.add(darkbeanJLabel);

				// 디카프 원두 이미지 넣는 JLabel
				JLabel decafbeanJLabel = new JLabel(sdecafbeanIcon);
				decafbeanJLabel.setBounds(172, 255, 60, 60);
				c.add(decafbeanJLabel);

				// 샷 선택 문구 넣는 JLabel
				JLabel selectshotJLabel = new JLabel("샷선택(필수, 단일선택)");
				selectshotJLabel.setBounds(30, 300, 250, 50);
				selectshotJLabel.setForeground(Color.red);
				selectshotJLabel.setFont(new Font("Bauhaus", Font.BOLD, 12));
				c.add(selectshotJLabel);

				// 기본(2샷) 이미지 넣는 JLabel
				JLabel basicshotJLabel = new JLabel(stbasicshotIcon);
				basicshotJLabel.setBounds(28, 335, 60, 60);
				c.add(basicshotJLabel);

				// 연하게(1샷) 이미지 넣는 JLabel
				JLabel lessshotJLabel = new JLabel(slessshotIcon);
				lessshotJLabel.setBounds(100, 335, 60, 60);
				c.add(lessshotJLabel);

				// 샷추가(+2샷) 이미지 넣는 JLabel
				JLabel addshotJLabel = new JLabel(smildshotIcon);
				addshotJLabel.setBounds(172, 335, 60, 60);
				c.add(addshotJLabel);

				// 마일드 원두 이미지 클릭했을 떄 발생하는 Listener
				mildbeanJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						mildbeanJLabel.setIcon(stmildbeanIcon);
						darkbeanJLabel.setIcon(sdarkbeanIcon);
						decafbeanJLabel.setIcon(sdecafbeanIcon);
						basicshotJLabel.setIcon(stbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						addshotJLabel.setIcon(smildshotIcon);
						optionJLabel.setText(option + sizeoption + "/마일드원두/기본(2샷)");
						beannum = 1;
						if (bean == true) {
							finalprice -= beanprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
						}
						if (shot == true) {
							finalprice -= shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
						}
						shot = false;
						bean = false;
					}
				});

				// 다크 원두 이미지 클릭했을 떄 발생하는 Listener
				darkbeanJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						mildbeanJLabel.setIcon(smildbeanIcon);
						darkbeanJLabel.setIcon(stdarkbeanIcon);
						decafbeanJLabel.setIcon(sdecafbeanIcon);
						basicshotJLabel.setIcon(stbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						addshotJLabel.setIcon(sdarkshotIcon);
						optionJLabel.setText(option + sizeoption + "/다크원두/기본(2샷)");
						beannum = 2;
						if (bean == true) {
							finalprice -= beanprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
						}
						if (shot == true) {
							finalprice -= shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
						}
						shot = false;
						bean = false;
					}
				});

				// 디카프 원두 이미지 클릭했을 떄 발생하는 Listener
				decafbeanJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						mildbeanJLabel.setIcon(smildbeanIcon);
						darkbeanJLabel.setIcon(sdarkbeanIcon);
						decafbeanJLabel.setIcon(stdecafbeanIcon);
						basicshotJLabel.setIcon(stbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						addshotJLabel.setIcon(sdecafshotIcon);
						optionJLabel.setText(option + sizeoption + "/디카페인원두/기본(2샷)");
						beannum = 3;
						if (bean == false) {
							finalprice += beanprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
						}
						bean = true;
					}
				});

				// 기본(2샷) 이미지 클릭했을 때 발생하는 Listener
				basicshotJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						basicshotJLabel.setIcon(stbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						if (beannum == 1) {
							addshotJLabel.setIcon(smildshotIcon);
							optionJLabel.setText(option + sizeoption + "/마일드원두/기본(2샷)");
						} else if (beannum == 2) {
							addshotJLabel.setIcon(sdarkshotIcon);
							optionJLabel.setText(option + sizeoption + "/다크원두/기본(2샷)");
						} else if (beannum == 3) {
							addshotJLabel.setIcon(sdecafshotIcon);
							optionJLabel.setText(option + sizeoption + "/디카페인원두/기본(2샷)");
						}
						if (shot == true) {
							finalprice -= shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
						}
						shot = false;
					}
				});

				// 연하게(1샷) 이미지 클릭했을 때 발생하는 Listener
				lessshotJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						basicshotJLabel.setIcon(sbasicshotIcon);
						lessshotJLabel.setIcon(stlessshotIcon);
						if (beannum == 1) {
							addshotJLabel.setIcon(smildshotIcon);
							optionJLabel.setText(option + sizeoption + "/마일드원두/연하게(1샷)");
						} else if (beannum == 2) {
							addshotJLabel.setIcon(sdarkshotIcon);
							optionJLabel.setText(option + sizeoption + "/다크원두/연하게(1샷)");
						} else if (beannum == 3) {
							addshotJLabel.setIcon(sdecafshotIcon);
							optionJLabel.setText(option + sizeoption + "/디카페인원두/연하게(1샷)");
						}
						if (shot == true) {
							finalprice -= shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
						}
						shot = false;
					}
				});

				// 샷추가(+2샷) 이미지 클릭했을 때 발생하는 Listener
				addshotJLabel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						basicshotJLabel.setIcon(sbasicshotIcon);
						lessshotJLabel.setIcon(slessshotIcon);
						if (beannum == 1) {
							addshotJLabel.setIcon(stmildshotIcon);
							optionJLabel.setText(option + sizeoption + "/마일드원두/샷추가(+2샷)");
						} else if (beannum == 2) {
							addshotJLabel.setIcon(stdarkshotIcon);
							optionJLabel.setText(option + sizeoption + "/다크원두/샷추가(+2샷)");
						} else if (beannum == 3) {
							addshotJLabel.setIcon(stdecafshotIcon);
							optionJLabel.setText(option + sizeoption + "/디카페인원두/샷추가(+2샷)");
						}
						if (shot == false) {
							finalprice += shotprice;
							chosemenupriceJLabel.setText(formatter.format(finalprice) + "원");
						}
						shot = true;
					}
				});
			}
		} else {
			optionJLabel.setText("");
		}

		// 옵션 선택 화면 닫는 JLabel
		JLabel cancelJLabel = new JLabel(scancelIcon);
		cancelJLabel.setBounds(45, 550, 200, 45);
		c.add(cancelJLabel);
		cancelJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				order = false;
				dispose();
			}
		});

		// 옵션 선택 후 주문목록에 넣는 JLabel
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
