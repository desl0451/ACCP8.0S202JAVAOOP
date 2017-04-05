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
			// д����Ϣ
			bw.write("��Һ�!");
			bw.write("������ѧϰBufferedWriter��");
			bw.newLine();
			bw.write("����ָ��!");
			bw.newLine();// ���뻻�з�
			bw.flush();// ˢ�»�����
			bw.close();// �ر���
			// ��ȡ�ļ�����
			fr = new FileReader("D:\\hello.txt");
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("�ļ�������!");
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
