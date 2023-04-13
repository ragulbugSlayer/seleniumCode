package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login_Get_Attribute_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("7449028819");

		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("pass123");
		System.out.println(password.getAttribute("value"));

		WebElement login=driver.findElement(By.name("login"));
		String buttontext= login.getText();
		System.out.println(buttontext);
		login.click();
	}

}

