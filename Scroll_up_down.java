package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down
{

	public static void main(String[] args) 
	{
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     
     WebElement country = driver.findElement(By.linkText("Canada"));
     Point location = country.getLocation();//getlocation is the method of 
     
     int x = location.getX();
     int y = location.getY();
     
     System.out.println(x);
     System.out.println(y);
     
     JavascriptExecutor jse = driver;//upcasting the driver to the JavascriptExecutor
		jse.executeScript("window.scrollBy(0,"+y+")");//with the help of ref variable use it's method called as executescript
	
			/*jse.executeScript("window.scrollBy(0,5000)");
			Thread.sleep(3000);
			jse.executeScript("window.scrollBy(0,-5000)");*/

     
	}

}
