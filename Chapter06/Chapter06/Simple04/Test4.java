package Chapter06.Simple04;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class Test4 {
	private static Logger logger = Logger.getLogger(Test4.class.getName());

	public static void main(String[] args) {
		// 1.ʹ��HashMap �洢�������Ӣ�ļ�ƺ�����ȫ�Ƶ�"��-ֵ��"
		Map countries = new HashMap();
		countries.put("CN", "�л����񹲺͹�");
		countries.put("RU", "����˹����");
		countries.put("FR", "���������͹�");
		countries.put("US", "��������ڹ�");
		// 2.��ʾ"CN"��Ӧ���ҵ�����ȫ��
		String country = (String) countries.get("CN");
		System.out.println("CN��Ӧ�Ĺ�����:" + country);
		// 3.��ʾ������Ԫ�ظ���
		System.out.println("Map�й���" + countries.size() + "������");
		// 4.�����ж�Map���Ƿ����"FR"��
		System.out.println("Map�а���FR��Key��?" + countries.containsKey("FR"));
		countries.remove("FR");
		System.out.println("Map�а���FR��key��?" + countries.containsKey("FR"));

		// 5.�ֱ���ʾ������ֵ���ͼ�-ֵ�Լ�
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		System.out.println(countries);

		// 6.���HashMap���ж�
		countries.clear();
		if (countries.isEmpty()) {
			System.out.println("�����Map������!");
		}

	}
}
