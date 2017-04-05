package Chapter06.exercise03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Chapter06.Simple02.Dog;
import Chapter06.exercise01.Penguin;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map pgnMap = new HashMap();
		// 1.创建4个狗狗对象
		Penguin ououPenguin = new Penguin("欧欧", "Q仔");
		Penguin yayaPenguin = new Penguin("亚亚", "Q妹");
		Penguin meimeiPenguin = new Penguin("美美", "Q妹");
		Penguin feifeiPenguin = new Penguin("菲菲", "Q妹");

		pgnMap.put(ououPenguin.getName(), ououPenguin);
		pgnMap.put(yayaPenguin.getName(), yayaPenguin);
		pgnMap.put(meimeiPenguin.getName(), meimeiPenguin);
		pgnMap.put(feifeiPenguin.getName(), feifeiPenguin);

		Set keys = pgnMap.keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Penguin pgn = (Penguin) pgnMap.get(key);
			System.out.println(pgn.getName() + "\t" + pgn.getSex());
		}
	}

}
