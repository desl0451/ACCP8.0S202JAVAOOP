using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CSharpChapter4
{
    class Program
    {
        static void Main(string[] args)
        {
            //1.定义打印机
            InkBox inkBox = null;
            Paper paper = null;
            Printer printer = new Printer();

            //2.使用黑白墨盒在A4纸上打印
            inkBox = new GrayInkBox();
            paper = new A4Paper();
            printer.InkBox = inkBox;
            printer.Paper = paper;

            printer.print();

            //3.使用彩色墨盒在B5纸上打印
            inkBox = new ColorInkBox();
            paper = new B5Paper();

            printer.InkBox = inkBox;
            printer.Paper = paper;

            printer.print();

            //4.使用彩色墨盒在A4纸上打印
            paper = new A4Paper();
            printer.Paper = paper;
            printer.print();



        }
    }
}
