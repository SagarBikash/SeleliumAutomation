package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");

		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	   
	   WebElement link2=driver.findElement(By.linkText("Use Custom Domain"));
	   
	   System.out.println(link2.isDisplayed());
	   
	   System.out.println(link2.isEnabled());
	    
	}


	}




