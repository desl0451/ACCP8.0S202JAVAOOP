package cn.jbit.quickhit8;

public class Book {
	/**
	 * ͼ����
	 */
	private String bookId;
	/**
	 * ͼ������
	 */
	private String bookName;
	/**
	 * ͼ�鵥��
	 */
	private double price;
	/**
	 * �������
	 */
	private int storage;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
}
