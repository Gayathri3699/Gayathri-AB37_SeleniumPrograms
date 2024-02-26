package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_IsEnabledorDisabled_2 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("file:///C:/Users/Asus/Desktop/learningHTML1.html");
	       driver.manage().window().maximize();
	       WebElement a =  driver.findElement(By.name("lname"));
		     boolean answer = a.isEnabled();
		     
		     if(answer == true)
		     {
		    	 System.out.println("Rao");
		     }
		     else
		     {
		    	System.out.println("It is disabled");
		     }


	}

}
