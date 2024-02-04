package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		//moves to specific element
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(move).contextClick().build().perform();
		//move to element, holds shift and enter the letters and selects the entered text
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		action.moveToElement(move).contextClick().build().perform();	
		//double click 
		
	}

}
