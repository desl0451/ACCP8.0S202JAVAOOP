package Chapter06.Question05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Student st1 = new Student("С��", 100);
		Student st2 = new Student("����", 99);
		Student st3 = new Student("κ����", 98);
		Student st4 = new Student("�źƲ�", 100);
		map.put(st1.getName(), st1);
		map.put(st2.getName(), st2);
		map.put(st3.getName(), st3);
		map.put(st4.getName(), st4);
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		System.out.println("=====ѧ������=====");
		while (it.hasNext()) {
			String key = it.next();
			Student st = map.get(key);
			System.out.println(st.getName() + "\t" + st.getScore());
		}
		System.out.println("==================");
		for (Student st : map.values()) {
			System.out.println(st.getName() + "\t" + st.getScore());
		}
	}
}
