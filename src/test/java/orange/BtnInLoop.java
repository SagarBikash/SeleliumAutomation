package orange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtnInLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
     driver.manage().window().maximize();
     Thread.sleep(3000);
    // WebElement btn=driver.findElements(By.xpath("//input[@name='radioButton']"));
     List<WebElement> btn=driver.findElements(By.xpath("//input[@name='radioButton']"));
     /*for(int i=0;i<btn.size();i++)
     {
    	 btn.get(i).click();
  Thread.sleep(3000);
     
     }*/
     
     for(WebElement btn2:btn) {
    	 btn2.click();
    	 
     }
     
     
     }

}
