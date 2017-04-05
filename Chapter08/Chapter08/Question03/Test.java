package Chapter08.Question03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;
		File file = new File(Test.class.getResource("").getPath());
		StringBuffer sb = new StringBuffer();
		try {
			fr = new FileReader(file + "\\source.txt");
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append("\r\n");
				line = br.readLine();
			}
			fw = new FileWriter("d:\\target.txt");
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			System.out.println("文件写入成功!");
		} catch (Exception e) {
			System.out.println("文件操作异常!");
		} finally {
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (Exception e) {
				System.out.println("文件流关闭异常!");
			}

		}
	}
}
