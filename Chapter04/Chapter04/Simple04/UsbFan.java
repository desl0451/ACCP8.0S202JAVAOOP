package Chapter04.Simple04;

public class UsbFan implements UsbInterface {

	@Override
	public void service() {
		System.out.println("连接USB接口,获得电流,风扇开始转动。");
	}
}
