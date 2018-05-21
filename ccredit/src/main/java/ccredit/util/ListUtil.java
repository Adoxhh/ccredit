package ccredit.util;

import java.util.List;

public class ListUtil {
	public static boolean isNotNull(List list){
		if(list!=null&&list.size()>0){
			return true;
		}
		return false;
	}
	public static boolean isNull(List list){
		if(list==null||list.size()<1){
			return true;
		}
		return false;
	}

}
