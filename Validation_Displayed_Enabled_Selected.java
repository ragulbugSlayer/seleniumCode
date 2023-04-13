package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Displayed_Enabled_Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/edit");
		
		//To find the given button is working or not
		boolean isEnabled = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println("isEnabled ??" +isEnabled);
		
		//To find the given button is showing or not
		boolean isDisplayed = driver.findElement(By.className("card-footer-item")).isDisplayed();
		System.out.println("isDisplayed??"+ isDisplayed);
		
		//To find the given button is Selected or not
		
		
		driver.quit();
	}

}
