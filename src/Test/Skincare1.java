package Test;

import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Page.SkinCare;

public class Skincare1 extends BaseClass {
	

	@Test
	public void linkselect() throws InterruptedException
	{
		SkinCare sc=new SkinCare(dr);
		sc.linksel();	
	}


}
