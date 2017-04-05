package Chapter07.exercise03;

public class ClimbThread extends Thread {
	private int time;// 爬100米的时间
	public int num = 0;// 爬多少个100米

	public ClimbThread(String name, int time, int kilometer) {
		super(name);
		this.time = time;
		this.num = kilometer * 1000 / 100;// 将千米数转换为多少个100米
	}

	@Override
	public void run() {
		while (num > 0) {
			try {
				Thread.sleep(this.time);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "爬完100米");
			num--;
		}
		System.out.println(Thread.currentThread().getName() + "到达终点!");
	}

}
