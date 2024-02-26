package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Searchshoe
{

	public static void main(String[] args) 
	{
       FirefoxDriver driver = new FirefoxDriver();
       driver.get("https://www.amazon.in");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
       driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
       
	}

}
