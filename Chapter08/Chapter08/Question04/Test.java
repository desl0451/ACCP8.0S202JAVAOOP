package Chapter08.Question04;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
	/**
	 * 编写一个Java程序读取Windows目录下的win.ini文件，并输出其内容
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
			System.out.println("文件内容:");
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
