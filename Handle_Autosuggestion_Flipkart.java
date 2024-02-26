//launch flipkart enter books and select the 6th option

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Autosuggestion_Flipkart
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       driver.manage().window().maximize();
	       WebElement enter = driver.findElement(By.name("q"));
	       enter.sendKeys("books");
	}

}






















