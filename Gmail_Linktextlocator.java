package selenium.program;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Linktextlocator
{
//assignment 115
	public static void main(String[] args) 
	{
      FirefoxDriver driver = new FirefoxDriver();
      driver.get("https://www.gooogle.com");
      driver.manage().window().maximize();
      driver.findElement(By.linkText("Gmail")).click();
      
	}

}
