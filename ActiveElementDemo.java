package basicseleniumm;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement activeElement = driver.switchTo().activeElement();
		
		activeElement.sendKeys("Raagulkanna" ,Keys.TAB , "Password" , Keys.ENTER);
	//river.quit();
	}

}
