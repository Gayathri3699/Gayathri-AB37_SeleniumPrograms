

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_WindowsPopup 
{

	public static void main(String[] args) 
	{
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://grotechminds.com/registration/");
       driver.manage().window().maximize();
 
       
//get the location of the file followed by pdf name and the extension
      WebElement file_upload = driver.findElement(By.id("Resume"));
      file_upload.sendKeys("C:\\Users\\Asus\\Desktop\\Demofile_mkt\\mkt.pdf");
      
      
      
       }

}
