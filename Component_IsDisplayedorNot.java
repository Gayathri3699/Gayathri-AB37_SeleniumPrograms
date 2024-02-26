//check if the given component is present in the webpage
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_IsDisplayedorNot 
{

	public static void main(String[] args) throws InterruptedException 
	{		  
		 ChromeDriver driver = new ChromeDriver();
	       driver.get("https://grotechminds.com/");
	       driver.manage().window().maximize();
	       
	     WebElement a =  driver.findElement(By.name("your-name"));
	     boolean answer = a.isDisplayed();

         if(answer == true)
         {
        	 a.sendKeys("Gayathri");
         }
         else
         {
        	 System.out.println("Its not displayed");
         }
		        
	}

}
