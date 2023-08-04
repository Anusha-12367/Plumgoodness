package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseClass;

public class SkinCare extends BaseClass {
	WebDriver dr;
	
	By suns=By.cssSelector("#searchfeild");
	By adcrt=By.xpath("//*[@id=\"searchModal\"]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/div[4]/div/div/div/button[1]");
	
	By makeup=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[2]/nav/ul/li[6]/a");
	By recmnd=By.xpath("/html/body/div[3]/main/div/div[2]/div/div/div/div[1]/div/div[1]/div/label/span/span");
	By newl=By.xpath("/html/body/div[3]/main/div/div[2]/div/div/div/div[1]/div/div[1]/div/ul/li[2]/a");
	By lipchk=By.cssSelector("li.boost-pfs-filter-option-multi-level-item:nth-child(6) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)");
	By lips=By.xpath("//*[@id=\"grid-product-form--7135353372732\"]/div[5]/button");
	public SkinCare(WebDriver dr) 
	{
		this.dr=dr;
		
	}
	public void linksel() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement en=dr.findElement(suns);
		en.sendKeys("Sunscreens");
		en.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		dr.findElement(adcrt).click();

		dr.findElement(makeup).click();
		dr.findElement(recmnd).click();
		dr.findElement(newl).click();
		dr.findElement(lipchk).click();
		JavascriptExecutor js2 = (JavascriptExecutor) dr;
		 js2.executeScript("window.scrollBy(0,200)");
		 Thread.sleep(1000);
		 dr.findElement(lips).click();
		
	}
}
