package Page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import Baseclass.BaseClass;
public class HomePage extends BaseClass{
 
    
    By reg=By.id("Capa_1");
    
	public HomePage(WebDriver dr) {
		
		BaseClass.dr=dr;	
	}
	
	public void register() throws InterruptedException
	{
		
		dr.findElement(reg).click();
	}
    public void login() throws InterruptedException
    {
    	Thread.sleep(1000);
    	dr.findElement(reg).click();
    }
}
