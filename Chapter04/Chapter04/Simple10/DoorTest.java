package Chapter04.Simple10;

public class DoorTest {
	public static void main(String[] args) {
		TheftproofDoor tfd = new TheftproofDoor();
		tfd.close();// 关门
		tfd.lockUp();// 上锁
		tfd.openLock();// 开锁
		tfd.open();// 开门
	}
}
