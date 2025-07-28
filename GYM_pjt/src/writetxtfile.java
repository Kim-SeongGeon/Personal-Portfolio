import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class writetxtfile {

	static ArrayList<String> list = new ArrayList<>();

	public static void saveMembershipNumberToFile(String membershipNumber) {
		FileWriter fout = null;
		try {
			fout = new FileWriter("D:\\JAVA Programming\\GYM_pjt\\회원정보.txt");
			for (int i = 0; i < list.size(); ++i) {
				fout.write(list.get(i));
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
