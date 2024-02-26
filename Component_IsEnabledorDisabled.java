package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_IsEnabledorDisabled 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://grotechminds.com/");
	       driver.manage().window().maximize();
	       
	       WebElement a =  driver.findElement(By.name("your-name"));
		     boolean answer = a.isEnabled();
		     
		     if(answer==true)
		     {
		    	 a.sendKeys("Gayathri Rao");
		     }
		     else
		     {
		    	 System.out.println("It is disabled");
		     }
	}

}
