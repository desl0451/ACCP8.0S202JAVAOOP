package Chapter03.Question06;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "牛犇";// input.next();
		Master master = new Master(name);
		Chinese chinese = new Chinese("中国", "王小强");
		American america = new American("美国", "约翰");
		master.serving(chinese);
		master.serving(america);

	}

}
