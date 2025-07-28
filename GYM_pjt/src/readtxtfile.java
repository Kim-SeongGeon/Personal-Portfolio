import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class readtxtfile {

	public static void readMembershipNumberFromFile() throws Exception {
		File file = new File("D:\\JAVA Programming\\GYM_pjt\\회원정보.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st = "";
		
		while((st = br.readLine()) != null) {
			writetxtfile.list.add(st);
			System.out.println(st);
		}
		
		br.close();
	}
}
