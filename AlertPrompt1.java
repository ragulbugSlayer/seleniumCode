package basicseleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrompt1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click(); 
		Alert alert = driver.switchTo().alert();
		String Text = alert.getText(); //To print the alert Pop up text
		alert.sendKeys("Raagul Kanna");
		System.out.println("Prompt alert text => "+ Text);
		alert.accept(); //accept the alert clicks (OK)
		driver.quit();
		/*This program is for Simple alert it is same for conform alert also
		 * conform alert shows both OK and cancel option..if you want to cancel
		 * you have to give (dismiss) command instead of (accept)
		 */
	}
}
