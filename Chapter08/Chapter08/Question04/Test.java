package Chapter08.Question04;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
	/**
	 * ��дһ��Java�����ȡWindowsĿ¼�µ�win.ini�ļ��������������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			StringBuffer sb = new StringBuffer();
			fr = new FileReader("C:\\Windows\\win.ini");
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append("\r\n");
				line = br.readLine();
			}
			System.out.println("�ļ�����:");
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
