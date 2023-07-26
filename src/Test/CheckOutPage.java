package Test;

import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Page.CheckOutPage1;

public class CheckOutPage extends BaseClass{
	
	 @Test
	 public void checkout1() throws InterruptedException 
	 {
		 CheckOutPage1 cp1=new CheckOutPage1(dr);
		 cp1.shop();
	 }

}
