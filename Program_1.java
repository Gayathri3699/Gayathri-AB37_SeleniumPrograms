package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
	       
	  WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	  search.sendKeys("shoes");
	  search.sendKeys(Keys.ENTER);
	  
	  WebElement select_shoe =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]"));
	  select_shoe.click();
	  
	  WebElement click_mobiles = driver.findElement(By.linkText("Mobiles"));
	  click_mobiles.click();
	  
	  WebElement select_mobile = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]"));
	  select_mobile.click();
	  
	 Set <String> pcid = driver.getWindowHandles();
	 System.out.println(pcid);
	 
	 Iterator<String> pcid1 =  pcid.iterator();
	String parent_id = pcid1.next();
	String child_id1 = pcid1.next();
	String child_id2 = pcid1.next();
	
	driver.switchTo().window(child_id2);
	
	
	 WebElement add_wishlist =driver.findElement(By.id("add-to-wishlist-button-submit"));
     add_wishlist.click();
	}
}