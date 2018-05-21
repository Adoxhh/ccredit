package demo;

//import com.sun.tools.apt.Main;

public class Test {
	
	public static void main(String[] args) {
		String str="ä¸ªäººå€Ÿè´·åŸºç¡€ä¿¡æ�¯è¡¨";
		System.out.println(getEncoding(str));;
		
	}
	/** 
	 * 判断字符串的编码 
	 * 
	 * @param str 
	 * @return 
	 */  
	public static String getEncoding(String str) {  
	    String encode[] = new String[]{  
	            "UTF-8",  
	            "ISO-8859-1",  
	            "GB2312",  
	            "GBK",  
	            "GB18030",  
	            "Big5",  
	            "Unicode",  
	            "ASCII"  
	    };  
	    for (int i = 0; i < encode.length; i++){  
	        try {  
	            if (str.equals(new String(str.getBytes(encode[i]), encode[i]))) {  
	                return encode[i];  
	            }  
	        } catch (Exception ex) {  
	        }  
	    }  
	      
	    return "";  
	}  

}
