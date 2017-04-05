package Chapter08.Simple08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fw = new FileWriter("D:\\hello.txt");
			bw = new BufferedWriter(fw);
			// 写入信息
			bw.write("大家好!");
			bw.write("我正在学习BufferedWriter。");
			bw.newLine();
			bw.write("请多多指教!");
			bw.newLine();// 插入换行符
			bw.flush();// 刷新缓冲区
			bw.close();// 关闭流
			// 读取文件内容
			fr = new FileReader("D:\\hello.txt");
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("文件不存在!");
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
