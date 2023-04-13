package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestSelenium1 {

	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver",
				 "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//To Maximize the page of the URL give
		driver.get("http://letcode.in/");
		//load the URL
		//click login button
		driver.findElement(By.linkText("Log in")).click();
		
		//Enter Email id 
		driver.findElement(By.name("email")).sendKeys("raagulkanna1998@gmail.com");
		
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("pass123");
		
		//click Submit or Login button using Xpath
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		
			}

}
