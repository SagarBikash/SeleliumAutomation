package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProagrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://login.salesforce.com/?locale=in");
    driver.manage().window().maximize();
  WebElement username =driver.findElement(By.id("username"));
    username.sendKeys("Bikash");
    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("Bikash123");
	}

}
