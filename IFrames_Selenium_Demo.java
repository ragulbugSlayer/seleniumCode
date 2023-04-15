package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames_Selenium_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/frame");
		
		WebElement MyFrame = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(MyFrame);
		driver.findElement(By.name("fname")).sendKeys("Raagul kanna");
		driver.findElement(By.name("lname")).sendKeys("B");
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("raagulkanna1998@gmail.com");
		
		driver.switchTo().parentFrame(); // parent frame command is used to switch to the parent frame of existing frame
		driver.findElement(By.name("lname")).sendKeys("Babu");
		
		driver.switchTo().defaultContent(); //Default content is used to switch to main page		
	}
}
