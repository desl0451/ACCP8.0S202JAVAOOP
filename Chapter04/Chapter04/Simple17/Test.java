package Chapter04.Simple17;

public class Test {
	public static void main(String[] args) {
		// 1.�����ӡ��
		InkBox inkBox = null;// ī��
		Paper paper = null; // ֽ��
		Printer printer = new Printer();// ��ӡ��

		// 2.ʹ�úڰ�ī����A4ֽ�ϴ�ӡ
		inkBox = new GrayInkBox();// �����ڰ�ī��
		paper = new A4Paper();// ����A4ֽ��
		
		printer.setInkBox(inkBox);//��ӡ������Ϊ�ڰ�ī��
		printer.setPaper(paper);//��ӡ������ΪA4ֽ��
		
		printer.print();//ʹ�ô�ӡ����ʼ��ӡ
		
		
		//3.ʹ�ò�ɫī����B5ֽ�ϴ�ӡ
		inkBox=new ColorInkBox();//������ɫī�С�
		paper=new B5Paper();//����B5��ֽ
		
		printer.setInkBox(inkBox);//��ӡ������Ϊ��ɫī��
		printer.setPaper(paper);//��ӡ������ΪB5ֽ��
		
		printer.print();//ʹ�ô�ӡ����ʼ��ӡ
		
		//4.ʹ�ò�ɫī����A4ֽ�ϴ�ӡ
		//inkBox=new ColorInkBox();//������ɫī�С�
		paper=new A4Paper();//����A4ֽ��
		
		printer.setPaper(paper);
		printer.print();
	}
}
