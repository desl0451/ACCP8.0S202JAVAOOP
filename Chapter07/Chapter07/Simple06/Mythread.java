package Chapter07.Simple06;

public class Mythread implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("线程t在运行!");
			Thread.sleep(500);
			System.out.println("线程t在500毫秒休眠后重新运行!");
		} catch (Exception e) {
			System.out.println("线程被中断");
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Mythread());
		System.out.println("线程t为新建!");
		t.start();
		System.out.println("线程t为就绪!");
	}
}
