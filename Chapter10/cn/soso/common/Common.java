package cn.soso.common;

import java.text.DecimalFormat;

public class Common {
	/**
	 * 流量信息的格式化方法
	 * @param data
	 * @return
	 */
	public static String dataFormat(double data) {
		DecimalFormat formatData = new DecimalFormat("#.0");
		return formatData.format(data);
	}
}
