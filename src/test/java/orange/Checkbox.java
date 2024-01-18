package orange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*WebElement check1=driver.findElement(By.xpath("//input[@value='option1']"));
		check1.click();*/
		List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<check.size();i++) {
		check.get(i).click();
		}		
	}

}
