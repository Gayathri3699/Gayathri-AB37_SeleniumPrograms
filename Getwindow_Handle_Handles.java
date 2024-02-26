package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow_Handle_Handles 
{

	public static void main(String[] args)
	{

	       ChromeDriver d1 = new ChromeDriver();
	       d1.get("https://www.flipkart.com");
	       System.out.println(d1.getWindowHandle());
	       System.out.println(d1.getWindowHandles());
	}

}
