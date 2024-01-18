package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixthProgram {

	public static void main(String[] args) throws InterruptedException {
	

WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement radioButton1=driver.findElement(By.xpath("//input[@value='radio1']"));
		
		WebElement radioButton2=driver.findElement(By.xpath("//input[@value='radio2']"));
		
		WebElement radioButton3=driver.findElement(By.cssSelector("input[value='radio3']"));

		radioButton1.click();
		Thread.sleep(3000);
		System.out.println(radioButton1.isSelected());
		System.out.println(radioButton1.isDisplayed());
		System.out.println(radioButton1.isEnabled());
		
		radioButton2.click();
		Thread.sleep(30000);
		System.out.println(radioButton2.isSelected());
		System.out.println(radioButton2.isDisplayed());
		System.out.println(radioButton2.isEnabled());
		
		radioButton3.click();
		System.out.println(radioButton3.isSelected());
		System.out.println(radioButton3.isDisplayed());
		System.out.println(radioButton3.isEnabled());
	}


	}


