package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handle 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
	      WebElement categories_dd = driver.findElement(By.id("searchDropdownBox"));
	      
	      Select s1 = new Select(categories_dd);
	     s1.selectByValue("search-alias=alexa-skills");
	     // s1.selectByVisibleText("Books");
	      //s1.selectByIndex(1);
	}

}
