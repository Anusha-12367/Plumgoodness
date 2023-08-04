package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Baseclass.BaseClass;

public class Lipstick1 extends BaseClass {
	
	WebDriver dr;
	
    By crrttt=By.cssSelector("img.cart");
    By viewcart=By.xpath("//*[@id=\"dropdown-cart\"]/div[5]/div[2]/div[1]/a");
    public Lipstick1(WebDriver dr) {
		
		this.dr=dr;
	}
	
	public void wishlist() throws InterruptedException
	{
		
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		dr.findElement(crrttt).click();
		dr.findElement(viewcart).click();
		
	}

} 

