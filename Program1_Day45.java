package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1_Day45 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.className("gLFyf")).sendKeys("India");
	       driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
	       
	}

}
