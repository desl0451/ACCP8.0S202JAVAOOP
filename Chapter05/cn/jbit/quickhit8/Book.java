package cn.jbit.quickhit8;

public class Book {
	/**
	 * 图书编号
	 */
	private String bookId;
	/**
	 * 图书名称
	 */
	private String bookName;
	/**
	 * 图书单价
	 */
	private double price;
	/**
	 * 库存数量
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
