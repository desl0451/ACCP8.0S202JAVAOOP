package Chapter04.Simple02;

public class UDisk implements UsbInterface {

	@Override
	public void service() {
		System.out.println("连接USB口,开始传输数据。");
	}

}
