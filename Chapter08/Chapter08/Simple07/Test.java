package Chapter08.Simple07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {

	public static void main(String[] args) {
		Writer fw = null;
		try {
			// ����һ��FileWriter����
			fw = new FileWriter("d:\\hello.txt");
			// д����Ϣ
			fw.write("�Ұ����й�");
			fw.flush();
		} catch (IOException e) {
			System.out.println("�ļ�������!");
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
