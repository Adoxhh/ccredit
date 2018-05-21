package ccredit.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import ccredit.xtmodules.xtcore.util.ReadJDBCProperties;
import ccredit.xtmodules.xtcore.util.db.DBMSMetaUtil;

/** 根据数据字典value 获取text */
public class DictionaryText {

	public static String get(String ckey, String value) {
		String text = null;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet ret = null;
		try {
			Properties pro = ReadJDBCProperties.readProperties();
			conn = DBMSMetaUtil.getConnection(pro.getProperty("master.url"), pro.getProperty("master.username"),pro.getProperty("master.password"));
			String sql = " SELECT XT_DATA_DICTIONARY_NAME FROM  XT_DATA_DICTIONARY WHERE XT_DATA_DICTIONARY_PID = (SELECT XT_DATA_DICTIONARY_ID FROM XT_DATA_DICTIONARY WHERE XT_DATA_DICTIONARY_VALUE = '"
					+ ckey + "') AND XT_DATA_DICTIONARY_VALUE = '" + value + "'";
			pst = conn.prepareStatement(sql);
			ret = pst.executeQuery();
			while (ret.next()) {
				text = ret.getString(1);
			}
			ret.close();
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ret != null) {
					ret.close();
					ret = null;
				}
				if (pst != null) {
					pst.close();
					pst = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return text;
	}
}
