package basicseleniumm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/windows");
		
		String windowHandle = driver.getWindowHandle();
		
		System.out.println(windowHandle);
		
		driver.findElement(By.id("home")).click();
		
		Set<String> windowhandle= driver.getWindowHandles();
		System.out.println(windowhandle);
		
		List<String> ListWindow = new ArrayList<String>(windowhandle);
		driver.switchTo().window(ListWindow.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		Set<String> windowHanle2 = driver.getWindowHandles();
		ListWindow.clear();
		ListWindow.addAll(windowHanle2);
		driver.switchTo().window(ListWindow.get(0));
		
		String URl = driver.getCurrentUrl();
		System.out.println("URL"+ URl);
		driver.quit();
		
		

	}

}
