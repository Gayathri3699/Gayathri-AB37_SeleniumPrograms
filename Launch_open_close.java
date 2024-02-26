package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_open_close
{

	public static void main(String[] args) throws InterruptedException
	{

	       ChromeDriver d1 = new ChromeDriver();
	       d1.get("https://www.flipkart.com");
	       Thread.sleep(2000);
	       d1.close();
	}

}
