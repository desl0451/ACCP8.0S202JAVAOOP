package Chapter04.Simple14;

/**
 * ��ӡ����
 */
public class Printer {
	InkBox inkBox;// ī��
	Paper paper;// ֽ��

	/**
	 * ���ô�ӡ��ī��
	 * 
	 * @param inkBox
	 *            ��ӡʹ�õ�Χī��
	 */
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}

	/**
	 * ���ô�ӡ��ֽ��
	 * 
	 * @param paper
	 *            ��ӡʹ�õ�ֽ��
	 */
	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	/**
	 * ʹ��ī����ֽ���ϴ�ӡ
	 */
	public void print() {
		System.out.println("ʹ��" + inkBox.getColor() + "ī����" + paper.getSize()
				+ "ֽ���ϴ�ӡ��");
	}
}
