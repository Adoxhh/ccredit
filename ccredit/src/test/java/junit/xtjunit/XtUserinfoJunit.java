package junit.xtjunit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ccredit.xtmodules.xtmodel.XtCompany;
import ccredit.xtmodules.xtservice.XtCompanyService;
import ccredit.xtmodules.xtservice.XtUserinfoService;
import junit.base.BaseJunit;

public class XtUserinfoJunit extends BaseJunit{
	@Autowired
	private XtUserinfoService xtUserinfoService;
	@Autowired
	private XtCompanyService xtCompanyService;
	@Test
	public void getXtUserinfoList(){
		Map<String, Object> condition = new HashMap<String, Object>();
		XtCompany xt_Company = new XtCompany();
		List<XtCompany> XtCompanyList = xtCompanyService.getXtCompanyListByCondition(condition);
		if(!XtCompanyList.isEmpty()){
			xt_Company = XtCompanyList.get(0);
		}
		xt_Company.setXt_company_ceo("邓纯杰");
		xtCompanyService.updateXtCompany(xt_Company);
		
		condition = new HashMap<String, Object>();
		System.out.println(xtUserinfoService.getXtUserinfoList(condition).size());
	}
}
