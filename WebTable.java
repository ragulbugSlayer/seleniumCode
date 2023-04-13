package basicseleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/table");
		
		WebElement table = driver.findElement(By.id("simpletable"));
		
		List <WebElement> header  = table.findElements(By.tagName("th"));
		
		for (WebElement HeaderText : header) {
			
			String TEXT = HeaderText.getText();
			System.out.println(TEXT);
		}
		
		List<WebElement> Allrows = table.findElements(By.cssSelector("tbody tr"));
		
		int AllrowsSize = Allrows.size();  		
		
		System.out.println(AllrowsSize);
		
		if (AllrowsSize == 3) {
			
			System.out.println("PASSED");
			
		}
		
		else {
			System.out.println("FAIL");
		}
		
		for (WebElement row : Allrows) {
			
			List <WebElement> coloumn = row.findElements(By.tagName("td"));
			WebElement firstcoloumn = coloumn.get(0);
			System.out.println(firstcoloumn.getText());
		}
			
		for (int i = 0; i < AllrowsSize; i++) {
			
			List<WebElement> rows = Allrows.get(i).findElements((By.tagName("td")));
			
			WebElement lastname = rows.get(1);
			
			String Name = lastname.getText();
			
			System.out.println(Name);
			
			if (Name.equals("Raj")) {
				
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				
				input.click();
				break;
			}
			
			
		}driver.quit();
		
	}
	
} 
		
		

				

	


