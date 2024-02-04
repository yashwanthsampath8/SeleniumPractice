package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//this will wait untill all the components are fully loaded
		driver.get("https://www.google.com");
		//this will not wait, this helps in internally navigating 
		driver.navigate().to("https://rahulshettyacademy.com/");
		//this method will take you back to the google.com page
		driver.navigate().back();
		//this will navigate back to rahulshetty page
		driver.navigate().forward();
	}

}
