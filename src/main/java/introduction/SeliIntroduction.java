package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeliIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking the browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashwanthSampath\\eclipse-workspace\\introduction\\chromedriver\\chromedriver.exe");
		// directly downloaded by webdriver manager optional line
		
		//firefox launch 
		//WebDriver driver1 = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashwanthSampath\\eclipse-workspace\\introduction\\chromedriver\\chromedriver.exe");
		
		//chrome launch
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		//driver.navigate().to("https://rahulshettyacademy.com/");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		driver.findElement(By.id("inputUsername")).sendKeys("Yashwanth");
		driver.findElement(By.name("inputPassword")).sendKeys("Yashwanth@1234");
		driver.findElement(By.className("submit")).click();
		
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Yashwanth");
	}

}
