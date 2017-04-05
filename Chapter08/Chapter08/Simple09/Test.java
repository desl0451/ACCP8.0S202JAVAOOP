package Chapter08.Simple09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		DataOutputStream out = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		FileOutputStream outFile = null;
		try {
			File file = new File(Test.class.getResource("").getPath());
			System.out.println(file);
			// 创建输入流对象
			fis = new FileInputStream(file + "\\demo.jpg");
			dis = new DataInputStream(fis);
			// 创建输入流对象
			outFile = new FileOutputStream("d:\\temp.jpg");
			out = new DataOutputStream(outFile);
			int temp;
			while ((temp = dis.read()) != -1) {
				out.write(temp);
			}
			System.out.println("拷贝完成!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e) {

			}
		}
	}
}
