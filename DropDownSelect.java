package basicseleniumm;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in/dropdowns");

		WebElement Fruits = driver.findElement(By.id("fruits"));
		Select Myfruits = new Select(Fruits);
		Myfruits.selectByVisibleText("Mango");

		WebElement Heros = driver.findElement(By.id("superheros"));
		Select Myheros = new Select(Heros);
		boolean Multiple = Myheros.isMultiple();
		System.out.println("Is Multiple ? " + Multiple);
		Myheros.selectByValue("bp");
		Myheros.selectByValue("bw");
		Myheros.selectByValue("aq");
	

		List <WebElement> AllHeros = Myheros.getAllSelectedOptions();
		for (WebElement webElement : AllHeros) 
		{
			System.out.println(webElement.getText());
		}
		
		WebElement Language = driver.findElement(By.id("lang"));
		Select Lang = new Select(Language);
		Lang.selectByValue("sharp");
		
		
		
		WebElement country = driver.findElement(By.id("country"));
		Select Mycountry = new Select(country);
		Mycountry.selectByValue("India");
		WebElement Selectedcountry = Mycountry.getFirstSelectedOption();
		System.out.println(Selectedcountry.getText());
		
	}

}
