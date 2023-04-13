package basicseleniumm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetText_and_GetAttribute {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		//To print the Header or title of the page use tag name like below
		WebElement Header = driver.findElement(By.tagName("h1"));
		String Text = Header.getText();
		System.out.println(Text);
		//To print all the titles on the edit page use below code
		String AllLabel = driver.findElement(By.className("card-content")).getText();
		System.out.println(AllLabel);
		//From above code we understand what is get_text();
		//Now will see what is get_attribute();
		String AttText= driver.findElement(By.id("fullName")).getAttribute("placeholder"); 
		System.out.println(AttText);
		driver.quit();
	}

}
