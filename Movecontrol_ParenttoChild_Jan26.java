//launch amazon india search for shoe and select 1st shoe then click on add to cart

package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Movecontrol_ParenttoChild_Jan26
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");//launch the browser
		WebElement shoe = driver.findElement(By.id("twotabsearchtextbox"));//inspect the search tab
		shoe.sendKeys("shoe");//perform action
		shoe.sendKeys(Keys.ENTER);//perform action click enter
		
		WebElement click_shoe = driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[1]"));//inspect and write xpath for 3rd shoe
		click_shoe.click();//perform action
		
		String parent_id = driver.getWindowHandle();//gives the parent id
		System.out.println(parent_id);
		Set<String> parentchild_id =	driver.getWindowHandles();//gives the parent and child id
		System.out.println(parentchild_id);
		
		Iterator<String> pcid=parentchild_id.iterator();//using iterator we can separate the parent and child id
		String parent_id1 =pcid.next();
		String child_id = pcid.next();
		
	      System.out.println(parent_id1);
	      System.out.println(child_id);
	      
        driver.switchTo().window(child_id);
       WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
       addtocart.click();
	}

}
