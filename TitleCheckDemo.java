package basicseleniumm;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheckDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
	        // to check our title is correct
	        String title = driver.getTitle();
			System.out.println(title);
	        
	        String myTitle = "Facebook – log in or sign up";
	        
			if(myTitle.equals(title)) { 
				System.out.println("Get Title is correct");
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
			}
			else {
				System.out.println("Get Title is false");
			}
			// to get page source use this method
			//String pageSource = driver.getPageSource();
		    //System.out.println(pageSource);
			
			driver.close();
	}


}
