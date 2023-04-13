package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_dropby_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		WebElement Element = driver.findElement(By.id("draggable"));
		int x = Element.getLocation().getX();
		int y = Element.getLocation().getY();
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(Element, x+50, y+50).perform();
		
	}

}
