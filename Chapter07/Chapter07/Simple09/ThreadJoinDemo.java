package Chapter07.Simple09;

public class ThreadJoinDemo {
	public static void main(String[] args) {
		System.out.println("***********线程强制执行************");
		// 创建子线程并启动
		Thread temp = new Thread(new MyThread());
		temp.start();
		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				try {
					// 阻塞主线程,子线程强制执行
					temp.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "运行:" + i);
		}
	}
}
