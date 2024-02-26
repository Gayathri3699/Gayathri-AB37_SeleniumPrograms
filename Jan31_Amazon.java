package selenium.program;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jan31_Amazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.amazon.in");
	      driver.manage().window().maximize();
	      
     WebElement signin =  driver.findElement(By.xpath("//a[@id ='nav-link-accountList']"));
	 signin.click();
	 
     WebElement id =  driver.findElement(By.id("ap_email"));
     id.sendKeys("8424900084");
     
     WebElement click_submit =  driver.findElement(By.id("continue"));
     click_submit.click();
	 
     WebElement pass =  driver.findElement(By.id("ap_password"));
                                                                                                                     pass.sendKeys("kiran@123");
     
     WebElement click_signin =  driver.findElement(By.id("signInSubmit"));
     click_signin.click();
     
     WebElement search_product =  driver.findElement(By.id("twotabsearchtextbox"));
     search_product.sendKeys("shoes");
     search_product.sendKeys(Keys.ENTER);
     
     WebElement select_shoe =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]"));
     select_shoe.click();
     
//get both parent child id
     
     String Parent = driver.getWindowHandle();
     Set <String> parent_child = driver.getWindowHandles();
          System.out.println(Parent);
          System.out.println(parent_child);

     
//iterate it to separate the parent and child it
     Iterator <String> pcid = parent_child.iterator();
     String parent_id = pcid.next();
     String child_id =  pcid.next();
        System.out.println(parent_id);
        System.out.println(child_id);
        
//switch the control from parent to child        

     driver.switchTo().window(child_id);
        
        
//add it to wishlist     
     WebElement add_wishlist =driver.findElement(By.id("add-to-wishlist-button-submit"));
     add_wishlist.click();
     

	 
	
	
	}

}
