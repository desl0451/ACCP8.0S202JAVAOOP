package Chapter08.exercise03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			File file = new File(Test.class.getResource("").getPath());
			fr = new FileReader(file + "\\pet.template");
			br = new BufferedReader(fr);
			String line = br.readLine();
			StringBuffer sb = new StringBuffer();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			System.out.println(sb.toString());
			String html = sb.toString();
			html = html.replace("{name}", "ŷŷ");
			html = html.replace("{type}", "����");
			html = html.replace("{master}", "С��");
			System.out.println(file+"\\dog.html");
			fw = new FileWriter("d:\\dog.html");
			bw = new BufferedWriter(fw);
			bw.write(html);
			bw.flush();
			System.out.println("д���ļ��ɹ�!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
