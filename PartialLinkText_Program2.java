package selenium.program;

import java.util.Arrays;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkText_Program2 
{

	public static void main(String[] args) throws InterruptedException
	{
		  FirefoxDriver driver = new FirefoxDriver();
	       driver.get("https://www.amazon.in");
	       driver.manage().window().maximize();
	       
	      for(int i =0;i<3;i++)
	      {
	    	  Scanner s1 = new Scanner(System.in);
	    	  System.out.println("enter input");
	    	  String ptl = s1.next();
	    	  driver.findElement(By.partialLinkText(ptl)).click();
	      }
	      
	      
	     
	}

}
