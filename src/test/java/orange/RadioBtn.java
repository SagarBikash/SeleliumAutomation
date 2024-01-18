package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement btn1=driver.findElement(By.xpath("//input[@value='radio1']"));
    btn1.click();
    Thread.sleep(3000);

    WebElement btn2=driver.findElement(By.xpath("//input[@value='radio2']"));
    btn2.click();
    Thread.sleep(3000);

    WebElement btn3=driver.findElement(By.xpath("//input[@value='radio3']"));
    btn3.click();
    Thread.sleep(3000);
     
    driver.close();
	}

}
