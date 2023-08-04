package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Baseclass.BaseClass;

public class CheckOutPage1 extends BaseClass {
	
	WebDriver dr;
	By chkout=By.id("gokwik-btn");


public CheckOutPage1(WebDriver dr) {
		
		this.dr=dr;
}
public void shop() throws InterruptedException
{
	
	dr.findElement(chkout).click();
	Thread.sleep(3000);
	dr.navigate().back();
    
    dr.quit();

}
	
		
}
	


