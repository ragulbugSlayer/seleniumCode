package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_or_ContextMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in");

		driver.switchTo().frame(0);

		WebElement Element = driver.findElement(By.id("-------"));

		Actions builder = new Actions(driver);
		builder.contextClick(Element).perform();

		driver.quit();


	}

}
