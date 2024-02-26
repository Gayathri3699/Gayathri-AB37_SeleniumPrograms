package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Copypaste 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("email")).sendKeys("archana123");
	       driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+ "a");
	       driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+ "c");
	       driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+ "v");
	       
	}

}
