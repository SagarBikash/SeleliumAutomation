package orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=GiCiEy1ABKM&list=RDGiCiEy1ABKM&start_radio=1");
		driver.manage().window().maximize();
		 Thread.sleep(3000);

	}

}
