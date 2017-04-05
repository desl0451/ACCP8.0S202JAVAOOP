package Chapter04.Simple17;

public class Test {
	public static void main(String[] args) {
		// 1.定义打印机
		InkBox inkBox = null;// 墨盒
		Paper paper = null; // 纸张
		Printer printer = new Printer();// 打印机

		// 2.使用黑白墨盒在A4纸上打印
		inkBox = new GrayInkBox();// 创建黑白墨盒
		paper = new A4Paper();// 创建A4纸张
		
		printer.setInkBox(inkBox);//打印机设置为黑白墨盒
		printer.setPaper(paper);//打印机设置为A4纸张
		
		printer.print();//使用打印机开始打印
		
		
		//3.使用彩色墨盒在B5纸上打印
		inkBox=new ColorInkBox();//创建彩色墨盒　
		paper=new B5Paper();//创建B5张纸
		
		printer.setInkBox(inkBox);//打印机设置为彩色墨盒
		printer.setPaper(paper);//打印机设置为B5纸张
		
		printer.print();//使用打印机开始打印
		
		//4.使用彩色墨盒在A4纸上打印
		//inkBox=new ColorInkBox();//创建彩色墨盒　
		paper=new A4Paper();//创建A4纸张
		
		printer.setPaper(paper);
		printer.print();
	}
}
