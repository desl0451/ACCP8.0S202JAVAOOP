package Chapter08.Simple03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStremTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("d:\\hello.txt");
			int data;
			System.out.println("�ɶ�ȡ���ֽ���:" + fis.available());
			System.out.print("�ļ�����Ϊ:");
			while ((data = fis.read()) != -1) {
				System.out.print((char) data + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
