package cn.jbit.quickhit8;

public class OrderItem {
	/**
	 * 图书名称
	 */
	private String bookName;
	/**
	 * 图书单价
	 */
	private double price;
	/**
	 * 购买数量
	 */
	private int num;

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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
