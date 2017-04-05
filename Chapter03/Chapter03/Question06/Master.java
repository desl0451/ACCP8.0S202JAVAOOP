package Chapter03.Question06;

public class Master {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void serving(Friend friend) {
		System.out.println(this.getName() + "Åã" + friend.getName() + ":");
		if (friend instanceof Chinese) {
			Chinese chinese = (Chinese) friend;
			chinese.eat("ËÄ´¨²Ë");
			chinese.shadowboxing();
		} else if (friend instanceof American) {
			American american = (American) friend;
			american.eat("±ÈÈø");
			american.hitFootball();
		}
	}

	public Master(String name) {
		super();
		this.name = name;
	}
}
