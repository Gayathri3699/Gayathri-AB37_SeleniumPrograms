package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_EnterUsername 
{

	
	public static void main(String[] args) 
	{
       ChromeDriver d1 = new ChromeDriver();
       d1.get("https://www.grotechminds.com/registration/");
       d1.findElement(By.id("Username")).sendKeys("archana123");
	}

}
