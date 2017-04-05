package Chapter02.Question01;
class Base{
	public Base() {
		System.out.println("Base");
	}
}
class Child extends Base{
	public Child() {
		System.out.println("Child");
	}
}
public class Sample {
	public static void main(String[] args) {
		Child c=new Child();
	}
}
