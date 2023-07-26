package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Baseclass.BaseClass;

public class CheckOutPage1 extends BaseClass {
	
By chkout=By.cssSelector(".btn-text > span:nth-child(1)");
//By pop1=By.xpath("/html/body/div/div[3]/div/div[2]/button[1]");
//By popp=By.xpath("/html/body/div/div[3]/div");
//By logout=By.cssSelector(".logout");
public CheckOutPage1(WebDriver dr) {
		
		BaseClass.dr=dr;
}
public void shop() throws InterruptedException
{
	dr.findElement(chkout).click();
	dr.navigate().back();
	
    dr.quit();

}
	
		
}
	


