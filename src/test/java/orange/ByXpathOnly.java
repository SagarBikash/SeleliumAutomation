package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpathOnly {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      WebElement usern=driver.findElement(By.xpath("//input[@placeholder='username']"));
      usern.sendKeys("Admin");
      Thread.sleep(3000);
      WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
      pass.sendKeys("admin123");
      Thread.sleep(3000);
     /* WebElement Btn=driver.findElement(By.xpath("//button[@type='submit']"));
      Btn.click();
      Thread.sleep(3000);*/
      
	}

}
