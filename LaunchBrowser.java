package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{

	public static void main(String[] args)
	{
       ChromeDriver d1 = new ChromeDriver();
       d1.get("https://www.google.com");
       
	}

}
