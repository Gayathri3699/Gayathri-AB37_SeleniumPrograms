package selenium.program;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partiallintext_Program 
{

	public static void main(String[] args)
	{
       FirefoxDriver driver = new FirefoxDriver();
       driver.get("https://www.google.com");
       driver.manage().window().maximize();
       driver.findElement(By.partialLinkText("Gma")).click();
	}

}
