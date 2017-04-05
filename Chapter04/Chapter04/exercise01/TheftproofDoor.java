package Chapter04.exercise01;

public class TheftproofDoor extends Door implements Lock, DoorBell {
	/**
	 * 拍照
	 */
	@Override
	public void takePictures() {
		// TODO Auto-generated method stub
		System.out.println("铃.....咔嚓.....照片存储");
	}

	/**
	 * 上锁
	 */
	@Override
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙,向左旋转钥匙三圈,锁上了，拔出钥匙.");
	}

	/**
	 * 开锁
	 */
	@Override
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙,向左旋转钥匙三圈,锁打开了,拔出钥匙");
	}

	/**
	 * 开
	 */
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("用力推门打开了.");
	}

	/**
	 * 关
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("轻劲拉门,门关上了.");
	}

}
