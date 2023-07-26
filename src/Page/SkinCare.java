package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import Baseclass.BaseClass;

public class SkinCare extends BaseClass {
	
	
	By sk=By.xpath("//*[@id=\"section_\"]/a");
	By skn=By.cssSelector("#boost-pfs-filter-tree-pf-mlt-product-type > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)");
	By adbt=By.xpath("/html/body/div[3]/main/div/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div[2]/div[2]/form/div[4]/button");
	By cart=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[3]/div[3]/a/img");
	By viewcart=By.xpath("//a[@class='btn btn-view-cart']");
	By makeup=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[2]/nav/ul/li[6]/a");
	By recmnd=By.xpath("/html/body/div[3]/main/div/div[2]/div/div/div/div[1]/div/div[1]/div/label/span/span");
	By newl=By.xpath("/html/body/div[3]/main/div/div[2]/div/div/div/div[1]/div/div[1]/div/ul/li[2]/a");
	By lipchk=By.cssSelector("li.boost-pfs-filter-option-multi-level-item:nth-child(6) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)");
	By lips=By.className("product-image image-swap ");
	public SkinCare(WebDriver dr) 
	{
		BaseClass.dr=dr;
	}
	public void linksel() throws InterruptedException
	{
		Thread.sleep(1000);
		dr.findElement(sk).click();
		dr.findElement(skn).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		dr.findElement(adbt).click();
		dr.findElement(cart).click();
		Thread.sleep(2000);
		dr.findElement(viewcart).click();
	
		dr.findElement(makeup).click();
		Thread.sleep(3000);
		dr.findElement(recmnd).click();
		dr.findElement(newl).click();
		Thread.sleep(3000);
		dr.findElement(lipchk).click();
		JavascriptExecutor js2 = (JavascriptExecutor) dr;
		 js2.executeScript("window.scrollBy(0,200)");
		 Thread.sleep(1000);
		 dr.findElement(lips).click();
		
	}
}
