using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CSharpChapter4
{
    /// <summary>
    /// 墨盒接口
    /// </summary>
    public interface InkBox
    {
        /// <summary>
        /// 只读属性颜色
        /// </summary>
        string Color { get; }
    }
}
