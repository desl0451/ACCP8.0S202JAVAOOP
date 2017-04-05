using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CSharpChapter4
{
    class Printer
    {
        InkBox inkBox;//墨盒
        Paper paper;//纸张
        public InkBox InkBox { set { inkBox = value; } }

        public Paper Paper { set { paper = value; } }
        /// <summary>
        /// 打印
        /// </summary>
        public void print()
        {
            Console.WriteLine("使用" + inkBox.Color + "墨盒在" + paper.Size + "纸上打印");
        }
    }
}
