package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInsta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("7449028819");
		
		driver.findElement(By.name("password")).sendKeys("pass123");
		
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		driver.quit();

	}

}
