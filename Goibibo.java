package selenium.program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo 
{

	public static void main(String[] args) 
	{
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.goibibo.com/");
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
 //from 
      
    
      driver.findElement(By.xpath("//span[@class ='logSprite icClose']")).click();
     
      
       WebElement frame = driver.findElement(By.name("destination_publishing_iframe_ibibo_0_name"));
       frame.click();
       driver.switchTo().frame(frame);
      
      WebElement mobile = driver.findElement(By.name("phone"));
      mobile.sendKeys("9876543210");
      
     WebElement search_from =  driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]"));
     search_from .sendKeys("Hyderabad");
      
     List <WebElement> select_from = driver.findElements(By.xpath("//ul[@class='search-widget-autosuggeststyles__SearchMenuStyles-sc-d4g22y-9 loRkxU']/div/div"));
     int from_link_count = select_from.size();
     System.out.println(from_link_count);
     
     WebElement select_1 = select_from.get(from_link_count-10);
     select_1.click();
     
 //to        
     WebElement search_to =  driver.findElement(By.xpath("(//p[.='Enter city or airport'])[2]"));
     search_to .sendKeys("Mumbai");
     
     List <WebElement> select_to = driver.findElements(By.xpath("//ul[@class='search-widget-autosuggeststyles__SearchMenuStyles-sc-d4g22y-9 loRkxU']/div/div"));
     int to_link_count = select_to.size();
     System.out.println(to_link_count);
     
     WebElement select_2 = select_to.get(to_link_count-10);
     select_2.click();
     
//departure date
    /* //div[@class='dcalendarstyles__DayAndDateWrapperDiv-sc-r2jz2t-5 gUCxnE']/ul[2]/li[10]
     
    WebElement cal = driver.findElement(By.id("search-widget-checkin-input"));
    cal.click();
     
     
     List<WebElement> select_date = driver.findElements(By.xpath("div[@class='dcalendarstyles__DayAndDateWrapperDiv-sc-r2jz2t-5 gUCxnE']/ul[2]/li"));
     int date_count = select_date.size();
     System.out.println("Auto date count:" +date_count);*/
     
	}

}
