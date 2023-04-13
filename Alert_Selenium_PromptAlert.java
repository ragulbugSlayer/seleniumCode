package basicseleniumm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Selenium_PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("prompt")).click();
		Alert alert = driver.switchTo().alert();
		String Text = alert.getText();
		System.out.println("Prompt Text => "+Text);
		alert.sendKeys("Raagul Kanna");
		alert.accept();
		
		String Name = driver.findElement(By.id("myName")).getText();
		System.out.println( "Entered name =>" +Name);
		driver.quit();
	}

}
