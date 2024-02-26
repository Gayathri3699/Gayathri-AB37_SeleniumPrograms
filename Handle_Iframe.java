package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handle_Iframe 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		EdgeDriver driver = new EdgeDriver();
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	      
      FileInputStream f1 = new FileInputStream("C:\\Users\\Asus\\Desktop\\GAYATHRI RAO 2023\\MKT Software Testing\\Selenium\\ExcelSheet\\ddt.xlsx");
     Workbook wb =  WorkbookFactory.create(f1);
     //String username   =  wb.getSheet("login").getRow(2).getCell(0).getStringCellValue();
     String pass = wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
     
    String un = NumberToTextConverter.toText(wb.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
  	//System.out.println(un);
    
   

      

     WebElement signin =  driver.findElement(By.linkText("Sign in"));
      signin.click();

      WebElement id =  driver.findElement(By.id("ap_email"));
      id.sendKeys(un);

      WebElement click_submit =  driver.findElement(By.id("continue"));
      click_submit.click();

      WebElement pass1 =  driver.findElement(By.id("ap_password"));
      pass1.sendKeys(pass);

      WebElement click_signin =  driver.findElement(By.id("signInSubmit"));
      click_signin.click();
      
      WebElement search_product =  driver.findElement(By.id("twotabsearchtextbox"));
      search_product.sendKeys("shoes");
      search_product.sendKeys(Keys.ENTER);
      
      WebElement select_shoe =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]"));
      select_shoe.click();
      
      String Parent = driver.getWindowHandle();
      Set <String> parent_child = driver.getWindowHandles();
           System.out.println(Parent);
           System.out.println(parent_child);
           
           Iterator <String> pcid = parent_child.iterator();
           String parent_id = pcid.next();
           String child_id =  pcid.next();
              System.out.println(parent_id);
              System.out.println(child_id);
              
       driver.switchTo().window(child_id);

       WebElement add_cart =driver.findElement(By.id("add-to-cart-button"));
       add_cart.click();
      
       WebElement checkout =driver.findElement(By.name("proceedToRetailCheckout"));
       checkout.click();
       
       WebElement address =driver.findElement(By.name("submissionURL"));
       address.click();
      
       WebElement use_address =driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
       use_address.click();
      
       WebElement radio_button =driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
       radio_button.click();
       
       WebElement click_entercarddetails =driver.findElement(By.linkText("Enter card details"));
       click_entercarddetails.click();
       
       WebElement first_frame =driver.findElement(By.name("ApxSecureIframe"));
       first_frame.click();
       
       driver.switchTo().frame(first_frame);
       
       WebElement card_number =driver.findElement(By.name("addCreditCardNumber"));
       card_number.sendKeys("987654321256");
       
      
	}

}
