package basicseleniumm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotSeleniumDemo {

	public static void main(String[] args) throws InterruptedException , IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		
		//Taking screenshot for whole page that is visible on that page
		File Firstsrc = driver.getScreenshotAs(OutputType.FILE);
		File img1 = new File("./snaps/img2.png");
		FileHandler.copy(Firstsrc, img1);
		
		
		//Taking Element Screenshot --- Takes screenshot only on specific element
		WebElement Element = driver.findElement(By.id("home"));
		File Elesrc = Element.getScreenshotAs(OutputType.FILE);
		File img2 = new File("./snaps/img3.png");
		FileHandler.copy(Elesrc, img2);
		
		
		//Taking Section Screenshot ----Takes a whole section screenshot
		WebElement info = driver.findElement(By.className("card-header-title"));
		 Elesrc = info.getScreenshotAs(OutputType.FILE);
		 File img3 = new File("./snaps/img4.png");
		 FileHandler.copy(Elesrc, img3);
		 
		 
		 //quit the browser
		driver.quit();
		
	}

}
