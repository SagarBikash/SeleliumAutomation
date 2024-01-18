package orange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practicedropdown {
 @Test
	public void Dropdown() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement dropdown1=driver.findElement(By.id("dropdown-class-example"));
	Select obj=new Select(dropdown1);
	obj.selectByIndex(1);
	obj.selectByVisibleText("Option2");
	List<WebElement> dropdownList=driver.findElements(By.id("dropdown-class-example"));
	for(int i=0;i<dropdownList.size();i++) {
	System.out.println(dropdownList.get(i).getText())	;
	}
	
	}

}
