package Chapter08.Simple06;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test6 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// ����һ��FileReader����
			fr = new FileReader("d:\\hello.txt");
			// ����һ��BufferedReader����
			br = new BufferedReader(fr);
			// ��ȡһ������
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
