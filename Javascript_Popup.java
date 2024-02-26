package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Popup
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("file:///C:/Users/Asus/Desktop/JSAM.html");
	       
//line of command to accept javascript popup	       
	     	driver.switchTo().alert().accept();

//cannot maximise the browser without handling the javascript popup
	       driver.manage().window().maximize();
	       
	       
//perform action	       
	    WebElement fname =   driver.findElement(By.id("1"));
	     fname.sendKeys("Gayathri");
	     
	     
	}

}


//the exception that we get without handling the javascript popup and if we perform action
//ans is UnhandledAlertException - it is a selenium exception

//to disagree or for no we need to use - driver.switchto().alert().dismiss;

































/*characteristics of a javascript popup
1.it is not inspectable
2.it gives maximum 2 options yes or no or it can also give a single option
3.javascript popups cannot be ignored it is mandatory to be handled*/