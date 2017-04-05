package Chapter06.exercise04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<Integer, Penguin> pgnMap = new HashMap<Integer, Penguin>();
		// 1.创建4个狗狗对象
		Penguin ououPenguin = new Penguin(1, "欧欧", "Q仔");
		Penguin yayaPenguin = new Penguin(2, "亚亚", "Q妹");
		Penguin meimeiPenguin = new Penguin(3, "美美", "Q妹");
		Penguin feifeiPenguin = new Penguin(4, "菲菲", "Q妹");

		pgnMap.put(ououPenguin.getId(), ououPenguin);
		pgnMap.put(yayaPenguin.getId(), yayaPenguin);
		pgnMap.put(meimeiPenguin.getId(), meimeiPenguin);
		pgnMap.put(feifeiPenguin.getId(), feifeiPenguin);

		Set<Integer> keys = pgnMap.keySet();
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			int key = it.next();
			Penguin pgn = (Penguin) pgnMap.get(key);
			System.out.println(pgn.getName() + "\t" + pgn.getSex());
		}
		System.out.println("=======================================");
		for (int key : keys) {
			Penguin pgn = (Penguin) pgnMap.get(key);
			System.out.println(pgn.getName() + "\t" + pgn.getSex());
		}
	}
}
