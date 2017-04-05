package Chapter07.Test;

public class Test {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		// start多个线程同时处于启动状态
//		t1.start();
//		t2.start();
		// run程序是按顺序执行
		 t1.run();
		 t2.run();
	}
}
