package ccredit.util;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import ccredit.xtmodules.xtweb.XtDbController;
public class HtmlToPdf {
    /**
     * html转pdf
     * @param srcPath html路径，可以是硬盘上的路径，也可以是网络路径
     * @param destPath pdf保存路径
     * @return 转换成功返回true
     */
    public static boolean convert(String srcPath, String destPath){
    	//wkhtmltopdf在系统中的路径
    	String str="";
		try {
			str = URLDecoder.decode(XtDbController.class.getClassLoader().getResource("ccredit/util/pdfFile/wkhtmltopdf.exe").getFile(), "utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String path = new File(str).getPath();
        File file = new File(destPath);
        File parent = file.getParentFile();
        //如果pdf保存路径不存在，则创建路径
        if(!parent.exists()){
            parent.mkdirs();
        }
        StringBuilder cmd = new StringBuilder();
        cmd.append(path);
        cmd.append(" ");
        cmd.append(srcPath);
        cmd.append(" ");
        cmd.append(destPath);
        System.out.println(cmd.toString());
        boolean result = true;
        try{
        	//运行外部程序
            Process proc = Runtime.getRuntime().exec(cmd.toString());
            proc.waitFor();
        }catch(Exception e){
            result = false;
            e.printStackTrace();
        }
        
        return result;
    }
    /**
     * 将内容写入html文件
     */
    public static String writeHtmlToFile(String content,String htmlName) {
    	String path = "";
		try {
			path = URLDecoder.decode(XtDbController.class.getClassLoader().getResource("ccredit/util/pdfFile/").getFile(), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		content=content.replace("button", "hidden").replace("height: 430px;", "");
		File file = new File(path + htmlName+".html");
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"utf-8"));  
			bw.write("<!DOCTYPE html><html lang=\"en\">");
			bw.write(content);
			bw.write("</html>");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return file.getParent();
	}
    /**
     * 导出PDF
     */
    public static void exportPDF(String pName,String pPath ,HttpServletResponse response) {
    	try {
    		//Thread.sleep(1000);
    		response.setContentType("application/pdf");
    		response.addHeader("content-disposition", "attachment;filename="+ URLEncoder.encode(pName+".pdf", "UTF-8"));
    		File file = new File(pPath+"/"+pName+".pdf");
    		InputStream fis = new BufferedInputStream(new FileInputStream(file));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
    		OutputStream os = response.getOutputStream();
    		os.write(buffer);
    		os.flush();
    		os.close();
    	} catch (UnsupportedEncodingException e1) {
    		e1.printStackTrace();
    	}catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public static void main(String[] args) {
        HtmlToPdf.convert("D:\\db\\accthistory.html", "D:\\db\\accthistory.pdf");
    }
}
