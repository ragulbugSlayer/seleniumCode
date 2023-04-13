package basicseleniumm;

import java.awt.Label;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) {

		//System Property
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//driver upload
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Get the URl
		driver.get("https://letcode.in/edit");
		//Set the time to wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		List <WebElement> Labels = driver.findElements(By.tagName("label"));
		WebElement lastelement = Labels.get(Labels.size()-3);
		System.out.println(lastelement.getText());
		int Size = Labels.size();

		if (Size == 6)
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}

		//To print all the labels use for each 
		for (WebElement label : Labels) {

			String Text = label.getText();
			System.out.println(Text);

		}

		driver.quit();

	}

}
