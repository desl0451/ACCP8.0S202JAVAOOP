package cn.jbit.quickhit8;

public class OrderItem {
	/**
	 * ͼ������
	 */
	private String bookName;
	/**
	 * ͼ�鵥��
	 */
	private double price;
	/**
	 * ��������
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
