package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Page 
{

	public static void main(String[] args) 
	{
       ChromeDriver d1 = new ChromeDriver();
       d1.get("https://www.flipkart.com");
       System.out.println(d1.getTitle());
       String flipkarttitle = d1.getTitle();
       char [] ar = flipkarttitle.toCharArray();
       System.out.println(ar);
       
	}

}
