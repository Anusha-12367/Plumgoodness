package Test;

import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Page.LoginUser;

public class SearchProduct extends BaseClass {
	
	@Test
	public void testlogin() throws InterruptedException
	{
		LoginUser lo=new LoginUser(dr);
		lo.logtest1();	
	}

}
