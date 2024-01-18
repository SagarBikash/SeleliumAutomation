package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");
		
		WebElement btn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		btn.click();
		
		WebElement admin=driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
		admin.click();
	}

}
