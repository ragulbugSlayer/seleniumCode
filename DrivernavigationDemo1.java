package basicseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrivernavigationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the page
		driver.manage().window().maximize();	
		
		//launching the URL
		driver.get("https://letcode.in/buttons");	
		
		//print current URL
		String URL = driver.getCurrentUrl();
		System.out.println("first URL :" + URL );
		
		
		//clicking go to home button
		driver.findElement(By.id("home")).click();	
		
		//print current URL
		String URLnew = driver.getCurrentUrl();
		System.out.println("New URL :" + URLnew);
		
		
		//navigate to back button
		driver.navigate().back();
		
		//print current URL
        String URLBack = driver.getCurrentUrl();
		System.out.println("Back URL :" + URLBack );
		
		
		//navigate to given URL
		driver.navigate().to("https://letcode.in/buttons");
		
		//close the page or browser
		driver.quit();
	}

}
