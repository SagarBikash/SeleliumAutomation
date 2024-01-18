package orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().window().maximize();
     driver.getTitle();
     System.out.println(driver.getTitle());
     Assert.assertEquals("",  driver.getTitle());
	}

}
