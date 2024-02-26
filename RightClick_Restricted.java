//how to handle those application where right click doesn't work
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick_Restricted 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	       driver.manage().window().maximize();
	       
	 WebElement clickoncontinue = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
	 clickoncontinue.click();
	
	}

}
