package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				 "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/buttons");
		
		//Find the location of the button
		
		WebElement Element = driver.findElement(By.id("position"));
		
		Point point = Element.getLocation();
		
		int x = point.getX();		
		int y = point.getY();		
		
		System.out.println("X  is : "+x);
		System.out.println("Y  is : "+y);
		
		//Find the color of the button
		
		WebElement Color =driver.findElement(By.id("color"));
		
		String Colors = Color.getCssValue("background-color");
		System.out.println(Colors);
		
		//Find the Size of the button (height and width)
		
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		//find the button is enabled or not (working or not)
		
		boolean Displayed = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(Displayed);
		
		// To close the page
		
		driver.quit();
		
		
		
	}

}
