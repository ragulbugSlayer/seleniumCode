package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFBSelenium2 {
	public static void main(String[] args) {
 
	System.setProperty("webdriver.chrome.driver", 
			    "./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.name("email")).sendKeys("7449028819");
	
	driver.findElement(By.name("pass")).sendKeys("pass123");
	
	driver.findElement(By.name("login")).click();
	driver.quit();
	}
}