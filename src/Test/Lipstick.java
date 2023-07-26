package Test;

import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Page.Lipstick1;

public class Lipstick extends BaseClass {
	
	@Test
	public void linkselect() throws InterruptedException
	{
		Lipstick1 lp=new Lipstick1(dr);
		lp.wishlist();
			
	}

}
