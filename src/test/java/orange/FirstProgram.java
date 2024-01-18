package orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.getTitle();
	 System.out.println(driver.getTitle());
	 driver.getCurrentUrl();
	 System.out.println(driver.getCurrentUrl());
     driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN885G0&p=fb&guccounter=1");
     driver.navigate().back();
     driver.navigate().forward();
     driver.navigate().refresh();
     Thread.sleep(3000);
     driver.manage().window().minimize();
     driver.close();
     driver.quit();
     
	}

}

