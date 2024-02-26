package selenium.program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Launch jsam application click on are you ready to relocate to banagalore,if it is selected click on submit button
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_IsSelected 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("file:///C:/Users/Asus/Desktop/learningHTML1.html");
	       driver.manage().window().maximize();
	       
	  WebElement checkbox =     driver.findElement(By.xpath(("(/html/body/input)[6]")));
	  checkbox.click();	
	  
	  if(checkbox.isSelected()== true)
	  {
		  System.out.println("click on submit button");
	  }
	  else
	  {
		  checkbox.click();
	  }
	}

}
