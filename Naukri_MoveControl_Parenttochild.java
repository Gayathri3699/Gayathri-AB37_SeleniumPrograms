//launch naukri.com and click on sign in with google and do the login activity
package selenium.program;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukri_MoveControl_Parenttochild 
{

	public static void main(String[] args) 
	{
//launch the browser 		
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	       driver.manage().window().maximize();

//find the element and perform action	       
	      WebElement click_google = driver.findElement(By.xpath("//span[.='Google']"));
	      click_google.click();
	
//both parent id and parentchild id	      
	     String parent_id = driver.getWindowHandle();
	     Set<String> parentchild_id = driver.getWindowHandles();
	     System.out.println(parent_id);
	     System.out.println(parentchild_id);
	     
//separate the id
	   Iterator<String> a =  parentchild_id.iterator();	     
	   String parent_id1 =  a.next();//1st time of next gives the parent id
	   String child_id1 =  a.next();//2nd time of next gives the 1st child id
	   System.out.println(parent_id1);
	   System.out.println(parent_id1);
	   
//move the control to child window	   	   
      driver.switchTo().window(child_id1);
      	   
//perform action on child browser	   
	     WebElement username = driver.findElement(By.id("identifierId"));
	     username.sendKeys("ar@123");
	     
	      }

}
