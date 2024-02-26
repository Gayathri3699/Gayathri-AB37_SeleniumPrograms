//how to handle hoverover
//this has to be handled using actions class
//Actions a1 = new Actions(driver); - it accepts parameter as driver to invoke it's constructor
//we have to utilise it's method called as movetoelement - a1.movetoelement(e1) - here e1 is that component where we wish to perform hover over

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_HoverOver 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	WebElement e1 =	driver.findElement(By.id("nav-link-accountList"));
	e1.click();
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1);
		//a1.click();
       
	}

}
