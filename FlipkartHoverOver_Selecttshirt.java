/*launch flipkart hover over fashion and click on tshirt*/


package selenium.program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FlipkartHoverOver_Selecttshirt
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		//Thread.sleep(2000);
		WebElement electronics =driver.findElement(By.xpath("//span[.='Electronics'][1]"));
		
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.moveToElement(electronics).perform();
		WebElement blu = driver.findElement(By.linkText("Bluetooth Headphones"));
		blu.click();
		
		

	}

}
