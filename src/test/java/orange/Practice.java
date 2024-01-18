package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Login =driver.findElement(By.xpath("//input[@name='username']"));
		Login.sendKeys("Admin1");
		
		WebElement Password =driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("admin123");
		WebElement lgnbtn =driver.findElement(By.xpath("//button[@type='submit']"));
		lgnbtn.click();
		
	}

}
