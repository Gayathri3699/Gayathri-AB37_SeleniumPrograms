//launch amazon and double click on mobiles
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Doubleclick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mobiles =driver.findElement(By.xpath("//a[.='Mobiles']"));
		
		Actions a1 = new Actions(driver);
		a1.doubleClick(mobiles).perform();

	}

}
