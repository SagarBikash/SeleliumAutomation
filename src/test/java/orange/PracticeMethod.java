package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("admin123");
				
		WebElement lgbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		lgbtn.click();
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
