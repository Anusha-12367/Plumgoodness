package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Baseclass.BaseClass;

public class LoginUser extends BaseClass{
	
	By emid=By.xpath("//*[@id=\"customer_email\"]");
	By pa=By.xpath("//*[@id=\"customer_password\"]");
	By log=By.xpath("//*[@id=\"notifyeventsignup\"]");
	public LoginUser(WebDriver dr)
	{
		BaseClass.dr=dr;
	}
    public void logtest1() 
    {
    	dr.findElement(emid).sendKeys("anusha.nimish@gmail.com");
    	dr.findElement(pa).sendKeys("SN4qB5@SsQ#6Ch");
    	dr.findElement(log).click();
    	
    }
}
