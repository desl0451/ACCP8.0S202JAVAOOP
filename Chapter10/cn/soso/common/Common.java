package cn.soso.common;

import java.text.DecimalFormat;

public class Common {
	/**
	 * ������Ϣ�ĸ�ʽ������
	 * @param data
	 * @return
	 */
	public static String dataFormat(double data) {
		DecimalFormat formatData = new DecimalFormat("#.0");
		return formatData.format(data);
	}
}
