package junit.xtjunit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

import ccredit.xtmodules.xtcore.allutils.file.ftp.FtpUtil;
import junit.base.BaseJunit;

public class FtpJunit extends BaseJunit{
	@Test
	public void getXtUserinfoList() throws FileNotFoundException{
		File f = new File("D://ext-all.txt");
		InputStream input = new FileInputStream(f);
		FtpUtil.uploadFile("/data/resource/doc/", "ext-all.txt", input);
	}
}
