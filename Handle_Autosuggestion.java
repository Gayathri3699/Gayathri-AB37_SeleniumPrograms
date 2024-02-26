//how to handle autosuggestion
//launh google type bangalore and select the 4th option



package selenium.program;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Autosuggestion 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();
	       
	  WebElement google = driver.findElement(By.name("q"));
	  google.sendKeys("bangalore");
	  
	  Thread.sleep(1000);
	  List<WebElement> results=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

	  int count = results.size();
	  System.out.println(count);
	  
	  Thread.sleep(3000);
	 // results.get(3).click();//to click on the 4th option
	  results.get(count -7).click();
	}

}
