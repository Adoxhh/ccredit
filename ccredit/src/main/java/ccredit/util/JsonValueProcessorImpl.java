package ccredit.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

 
/**
 * Json-Lib日期格式系列化辅助格式化工具<br>
 * 
 * @author XiongChun
 * @since 2009-07-06
 * @see net.sf.json.processors.JsonValueProcessor
 */
public class JsonValueProcessorImpl implements JsonValueProcessor {

	/**
	 * 默认的格式
	 */
	private String format = "yyyy-MM-dd HH:mm:ss";

	public JsonValueProcessorImpl() {
	};

	public JsonValueProcessorImpl(String format) {
		this.format = format;
	}

	/**
	 * 格式化数组
	 */
	public Object processArrayValue(Object value, JsonConfig jsonConfig) {
		String[] obj = {};
		if (value instanceof java.util.Date[]) {
			SimpleDateFormat sf = new SimpleDateFormat(format);
			java.util.Date[] dates = (java.util.Date[]) value;
			obj = new String[dates.length];
			for (int i = 0; i < dates.length; i++) {
				obj[i] = sf.format(dates[i]);
			}
		}
		if (value instanceof Timestamp[]) {
			SimpleDateFormat sf = new SimpleDateFormat(format);
			Timestamp[] dates = (Timestamp[]) value;
			obj = new String[dates.length];
			for (int i = 0; i < dates.length; i++) {
				obj[i] = sf.format(dates[i]);
			}
		}
		if (value instanceof java.sql.Date[]) {
			SimpleDateFormat sf = new SimpleDateFormat(format);
			java.sql.Date[] dates = (java.sql.Date[]) value;
			obj = new String[dates.length];
			for (int i = 0; i < dates.length; i++) {
				obj[i] = sf.format(dates[i]);
			}
		}
		return obj;
	}

	/**
	 * 格式化单一对象
	 */
	public Object processObjectValue(String key, Object value,
			JsonConfig jsonConfig) {
		if(isEmpty(value))
			return "";
		if (value instanceof Timestamp) {
			String str = new SimpleDateFormat(format).format((Timestamp) value);
			return str;
		} else if (value instanceof java.util.Date) {
			String str = new SimpleDateFormat(format).format((java.util.Date) value);
			return str;
		} else if (value instanceof java.sql.Date) {
			String str = new SimpleDateFormat(format).format((java.sql.Date) value);
			return str;
		}
		return value.toString();
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * 判断对象是否Empty(null或元素为0)<br>
	 * 实用于对如下对象做判断:String Collection及其子类 Map及其子类
	 * 
	 * @param pObj
	 *            待检查对象
	 * @return boolean 返回的布尔值
	 */
	public static boolean isEmpty(Object pObj) {
		if (pObj == null)
			return true;
		if (pObj == "")
			return true;
		if (pObj instanceof String) {
			if (((String) pObj).length() == 0) {
				return true;
			}
		} else if (pObj instanceof Collection) {
			if (((Collection) pObj).size() == 0) {
				return true;
			}
		} else if (pObj instanceof Map) {
			if (((Map) pObj).size() == 0) {
				return true;
			}
		}
		return false;
	}

}
