package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Getting the counts of all the links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//limiting webdriver scope to only footer section 
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		//limiting webdriver scope to only footer section column
		WebElement columndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//clicking on the links and check if the windows are opened
		for(int i = 1; i<columndriver.findElements(By.tagName("a")).size();i++) {
			//Holds cntrl key and clicks on all the links
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);	
		}
			Thread.sleep(5000);
			Set<String> abc = driver.getWindowHandles();
			Iterator it = abc.iterator();
			while(it.hasNext()){
				//Iterarates all the windows opened in the browser window
				driver.switchTo().window((String) it.next());
				System.out.println(driver.getTitle());
			}	
	}

}
