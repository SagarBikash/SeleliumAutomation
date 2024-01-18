package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByLocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		WebElement userNn=driver.findElement(By.id("username")); //by id
		userNn.sendKeys("Bikash");
		driver.findElement(By.name("pw")).sendKeys("Bikash@123");
		
		WebElement Butn=driver.findElement(By.cssSelector("input[type='submit']"));
		Butn.click();
		

	}

}
