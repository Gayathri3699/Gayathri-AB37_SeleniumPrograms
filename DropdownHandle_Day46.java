package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle_Day46
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
	      WebElement categories_dd = driver.findElement(By.id("searchDropdownBox"));
	      
	      Select s1 = new Select(categories_dd);
	      s1.selectByIndex(1);
	}

}
