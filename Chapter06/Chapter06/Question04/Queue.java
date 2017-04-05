package Chapter06.Question04;

import java.util.LinkedList;

public class Queue {
	private LinkedList list = new LinkedList();

	public void add(Object obj) {
		list.addFirst(obj);
	}

	public Object get() {
		return list.removeLast();
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		int len = queue.list.size();
		for (int i = 0; i < len; i++) {
			System.out.println(queue.get());
		}
	}
}
