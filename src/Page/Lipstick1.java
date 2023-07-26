package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Baseclass.BaseClass;

public class Lipstick1 extends BaseClass {
	
	//By imag=By.xpath("/html/body/div[3]/main/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/div/a");
    By lipclr=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[1]/div/label/span");
	By qty=By.cssSelector(".plus");
    By pinc=By.cssSelector("#pincode_input");
    By chk=By.xpath("//*[@id=\"check-delivery-submit\"]");
    By adto=By.cssSelector("div.groups-btn:nth-child(1) > input:nth-child(1)");
    By crrttt=By.cssSelector("img.cart");
   
    public Lipstick1(WebDriver dr) {
		
		BaseClass.dr=dr;
	}
	
	public void wishlist() throws InterruptedException
	{
		
		Thread.sleep(1000);
		dr.findElement(lipclr).click();
		dr.findElement(qty).click();
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		dr.findElement(pinc).sendKeys("685585");
		dr.findElement(chk).click();
		Thread.sleep(3000);
		dr.findElement(adto).click();
		dr.findElement(crrttt).click();
		Thread.sleep(2000);
		
	}

} 

