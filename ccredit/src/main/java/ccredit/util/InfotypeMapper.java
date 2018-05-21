package ccredit.util;

import java.util.HashMap;
import java.util.Map;

public class InfotypeMapper {
	//标签
	public static Map<String , String>infotypemap=new HashMap<>();
	//大类
	public static Map<String , String>infotypeMidmap=new HashMap<>();
	//
	public static Map<String , String>eacodemap=new HashMap<>();

	static{
		infotypemap.put("114", "BsInfDlt");
		infotypemap.put("134", "IdEfctInfDlt");
		infotypemap.put("213", "AcctDel");
		infotypemap.put("223", "CtrctDel");
		infotypemap.put("214", "AcctEntDel");
		infotypemap.put("224", "CtrctEntDel");
		infotypemap.put("234", "SecAcctEntDeI");
		infotypemap.put("233", "SecAcctDeI");
		infotypemap.put("514", "MoCEntDel");
		//以下变更类型
		infotypemap.put("231", "SecAcctIdCagsInf");
		infotypemap.put("511", "MoCIdCagslnf");
		infotypemap.put("211", "AcctIdCagsInf");
		infotypemap.put("221", "CtrctIdCagsInf");
		infotypemap.put("215", "SpcEvtDscInf");
		//以下为更正
		infotypemap.put("212", "AcctMdfc");
		infotypemap.put("232", "SecAcctMdfc");
		infotypemap.put("222", "CtrctMdfc");
		//
		eacodemap.put("212", "JDCHANGE");
		eacodemap.put("232", "DBCHANGE");
		eacodemap.put("222", "SXCHANGE");
		//
		infotypeMidmap.put("114", "PERSONBASEINFORECCODE");
		infotypeMidmap.put("134", "PERSONBASEINFORECCODE");
		infotypeMidmap.put("213", "PERSONBASEINFORECCODE");
		infotypeMidmap.put("223", "PERBORROWINGRECTYPECODE");
		infotypeMidmap.put("214", "PERBORROWINGRECTYPECODE");
		infotypeMidmap.put("224", "PERBORROWINGRECTYPECODE");
		infotypeMidmap.put("234", "PERGUATRAINFORECTYPECODE");
		infotypeMidmap.put("233", "PERGUATRAINFORECTYPECODE");
		infotypeMidmap.put("514", "GUARANTYINFOTYPECODE");
		//
		
	
	}
}
